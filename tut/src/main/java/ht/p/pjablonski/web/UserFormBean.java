package ht.p.pjablonski.web;

import ht.p.pjablonski.domain.User;
import ht.p.pjablonski.service.UserManager;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ManagedBean
@SessionScoped
@Named("userBean")
public class UserFormBean {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	User user = (User) context.getBean("user");
	
	@Inject
	UserManager um;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String createUser(User user) {
		um.create(user);
		return null;
	}
	
}
