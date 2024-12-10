package com.rungroop.demo.models;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clubs")
@Getter
@Setter
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime updatedOn;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public String getPhotoUrl() {
        return photoUrl;
    }
    public String getContent() {
        return content;
    }
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }
}
