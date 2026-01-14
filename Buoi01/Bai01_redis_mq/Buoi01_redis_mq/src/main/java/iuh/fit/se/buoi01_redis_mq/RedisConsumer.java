package iuh.fit.se.buoi01_redis_mq;

import com.google.gson.Gson;
import iuh.fit.se.buoi01_redis_mq.entity.Message;
import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisConsumer {

    private static final String QUEUE = "message_queue";

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Jedis jedis = new Jedis("localhost", 6379)) {

            System.out.println("🚀 Consumer waiting for messages...");

            while (true) {
                List<String> result = jedis.brpop(0, QUEUE);
                String json = result.get(1);

                Message msg = gson.fromJson(json, Message.class);

                System.out.println("📥 Received:");
                System.out.println("  id = " + msg.id);
                System.out.println("  type = " + msg.type);
                System.out.println("  content = " + msg.content);
            }
        }
    }
}
