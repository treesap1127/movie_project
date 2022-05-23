package kr.ac.kopo.movie_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.movie_project.dao.ServiceCenterDao;
import kr.ac.kopo.movie_project.model.Board;
import kr.ac.kopo.movie_project.util.Pager;
@Service
public class ServiceCenterserviceImpl implements ServiceCenterservice {
	@Autowired
	ServiceCenterDao dao;
	
	@Override
	public List<Board> list(Pager pager,Long boardId) {
		int total = dao.total(pager);
		pager.setTotal(total);
		return dao.list(pager,boardId);
	}


	@Override
	public void add(Board item) {
		dao.add(item);
		
	}

	@Override
	public void update(Board item) {
		dao.update(item);
		
	}


	@Override
	public Board item(int boardId, int articleId) {
	
		return dao.item(boardId, articleId);
	}


	@Override
	public void delete(int boardId, int articleId) {
		dao.delete(boardId, articleId);
	}

}
