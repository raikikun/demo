package es4.demo.application.domein.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es4.demo.application.domein.entity.WordEntity;
import es4.demo.application.domein.repository.WordRepository;

@Service
public class WordService {
    
    @Autowired
    private WordRepository wordRepository;

    // 単語を登録するメソッド
    public void registerWord(String word) {
        WordEntity newWord = new WordEntity();
        newWord.setWord(word);
        wordRepository.save(newWord);
    }

    // すべての単語を取得するメソッド
    public List<WordEntity> getAllWords() {
        return (List<WordEntity>) wordRepository.findAll();
    }

    public void deleteWordById(Long id) {
        wordRepository.deleteById(id);
    }
    
}
