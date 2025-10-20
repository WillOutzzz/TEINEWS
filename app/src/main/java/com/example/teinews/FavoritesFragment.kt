package com.example.teinews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teinews.databinding.FragmentFavoritesBinding

class FavoritesFragment : Fragment() {

    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)

        val favorites = listOf(
            NewsItem(
<<<<<<< HEAD
                id = 8,
                title = "Intel anuncia nueva generación de procesadores",
                content = "La compañía presenta sus últimos avances en tecnología de procesadores con mejoras significativas.",
                source = "TechNews",
                publishTime = "Hace 1 día",
                category = "Tecnología",
                isFavorite = true
            ),
            NewsItem(
                id = 9,
                title = "Top 10 innovaciones tecnológicas del año",
                content = "Un repaso a las tecnologías más impactantes que han marcado este año.",
                source = "Innovation Weekly",
                publishTime = "Hace 2 días",
                category = "Innovación",
=======
                id = 1,
                title = "Google intensifica la ciberseguridad con IA",
                content = "Google presentó un asistente de inteligencia artificial llamado CODER MENDER, basado en Gemini, utilizado para corregir fallas de código automáticamente. Incluye un nuevo programa de recompensas y la actualización del Marco de IA Segura 2.0.",
                detailedContent = "Google ha anunciado el lanzamiento de CODER MENDER, un asistente autónomo de inteligencia artificial diseñado para detectar y corregir vulnerabilidades de código de forma automática.\n\nEste nuevo agente se basa en Gemini, la IA desarrollada por Microsoft, y forma parte del fortalecimiento del programa de ciberseguridad de Google.\n\nAdemás, la compañía presentó una actualización del Marco de IA Segura 2.0 y un nuevo programa de recompensas para investigadores que descubran fallas críticas en el software.\n\nEl objetivo es crear un ecosistema digital más protegido, donde las IA actúen como guardianes automáticos del código.",
                source = "Wired",
                sourceLink = "https://www.wired.com",
                publishTime = "Hace 2 horas",
                category = "Ciberseguridad",
                isFavorite = true
            ),
            NewsItem(
                id = 4,
                title = "OpenAI lanza o1: una IA que razona como un humano",
                content = "OpenAI presentó el modelo o1, una IA que razona paso a paso como un humano. Analiza, verifica y reflexiona antes de responder, mejorando la resolución de problemas en matemáticas, ciencias y programación, con un proceso más transparente y confiable.",
                detailedContent = "OpenAI ha presentado o1, un modelo de inteligencia artificial capaz de razonar paso a paso como un humano.\n\nA diferencia de los modelos tradicionales que solo reconocen patrones, o1 analiza, verifica y reflexiona antes de responder, logrando resultados más precisos en matemáticas, ciencias y programación.\n\nEl modelo también muestra su proceso de pensamiento, aumentando la transparencia y la confianza en sus respuestas.\n\nEsta innovación marca un salto hacia IA más explicables y responsables, ideales para aplicaciones críticas y educativas.",
                source = "OpenAI Blog",
                sourceLink = "https://openai.com/blog",
                publishTime = "Hace 8 horas",
                category = "Inteligencia Artificial",
                isFavorite = true
            ),
            NewsItem(
                id = 5,
                title = "Microsoft y NVIDIA lanzan la supercomputadora más potente del mundo para IA",
                content = "Microsoft Azure y NVIDIA presentaron el clúster GB300 NVL72, con 4,608 GPU NVIDIA Blackwell Ultra y rendimiento de 1.44 exaflops. Permite entrenar modelos avanzados de IA, impulsando el desarrollo de agentes inteligentes y sistemas de razonamiento complejo.",
                detailedContent = "Microsoft Azure y NVIDIA anunciaron el lanzamiento de la supercomputadora GB300 NVL72, el clúster de producción más potente del planeta, diseñado para entrenar modelos avanzados de inteligencia artificial.\n\nEste sistema integra 4,608 GPU NVIDIA Blackwell Ultra, interconectadas mediante Quantum-X800 InfiniBand, alcanzando una potencia de 1.44 exaflops por máquina virtual y 37 TB de memoria unificada.\n\nGracias a esta infraestructura, se podrán entrenar modelos multimodales y sistemas de razonamiento complejo como los utilizados por OpenAI, reforzando el liderazgo estadounidense en la próxima generación de IA.",
                source = "NVIDIA Blog",
                sourceLink = "https://blogs.nvidia.com",
                publishTime = "Hace 10 horas",
                category = "Computación",
                isFavorite = true
            ),
            NewsItem(
                id = 6,
                title = "Científicos crean 'minicerebros' humanos para impulsar computadoras biológicas",
                content = "Investigadores suizos de FinalSpark desarrollan biocomputadoras basadas en organoides cerebrales cultivados de células humanas. Estos 'minicerebros' procesan señales eléctricas y podrían complementar la IA tradicional consumiendo menos energía.",
                detailedContent = "Investigadores suizos de la empresa FinalSpark están desarrollando biocomputadoras basadas en organoides cerebrales, pequeños grupos de neuronas cultivadas a partir de células de piel humana.\n\nEstos \"minicerebros\" pueden procesar señales eléctricas y responder a comandos básicos, representando un primer paso hacia computadoras biológicas que consumen una fracción de la energía de los sistemas actuales.\n\nAunque aún son experimentales —los organoides sobreviven unos cuatro meses—, los científicos creen que esta tecnología podría complementar la inteligencia artificial tradicional y ayudar a estudiar enfermedades neurológicas.",
                source = "BBC Mundo",
                sourceLink = "https://www.bbc.com/mundo",
                publishTime = "Hace 12 horas",
                category = "Biotecnología",
                isFavorite = true
            ),
            NewsItem(
                id = 8,
                title = "Apple lanza los chips M5 con IA integrada",
                content = "Durante el evento 'Apple October 2025', la compañía presentó los procesadores M5, optimizados para tareas de IA y aprendizaje automático local, con un 40% más de eficiencia en modelos CoreML.",
                detailedContent = "En su evento \"Apple October 2025\", la compañía presentó los nuevos procesadores M5, diseñados con módulos de IA integrados para ejecutar tareas de aprendizaje automático directamente desde el dispositivo.\n\nEstos chips prometen un 40% más de eficiencia energética y un rendimiento superior en modelos desarrollados con CoreML, el entorno de aprendizaje automático de Apple.\n\nLa empresa busca con esto potenciar la IA local en Mac, iPad y iPhone, garantizando velocidad y privacidad sin depender de la nube.",
                source = "Apple Newsroom",
                sourceLink = "https://www.apple.com/newsroom",
                publishTime = "Hace 16 horas",
                category = "Hardware",
>>>>>>> fd539a0 (Version Final)
                isFavorite = true
            )
        )

        binding.recyclerViewFavorites.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewFavorites.adapter = NewsAdapter(favorites)

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
