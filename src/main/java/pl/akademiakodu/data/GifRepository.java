package pl.akademiakodu.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    public static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "ala123", true, 1),
            new Gif("ben-and-mike", "piotrek", false, 1),
            new Gif("book-dominos", "piotrek", false, 1),
            new Gif("compiler-bot", "jeremi666", true, 1),
            new Gif("cowboy-coder", "ola", true, 1),
            new Gif("infinite-andrew", "waco", true, 1)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }


    public static List<Gif> getFavoriteGifs(){
        List<Gif> favoritesGifs = new ArrayList<>();
        for (Gif value : ALL_GIFS){
            if(value.getFavorite() == true){
                favoritesGifs.add(value);
            }
        }
        return favoritesGifs;
    }
}