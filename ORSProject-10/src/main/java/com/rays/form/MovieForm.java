package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MovieDTO;

public class MovieForm extends BaseForm{
	
	@NotEmpty(message = "MovieTitle is required")
	private String movieTitle;
	
	@NotEmpty(message = "ReviewerName is required")
	private String reviewerName;
	
	@NotNull(message = "Rating is required")
	private Integer rating;
	
	@NotEmpty(message = "ReviewText is required")
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
    public BaseDTO getDto() {
        
    	MovieDTO dto = initDTO(new MovieDTO());
                 dto.setMovieTitle(movieTitle);
                 dto.setReviewerName(reviewerName);
                 dto.setRating(rating);
                 dto.setReviewText(reviewText);
    	         return dto;
    }
	
}
