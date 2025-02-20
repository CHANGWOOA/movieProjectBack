package com.care.project.main.dto;

public class MovieDTO {
    private int movieId;  // movie_ID -> movieId
    private String title;
    private String posterUrl;  // poster_URL -> posterUrl
    private String movieSynopsis;  // synopsis -> movieSynopsis
    private String directorName;  // director -> directorName
    private String actors;  // actors -> actors
    private String rank; // rank - > rank (영화데이터 api를 위한 추가, kobis에서 가져오는 rank의 자료형은 int이지만 날짜구별을 위해 앞에
    // "날짜 - 순위" 이런식으로 만들어서 데이터베이스 넣을거라서 String으로 작성

	// Getters and Setters
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getMovieSynopsis() {
        return movieSynopsis;
    }

    public void setMovieSynopsis(String movieSynopsis) {
        this.movieSynopsis = movieSynopsis;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
}