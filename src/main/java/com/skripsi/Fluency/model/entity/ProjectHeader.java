package com.skripsi.Fluency.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "influencer_id")
    private Influencer influencer;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(length = 255)
    private String title;
    private String description;
    private String caption;
    private String mention;
    private String hashtag;

    //    tambahan
    @OneToMany(mappedBy = "projectHeader")
    private List<ProjectDetail> projectDetails;

    @OneToOne
    @JoinColumn(name = "review_id")
    private Review review;
}
