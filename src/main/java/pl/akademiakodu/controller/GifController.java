package pl.akademiakodu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.data.GifRepository;
import pl.akademiakodu.model.Gif;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;

    //@RequestBody
    @RequestMapping("/")
    public String listGifs(ModelMap map) {

        List<Gif> gifs = gifRepository.ALL_GIFS;

        map.put("gifs", gifs);

        return "home";


    }
    @RequestMapping("/favorites")
    public String gifFavorites(ModelMap modelMap){
        List<Gif> gifs = gifRepository.getFavoriteGifs();
        modelMap.put("gifs", gifs);
        return "favorites";
    }


}
