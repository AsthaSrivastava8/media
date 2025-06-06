package com.social.media.models;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Setter
public class SocialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private SocialUser socialUser;
}
