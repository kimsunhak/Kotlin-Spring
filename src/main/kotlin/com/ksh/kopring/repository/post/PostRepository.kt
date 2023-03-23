package com.ksh.kopring.repository.post

import com.ksh.kopring.domain.post.Post
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author : ksh
 * @date : 2023/02/24
 **/
interface PostRepository: JpaRepository<Post, Long>
