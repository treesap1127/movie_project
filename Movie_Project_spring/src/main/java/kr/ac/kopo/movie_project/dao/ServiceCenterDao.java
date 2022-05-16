package kr.ac.kopo.movie_project.dao;

import java.util.List;

import kr.ac.kopo.movie_project.model.Board;

public interface ServiceCenterDao {

	List<Board> list();

	void add(Board item);

	Board item(int articleId);

	void update(Board item);

	void delete(int articleId);

}
