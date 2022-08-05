package net.talaatharb.movies.reposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.talaatharb.movies.model.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {

}
