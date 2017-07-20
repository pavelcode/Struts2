package com.cblue.validate;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class AgeValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object obj) throws ValidationException {
		// TODO Auto-generated method stub
		System.out.println("AgeValidate --obj="+obj);
		//获取字段名称
		String filedName = this.getFieldName();
		System.out.println("filedName="+filedName);
		//获取字段的值
		Object filedValue = this.getFieldValue(filedName, obj);
		System.out.println("filedValue="+filedValue);
		//判断字段值的类型
		if(filedValue instanceof Integer){
			Integer age = (Integer)filedValue;
			if(age<0){
				this.addFieldError(filedName, obj);
			}
		}
		
	}

}
