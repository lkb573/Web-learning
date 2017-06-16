package kr.re.kitri.hello.service;


import kr.re.kitri.hello.dao.MemberDaoJdbc;
import kr.re.kitri.hello.dao.PostDaoJdbc;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private MemberDaoJdbc mDao;

    @Autowired
    private PostDaoJdbc pDao;

    /*
    * 글을 등록 --> 회원 point +10
    **/
    public void registPost(Post post) {

        pDao.insertPost(post);
        mDao.updatePoint(post.getMemberId());

    }

    public List<Post> getPosts() {
        return pDao.selectAllPost();
    }

    public Post viewPostDetail(int memberId) {

        return pDao.selectPostMemberId(memberId);
    }
}