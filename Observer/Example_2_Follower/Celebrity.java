package Observer.Example_2_Follower;

import java.util.ArrayList;

public class Celebrity implements IObservable {

    private String celebrityName;
    private String tweet;
    private ArrayList<IObserver> followers;

    public Celebrity(String celebrityName) {
        this.celebrityName = celebrityName;
        this.followers = new ArrayList<IObserver>();
    }

    @Override
    public void register(IObserver o) {
        followers.add(o);
    }

    @Override
    public void remove(IObserver o) {
        int index = followers.indexOf(o);
        if (index >= 0) {
            followers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver follower : followers) {
            follower.update(celebrityName, tweet);
        }
    }

    private void newTweet() {
        notifyObservers();
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
        newTweet();
    }

}