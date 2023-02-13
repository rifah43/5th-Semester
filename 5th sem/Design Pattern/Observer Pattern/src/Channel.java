import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscriberList = new ArrayList<Subscriber>();
    public void attach(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void detach(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }
    public void notification(){
        for(Subscriber s: subscriberList){
            s.update(this);
        }
    }
}
