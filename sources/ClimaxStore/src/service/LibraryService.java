package service;

import entity.Library;

import java.util.List;

public class LibraryService {
    private static final LibraryService libraryService = new LibraryService();

    private LibraryService() {}

    public static LibraryService getInstance() {
        return libraryService;
    }

    private List<Library> libraryList;
    private Library currentLibrary;

    public List<Library> getLibraryList() {
        return libraryList;
    }

    public void setLibraryList(List<Library> libraryList) {
        this.libraryList = libraryList;
    }

    public Library getCurrentLibrary() {
        return currentLibrary;
    }

    public void setCurrentLibrary(Library currentLibrary) {
        this.currentLibrary = currentLibrary;
    }

    public void addGameToLibrary() {
        System.out.println("Choose game you want");
    }
}
