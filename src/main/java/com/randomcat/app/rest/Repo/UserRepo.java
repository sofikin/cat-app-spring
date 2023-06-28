package com.randomcat.app.rest.Repo;

import com.randomcat.app.rest.Models.Images;
import com.randomcat.app.rest.Models.Breeds;
import com.randomcat.app.rest.Models.Favourites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<Images, Long> {
    @Query(value = "SELECT * FROM images INNER JOIN breeds ON images.id=breeds.id ORDER BY RAND() LIMIT 12", nativeQuery = true)
    List<Images> findRandom12Cats();
}