package com.kita.first.level3;

public class BoardVo { //vo는 데이터저장용

	private String title;
	private String content;
	private int writeId;

	public void setTitle(String title) {
		this.title = title;

	}

	public void setContent(String contents) {
		this.content = contents;

	}

	public void setWriteId(int writeId) {
		this.writeId = writeId;

	}

	public String getTitle() {

		return title;
	}

	public String getContent() {

		return content;
	}

	public int getWriteId() {

		return writeId;
	}

	public BoardVo() {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}

	public BoardVo(String title, String content, int writeId) {
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}
}
