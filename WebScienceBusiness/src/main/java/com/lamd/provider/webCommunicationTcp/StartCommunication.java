package com.lamd.provider.webCommunicationTcp;

import com.lamd.commin.byteMutualConversionString.ByteToString;
import com.lamd.provider.modules.thermallmager.ThermalArray2Color;
import com.lamd.provider.webCommunicationTcp.config.ClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

@Service
public class StartCommunication extends ByteToString implements ApplicationRunner{
    private static final Logger logger = LoggerFactory.getLogger(ThermalArray2Color.class);
//implements ApplicationRunner
    @Autowired
    private ClientConfig clientConfig;

    private Socket socket;
    private InputStream socketin;
    private OutputStream socketOut;
    private int sleepTime;
    private String type;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        while (true){
            socket = new Socket();
            SocketAddress serverSocketAddress=new InetSocketAddress(clientConfig.getServerIP(),clientConfig.getServerProt());//serverIP,serverPort定义服务器套接字地址
            socket.connect(serverSocketAddress);//socket连接服务器套接字地址
            socketin = socket.getInputStream();
            socketOut= socket.getOutputStream(); //获取套接字socket的输出流

            DataOutputStream dataout =new DataOutputStream(socketOut);
            DataInputStream datain = new DataInputStream(socketin);

            byte[] bye = new byte[3200];

            while (true) {
                //判断是否有数据传输
                if (datain.available()>0) {
                    datain.read(bye,0,3200);
                    type = super.ToString(bye,3,2,0,3);
                    //是不是事件帧
                    if (type.equals("EVE")) {
                        //todo:控制发送短信
                    }
                    if (type.equals("ACK")){
                        System.out.println("+++++++++++++++++++++++");
                    }
                }
                Thread.sleep(1000);
                //每个5秒发送一次心脏包
                if (sleepTime % 5 == 0) {
                    try {
                        dataout.write("@@ACK##".getBytes());
                    }catch (Exception e){
                        logger.info("!!!!!!!!!!!!!! TCP服务器断开 !!!!!!!!!!"+e.getMessage());
                        break;
                    }

                }

                if (sleepTime == 5000){
                    sleepTime = 0;
                }

                sleepTime++;

            }

        }
    }
}
