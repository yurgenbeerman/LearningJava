package observer;

/**
 * Created by Lena on 30.01.14.
 */
public interface Subject {
    public void registerObserver();
    public void removeObserver();
    public void notifyObservers();
}
