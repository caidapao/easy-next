package com.caidapao.easynext.repository.cache;

import com.caidapao.easynext.entity.SerialNumber;
import com.caidapao.easynext.entity.SerialNumberPart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地JVM缓存
 *
 * @author caixuan
 * @date 2022/11/24 23:52
 **/
@Component
@Slf4j
public class SerialCache {

    /**
     * 流水号缓存完成标识
     */
    public static Boolean initFinished = false;
    /**
     * 流水号缓存
     */
    private static final ConcurrentHashMap<String, SerialNumber> SERIAL_NUMBER = new ConcurrentHashMap<>();
    /**
     * 流水号成分缓存
     */
    private static final ConcurrentHashMap<String, List<SerialNumberPart>> SERIAL_NUMBER_PARTS = new ConcurrentHashMap<>();

    @PostConstruct
    public static void init() {
        log.info("项目启动完毕,开始初始化流水号数据到内存");
        //TODO:caidapao 项目启动时加载数据库的流水号数据
        log.info("项目启动完毕,结束初始化流水号数据到内存");
        initFinished = true;
    }

    public static boolean isInitFinish() {
        return initFinished;
    }

    public static SerialNumber getSerialNumber(String code) {
        return SERIAL_NUMBER.get(code);
    }

    public static List<SerialNumberPart> getSerialNumberParts(String code) {
        return SERIAL_NUMBER_PARTS.get(code);
    }

    public static void setSerialNumber(String code, SerialNumber serialNumber) {
        SERIAL_NUMBER.put(code, serialNumber);
    }

    public static void setSerialNumberParts(String code, List<SerialNumberPart> parts) {
        SERIAL_NUMBER_PARTS.put(code, parts);
    }
}
