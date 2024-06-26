package com.kochipek.news_app.data.repository.source.remote

import com.kochipek.news_app.data.model.Article
import com.kochipek.news_app.data.model.NewsApiResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getNews(country: String, page: Int): Response<NewsApiResponse>
    suspend fun getSearchedNews(searchQuery: String, page: Int): Response<NewsApiResponse>
}