package com.foxxist.firefoxcenter.controller.admin.upload;

import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.service.OssService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 管理员资源上传控制器
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/20 13:33
 */
@Slf4j
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminUploadController {

    private final OssService ossService;

    /**
     * 处理管理员上传头像的POST请求。
     * 该方法会检查文件类型和大小，然后将文件上传到OSS（对象存储服务）。
     *
     * @param file 上传的文件
     * @return 返回上传结果，包括成功或失败的信息
     */
    @PostMapping("/upload/avatar")
    public Result<String> uploadAvatar(@RequestParam("file") MultipartFile file) {
        try {
            // Step 1: 检查管理员上传文件类型
            String contentType = file.getContentType();
            if (contentType == null || !contentType.startsWith("image/")) {
                return Result.error("只能上传图片文件");
            }

            // Step 2: 检查文件大小（限制为2MB）
            if (file.getSize() > 2 * 1024 * 1024) {
                return Result.error("图片大小不能超过2MB");
            }

            // Step 3: 上传到OSS
            String url = ossService.uploadFile(file, "admin/avatar");
            return Result.success(url);
        } catch (Exception e) {
            log.error("管理员头像上传失败", e);
            return Result.error("管理员头像上传失败：" + e.getMessage());
        }
    }
}
