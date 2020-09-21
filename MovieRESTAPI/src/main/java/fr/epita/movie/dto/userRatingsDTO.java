package fr.epita.movie.dto;

public class userRatingsDTO {
	
	private long ratings;
	private String commentTitle;
	private String commentContent;
	private long userId;
	
	public userRatingsDTO() {
		
	}
	public long getRatings() {
		return ratings;
	}
	public void setRatings(long ratings) {
		this.ratings = ratings;
	}
	public String getCommentTitle() {
		return commentTitle;
	}
	public void setCommentTitle(String commentTitle) {
		this.commentTitle = commentTitle;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
}
