package pl.WuZet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.WuZet.data.GifRepository;
import pl.WuZet.model.Gif;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;
    @RequestMapping("/")
    public String listGifts(){
        return "home";
    }
    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = gifRepository.findByName("android-explosion");
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
