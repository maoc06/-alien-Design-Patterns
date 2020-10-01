package Observer.Example_2_Follower;

public class FansTweet {
    public static void main(String[] args) {
        Celebrity DuaLipa = new Celebrity("Dua Lipa");
        Celebrity LogicRap = new Celebrity("Logic");

        Follower maoc = new Follower("Michael");
        Follower javo = new Follower("George");
        Follower gal = new Follower("Gal");
        Follower chris = new Follower("Chris");

        DuaLipa.register(maoc);
        DuaLipa.register(gal);
        LogicRap.register(javo);
        LogicRap.register(chris);

        DuaLipa.setTweet("Hey guys, came across my new single");
        LogicRap.setTweet("Good Morning...!");
        DuaLipa.setTweet("Thx guys!");
    }
}