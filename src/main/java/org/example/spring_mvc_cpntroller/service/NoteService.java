package org.example.spring_mvc_cpntroller.service;

import org.example.spring_mvc_cpntroller.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NoteService {
private Map<Long,Note> notes = new HashMap<>();
private final AtomicLong counter = new AtomicLong();

public List<Note> listAll() {
    List<Note> noteList = new ArrayList<>();
    for (Note note : notes.values()) {
        noteList.add(note);
    }
    return noteList;
}

public Note add (Note note) {
    note.setId(counter.incrementAndGet());
    notes.put(note.getId(), note);
    return note;
}

public void deleteById(Long id) {
    if(notes.containsKey(id)) {
        notes.remove(id);
    }
    else {
        throw new IllegalArgumentException("Note not found");
    }
}

public void update(Note note) {
    if(notes.containsKey(note.getId())) {
        notes.put(note.getId(), note);
    }
    else {
        throw new IllegalArgumentException("Note not found");
    }
}

public Note getById(Long id) {
    if(notes.containsKey(id)) {
        Object note = notes.get(id);
        return (Note) note;
    }
    else {
        throw new IllegalArgumentException("Note not found");
    }
}
}
