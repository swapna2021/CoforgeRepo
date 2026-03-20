package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Author;
import com.coforge.entities.Book;
import com.coforge.util.HibernateUtil;

public class AuthorDao {
	
	
	public void getAll(){
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			session.createQuery("From Author",Author.class).list().forEach(System.out::println);
		}
	}
	
	public void save(Author author) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			session.persist(author);
			tx.commit();
		}
		
	}
	
	public Author getById(long aid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Author.class,aid);	
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
	
	public void removeBookFromAuthor(long aid,long bid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			Book delBook=null;
			Author author=session.get(Author.class, aid);
			if(author==null)
				System.out.println("no deletion");
			else
			{
				for(Book book:author.getBookList()) {
					if(book.getBookId()==bid) {
						delBook=book;
					}
				}
			}
			
			if(delBook!=null) {
				author.removeBook(delBook);
			
			}
			tx.commit();
		}
	}

}
