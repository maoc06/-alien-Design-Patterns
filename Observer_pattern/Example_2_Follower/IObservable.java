package Observer_pattern.Example_2_Follower;

public interface IObservable {
    public void register(IObserver o);

    public void remove(IObserver o);

    public void notifyObservers();
}