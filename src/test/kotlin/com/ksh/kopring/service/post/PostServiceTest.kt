package com.ksh.kopring.service.post

import com.ksh.kopring.domain.post.Post
import com.ksh.kopring.dto.post.request.PostRequest
import com.ksh.kopring.repository.post.PostRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * @author : ksh
 * @date : 2023/03/23
 **/

@SpringBootTest
class PostServiceTest @Autowired constructor(
    private val postRepository: PostRepository,
    private val postService: PostService
) {

    @Test
    fun `게시글 저장`() {
        // given
        val postRequest = PostRequest("title", "content")
        // when
        val postId = postService.createPost(postRequest)
        // then
        assertEquals(postId, 1L)
    }

    @Test
    fun `게시글 조회`() {
        // given
        val postRequest = PostRequest("title", "content")

        // when
        val post = postRepository.save(Post(postRequest.title, postRequest.content))

        // then
        assertEquals(post.content, postRequest.content)
    }
}
