package org.edu.farhadi.hibernateenvers;

import org.edu.farhadi.hibernateenvers.entity.Post;
import org.edu.farhadi.hibernateenvers.reposirory.PostRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/post")
public class PostAPI {
    private final PostRepository repository;

    public PostAPI(PostRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = {"/save"})
    @ResponseBody
    ResponseEntity<Post> save(@RequestBody Post post) {
        Post result = repository.save(post);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = {"/findById/{id}"})
    ResponseEntity<Post> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(repository.findById(id).get());
    }

    @DeleteMapping(value = {"/deleteById/{id}"})
    ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
