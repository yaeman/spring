package com.kgitbank.mvc03;

public class MemberDTO {
	//�۷κ� ����(�ڵ��ʱ�ȭ, null�� �ʱ�ȭ)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//set�޼ҵ�, setter
	public void setId(String id) {
		this.id = id; //���������� �����ϱ����� this�� ���
	}
	
	//get�޼ҵ�, getter
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
