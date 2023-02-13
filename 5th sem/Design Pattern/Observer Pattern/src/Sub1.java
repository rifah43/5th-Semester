public class Sub1 extends Subscriber{
    private SportsChannel sportsChannel;
    public Sub1(SportsChannel sportsChannel){
        this.sportsChannel=sportsChannel;
        this.sportsChannel.attach(this);
    }
    @Override
    public void update(Channel channel) {
        if(channel == this.sportsChannel){
            viewNews();
        }
    }
    public void viewNews(){
        String news= this.sportsChannel.getNews();
        System.out.println(news);
    }
}
