package com.example.demo.services;

import com.example.demo.payloads.CommentDto;

public interface CommentService {

	CommentDto createcomment(CommentDto commentDto, Integer postId);
	void deleteComment(Integer commentId);
}
