package com.social.media.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @ManyToOne
    private SocialUser socialUser;


}
