package com.tbrkcbn.commercial.note;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @ResponseBody
    @GetMapping
    public List<Note> getNotes(){
        return noteRepository.findAll();
    }

    public void saveNote(Note note){
        Optional<Note> noteByTitle = noteRepository.findNoteByTitle(note.getTitle());
        if (noteByTitle.isPresent()){
            throw new IllegalStateException("this title has taken");
        }
        noteRepository.save(note);
    }
    public void deleteNoteByTitle(String title){
        Optional<Note> noteByTitle = noteRepository.findNoteByTitle(title);
        if (noteByTitle.isPresent()){
            noteRepository.delete(noteByTitle);
        }
        throw new IllegalStateException("There is no such a note with this title");
    }
}
