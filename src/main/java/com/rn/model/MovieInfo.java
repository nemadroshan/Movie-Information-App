package com.rn.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieInfo implements Serializable{

@JsonProperty("Title")
private String title;
@JsonProperty("Year")
private String year;
@JsonProperty("Rated")
private String rated;
@JsonProperty("Released")
private String released;
@JsonProperty("Runtime")
private String runtime;
@JsonProperty("Genre")
private String genre;
@JsonProperty("Director")
private String director;
@JsonProperty("Writer")
private String writer;
@JsonProperty("Actors")
private String actors;
@JsonProperty("Plot")
private String plot;
@JsonProperty("Language")
private String language;
@JsonProperty("Country")
private String country;
@JsonProperty("Awards")
private String awards;
@JsonProperty("Poster")
private String poster;
@JsonProperty("Metascore")
private String metascore;
@JsonProperty("imdbRating")
private String imdbRating;
@JsonProperty("imdbVotes")
private String imdbVotes;
@JsonProperty("imdbID")
private String imdbID;
   
   public MovieInfo() {
     System.out.println("MovieInfo :: zero Param Constructor");
  }

   @JsonProperty("Title")
public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

@JsonProperty("Year")
public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getRated() {
	return rated;
}

public void setRated(String rated) {
	this.rated = rated;
}

public String getReleased() {
	return released;
}

public void setReleased(String released) {
	this.released = released;
}

public String getRuntime() {
	return runtime;
}

public void setRuntime(String runtime) {
	this.runtime = runtime;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

public String getWriter() {
	return writer;
}

public void setWriter(String writer) {
	this.writer = writer;
}

public String getActors() {
	return actors;
}

public void setActors(String actors) {
	this.actors = actors;
}

public String getPlot() {
	return plot;
}

public void setPlot(String plot) {
	this.plot = plot;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getAwards() {
	return awards;
}

public void setAwards(String awards) {
	this.awards = awards;
}

public String getPoster() {
	return poster;
}

public void setPoster(String poster) {
	this.poster = poster;
}

public String getMetascore() {
	return metascore;
}

public void setMetascore(String metascore) {
	this.metascore = metascore;
}

public String getImdbRating() {
	return imdbRating;
}

public void setImdbRating(String imdbRating) {
	this.imdbRating = imdbRating;
}

public String getImdbVotes() {
	return imdbVotes;
}

public void setImdbVotes(String imdbVotes) {
	this.imdbVotes = imdbVotes;
}

public String getImdbID() {
	return imdbID;
}

public void setImdbID(String imdbID) {
	this.imdbID = imdbID;
}

@Override
public String toString() {
	return "MovieInfo [title=" + title + ", year=" + year + ", rated=" + rated + ", released=" + released + ", runtime="
			+ runtime + ", genre=" + genre + ", director=" + director + ", writer=" + writer + ", actors=" + actors
			+ ", plot=" + plot + ", language=" + language + ", country=" + country + ", awards=" + awards + ", poster="
			+ poster + ", metascore=" + metascore + ", imdbRating=" + imdbRating + ", imdbVotes=" + imdbVotes
			+ ", imdbID=" + imdbID + "]";
}
 
   
   
}