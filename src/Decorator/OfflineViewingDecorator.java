package Decorator;

public class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vizionare offline";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
