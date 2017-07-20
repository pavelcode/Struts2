package com.cblue.download;

import java.beans.Encoder;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.URLEncoder;

import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	
	//下載文件的输入流
	private InputStream downloadFile;
	//下载的文件名
	private String fileName; 

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getDownloadFile() {
     	return downloadFile;
	}

	public void setDownloadFile(InputStream downloadFile) {
		this.downloadFile = downloadFile;
	}

	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DownloadAction---execute");	
	
      // String realPath = ServletActionContext.getServletContext().getRealPath("files/t1.png");
       String realPath = ServletActionContext.getServletContext().getRealPath("files/百度.png");
		
		System.out.println("realpath="+realPath);
		downloadFile = new FileInputStream(realPath);
		//获得文件名，会自动替换配置文件中的
		fileName = FilenameUtils.getName(realPath);
		//支持中文文件的下载
		fileName = URLEncoder.encode(fileName, "UTF-8");
		return SUCCESS;
	}

}
