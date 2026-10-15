package observerpattern;

public interface NewsAgency {
    void subscribe(NewsSubscriber subscriber);
    void unsubscribe(NewsSubscriber subscriber);
    void notifySubscribers();
}