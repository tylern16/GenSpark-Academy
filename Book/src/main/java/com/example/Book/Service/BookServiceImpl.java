package com.example.Book.Service;

import com.example.Book.Dao.BookDao;
import com.example.Book.Entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllBooks() {
        return this.bookDao.findAll();
    }

    @Override
    public Book getBookByID(int bookID) {
        Optional<Book> b = this.bookDao.findById(bookID);
        Book book = null;
        if (b.isPresent()) {
            book = b.get();
        } else {
            throw new RuntimeException("Course not for for id " + bookID);
        }
        return book;
    }

    @Override
    public Book addBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public String deleteBookByID(int bookID) {
        this.bookDao.deleteById(bookID);
        return "Successfully Deleted";
    }
}
