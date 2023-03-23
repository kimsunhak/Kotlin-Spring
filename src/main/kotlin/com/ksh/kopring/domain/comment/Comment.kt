package com.ksh.kopring.domain.comment

import com.ksh.kopring.common.BaseTimeEntity
import javax.persistence.*

/**
 * @author : ksh
 * @date : 2023/02/24
 **/

@Entity
class Comment(
    var content: String,
) : BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    val id: Long? = null
}
