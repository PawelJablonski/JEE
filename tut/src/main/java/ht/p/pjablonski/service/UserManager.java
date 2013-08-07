package ht.p.pjablonski.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ht.p.pjablonski.domain.User;

@Stateless
public class UserManager {

	@PersistenceContext
	EntityManager em;
	
	public void create(User user) {
		
		
	}

}
