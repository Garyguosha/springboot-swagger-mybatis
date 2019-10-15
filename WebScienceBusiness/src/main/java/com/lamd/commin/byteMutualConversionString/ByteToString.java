package com.lamd.commin.byteMutualConversionString;

import org.springframework.context.annotation.Configuration;


public abstract class ByteToString {
    private static String hexString="0123456789ABCDEF";
    /**
     *   指定字节转换为字符串
     * @param bytes  处理字节数组
     * @param resize 转化字节数组大小
     * @param srcPos 截取bytes srcPos位置之后的字节
     * @param destPos 截取后的字节偏移量
     * @param length  转换长度
     * @return
     */
    public String ToString(byte[] bytes,int resize,int srcPos,int destPos,int length){

        if (bytes == null){
            return null;
        }
        byte[] by = new byte[resize];
        System.arraycopy(bytes, srcPos, by, destPos, length);
        return new String (by);
    }

    /**
     *   一个字节里放了两个16进制字符转换为字符串
     * @param bytes  处理字节数组
     * @param resize 转化字节数组大小
     * @param srcPos 截取bytes srcPos位置之后的字节
     * @param destPos 截取后的字节偏移量
     * @param length  转换长度
     * @return
     */
    public  String encode(byte[] bytes,int resize,int srcPos,int destPos,int length)
    {
        if (bytes == null){
            return  null;
        }
        byte[] by = new byte[resize];
        StringBuilder sb=new StringBuilder(by.length*2);
        for(int i=0;i<by.length;i++)
        {
            sb.append(hexString.charAt((by[i]&0xf0)>>4));
            sb.append(hexString.charAt((by[i]&0x0f)>>0));
        }
        return sb.toString();
    }

    /**
     *  将字符转为16进制 存储到一个字节
     * @param strEncode  转换字符串
     * @return
     */
    public byte[] ToHex (String strEncode) {
        if(strEncode.length() == 0) {
            return null;
        }

        int aux = 0;
        byte[] by = new byte[strEncode.length() / 2];
        for (int i = 0; i < strEncode.length() / 2 ; i++) {
            by[i] = (byte)Integer.parseInt(strEncode.substring (aux, aux+2),16);
            aux += 2;
        }
        aux = 0;
        return by;
    }
}
