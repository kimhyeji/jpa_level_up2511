package com.ll.jpa2511.domain.post;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String username;
    private String subject;
    private String content;
    @Version
    private Long version;
}
