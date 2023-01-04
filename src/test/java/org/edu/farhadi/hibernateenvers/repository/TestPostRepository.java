package org.edu.farhadi.hibernateenvers.repository;


import org.edu.farhadi.hibernateenvers.entity.Post;
import org.edu.farhadi.hibernateenvers.reposirory.PostRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestPostRepository {
    @Autowired
    private PostRepository repository;


    @Test
    public void savePost() {
        Post post = new Post();
        post.setId( 1L );
        post.setTitle(
                "High-Performance Java Persistence 1st edition"
        );
        repository.save(post);
    }


}
