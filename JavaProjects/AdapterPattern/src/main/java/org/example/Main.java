package org.example;

import org.example.interfaces.SocketAdapter;
import org.example.model.SocketAdapterImplUsingKomposition;
import org.example.model.Volt;

public class Main {
    public static void main(String[] args) {
    testSocketAdapterKomposition();
    }

    private static  void testSocketAdapterKomposition(){
        SocketAdapter socketAdapter = new SocketAdapterImplUsingKomposition();
        Volt v12 = getVolt(socketAdapter,12);
        Volt v3 = getVolt(socketAdapter,3);
        Volt v120 = getVolt(socketAdapter,120);
        System.out.println(v3.getVolts());
        System.out.println(v12.getVolts());
        System.out.println(v120.getVolts());
    }
    private static Volt getVolt(SocketAdapter socketAdapter,int i){
        switch (i){
            case 1: return socketAdapter.get1Volt();
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get12Volts();
            case 120: return socketAdapter.get120Volts();
            default: return socketAdapter.get120Volts();}

    }
}
