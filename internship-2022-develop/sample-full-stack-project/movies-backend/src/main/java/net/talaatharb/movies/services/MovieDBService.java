package net.talaatharb.movies.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import net.talaatharb.movies.dtos.MoviePage;
import net.talaatharb.movies.model.Movies;
import net.talaatharb.movies.reposotiry.MovieRepository;

@Service
@RequiredArgsConstructor
public class MovieDBService {
	

	 RestTemplate restTemplate;
	 MovieRepository movierepository ;

	private String apiKey = "a97243d7813d31446f6c43284e6854d5";

	private String apiUrl = "https://api.themoviedb.org/3";

	private static final String URL_SEGEMENT_FOR_POPULAR = "/movie/popular";

	public MoviePage getPopularMovies(Integer page) {
		//https://api.themoviedb.org/3/movie/popular?api_key=a97243d7813d31446f6c43284e6854d5&page=1
		String urlForPopularMovies = apiUrl + URL_SEGEMENT_FOR_POPULAR + "?api_key=" + apiKey + "&page="
				+ page.intValue();
		System.out.println(urlForPopularMovies);
		
		return restTemplate.getForEntity(urlForPopularMovies, MoviePage.class).getBody();
	}
	
	public Movies GetMovies(Integer id) {
		String urlForMovie = apiUrl + "/movie/" + id + "?api_key=" + apiKey;
		boolean isMovieInDB = movierepository.existsById(id);
		if (isMovieInDB) {
			return movierepository.findById(id).get();
		} else {
			Movies movie = restTemplate.getForEntity(urlForMovie, Movies.class).getBody();
			System.out.println(movie);
			movierepository.save(movie);
			return movie;
		}
		
	}
	public Object searchMovie(String title) {
		//https://api.themoviedb.org/3/search/?api_key=a97243d7813d31446f6c43284e6854d5&query=
		String urlForMovie = apiUrl + "/search/movie?api_key=" + apiKey + "&query=" + title;
		System.out.println(urlForMovie);
		return restTemplate.getForEntity(urlForMovie, Object.class).getBody();
	}
}
