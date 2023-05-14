package service.search;

import java.util.List;

public class SearchByGameTag implements Search {
    private static final SearchByGameTag searchByGameTag = new SearchByGameTag();

    private SearchByGameTag() {}

    public static SearchByGameTag getInstance() {
        return searchByGameTag;
    }

    @Override
    public List<Integer> searchForGameByCondition() {

    }

    public List<Integer> searchByGameTag() {

    }
}
