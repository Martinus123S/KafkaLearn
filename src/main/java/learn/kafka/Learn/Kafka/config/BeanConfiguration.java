package learn.kafka.Learn.Kafka.config;

import learn.kafka.Learn.Kafka.MovieApp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
  @Bean
  public MovieApp movieApps(){
    return new MovieApp();
  }
}
