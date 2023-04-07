package utez.edu.mx.adoptame.e4.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import utez.edu.mx.adoptame.e4.entity.Blog;
import utez.edu.mx.adoptame.e4.model.request.blog.BlogInsertDto;
import utez.edu.mx.adoptame.e4.model.request.blog.BlogUpdateDto;

import java.util.List;
import java.util.Optional;


public interface BlogService {
     Page<Blog> findAllBlog(Pageable pageable);
     Optional<Blog> findBlogById(Long id);
     boolean saveBlog(BlogInsertDto blog, String imageName, String username);
     boolean updateBlog(BlogUpdateDto blog);
     List<Blog> findAllByIsPrincipal(Boolean isPrincipal);
   
}
