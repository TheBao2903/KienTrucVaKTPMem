package iuh.fit.se.bai02_observerdesignpattern.BaiToanQLTask;

public class Manager implements TeamMember {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("📊 Manager " + name +
                " theo dõi: Task '" + taskName +
                "' hiện tại là " + status);
    }
}
