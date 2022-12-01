package com.sparta.board.entity;


import com.sparta.board.dto.PostRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Post extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column (nullable = false)
    private String username;

    @Column (nullable = false)
    private String content;

    @Column (nullable = false)
    private String password;

   public Post(PostRequestDto requestDto){
       this.title = requestDto.getTitle();
       this.username = requestDto.getUsername();
       this.content = requestDto.getContent();
       this.password = requestDto.getPassword();
   }

    public void update(PostRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
        this.password = requestDto.getPassword();
    }
}
