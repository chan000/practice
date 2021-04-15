package org.ict.service;

import java.util.List;

import org.ict.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> get();
	
	public BoardVO read(int bno);
	
	public String add(BoardVO board);
	
	public int remove(int bno);
}
