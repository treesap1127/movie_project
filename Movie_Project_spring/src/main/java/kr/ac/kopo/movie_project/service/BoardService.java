package kr.ac.kopo.movie_project.service;

import java.util.List;

import kr.ac.kopo.movie_project.model.BoardMaster;

public interface BoardService {

	List<BoardMaster> list();

	void add(BoardMaster item);

	

	void update(BoardMaster item);

	BoardMaster item(int boardId);

	void delete(int boardId);

}
