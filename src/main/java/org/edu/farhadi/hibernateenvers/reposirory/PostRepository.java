package org.edu.farhadi.hibernateenvers.reposirory;

import org.edu.farhadi.hibernateenvers.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
