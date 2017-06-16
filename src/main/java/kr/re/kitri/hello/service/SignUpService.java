package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDaoJdbc;
import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SignUpService {

    @Autowired
    private MemberDaoJdbc mDao;


    public void registMember(Member member) {
        mDao.signupMember(member);
    }
}
