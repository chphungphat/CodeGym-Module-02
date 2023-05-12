package service;

public class LibraryFileService {
    private static final LibraryFileService libraryFileService = new LibraryFileService();

    private LibraryFileService() {}

    public static LibraryFileService getInstance() {
        return libraryFileService;
    }

    private final String LIBRARY_FILEPATH = "src//data//library.csv";
}
