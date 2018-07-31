package com.mashensoft.factory;
public class PhoneFactory {
	public static Phone createPhone(String phonebBrand){
		if(phonebBrand.equalsIgnoreCase("miphone")){
			return new XiaoMiPhone();
		}else if(phonebBrand.equalsIgnoreCase("iphone")){
			return new IPhone();
		}
		return null;
	}
	
	public static XiaoMiPhone createXiaoMiPhone(){
		return new XiaoMiPhone();
	}
	public static IPhone createIPhone(){
		return new IPhone();
	}
	public static void main(String[] args) {
	}
}
