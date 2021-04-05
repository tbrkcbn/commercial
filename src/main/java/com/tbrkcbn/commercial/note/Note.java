package com.tbrkcbn.commercial.note;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Note {

    @Id
    @SequenceGenerator(
            name = "note_sequence",
            sequenceName = "note_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "note_sequence"
    )
    private Long id;
    private String title;
    private String content;
    //creation date
    private LocalDate dow;

    public Note() {
    }

    public Note(String title, String content, LocalDate dow) {
        this.title = title;
        this.content = content;
        this.dow = dow;
    }

    public Note(Long id, String title, String content, LocalDate dow) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dow = dow;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDow() {
        return dow;
    }

    public void setDow(LocalDate dow) {
        this.dow = dow;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", dow=" + dow +
                '}';
    }
}
