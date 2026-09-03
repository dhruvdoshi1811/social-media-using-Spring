package com.social.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "social_profile_id")
    private SocialProfile socialProfile;

    @OneToMany
    private List<Post> postList=new ArrayList<>();
}