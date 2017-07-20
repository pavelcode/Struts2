package com.cblue.convert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class DateConvert extends StrutsTypeConverter {

	//֧日期类型的转换格式
	private final DateFormat[] dfs={
        new SimpleDateFormat("yyyy年MM月dd日"),
        new SimpleDateFormat("yyyy-MM-dd"),
        new SimpleDateFormat("MM/dd/yy"),
        new SimpleDateFormat("yyyy.MM.dd"),
        new SimpleDateFormat("yy.MM.dd"),
        new SimpleDateFormat("yyyy/MM/dd")
    };
    
    /**
     * 从字符串转换为其他数据类型
     */
	@Override
	public Object convertFromString(Map context, String[] values, Class toType) {
		// TODO Auto-generated method stub
		        String dateStr=values[0];       //获得需要转换的字符串
	        for (int i = 0; i < dfs.length; i++) {   //遍历所有可以转换的类型
	            try {
	                return dfs[i].parse(dateStr);
	            } catch (Exception e) {
	                continue;
	            }
	        }
	        //抛出异常
	        throw new TypeConversionException();
	}

	/**
     * 其他数据类型转换为字符串
     */
	@Override
	public String convertToString(Map context, Object object) {
		// TODO Auto-generated method stub
		  Date date=(Date) object;
	        //字符串转换为yyyy-MM-dd
	      return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

}
