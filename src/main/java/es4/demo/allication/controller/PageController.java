package es4.demo.allication.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es4.demo.allication.domein.entity.WordEntity;
import es4.demo.allication.domein.service.WordService;
import es4.demo.allication.form.WordForm;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class PageController  {

    @Autowired
    private WordService wordService;

    @GetMapping("/")
    public String showStartPage(Model model) {
        return "index";
    }

    @PostMapping("back")
    public String backStartPage() {
        return "redirect:/";
    }
    

    @PostMapping("/register")
    public String showWordPage(@RequestParam("word") String word) {
        wordService.registerWord(word);
        return "redirect:/";
    }

    @PostMapping("/show")
    public String showWord(Model model) {
        // 単語のリストを取得するメソッドを呼び出して単語のデータを取得し、モデルにセットする
        List<WordEntity> words = wordService.getAllWords(); // 仮のメソッド名とサービスクラスの使用を想定
        model.addAttribute("words", words);
        return "show";
    }

}