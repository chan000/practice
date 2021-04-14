package org.ict.mapper;

import java.util.List;

import org.ict.domain.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getList();
	
	public BoardVO read(Long bno);
	
	public void insert(BoardVO board);	
	
	public int delete(Long bno);

	

}
