package com.app.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.entity.LoginResponse;

//@SpringBootApplication
@Repository
public class LoginRepository implements ILoginRepository {

	
	@Override
	public <S extends LoginResponse> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public Optional<LoginResponse> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<LoginResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<LoginResponse> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(LoginResponse entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends LoginResponse> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends LoginResponse> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
