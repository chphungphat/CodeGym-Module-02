package service;

public class LibraryService {
    private static final LibraryService libraryService = new LibraryService();

    private LibraryService() {}

    public static LibraryService getInstance() {
        return libraryService;
    }


}
