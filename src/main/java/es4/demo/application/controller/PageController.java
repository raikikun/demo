package es4.demo.application.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es4.demo.application.domein.entity.WordEntity;
import es4.demo.application.domein.service.WordService;
import es4.demo.application.form.WordForm;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class PageController  {

    @Autowired
    private WordService wordService;

    @GetMapping("/")
    public String showStartPage(Model model) {
        return "index";
    }

    @PostMapping("/back")
    public String backStartPage() {
        return "redirect:/";
    }
    

    @PostMapping("/register")
    public String showWordPage(@RequestParam("word") String word) {
        wordService.registerWord(word);
        return "redirect:/";
    }

    @GetMapping("/show")
    public String showWord(Model model) {
        // 単語のリストを取得するメソッドを呼び出して単語のデータを取得し、モデルにセットする
        List<WordEntity> words = wordService.getAllWords(); // 仮のメソッド名とサービスクラスの使用を想定
        model.addAttribute("words", words);
        return "show";
    }

    @PostMapping("/delete/{id}")
    public String deleteWord(@PathVariable("id") Long id) {
        wordService.deleteWordById(id);
        return "redirect:/show";
    }


}