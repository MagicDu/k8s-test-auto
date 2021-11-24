package com.magicdu.questionpaper.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取项目基础配置
 */
@Component
@ConfigurationProperties(prefix = "magic")
public class MagicConfig {
    // 文件上传路径
    private static String  uploadPath;

    public static String getUploadPath() {
        return uploadPath;
    }

    public  void setUploadPath(String uploadPath) {
        MagicConfig.uploadPath = uploadPath;
    }
}
