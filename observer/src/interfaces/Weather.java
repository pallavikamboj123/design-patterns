package interfaces;

public interface Weather {
    void register(Observer observer);
    void remove(Observer observer) ;
    void notifyObservers();
}
