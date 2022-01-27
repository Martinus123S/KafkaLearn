package learn.kafka.Learn.Kafka;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class MovieApp implements MovieProvider{
  @Override
  public List<String> movies() {
    List<String> movie = new ArrayList<>();
    movie.add("Episode 1");
    movie.add("Episode 2");
    movie.add("Episode 3");
    movie.add("Episode 4");
    return movie;
  }

  @Override
  public void seeListMovies() {
    movies().forEach(movie->{
      System.out.println(movie);
    });
  }
}
