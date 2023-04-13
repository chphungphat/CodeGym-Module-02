import java.util.ArrayList;

public class CategoryList {
    private ArrayList<Category> categoryLists;

    public CategoryList(ArrayList<Category> categoryLists) {
        this.categoryLists = categoryLists;
    }

    public CategoryList() {
        categoryLists = new ArrayList<Category>();
    }

    public ArrayList<Category> getCategoryLists() {
        return categoryLists;
    }

    public void setCategoryLists(ArrayList<Category> categoryLists) {
        this.categoryLists = categoryLists;
    }

    public Category get(int index) {
        return categoryLists.get(index);
    }

    public void addCategory(Category category) {
        categoryLists.add(category);
    }

    public void getAll() {
        int count = 1;
        String text;
        while (count <= categoryLists.size()) {
            text = String.format("%d. %s", count, categoryLists.get(count - 1).getName());
            System.out.println(text);
            count++;
        }
    }
}
