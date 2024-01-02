package com.userdetails_shree1.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails_shree1.user.Entity.userentity;
import com.userdetails_shree1.user.repository.userrepo;

@RestController
public class usercontroller {

	@Autowired
	public userrepo repo;
	
	@PostMapping("/usersave")
	public userentity userentityy(@RequestBody userentity pro)
	{
		try {
		repo.save(pro);
		return pro;
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;
 }
	  @GetMapping("/userget")
		public List<userentity> userget(){
			try {
				return repo.findAll();
		  }catch(Exception e){
				e.printStackTrace();
			   }
			return null;
		}		
		@PutMapping("/userupdate")
		public userentity userput(@RequestBody userentity pro){
			try {
			repo.save(pro);
			return pro;
		}catch(Exception e) {
			e.printStackTrace();
		}
			return null;
 }
		@SuppressWarnings("deprecation")
		@DeleteMapping("/deletepro/{Id}")
		public String delpro(@PathVariable int Id) {
			try
			{
				userentity pro=repo.getOne(Id);
				repo.delete(pro);
				return "product deleted";
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
		
}
