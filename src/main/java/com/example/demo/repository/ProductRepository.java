package com.example.demo.repository;

import com.example.demo.dto.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    JdbcTemplate jdbctemplate;


    public List<Emp> fetchData() {
        final String query="SELECT * FROM Test.emp";
        return jdbctemplate.query(query,new Object[] {}, (rse,rowNum)->{
            //System.out.println(rse.toString());
            //System.out.println(rse.getString("empno") + " " + rse.getString("ename"));
             return new Emp(rse.getString("empno"),
                                 rse.getString("ename"),
                                 rse.getString("job"),
                                 rse.getInt("sal"),
                                 rse.getInt("deptno"));

        });
    }
}
