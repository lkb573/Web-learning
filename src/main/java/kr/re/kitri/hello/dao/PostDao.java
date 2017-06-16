package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Post;

import java.util.List;

public interface PostDao {

    void insertPost(Post post);
    List<Post> selectAllPost();
    Post selectPostMemberId(int memberId);
}
