package com.example.Book.Service;

import com.example.Book.Entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> getAllBooks();
    Book getBookByID(int BookID);
    Book addBook(Book book);
    Book updateBook(Book book);
    String deleteBookByID(int BookID);
}
