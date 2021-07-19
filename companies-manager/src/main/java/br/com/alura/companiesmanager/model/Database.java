package br.com.alura.companiesmanager.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {
	
	private static List<Company> companyList = new ArrayList<>();
	private static List<User> userList = new ArrayList<>();
	private static Integer sequence = 1;
	
	static {
		  Company company = new Company();
		  company.setId(sequence++);
		  company.setName("Alura");
		  company.setHeadquarter("Brazil");
		  company.setEmployees("500");
		  
		  Company company2 = new Company();
		  company2.setId(sequence++);
		  company2.setName("Caelum");
		  company2.setHeadquarter("Brazil");
		  company2.setEmployees("1000");
		  
		  companyList.add(company);
		  companyList.add(company2);
		  
			User u1 = new User();
			u1.setName("Cesar Augusto");
			u1.setLogin("cesarc");
			u1.setPassword("12345");
			
			User u2 = new User();
			u2.setName("Jessica Vidal");
			u2.setLogin("jessicav");
			u2.setPassword("54321");
			
			userList.add(u1);
			userList.add(u2);
		}

	public void add(Company company) {
		company.setId(Database.sequence++);
		Database.companyList.add(company);
	}
	
	public void add(User user) {
		Database.userList.add(user);
	}
	
	public List<Company> getCompanies(){
		return Database.companyList;
	}
	
	public List<User> getUsers(){
		return Database.userList;
	}

	public void deleteCompany(Integer id) {
		
		Iterator<Company> it = companyList.iterator();
		
		while(it.hasNext()) {
			Company com = it.next();
			
			if(com.getId() == id) {
				it.remove();
			}
		}				
	}

	public Company getCompanyById(Integer id) {
		
		for (Company company : companyList) {
			if(company.getId() == id) {
				return company;
			}
		
		}
		return null;				
		
	}
	
	public User validateUser(String login, String password) {
		for(User user : userList) {
			if(user.checkLogin(login, password)) {
				return user;
			}
		}
		return null;
	}

}
