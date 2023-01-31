package com.htmake.reader.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "reader.app")
class AppConfig {
    lateinit var storagePath: String // 存储路径
    var showUI = false // 是否显示UI
    var debug = false  // 是否调试web
    var packaged = false  // 是否打包为app
    var secure = true    // 是否启用登录鉴权
    var inviteCode = "123"   // 注册邀请码
    var secureKey = "12345678"    // 管理密码
    var cacheChapterContent = true // 是否缓存章节内容
    var userLimit = 3// 用户上限
    var userBookLimit = 6666    // 用户书籍上限
    var debugLog = false // 调试日志
    var autoClearInactiveUser = 0  // 自动清理不活跃用户

    var exportUseReplace = false // 导出不使用净化
    var exportCharset = "UTF-8" // 导出字符集
    var exportNoChapterName = false // 不添加章节名
    var exportPictureFile = false // 导出图片
}
