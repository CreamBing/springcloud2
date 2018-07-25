package com.bing.test.jpa.dao;

import com.bing.test.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>Title: UserRepository</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/24
 * @Company 东方网力
 */
@Repository
public interface  UserRepository extends JpaRepository<User,Integer> {


}
