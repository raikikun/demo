package es4.demo.application.domein.entity;

import lombok.*;
import jakarta.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "word_list")
public class WordEntity  {
 
        // id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        // 単語
        private String word;
}
