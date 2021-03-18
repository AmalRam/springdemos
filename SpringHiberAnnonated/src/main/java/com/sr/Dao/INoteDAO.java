package com.sr.Dao;

import java.util.List;

import com.sr.Model.Note;

public interface INoteDAO 
{
	public boolean saveNote(Note note);//insert

	public boolean deleteNote(int noteId);//retrieve & update
	
	public List<Note> getAllNote(Note note);// retrieve
}
