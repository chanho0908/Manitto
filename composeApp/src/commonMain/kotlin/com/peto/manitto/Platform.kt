package com.peto.manitto

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
