package com.nyokabi.harakamall.repository

import com.nyokabi.harakamall.data.UserDao
import com.nyokabi.harakamall.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}