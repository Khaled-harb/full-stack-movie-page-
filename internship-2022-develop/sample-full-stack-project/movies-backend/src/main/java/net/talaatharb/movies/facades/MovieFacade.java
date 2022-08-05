package net.talaatharb.movies.facades;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.talaatharb.movies.services.MovieDBService;

@Service
@RequiredArgsConstructor
public class MovieFacade {
	
	private final MovieDBService movieDBService = new MovieDBService();
	
	public Object getPopularMovies(Integer page) {
		return movieDBService.getPopularMovies(page);
	}
	 public Object getMovie(Integer id) {
		return movieDBService.GetMovies(id);
 	 }
	 public Object searchMovie(String title) {
		return movieDBService.searchMovie(title);
	 }

}
