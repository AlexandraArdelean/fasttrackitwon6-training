package main.ro.fasttrackitwon6.homework.lab8.exercise1;

public class Facebook implements Advertise {
    String providedService;

    public Facebook(String providedService) {
        this.providedService = providedService;
    }

    @Override
    public void sendMessage() {
        System.out.println("50% offer at " + providedService + " for 10 days");
    }

    @Override
    public void setService(String service) {
        if (providedService == service){
            sendMessage();
        } else {
            System.out.println("Check it out! Spring sale starts in 15 days!");
        }

    }

}
