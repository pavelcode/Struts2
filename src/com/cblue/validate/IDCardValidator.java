package com.cblue.validate;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class IDCardValidator extends FieldValidatorSupport {

	//object是访问的Action对象
	@Override
	public void validate(Object object) throws ValidationException {
		// TODO Auto-generated method stub
		//1. 获取字段的名字和值
		String fieldName = getFieldName();
		System.out.println("fieldName="+fieldName);
		Object value = this.getFieldValue(fieldName, object); 
		System.out.println("value="+value);
		//2. 验证
		IDCard idCard = new IDCard();
		boolean result = idCard.Verify((String)value);        
		//3. 若验证失败, 则 ...
		if(!result){
		   addFieldError(fieldName, object);
		}        
	}

}
//18 位身份证验证器
class IDCard {
       final int[] wi = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };
       final int[] vi = { 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 };
       private int[] ai = new int[18];
       public IDCard() {}
       public boolean Verify(String idcard) {
          if (idcard.length() == 15) {
              idcard = uptoeighteen(idcard);
          }
          if (idcard.length() != 18) {
              return false;
          }
         String verify = idcard.substring(17, 18);
          if (verify.equals(getVerify(idcard))) {
             return true;
          }
         return false;
     }
      public String getVerify(String eightcardid) {
          int remaining = 0;
         if (eightcardid.length() == 18) {
             eightcardid = eightcardid.substring(0, 17);
         }
         if (eightcardid.length() == 17) {
             int sum = 0;
             for (int i = 0; i < 17; i++) {
                  String k = eightcardid.substring(i, i + 1);
                 ai[i] = Integer.parseInt(k);
              }
              for (int i = 0; i < 17; i++) { 
            	  sum = sum + wi[i] * ai[i];
             }
              remaining = sum % 11;
          }
          return remaining == 2 ? "X" : String.valueOf(vi[remaining]);
      }
      public String uptoeighteen(String fifteencardid) {
          String eightcardid = fifteencardid.substring(0, 6);
          eightcardid = eightcardid + "19";
          eightcardid = eightcardid + fifteencardid.substring(6, 15); 
           eightcardid = eightcardid + getVerify(eightcardid);
          return eightcardid;
     }
   }
