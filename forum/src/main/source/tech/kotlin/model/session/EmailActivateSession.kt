package tech.kotlin.model.session

import com.baidu.bjf.remoting.protobuf.FieldType
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf
import com.fasterxml.jackson.annotation.JsonProperty
import tech.kotlin.model.domain.Account
import tech.kotlin.model.domain.Device

/*********************************************************************
 * Created by chpengzh@foxmail.com
 * Copyright (c) http://chpengzh.com - All Rights Reserved
 *********************************************************************/
class EmailActivateSession {

    @Protobuf(order = 1, required = true, fieldType = FieldType.STRING, description = "email")
    @JsonProperty("email")
    var email = ""

    @Protobuf(order = 2, required = true, fieldType = FieldType.UINT64, description = "uid")
    @JsonProperty("uid")
    var uid: Long = 0

}