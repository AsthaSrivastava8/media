package com.social.media.models;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private SocialUser socialUser;
}
