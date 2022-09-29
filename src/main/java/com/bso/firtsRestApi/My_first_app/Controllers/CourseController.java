package com.bso.firtsRestApi.My_first_app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bso.firtsRestApi.My_first_app.Models.Course;
import com.bso.firtsRestApi.My_first_app.Services.ICourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private ICourseService _courseService;

	@PostMapping
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		//Course newCourse = _courseService.saveCourse(course);
		//return ResponseEntity.created(null).build();
		return new ResponseEntity<Course>(this._courseService.saveCourse(course), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Course> getCourse(@RequestParam(name="courseName", required = false) String Name){
		return new ResponseEntity<>(this._courseService.getCourse(Name), HttpStatus.OK);		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Course>> getAllCourse(@RequestParam(name="from", defaultValue = "0") int from, 
													 @RequestParam(name="limit", defaultValue = "20") int limit){
		return new ResponseEntity<>(this._courseService.getAllCourse(from,limit), HttpStatus.OK);
	}
	
}
