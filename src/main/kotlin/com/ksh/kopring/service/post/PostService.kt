package com.ksh.kopring.service.post

import com.ksh.kopring.domain.post.Post
import com.ksh.kopring.dto.post.request.PostRequest
import com.ksh.kopring.repository.post.PostRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * @author : ksh
 * @date : 2023/02/24
 **/

@Service
class PostService (private val postRepository: PostRepository) {

    @Transactional
    fun createPost(postRequest: PostRequest): Long {
        val post = postRepository.save(Post(postRequest.title, postRequest.content))
        return post.id!!
    }
}
