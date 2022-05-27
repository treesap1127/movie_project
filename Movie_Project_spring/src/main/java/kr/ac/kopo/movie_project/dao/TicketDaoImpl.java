package kr.ac.kopo.movie_project.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.movie_project.model.Movie;
import kr.ac.kopo.movie_project.model.MovieAdmin;
import kr.ac.kopo.movie_project.model.SitSelect;
import kr.ac.kopo.movie_project.model.Theater;

@Repository
public class TicketDaoImpl implements TicketDao {
	@Autowired
	SqlSession sql;
	@Override
	public List<Movie> movielist() {
		return sql.selectList("ticket.movielist");
	}
	@Override
	public List<MovieAdmin> movieplace(MovieAdmin bicCity) {
		return sql.selectList("ticket.movieplace", bicCity);
	}
	@Override
	public List<Movie> cinema(MovieAdmin item) {
		return sql.selectList("ticket.cinema", item);
	}
	@Override
	public List<Movie> cinemaCode(Movie item) {
		return  sql.selectList("ticket.cinemaCode", item);
	}
	@Override
	public List<Movie> cinematime(Movie item) {
		return sql.selectList("ticket.cinematime", item);
	}
	@Override
	public List<Movie> cinemaDate(Movie item) {
		return sql.selectList("ticket.cinemaDate", item);
	}
	@Override
	public List<Theater> ticketsit(Movie list) {
		return sql.selectList("ticket.ticketsit", list);
	}
	@Override
	public Movie moviecode(Movie item) {
		return sql.selectOne("ticket.moviecode", item);
	}
	@Override
	public Movie movieimage(Movie list) {
		return sql.selectOne("ticket.movieimage",list);
	}
	@Override
	public Movie sitTicdata(SitSelect item) {
		return sql.selectOne("ticket.socTicdata",item);
	}
	@Override
	public String sit_tic_add(SitSelect item) {
		try {
			sql.insert("ticket.sit_tic_add",item);
		} catch (Exception e) {
			return "";
		}
		return "true";
	}
	@Override
	public Movie paymentItem(SitSelect item) {
		return sql.selectOne("ticket.paymentItem", item);
	}
	

}
