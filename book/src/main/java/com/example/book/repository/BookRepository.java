package com.example.book.repository;

import com.example.book.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BookRepository {

    private final List<Book> books = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong();

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    public Optional<Book> findById(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    public Book save(Book book) {
        if (book.getId() == null) {
            book.setId(sequence.incrementAndGet());
            books.add(book);
        } else {
            Book existing = findById(book.getId())
                    .orElseThrow(() -> new IllegalArgumentException("No book with id: " + book.getId()));
            existing.setTitle(book.getTitle());
            existing.setAuthor(book.getAuthor());
            existing.setIsbn(book.getIsbn());
            existing.setPublishedYear(book.getPublishedYear());
        }
        return book;
    }

    public boolean deleteById(Long id) {
        return books.removeIf(book -> book.getId().equals(id));
    }
}
