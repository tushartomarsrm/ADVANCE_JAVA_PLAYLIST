package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Main {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();

        // Call methods
        ms.callNumber(1234567890);
        ms.pickCall();

        // Camera methods
        ms.takeSnap();
        ms.recordVideo();
        ms.record4KVideo();

        // WiFi methods
        String[] networks = ms.getNetworks();
        for (String network : networks) {
            System.out.println(network);
        }
        ms.connectToNetwork("HarryWiFi");
    }
}
