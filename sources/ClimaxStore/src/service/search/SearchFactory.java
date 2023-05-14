package service.search;

public class SearchFactory {
    private static final SearchFactory searchFactory = new SearchFactory();

    private SearchFactory() {}

    public static SearchFactory getInstance() {
        return searchFactory;
    }

    private final String NAME = "name";
    private final String PIRCE = "pirce";
    private final String DEVELOPER = "developer";
    private final String GAMETAGs = "gametags";

    public Search getSearch(String searchBy) {
        Search newSearch = SearchByName.getInstance();
        switch (searchBy) {
            case NAME -> {
                return SearchByName.getInstance();
            }
            case PIRCE -> {

            }
            default -> {
                System.err.println("Error");
            }
        }
        return newSearch;
    }
}
