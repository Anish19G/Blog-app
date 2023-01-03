package com.example.demo.services;
import java.util.List;

import com.example.demo.entities.Post;
import com.example.demo.payloads.PostDto;

public interface PostService {
	//create

	PostDto creatPost(PostDto postDto, Integer userId, Integer categoryId); 
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all post
	List<PostDto> getAllPost();
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get 
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all post by user
	List<PostDto> getPostByUser(Integer userId);
	
	//seacrh post 
	List<Post> searchPost(String Keyword);
 	
	

}
