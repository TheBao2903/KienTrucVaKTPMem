package iuh.fit.se.buoi01_redis_mq;

import com.google.gson.Gson;
import iuh.fit.se.buoi01_redis_mq.entity.Message;
import redis.clients.jedis.Jedis;

public class RedisProducer {

    private static final String QUEUE = "message_queue";

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Jedis jedis = new Jedis("localhost", 6379)) {

            for (int i = 1; i <= 5; i++) {

                Message msg = new Message();
                msg.id = i;
                msg.type = "EMAIL";
                msg.content = "Hello Redis MQ " + i;

                String json = gson.toJson(msg);
                jedis.lpush(QUEUE, json);

                System.out.println("📤 Sent: " + json);
            }
        }
    }
}
