package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{

    public void meth1(){
        System.out.println("meth1");
    }

    public void meth2(){
        System.out.println("meth2");
    }

    public void meth3(){
        System.out.println("meth3");
    }

    public void meth4(){
        System.out.println("meth4");
    }
}

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }

    public void recordVideo(){
        System.out.println("Taking snap");
    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }

    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class Main {
    public static void main(String[] args) {
        // Testing MySampleClass
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

        // Testing MySmartPhone2
        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        cam1.record4KVideo();
        
        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(7979);
    }
}
