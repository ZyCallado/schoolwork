package observerpattern;

public class NewsSubscriber implements Subscriber{
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String breakingNews) {
        System.out.println("Hello, " + name + "! We have breaking news for you:");
        System.out.println(breakingNews);
        System.out.println();
    }
}