package com.fikky.models;

import javax.persistence.*;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CHAPTER_ID")
    private Integer chapterId;

    @Version
    private Integer version;

    @Column(length = 120000)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "STORY_ID", nullable = false)
    private Story story;

    private int number;

    private String name;

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @ManyToOne
    @JoinColumn(name = "STOCK_ID", nullable = false)
    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}