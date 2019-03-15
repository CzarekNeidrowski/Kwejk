package pl.akademiakodu.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Category;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0, "funny"),
            new Category(1, "sport"),
            new Category(2, "it")

    );

    public static List<Category> getAllGifs() {
        return ALL_CATEGORIES;
    }

    public static Category getCategoryById(int id){
        return ALL_CATEGORIES.get(id);
    }
}