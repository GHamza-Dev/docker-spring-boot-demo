package io.hamza.recipemanagement.chef;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepository extends JpaRepository<Chef, Long> {
}