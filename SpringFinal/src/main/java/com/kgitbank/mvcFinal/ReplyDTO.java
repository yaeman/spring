package com.kgitbank.mvcFinal;

public class ReplyDTO {
	private String productId;
	private String content;
	private String writer;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "ReplyDTO [productId=" + productId + ", content=" + content + ", writer=" + writer + "]";
	}
}
