package com.darkmili.ecxkdemo.connect;

/**
 * 处理网络协议，对数据进行封包或解包
 * Created by Dark
 */
public interface ProtocolHandler<T> {

    public byte[] encodePackage(T data);//解包

    public T decodePackage(byte[] netData);//封包
}
