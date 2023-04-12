package com.example.Book.Controller;

import com.example.Book.Entities.Book;
import com.example.Book.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to Book App</H1></HTML>";
    }

    @GetMapping("/books")
    public List<Book> getBooks() { return this.bookService.getAllBooks();}

    @GetMapping("/books/{ID}")
    public Book getBookbyId(@PathVariable String ID) {
        return this.bookService.getBookByID(Integer.parseInt(ID));
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {return this.bookService.addBook(book);}

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {return this.bookService.updateBook(book);}

    @DeleteMapping("/books/{ID}")
    public String deleteBookByID(@PathVariable String ID) {return this.bookService.deleteBookByID(Integer.parseInt(ID));}
}
