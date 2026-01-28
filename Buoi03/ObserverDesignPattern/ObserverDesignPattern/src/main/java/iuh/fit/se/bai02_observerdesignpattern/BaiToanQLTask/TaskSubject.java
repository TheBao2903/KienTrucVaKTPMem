package iuh.fit.se.bai02_observerdesignpattern.BaiToanQLTask;

public interface TaskSubject {
    void attach(TeamMember member);
    void detach(TeamMember member);
    void notifyMembers();
}
