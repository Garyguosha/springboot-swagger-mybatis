package com.lamd.provider.webCommunicationTcp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.net.Socket;

@Component
@PropertySource("classpath:publicapplication.properties")
public class ClientConfig  {
    @Value("${serverIP}")
    private  String serverIP;
    @Value("${serverProt}")
    private  int serverProt;

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public int getServerProt() {
        return serverProt;
    }

    public void setServerProt(int serverProt) {
        this.serverProt = serverProt;
    }

}
