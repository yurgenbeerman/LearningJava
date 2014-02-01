package observer;

/**
 * Created by Lena on 30.01.14.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
