package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
@Controller
@RequestMapping("")
public class Controlador {
	
	@Autowired
	private BookRepository bookRepository;
	@GetMapping("/")
	public String buscaTots(Model model) {
		Iterable<Book> books = bookRepository.findAll();
		model.addAttribute("libros",books);
		return "llista";
	}
}
