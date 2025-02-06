package org.samoheen.mahjong.ally

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform