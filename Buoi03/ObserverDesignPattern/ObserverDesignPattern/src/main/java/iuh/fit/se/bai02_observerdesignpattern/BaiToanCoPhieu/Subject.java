package iuh.fit.se.bai02_observerdesignpattern.BaiToanCoPhieu;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}