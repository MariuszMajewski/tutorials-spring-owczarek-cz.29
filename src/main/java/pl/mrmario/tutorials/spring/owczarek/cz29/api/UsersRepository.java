package pl.mrmario.tutorials.spring.owczarek.cz29.api;

import pl.mrmario.tutorials.spring.owczarek.cz29.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
