package com.example.teinews

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.teinews.databinding.ActivityNewsDetailBinding

class NewsDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsDetailBinding
    private lateinit var newsItem: NewsItem
    private var isFavorite = false
    private var isSaved = false
    private var isReadLater = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener la noticia del intent
        newsItem = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("news_item", NewsItem::class.java) ?: getDefaultNewsItem()
        } else {
            @Suppress("DEPRECATION")
            intent.getSerializableExtra("news_item") as? NewsItem ?: getDefaultNewsItem()
        }

        setupUI()
        setupClickListeners()
    }

    private fun getDefaultNewsItem(): NewsItem {
        return NewsItem(
            id = 1,
            title = "Nuevos chips Intel 2025",
            content = "Intel ha anunciado su nueva generación de procesadores que prometen un rendimiento superior y mayor eficiencia energética. Los nuevos chips incluyen mejoras significativas en la arquitectura y soporte para las últimas tecnologías de memoria y conectividad.\n\nLa compañía espera que estos procesadores estén disponibles en el mercado durante el primer trimestre de 2025, con precios competitivos que buscan mantener su posición en el mercado de procesadores de alto rendimiento.\n\nLos expertos en tecnología han elogiado las mejoras en eficiencia energética, que podrían reducir significativamente el consumo de energía en dispositivos móviles y de escritorio.",
            source = "TechNews",
            publishTime = "Hace 2 horas",
            category = "Tecnología"
        )
    }

    private fun setupUI() {
        binding.tvTitle.text = newsItem.title
<<<<<<< HEAD
        binding.tvContent.text = newsItem.content
=======
        // Usar contenido detallado si está disponible, sino usar el contenido normal
        binding.tvContent.text = if (newsItem.detailedContent.isNotEmpty()) {
            newsItem.detailedContent
        } else {
            newsItem.content
        }
>>>>>>> fd539a0 (Version Final)
        binding.tvSource.text = newsItem.source
        binding.tvPublishTime.text = newsItem.publishTime
        binding.tvCategory.text = newsItem.category

        // Actualizar estado de los botones
        updateButtonStates()
    }

    private fun setupClickListeners() {
        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnFavorite.setOnClickListener {
            toggleFavorite()
        }

        binding.btnSave.setOnClickListener {
            toggleSave()
        }

        binding.btnReadLater.setOnClickListener {
            toggleReadLater()
        }
    }

    private fun toggleFavorite() {
        isFavorite = !isFavorite
        updateButtonStates()
        
        val message = if (isFavorite) "Agregado a favoritos" else "Removido de favoritos"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun toggleSave() {
        isSaved = !isSaved
        updateButtonStates()
        
        val message = if (isSaved) "Noticia guardada" else "Noticia removida"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun toggleReadLater() {
        isReadLater = !isReadLater
        updateButtonStates()
        
        val message = if (isReadLater) "Agregado a leer más tarde" else "Removido de leer más tarde"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun updateButtonStates() {
        // Actualizar botón de favorito
        if (isFavorite) {
            binding.ivFavoriteIcon.setColorFilter(getColor(R.color.accent_orange_dark))
            binding.tvFavoriteText.text = "En Favoritos"
            binding.btnFavorite.setCardBackgroundColor(getColor(R.color.accent_orange_dark))
            binding.tvFavoriteText.setTextColor(getColor(R.color.white))
        } else {
            binding.ivFavoriteIcon.setColorFilter(getColor(R.color.accent_orange_dark))
            binding.tvFavoriteText.text = "Favorito"
            binding.btnFavorite.setCardBackgroundColor(getColor(R.color.accent_orange_light))
            binding.tvFavoriteText.setTextColor(getColor(R.color.accent_orange_dark))
        }

        // Actualizar botón de guardar
        if (isSaved) {
            binding.ivSaveIcon.setColorFilter(getColor(R.color.white))
            binding.tvSaveText.text = "Guardado"
            binding.btnSave.setCardBackgroundColor(getColor(R.color.primary_blue_dark))
            binding.tvSaveText.setTextColor(getColor(R.color.white))
        } else {
            binding.ivSaveIcon.setColorFilter(getColor(R.color.primary_blue_dark))
            binding.tvSaveText.text = "Guardar"
            binding.btnSave.setCardBackgroundColor(getColor(R.color.primary_blue_light))
            binding.tvSaveText.setTextColor(getColor(R.color.primary_blue_dark))
        }

        // Actualizar botón de leer más tarde
        if (isReadLater) {
            binding.ivReadLaterIcon.setColorFilter(getColor(R.color.white))
            binding.tvReadLaterText.text = "Programado"
            binding.btnReadLater.setCardBackgroundColor(getColor(R.color.primary_blue_dark))
            binding.tvReadLaterText.setTextColor(getColor(R.color.white))
        } else {
            binding.ivReadLaterIcon.setColorFilter(getColor(R.color.white))
            binding.tvReadLaterText.text = "Leer Más Tarde"
            binding.btnReadLater.setCardBackgroundColor(getColor(R.color.success_green))
            binding.tvReadLaterText.setTextColor(getColor(R.color.white))
        }
    }
}
