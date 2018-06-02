package pl.mrmario.tutorials.spring.owczarek.cz29.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz29.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz29.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz29.domain.User;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired
	private Logger logger;

	public User createUser(String name) {
		if(logger!=null) {
			logger.log("Tworzenie u¿ytkownika " + name);
			
		}
		return new User(name);
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
