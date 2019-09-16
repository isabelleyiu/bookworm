package com.isabelleyiu.bookworm.controller;

import com.isabelleyiu.bookworm.model.Book;
import com.isabelleyiu.bookworm.repository.BookRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.validation.Valid;

/**
 * @author syiu
 */

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable ObjectId id) {
        return bookRepository.findBy_id(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Book createBook(@Valid @RequestBody Book book) {
        book.set_id(ObjectId.get());
        bookRepository.save(book);
        return book;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Book updateBookById(@PathVariable ObjectId id, @Valid @RequestBody Book book) {
        book.set_id(id);
        bookRepository.save(book);
        return book;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean deleteBookById(@PathVariable ObjectId id) {
        bookRepository.delete(bookRepository.findBy_id(id));
        return true;
    }
}
