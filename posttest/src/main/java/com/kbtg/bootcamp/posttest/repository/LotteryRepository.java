package com.kbtg.bootcamp.posttest.repository;

import com.kbtg.bootcamp.posttest.entity.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotteryRepository extends JpaRepository<Lottery,Integer> {


}
