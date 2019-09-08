package com.mscproject.wbl.service;

import com.mscproject.wbl.dao.AssignmentDao;
import com.mscproject.wbl.dao.CompetencyDao;
import com.mscproject.wbl.domain.Assignment;
import com.mscproject.wbl.domain.Competency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CompetencyServiceImpl implements CompetencyService {
    @Autowired
    CompetencyDao competencyDao;

    @Override
    public List<Competency> list() {
        return competencyDao.list();
    }

    @Override
    public void upd(Competency competency){
   competencyDao.upd(competency);
    }

    @Override
    public void add(Competency competency){
        competencyDao.add(competency);
    }

}
