package observerpattern;

public class NewsSubscriptionService {
    public static void main(String[] args) {
        News news = new News();

        NewsSubscriber sub1 = new NewsSubscriber("Zy");
        NewsSubscriber sub2 = new NewsSubscriber("Tessa");
        NewsSubscriber sub3 = new NewsSubscriber("Mae");
        NewsSubscriber sub4 = new NewsSubscriber("Yuwi");

        news.subscribe(sub1);
        news.subscribe(sub2);
        news.subscribe(sub3);

        news.setBreakingNews("Local man finds remote control after three-day search." +
                "Blames couch for \"structural integrity issues.\"");

        news.unsubscribe(sub3);

        news.setBreakingNews("Miracle cure kills fifth patient.");

        news.subscribe(sub4);

        news.setBreakingNews("New study confirms that all dogs are, in fact, \"good boys.\"");
    }
}