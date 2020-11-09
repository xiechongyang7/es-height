package com.study.es.dao;


import com.study.es.entity.es.EsBossCityInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


/**
* @description
* @since JDK1.8
* @createTime 2020/11/5 20:14
* @author xie
*/
@Repository
public interface TestDao extends ElasticsearchRepository<EsBossCityInfo,Long> {
}
