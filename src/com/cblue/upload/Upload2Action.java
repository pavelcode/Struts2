package com.cblue.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionSupport;

public class Upload2Action extends ActionSupport {
	
		 private List<File> file;
		 private String[] fileContentType;
		 private String[] fileFileName;
		 
		 public List getFile() {
		  return file;
		 }
		 public void setFile(List file) {
		  this.file = file;
		 }
		 public String[] getFileContentType() {
		  return fileContentType;
		 }
		 public void setFileContentType(String[] fileContentType) {
		  this.fileContentType = fileContentType;
		 }
		 public String[] getFileFileName() {
		  return fileFileName;
		 }
		 public void setFileFileName(String[] fileFileName) {
		  this.fileFileName = fileFileName;
		 }
		 
		 @Override
		 public String execute() { 
		  System.out.println("Upload2Action---execute");
		
		  String path = ServletActionContext.getServletContext().getRealPath("/images");
		  if (file != null) {
		   File filetemp = new File(path);
		   if (!filetemp.exists()) {
		    //建立文件夹
		    filetemp.mkdir();
		   }
		   try {
			    for (int i = 0; i < file.size(); i++) {
			     File f = new File(filetemp, fileFileName[i]);
			     System.out.println("上传的文件为："+fileFileName[i]+this.fileContentType[i]);
			     FileUtils.copyFile(file.get(i), f);
			    }
		       } catch (IOException e) {
		          e.printStackTrace();
		   }
		  }
		  return SUCCESS;
		}
		
		


}
