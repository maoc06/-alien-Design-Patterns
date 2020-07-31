package Observer_pattern.Example_2_Follower;

public class Follower implements IObserver {

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String celebrityName, String tweet) {
        System.out.println(followerName + " has received " + celebrityName + "'s tweet -> " + tweet);
    }
}