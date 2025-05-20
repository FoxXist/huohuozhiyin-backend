package com.foxxist.firefoxcenter.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * OSS服务接口
 */
public interface OssService {
    /**
     * 上传文件到OSS
     *
     * @param file 文件
     * @param dir 目录
     * @return 文件访问URL
     */
    String uploadFile(MultipartFile file, String dir);
} 