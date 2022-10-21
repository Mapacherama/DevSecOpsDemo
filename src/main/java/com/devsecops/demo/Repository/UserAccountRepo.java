package com.devsecops.demo.Repository;

import com.devsecops.demo.Entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:3200")
public interface UserAccountRepo extends JpaRepository<UserAccount, Integer> {
}
