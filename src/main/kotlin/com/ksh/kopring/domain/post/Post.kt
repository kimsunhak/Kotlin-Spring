package com.ksh.kopring.domain.post

import com.ksh.kopring.common.BaseTimeEntity
import com.ksh.kopring.common.enums.OnOffType
import javax.persistence.*

/**
 * @author : ksh
 * @date : 2023/02/24
 **/

@Entity
class Post(
    @Column
    var title: String,

    @Column
    var content: String,

    @Enumerated(EnumType.STRING)
    var postStatus: OnOffType = OnOffType.ON

) : BaseTimeEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    val id: Long? = null
}
