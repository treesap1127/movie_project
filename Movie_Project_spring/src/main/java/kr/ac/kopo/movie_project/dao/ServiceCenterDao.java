package kr.ac.kopo.movie_project.dao;

import java.util.List;

import kr.ac.kopo.movie_project.model.BoardMaster;

public interface ServiceCenterDao {

	List<BoardMaster> noticeView();

	void noticeadd(BoardMaster boardmaster);

	void noticeupdate(BoardMaster boardmaster);

	void delete(int boardId);

	BoardMaster item(int boardId);

}
