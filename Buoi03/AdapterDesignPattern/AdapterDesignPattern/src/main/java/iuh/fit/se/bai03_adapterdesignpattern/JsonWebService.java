package iuh.fit.se.bai03_adapterdesignpattern;

public class JsonWebService implements JsonService {
    @Override
    public void processJson(String json) {
        System.out.println("🟢 Xử lý dữ liệu JSON: " + json);
    }
}
