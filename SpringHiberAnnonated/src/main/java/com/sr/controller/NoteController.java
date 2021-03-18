package com.sr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sr.Dao.INoteDAO;
import com.sr.Model.Note;

@Controller
@RequestMapping("/")
public class NoteController 
{
	@Autowired
	private INoteDAO noteDAO;
	
	@GetMapping("/")
	public ModelAndView getHomePage()
	{
		Note note = new Note();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("notelist",noteDAO.getAllNote(note));
		return mv;
	}

@PostMapping("/saveNote")
public String saveNote(@ModelAttribute("note")Note note, ModelMap modelMap) 
{
	 boolean status = noteDAO.saveNote(note);
	 modelMap.addAttribute("noteList",noteDAO.getAllNote(note));
	 return "index";
	
	}

	@RequestMapping("/deleteNote/{noteId}")
	public ModelAndView deleteNote(@PathVariable("noteId")int noteId)
	{Note note = new Note();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		noteDAO.deleteNote(noteId);
		mv.addObject("noteList", noteDAO.getAllNote(note));
		return  mv;
	}
	
	
   
}
