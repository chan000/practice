package org.ict.mapper;

import java.util.List;

import org.ict.domain.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getList();

	public BoardVO read(int bno);

	public String insert(BoardVO board);

	public int remove(int bno);
}
