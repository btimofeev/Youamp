package ru.stresh.youamp.main.domain

internal interface ServerExistRepository {
    suspend fun hasServer(): Boolean
}