package Design_Patterns.Observer;

public interface Provider {

    public void register(Observer o);
    public void remove(Observer o);

    public void notifyObserver();

}