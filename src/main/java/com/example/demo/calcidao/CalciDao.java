package com.example.demo.calcidao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.calcientity.CalciEntity;

public interface CalciDao extends CrudRepository<CalciEntity, Double>
{

}
