package learn.kafka.Learn.Kafka;

import java.util.List;

public interface MovieProvider {
  List<String> movies();
  void seeListMovies();
}
