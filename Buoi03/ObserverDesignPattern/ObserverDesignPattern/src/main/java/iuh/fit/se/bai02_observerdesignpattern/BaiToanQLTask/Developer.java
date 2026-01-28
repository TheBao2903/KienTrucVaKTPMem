package iuh.fit.se.bai02_observerdesignpattern.BaiToanQLTask;

public class Developer implements TeamMember {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("👨‍💻 Developer " + name +
                " nhận thông báo: Task '" + taskName +
                "' đổi trạng thái thành " + status);
    }
}
