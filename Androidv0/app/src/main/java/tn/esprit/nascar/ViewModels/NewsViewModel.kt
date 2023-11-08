package tn.esprit.nascar.ViewModels
import tn.esprit.nascar.Models.News
import androidx.lifecycle.ViewModel

class NewsViewModel : ViewModel() {
    private val newsList = mutableListOf<News>()


    fun addNews(news: News) {
        newsList.add(news)
    }

    fun getNewsList(): List<News> {
        return newsList
    }

    fun getNewsById(id: Int): News? {
        return newsList.find { it.id == id }
    }




    fun deleteNews(id: Int) {
        newsList.removeAll { it.id == id }
    }
}
