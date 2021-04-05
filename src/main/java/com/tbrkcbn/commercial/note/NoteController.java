package com.tbrkcbn.commercial.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/notes")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @CrossOrigin
    @GetMapping
    public List<Note> getNotes(){
        return noteService.getNotes();
    }


    @CrossOrigin
    @PostMapping
    public void registerNewNode(@RequestBody Note note){
        noteService.saveNote(note);
    }

    @CrossOrigin
    @DeleteMapping
    public void removeNote(@RequestBody String title){
        noteService.deleteNoteByTitle(title);
    }
}
