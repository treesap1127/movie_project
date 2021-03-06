package kr.ac.kopo.movie_project.dao;

import java.util.List;

import kr.ac.kopo.movie_project.model.Movie;
import kr.ac.kopo.movie_project.model.MovieAdmin;
import kr.ac.kopo.movie_project.model.SitSelect;
import kr.ac.kopo.movie_project.model.Theater;
import kr.ac.kopo.movie_project.model.Ticketing;

public interface TicketDao {

	List<Movie> movielist();

	List<MovieAdmin> movieplace(MovieAdmin bicCity);

	List<Movie> cinema(MovieAdmin item);

	List<Movie> cinemaCode(Movie item);

	List<Movie> cinematime(Movie item);

	List<Movie> cinemaDate(Movie item);

	List<Theater> ticketsit(Movie list);

	Movie moviecode(Movie item);

	Movie movieimage(Movie list);

	Movie sitTicdata(SitSelect item);

	String sit_tic_add(SitSelect item);

	Movie paymentItem(SitSelect item);

	void ticketcomplete(Ticketing item);

	void ticketcomplete_sit(Ticketing item);

	String sit_tic_delete(SitSelect item);

	void ticketcomplete_delete_sit(Ticketing item);

	SitSelect ticketcompletecheck(Ticketing item);

	List<SitSelect> sitset(SitSelect list);

	Ticketing ticketitem(Ticketing item);

}
