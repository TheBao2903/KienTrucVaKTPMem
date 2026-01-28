package iuh.fit.se.bai02_observerdesignpattern.BaiToanQLTask;

public class Tester implements TeamMember {

    private String name;

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("🧪 Tester " + name +
                " nhận thông báo: Task '" + taskName +
                "' đổi trạng thái thành " + status);
    }
}
