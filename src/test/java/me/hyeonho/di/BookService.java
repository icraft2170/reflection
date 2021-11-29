package me.hyeonho.di;

public class BookService {
    @Inject
    private BookRepository bookRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }

}
