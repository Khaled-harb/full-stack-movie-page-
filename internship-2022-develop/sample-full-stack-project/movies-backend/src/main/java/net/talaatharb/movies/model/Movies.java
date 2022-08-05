package net.talaatharb.movies.model;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
@Table
public class Movies {
	@Id
	private Integer id;
	@Column(name = "title")
	private String title;
	@Column(name = "overview")

	private String overview;
	@Column(name = "poster_path")
	private String poster_path;
	@Column(name = "backdrop_path")
	private String backdrop_path;
	@Column(name = "vote_average")
	private Integer vote_average;
	@Column(name = "vote_count")
	private Integer vote_count;
	@Column(name = "adult")
	private boolean adult;
	@Column(name = "release_date")
	private String release_date;
	@Column(name = "original_title")
	private String original_title;
	@Column(name = "revenue")
	private String revenue;

	public Movies() {
		super();
	}

	public Movies(Integer id, String title, String overview, String poster_path, String backdrop_path,
			Integer vote_average, Integer vote_count, boolean adult, String release_date, String original_title,
			String revenue) {
		super();
		this.id = id;
		this.title = title;
		this.overview = overview;
		this.poster_path = poster_path;
		this.backdrop_path = backdrop_path;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
		this.adult = adult;
		this.release_date = release_date;
		this.original_title = original_title;
		this.revenue = revenue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public Integer getVote_average() {
		return vote_average;
	}

	public void setVote_average(Integer vote_average) {
		this.vote_average = vote_average;
	}

	public Integer getVote_count() {
		return vote_count;
	}

	public void setVote_count(Integer vote_count) {
		this.vote_count = vote_count;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

}
