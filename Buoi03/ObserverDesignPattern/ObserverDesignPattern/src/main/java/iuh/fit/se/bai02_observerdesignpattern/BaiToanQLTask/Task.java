package iuh.fit.se.bai02_observerdesignpattern.BaiToanQLTask;

import java.util.ArrayList;
import java.util.List;

public class Task implements TaskSubject {

    private String name;
    private String status;

    private List<TeamMember> members = new ArrayList<>();

    public Task(String name) {
        this.name = name;
        this.status = "TODO";
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyMembers();
    }

    @Override
    public void attach(TeamMember member) {
        members.add(member);
    }

    @Override
    public void detach(TeamMember member) {
        members.remove(member);
    }

    @Override
    public void notifyMembers() {
        for (TeamMember member : members) {
            member.update(name, status);
        }
    }
}
