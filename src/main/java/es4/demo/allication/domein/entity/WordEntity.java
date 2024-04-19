package es4.demo.allication.domein.entity;

import lombok.*;
import jakarta.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordEntity  {
 
        // word id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long wid;
    
        // ゲーム名
        private String word;
}
