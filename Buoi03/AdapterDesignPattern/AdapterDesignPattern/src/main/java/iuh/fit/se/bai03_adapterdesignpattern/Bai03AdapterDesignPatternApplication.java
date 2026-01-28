package iuh.fit.se.bai03_adapterdesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bai03AdapterDesignPatternApplication {

    public static void main(String[] args) {
        // Web service thuần JSON
        JsonService jsonService = new JsonWebService();
        jsonService.processJson("{\"name\":\"Task A\",\"status\":\"DONE\"}");

        // Hệ thống XML cũ
        XmlSystem xmlSystem = new XmlSystem();

        // Adapter
        JsonService adapter = new XmlToJsonAdapter(xmlSystem);
        adapter.processJson("{\"name\":\"Task B\",\"status\":\"TODO\"}");
    }

}
