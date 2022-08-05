package net.talaatharb.movies.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import net.talaatharb.movies.facades.MovieFacade;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/movies")
public class MoviesController {
	
	private final MovieFacade movieFacade = new MovieFacade();
	
	@GetMapping(path = "/popular")
	public ResponseEntity<Object> getPopularMovies(@RequestParam Integer page){
		
		return new ResponseEntity<>(movieFacade.getPopularMovies(page), HttpStatus.OK);
	}
	@GetMapping(path = "/{id}")
	public ResponseEntity<Object> getMovie(@PathVariable Integer id){
		return new ResponseEntity<>(movieFacade.getMovie(id), HttpStatus.OK);
	}
	@GetMapping(path = "/search")
	public ResponseEntity<Object> searchMovie(@RequestParam String title){
		return new ResponseEntity<>(movieFacade.searchMovie(title), HttpStatus.OK);
	}
}
