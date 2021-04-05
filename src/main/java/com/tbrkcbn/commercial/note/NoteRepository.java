package com.tbrkcbn.commercial.note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository <Note,Long> {

    @Query("SELECT n FROM Note n WHERE n.title = ?1")
    Optional<Note> findNoteByTitle(String title);

}
