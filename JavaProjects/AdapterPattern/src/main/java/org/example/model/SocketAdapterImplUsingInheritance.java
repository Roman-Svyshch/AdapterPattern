package org.example.model;

import org.example.interfaces.SocketAdapter;

//class Adapter
public class SocketAdapterImplUsingInheritance extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = getVolt();
        return converteVolt(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = getVolt();
        return converteVolt(v,40);
    }

    @Override
    public Volt get1Volt() {
        Volt v = getVolt();
        return converteVolt(v,120);
    }

    private Volt converteVolt(Volt v,int i){
        return new Volt(v.getVolts()/i);
    }
}
