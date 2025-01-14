package com.htmake.reader.entity

data class User(
        var username: String="1471587718",
        var password: String="19991223",
        var salt: String="",
        var token: String="",
        var last_login_at: Long = System.currentTimeMillis(),
        var created_at: Long = System.currentTimeMillis(),
        var enable_webdav: Boolean = true, // 是否开启 WebDAV 功能
        var token_map: Map<String, Long>? = null,
        var enable_local_store: Boolean = true // 是否开启本地书仓功能
)
