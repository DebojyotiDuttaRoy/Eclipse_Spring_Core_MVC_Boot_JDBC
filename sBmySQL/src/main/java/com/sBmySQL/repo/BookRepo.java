package com.sBmySQL.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sBmySQL.model.Book;

public interface BookRepo  extends JpaRepository<Book, Long>{
	public List<Book> findBybookName(String name);
}
