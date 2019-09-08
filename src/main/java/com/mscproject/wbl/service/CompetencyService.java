package com.mscproject.wbl.service;
import com.mscproject.wbl.domain.Assignment;
import com.mscproject.wbl.domain.Competency;

import java.util.List;

public interface CompetencyService {
    List<Competency> list();
    void upd(Competency competency);
    void add(Competency competency);
}
