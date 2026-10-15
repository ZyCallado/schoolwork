package observerpattern;

import java.util.*;

public class News implements NewsAgency {
    private List<NewsSubscriber> subscriberList = new ArrayList<>();
    private String breakingNews;

    public void setBreakingNews(String breakingNews) {
        this.breakingNews = breakingNews;
        notifySubscribers();
    }

    @Override
    public void subscribe(NewsSubscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(NewsSubscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(NewsSubscriber subscriber : subscriberList) {
            subscriber.update(breakingNews);
        }
    }
}