package kr.ac.kopo.movie_project.dao;

import java.util.HashMap;
import java.util.List;

import kr.ac.kopo.movie_project.model.Movie;
import kr.ac.kopo.movie_project.model.MovieAdmin;
import kr.ac.kopo.movie_project.model.Theater;
import kr.ac.kopo.movie_project.model.TicketItem;
import kr.ac.kopo.movie_project.model.Ticketing;

public interface MypageDao {

	List<MovieAdmin> list(String id);

	void sit_add(Theater item);

	List<Theater> theaterlist(String cinemaCode);

	List<Theater> theaterlist(String cinemaCode, String theaterName);

	void sitUpdate(Theater item);

	void theater_delete(String cinemaCode, String theaterName);

	void deleteTheater(String cinemaCode);

	void deleteCinema(String cinemaCode);

	List<Movie> movielist(HashMap<String, Object> map);

	void movieadd(Movie item);

	void moviedelete(Movie item);

	void movie_delete(String cinemaCode, String theaterName);

	void movie_all_delete(String cinemaCode);

	List<TicketItem> myticket(String id);

	String cancel(Ticketing item);

	List<TicketItem> myDateTicket(String id);

	MovieAdmin cinemaItem(String cinemaCode);

	void cinemaUpdate(MovieAdmin item);

	int moviecode(Movie item);

	void sitdelete(Movie item);

	void ticketdelete(Movie item);

	void th_sitdelete(String theaterName);

	void th_ticketdelete(String theaterName);

	int admincheck(String id);

	void adminUpdate(String id);

	void ci_sitdelete(String cinemaCode);

	void ci_ticketdelete(String cinemaCode);

	Ticketing ticketitem(Ticketing item);

	void sitdelete(Ticketing list);


}
