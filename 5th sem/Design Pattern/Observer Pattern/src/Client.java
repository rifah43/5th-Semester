public class Client {
    public static void main(String[] args) {

        SportsChannel sportsChannel= new SportsChannel();
        sportsChannel.setCricketNews("Cricket moja");
        Sub1 sub1= new Sub1(sportsChannel);
        sportsChannel.supplyNews();
    }
}