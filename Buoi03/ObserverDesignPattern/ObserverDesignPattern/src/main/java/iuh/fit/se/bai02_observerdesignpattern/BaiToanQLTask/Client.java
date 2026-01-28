package iuh.fit.se.bai02_observerdesignpattern.BaiToanQLTask;

public class Client {
    public static void main(String[] args) {

        Task task = new Task("Implement Observer Pattern");

        TeamMember dev = new Developer("An");
        TeamMember tester = new Tester("Bình");
        TeamMember manager = new Manager("Chi");

        task.attach(dev);
        task.attach(tester);
        task.attach(manager);

        task.setStatus("IN_PROGRESS");
        task.setStatus("DONE");
    }
}
