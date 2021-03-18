package com.sr.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sr.Model.Note;

@Repository
@Transactional
public class NoteDAOImpl implements INoteDAO 
{	

	@Autowired
	private SessionFactory sessionFactory;
	// in the entire project this single sessionFactory object will be shared


	
	public boolean saveNote(Note note) 
	{try
	{
      this.sessionFactory.getCurrentSession().save(note);
      return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}
	
	}



	public boolean deleteNote(int noteId) 
	{

		try
		{
			Note note = this.sessionFactory.getCurrentSession().load(Note.class, noteId);
			this.sessionFactory.getCurrentSession().delete(note);// line by line
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Note> getAllNote(Note note) 
	{
		return this.sessionFactory.getCurrentSession().createQuery("from Note").list();
	}
}











