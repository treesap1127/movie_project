package kr.ac.kopo.movie_project.service;

import java.util.List;

import kr.ac.kopo.movie_project.model.Faq;
import kr.ac.kopo.movie_project.model.Notice;
import kr.ac.kopo.movie_project.util.Pager;

public interface NoticeService {

	String add(Notice item);

	Notice item(int articleId);

	void delete(int articleId);

	String update(Notice item);

	List<Notice> list(Pager pager);

	List<Notice> notice();

	List<Faq> faq();

	void viewCount(int articleId);

}
