package com.cblue.upload;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Upload1Action extends ActionSupport {
  
	//上传文件
	private File myFile;
	//文件名
	private String myFileFileName;
	//文件类型
	private String myFileContentType;

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Upload1Action--execute--"+myFile.toString()+"--"+this.getMyFileFileName()+"---"+this.getMyFileContentType());
		//获得上传目录
		String saveDic = ServletActionContext.getServletContext().getRealPath("/images/");
		System.out.println("saveDic="+saveDic);
		try {
			if (saveDic != null) {
				   File filetemp = new File(saveDic);
				   if (!filetemp.exists()) {
				    //建立文件夹
				         filetemp.mkdirs();
				   }
				 //上传文件
				FileUtils.copyFile(myFile, new File(saveDic, myFileFileName));
			}
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		
		
		
		return SUCCESS;
	}

	
}
