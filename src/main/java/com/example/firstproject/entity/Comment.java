package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id //대표키 지정
    @JoinColumn(name="article_id")//외래키 생성, Article 엔티티의 기본키(id)와 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 자동으로 1씩 증가
    private Long id;
    @ManyToOne
    private Article article;
    @Column //해당 필드를 테이블의 속성으로 매핑
    private String nickname;
    @Column //해당 필드를 테이블의 속성으로 매핑
    private String body;
}
