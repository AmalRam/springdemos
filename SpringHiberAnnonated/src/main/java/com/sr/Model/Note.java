package com.sr.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note 
{
	@Id
	private int noteId;
	private String noteTitle;
	private String noteText;
	private String noteCategory;
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteText() {
		return noteText;
	}
	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}
	public String getNoteCategory() {
		return noteCategory;
	}
	public void setNoteCategory(String noteCategory) {
		this.noteCategory = noteCategory;
	}
	
	@Override
	public String toString()
	{
		return "Note-->"+noteId+"Note Title-->"+noteTitle;
	}

}
