package pl.tg.rest_api_book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping("helloBook")
    public Book helloBook() {
        return new Book(1L, "1234567891011", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }
}