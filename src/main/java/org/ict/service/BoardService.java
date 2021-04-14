package org.ict.service;

import java.util.List;

import org.ict.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> list();
	
	public BoardVO get(Long bno);
	
	public void create(BoardVO board);
	
	public boolean drop(Long bno);
	
}
