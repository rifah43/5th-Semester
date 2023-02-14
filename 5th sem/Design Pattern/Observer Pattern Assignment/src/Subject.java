import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
        private List<Observer> observerList = new ArrayList<Observer>();
        public void register(Observer observer){
            observerList.add(observer);
        }
        public void unregister(Observer observer){
            observerList.remove(observer);
        }
        public void notification(){
            for(Observer o: observerList){
                o.update();
            }
        }
}
