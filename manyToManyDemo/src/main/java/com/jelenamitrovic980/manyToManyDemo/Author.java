package com.jelenamitrovic980.manyToManyDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	private String authorName;
	
	@ManyToMany(mappedBy = "authors")
	private List<Book> books = new ArrayList<>();
	

}
