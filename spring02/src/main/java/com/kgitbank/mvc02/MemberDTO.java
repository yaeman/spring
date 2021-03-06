package com.kgitbank.mvc02;

public class MemberDTO {
	//글로별 변수(자동초기화, null로 초기화)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//set메소드, setter
	public void setId(String id) {
		this.id = id; //지역변수를 구분하기위해 this를 사용
	}
	
	//get메소드, getter
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
