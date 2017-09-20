package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 上传
 * Created by Administrator on 2017/9/20.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);

}
