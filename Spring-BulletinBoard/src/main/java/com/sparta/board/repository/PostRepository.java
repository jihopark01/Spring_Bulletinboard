package com.sparta.board.repository;

import com.sparta.board.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllMemoByOrderByModifiedAtDesc();

    Optional<Post> findByIdAndPassword(Long id, String password);

    Boolean existsByIdAndPassword(Long id,String password);
}
