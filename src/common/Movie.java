package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable  {
    private int movieId;
    private String title;
    private String releasedDate;
    private String director;

    public Movie(int moviId, String title, String releasedDate, String director) {
        setMovieId(moviId);
        setTitle(title);
        setReleasedDate(releasedDate);
        setDirector(director);
    }
    
      
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.title);
        hash = 83 * hash + Objects.hashCode(this.movieId);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }
    
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }

    
    @Override
    public String toString() {
        return "Movie{" + "movieId=" + movieId + ", title=" + title + ", releasedDate=" + releasedDate + ", director=" + director + '}';
    }

  

    @Override
    public int compareTo(Object other) {
         Movie m = (Movie)other;
         return new CompareToBuilder()
               .append(this.movieId, m.movieId)
               .toComparison(); 
    }

   
    
}
