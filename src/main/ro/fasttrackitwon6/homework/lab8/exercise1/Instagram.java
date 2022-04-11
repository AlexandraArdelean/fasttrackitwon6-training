package main.ro.fasttrackitwon6.homework.lab8.exercise1;

public class Instagram implements Advertise{
    String providedService;

    public Instagram(String providedService) {
        this.providedService = providedService;
    }

    @Override
    public void sendMessage() {
        System.out.println("Spring sale! 35% less at " + providedService);

    }

    @Override
    public void setService(String service) {
        if (providedService == service) {
            sendMessage();
        } else {
            System.out.println("Check it out! Spring sale starts in 15 days!");
        }

    }
}
