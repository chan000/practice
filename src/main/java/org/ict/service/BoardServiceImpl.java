package org.ict.service;

import java.util.List;

import org.ict.domain.BoardVO;
import org.ict.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;

	@Override
	public List<BoardVO> list() {
		return mapper.getList();
	}

	@Override
	public BoardVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public void create(BoardVO board) {
			mapper.insert(board);
			
	}

	@Override
	public boolean drop(Long bno) {
		return mapper.delete(bno)==1;
	}
	
}
