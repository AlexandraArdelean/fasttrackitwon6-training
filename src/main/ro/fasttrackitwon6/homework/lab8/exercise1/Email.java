package main.ro.fasttrackitwon6.homework.lab8.exercise1;

public class Email implements Advertise{
    String providedService;

    public Email(String providedService) {
        this.providedService = providedService;
    }

    @Override
    public void sendMessage() {
        System.out.println(providedService + " offer." + " Starting from 100 RON.");

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
