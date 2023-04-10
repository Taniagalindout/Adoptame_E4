package utez.edu.mx.adoptame.e4.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import utez.edu.mx.adoptame.e4.entity.Blog;

@Repository
public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    List<Blog> findAllByIsPrincipal(Boolean isPrincipal);
    Page<Blog> findAllByOrderByCreatedAtDesc(Pageable peagable);
}
