package kr.re.kitri.hello.service;


import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmigoService {

    @Autowired
    private AmigoDao dao;

    public void registAimgo(Amigo amigo) {
        dao.insertAimgo(amigo);
    }


    public List<Amigo> getAimgos() {
        return dao.selectAllAimgos();
    }

    public Amigo viewAmigoDetail(String name) {

        return dao.selectAmigoByName(name);
    }
}