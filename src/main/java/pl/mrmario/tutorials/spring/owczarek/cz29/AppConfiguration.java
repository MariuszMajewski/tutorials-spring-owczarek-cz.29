package pl.mrmario.tutorials.spring.owczarek.cz29;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.mrmario.tutorials.spring.owczarek.cz29.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz29.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz29.domain.User;
import pl.mrmario.tutorials.spring.owczarek.cz29.implementations.DateLogger;
import pl.mrmario.tutorials.spring.owczarek.cz29.implementations.UsersRepositoryImpl;

@Configuration
@ComponentScan(basePackages="pl.mrmario.tutorials.spring.owczarek.cz29.implementations")
public class AppConfiguration {
//	@Bean
//	public Logger logger() {
//		return new DateLogger();
//	}
//	@Bean
//	public UsersRepository usersRepository() {
//		UsersRepositoryImpl usersRepositoryImpl = new UsersRepositoryImpl();
//		usersRepositoryImpl.setLogger(logger());
//		return usersRepositoryImpl;
//			
//
//	}
}
