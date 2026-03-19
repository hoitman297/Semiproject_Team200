package com.semi.spring.board.model.vo;

import java.util.Date;
//import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BoardMap {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardCd;
	
//	private String boardWriter; // userId, userName
	private String userId;
	private String userName;
	
	private int userNo;
	
	private int count;
	private Date postDate;
	
	private String categoryNo;
	private String gameCode; 
	private String categoryName;
	
	private int capacity;    
	private String tier;     
	private String current; 
	private String preferMap;
	
//	private List<AttachFile> fileList;
}

	

