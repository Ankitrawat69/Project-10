package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_movie")
public class MovieDTO extends BaseDTO {
	
	@Column(name = "movieTitle", length = 50)
	private String movieTitle;
	
	@Column(name = "reviewerName", length = 50)
	private String reviewerName;
	
	@Column(name = "rating", length = 50)
	private Integer rating;
	
	@Column(name = "reviewText", length = 50)
	private String reviewText;

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	@Override
	public String getValue() {
		return movieTitle;
	}

	@Override
	public String getUniqueKey() {
		return "movieTitle";
	}

	@Override
	public String getUniqueValue() {
		return movieTitle;
	}

	@Override
	public String getLabel() {
		return "Movie Title";
	}

	@Override
	public String getTableName() {
		return "Movie";
	}
}
