public class SportsChannel extends Channel{
    private String news;
        public void setCricketNews(String news){
            this.news=news;
        }
        public String getNews(){
            return this.news;
        }
        public void supplyNews(){
            notification();
        }
}
