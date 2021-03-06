package kr.ac.kopo.movie_project.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ac.kopo.movie_project.model.Event;
import kr.ac.kopo.movie_project.service.EventService;
import kr.ac.kopo.movie_project.util.Pager;

@Controller
@RequestMapping("/event")
public class EventController {
	String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	final String path = "event/";
	
	@Autowired
	EventService service;
	
	@GetMapping("/continue_Event")
	public String continue_Event(Model model,Pager pager,Event item){
		List<Event> list = service.continue_Event(pager);
		service.viewcnt(item);
		model.addAttribute("list",list);		
		return path+"continue_Event";
	}	
	
	@GetMapping("/end_Event")
	public String end_Event(Model model,Pager pager) {
		List<Event> list = service.end_Event(pager);		
		model.addAttribute("list",list);		
		
		return path+"end_Event";
	}	
	

	@GetMapping("/EventInfo/{eventId}")
	public String EventInfo(@PathVariable int eventId, Model model) {
		Event item = service.item(eventId);
		
		service.viewcnt(item);
		
		model.addAttribute("item", item);
		
		return path+"EventInfo";
		
	}
	
	@GetMapping("/NoticeEventAdd")
	public String NoticeEventAdd() {
		return path+"NoticeEventAdd";
	}
	@PostMapping("/NoticeEventAdd")
	public String NoticeEventAdd(Event item,RedirectAttributes ra) {
			String bool=service.NoticeEventAdd(item);
			if(bool=="false") {
				ra.addFlashAttribute("msg", "false");
				return "redirect:NoticeEventAdd";
			}
		return "redirect:continue_Event";
	}
	
	@GetMapping("/NoticeEventUpdate/{eventId}")
	public String NoticeEventUpdate(@PathVariable int eventId, Model model) {
		Event item =service.item(eventId);
		
		model.addAttribute("list", item);
		return path + "NoticeEventUpdate";
	}
	
	@PostMapping("/NoticeEventUpdate/{eventId}")
	public String NoticeEventUpdate(@PathVariable int eventId, Event item ,RedirectAttributes ra) {
			item.setEventId(eventId);
			String bool=service.NoticeEventUpdate(item);
			if(bool=="false") {
				ra.addFlashAttribute("msg", "false");
				return "redirect:NoticeEventUpdate/"+eventId;
			}
		return "redirect:../continue_Event";
	}
	
	@GetMapping("/delete/{eventId}")
	public String delete(@PathVariable int eventId) {
		service.delete(eventId);
		
		return "redirect:../continue_Event";
	}
	@GetMapping("/end_delete/{eventId}")
	public String end_delete(@PathVariable int eventId) {
		service.delete(eventId);
		
		return "redirect:../end_Event";
	}
}
