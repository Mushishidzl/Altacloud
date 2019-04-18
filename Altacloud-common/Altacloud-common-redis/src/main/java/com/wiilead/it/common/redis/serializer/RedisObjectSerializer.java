package com.wiilead.it.common.redis.serializer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @ClassName: RedisObjectSerializer
 * @Description: 序列化对象，对象必须实现序列化
 * @Author mushishi
 * @Date 2019/4/18-17:45
 */
public class RedisObjectSerializer implements RedisSerializer<Object> {

    // 做一个空数组，不是null
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    // 为了方便进行对象与字节数组的转换，所以应该首先准备出两个转换器
    private Converter<Object, byte[]> serializingConverter = new SerializingConverter();
    private Converter<byte[], Object> deserializingConverter = new DeserializingConverter();


    @Override
    public byte[] serialize(Object obj) throws SerializationException {
        if (obj == null) {
            return EMPTY_BYTE_ARRAY;
        }
        // 将对象变为字节数组
        return this.serializingConverter.convert(obj);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        // 此时没有对象的内容信息
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        // 将字节数组转换成对象
        return this.deserializingConverter.convert(bytes);
    }
}
