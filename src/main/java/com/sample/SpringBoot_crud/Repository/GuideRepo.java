package com.sample.SpringBoot_crud.Repository;

import com.sample.SpringBoot_crud.Model.Guide;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuideRepo
    extends MongoRepository<Guide, Integer>
{

}


