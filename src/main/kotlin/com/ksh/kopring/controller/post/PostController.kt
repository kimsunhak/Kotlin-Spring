package com.ksh.kopring.controller.post

import com.ksh.kopring.dto.post.request.PostRequest
import com.ksh.kopring.service.post.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * @author : ksh
 * @date : 2023/02/24
 **/

@RestController
@RequestMapping("/post")
class PostController(private val postService: PostService) {

    @PostMapping("/save")
    fun savePost(@RequestBody postRequest: PostRequest) = postService.createPost(postRequest)

}
