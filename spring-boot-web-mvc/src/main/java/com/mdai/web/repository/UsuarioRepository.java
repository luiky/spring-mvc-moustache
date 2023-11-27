package com.mdai.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mdai.web.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	List<Usuario> findByName (String name);

}

//@Repository
//public interface AuthorRepository extends CrudRepository<Author, Long> {
//@Query("SELECT new AuthorCourseDto (c.id, a.name, c.name, c.description) 
//		from AUTHOR a, COURSES c, AUTHORS_COURSES ac 
//		where a.id = ac.authorId and c.id=ac.courseId and ac.authorId=?1")
//		
//		Iterable<AuthorCourseDto> getAuthorCourseInfo(long authorId);
//}