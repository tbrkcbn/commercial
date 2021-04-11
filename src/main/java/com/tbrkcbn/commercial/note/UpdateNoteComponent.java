package com.tbrkcbn.commercial.note;

public class UpdateNoteComponent {

    private Long id;
    private String note;

    public UpdateNoteComponent(Long id, String note) {
        this.id = id;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public String getNote() {
        return note;
    }
}
