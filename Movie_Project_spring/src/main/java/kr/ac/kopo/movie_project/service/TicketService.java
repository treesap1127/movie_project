package kr.ac.kopo.movie_project.service;

import java.text.ParseException;
import java.util.List;

import kr.ac.kopo.movie_project.model.Movie;
import kr.ac.kopo.movie_project.model.MovieAdmin;
import kr.ac.kopo.movie_project.model.SitSelect;
import kr.ac.kopo.movie_project.model.Theater;
import kr.ac.kopo.movie_project.model.Ticketing;

public interface TicketService {

	List<Movie> movielist();

	List<MovieAdmin> movieplace(MovieAdmin bicCity);

	List<Movie> cinema(MovieAdmin item);

	List<Movie> cinemaCode(Movie item);

	List<Movie> cinematime(Movie item) throws ParseException;

	List<Movie> cinemaDate(Movie item);

	List<Theater> ticketsit(Movie list);

	List<Movie> view();

	Movie moviecode(Movie item);

	Movie movieimage(Movie list);

	Movie sitTicdata(SitSelect item);

	String sit_tic_add(SitSelect item);

	Movie paymentItem(SitSelect item);

	String ticketcomplete(Ticketing item) throws Exception;

	String sit_tic_delete(SitSelect item) throws InterruptedException;

	void ticketsitadd(Ticketing item);

	List<SitSelect> sitset(SitSelect item);

	Ticketing ticketitem(Ticketing item);

}
