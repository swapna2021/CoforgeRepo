package com.coforge;

import com.coforge.dao.AuthorDao;
import com.coforge.dao.BookDao;
import com.coforge.entities.Author;
import com.coforge.entities.Book;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Author author=new Author("Swapna","Hyd");
        author.addBook(new Book("Learn Java",500));
        author.addBook(new Book("Spring tutorial",700));
        AuthorDao authorDao=new AuthorDao();
        authorDao.save(author);
        
        System.out.println("Authors Info");
        authorDao.getAll();
        
        BookDao bookDao=new BookDao();
        bookDao.getAll();
        System.out.println("************************");
       authorDao.removeBookFromAuthor(1, 1);
       bookDao.getAll();
    }
}
