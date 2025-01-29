package com.example.Repository;

import com.example.Service.Applicant;
import org.springframework.jdbc.core.JdbcTemplate;
public class JDBC {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(Applicant applicant){
        String query = "INSERT INTO applicant(id, name, applyfor) VALUES(?, ?, ?)";
        Object[] args = {applicant.getId(), applicant.getName(), applicant.getApplyFor()};
        jdbc.update(query, args);

    }
}
