package com.ksh.kopring.common

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import java.time.LocalDateTime
import javax.persistence.Column

/**
 * @author : ksh
 * @date : 2023/02/24
 **/


abstract class BaseTimeEntity (

    @CreatedDate
    @Column(name = "create_at")
    var createAt: LocalDateTime? = null,

    @LastModifiedBy
    @Column(name = "update_at")
    var updateAt: LocalDateTime? = null
)
