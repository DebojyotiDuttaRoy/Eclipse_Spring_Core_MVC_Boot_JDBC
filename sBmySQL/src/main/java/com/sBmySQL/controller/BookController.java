package com.sBmySQL.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sBmySQL.model.Book;
import com.sBmySQL.repo.BookRepo;

@RestController
public class BookController {
	@Autowired
	BookRepo bookRepo;
	
	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookRepo.save(book);
		return "Your record is saved successfully ! !";
	}
	@PostMapping("/multiBookSave")
	public String insertMultiBook(@RequestBody List<Book> book) {
		bookRepo.saveAll(book);
		return "Your records are saved successfully ! !";
	}
	@GetMapping("/getAllBooks")
	public List<Book> getBook() {
		return (List<Book>) bookRepo.findAll();
	}
	@GetMapping("/getBookById/{bookId}")
	public Optional<Book> getBookById(@PathVariable("bookId") Long bookId) {
		return bookRepo.findById(bookId);
	}
	@GetMapping("/getBookByName/{bookName}")
	public List<Book> getBookByName(@PathVariable("bookName") String bookName) {
		return (List<Book>) bookRepo.findBybookName(bookName);
	}
}
