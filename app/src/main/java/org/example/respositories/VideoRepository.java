package org.example.respositories;

import org.example.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * VideoRepository
 */
public interface VideoRepository extends JpaRepository<Video, Integer> {

	
}
