package com.stackroute.springJdbc.domain;

public class Movie {
    private String movieName;
    private int movieId;
    private String actorsName;
    private  int releaseYear ;
    private float ratings;

        public Movie(int movieId,String movieName, String actorsName, int releaseYear, float ratings) {
            this.movieName = movieName;
            this.movieId = movieId;
            this.actorsName = actorsName;
            this.releaseYear = releaseYear;
            this.ratings = ratings;
        }

    public Movie() {

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getActorsName() {
        return actorsName;
    }

    public void setActorsName(String actorsName) {
        this.actorsName = actorsName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieId=" + movieId +
                ", actorsName='" + actorsName + '\'' +
                ", releaseYear=" + releaseYear +
                ", ratings=" + ratings +
                '}';
    }
}



