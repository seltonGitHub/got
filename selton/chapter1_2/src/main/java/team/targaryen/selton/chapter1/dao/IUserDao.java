package team.targaryen.selton.chapter1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import team.targaryen.selton.chapter1.entity.User;

import javax.transaction.Transactional;

public interface IUserDao extends JpaRepository<User, Integer> {
    @Query(value = "update user set name=?2 , hobby=?3 where id=?1", nativeQuery = true)
    @Modifying
    @Transactional
    void modifySingle(int id, String name, String hobby);
}
