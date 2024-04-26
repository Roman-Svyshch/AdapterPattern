package org.example.model;

import org.example.interfaces.SocketAdapter;

public class SocketAdapterImplUsingKomposition implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = socket.getVolt();
        return converteVolt(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = socket.getVolt();
        return converteVolt(v,40);
    }

    @Override
    public Volt get1Volt() {
        Volt v = socket.getVolt();
        return converteVolt(v,120);
    }
    private Volt converteVolt(Volt v,int i){
        return new Volt(v.getVolts()/i);
    }
}
