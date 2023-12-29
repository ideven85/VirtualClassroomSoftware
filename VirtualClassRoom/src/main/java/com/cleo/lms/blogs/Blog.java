package com.cleo.lms.blogs;

import com.cleo.lms.users.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    @Id @GeneratedValue private Long id;

    @Column(nullable = false)

    private String title;


    @Type(type = "text")
    private String body;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return username;
    }

    public void setUser(User user) {
        this.username = user;
    }

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    private User username;

    private Date date_created;

    private Date date_updated;

    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(Date date_updated) {
        this.date_updated = date_updated;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @PrePersist
    public void onCreate(){
        this.date_created = new Date();
    }

    @PreUpdate
    public void onUpdate(){
        this.date_updated = new Date();
    }


}
