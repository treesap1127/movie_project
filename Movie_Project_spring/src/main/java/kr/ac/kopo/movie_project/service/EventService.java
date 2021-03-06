package kr.ac.kopo.movie_project.service;

import java.util.List;

import kr.ac.kopo.movie_project.model.Event;
import kr.ac.kopo.movie_project.util.Pager;

public interface EventService {

	List<Event> continue_Event(Pager pager);

	List<Event> end_Event(Pager pager);

	String NoticeEventAdd(Event item);

	void delete(int eventId);	

	Event item(int eventId);

	String NoticeEventUpdate(Event item);

	void viewcnt(Event item);	

}
