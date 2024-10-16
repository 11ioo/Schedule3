package com.example.schedule3.service;

import com.example.schedule3.entity.Comment;
import com.example.schedule3.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // Create or Update Comment
    @Transactional
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // Get Comment by ID
    @Transactional(readOnly = true)
    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    // Get All Comments
    @Transactional(readOnly = true)
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    // Delete Comment by ID
    @Transactional
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}