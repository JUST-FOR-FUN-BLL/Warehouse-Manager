package tool.warehouse.sso.service;

import org.springframework.web.multipart.MultipartFile;

import tool.warehouse.common.pojo.PictureResult;



public interface PictureService {
		PictureResult uploadPic(MultipartFile picFile);
}
