package com.example.teinews

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teinews.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private lateinit var allArticles: List<NewsItem>
    private lateinit var searchAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        // Base de datos de artículos para búsqueda
        allArticles = listOf(
            NewsItem(
<<<<<<< HEAD
                id = 5,
                title = "Cómo mejorar tu PC gamer",
                content = "Guía completa para optimizar tu computadora gaming con los mejores componentes y configuraciones.",
                source = "GamingTech",
                publishTime = "Hace 1 hora",
                category = "Gaming"
            ),
            NewsItem(
                id = 6,
                title = "Los mejores celulares 2025",
                content = "Revisión de los smartphones más destacados que han llegado al mercado este año.",
                source = "PhoneReview",
                publishTime = "Hace 3 horas",
                category = "Smartphones"
            ),
            NewsItem(
                id = 7,
                title = "Tecnología verde: el futuro sostenible",
                content = "Las innovaciones tecnológicas que están ayudando a crear un futuro más sostenible.",
                source = "EcoTech",
                publishTime = "Hace 5 horas",
                category = "Sostenibilidad"
            ),
            NewsItem(
                id = 8,
                title = "Inteligencia artificial en medicina",
                content = "Cómo la IA está revolucionando el diagnóstico y tratamiento médico.",
                source = "MedTech",
                publishTime = "Hace 2 horas",
                category = "Medicina"
            ),
            NewsItem(
                id = 9,
                title = "Realidad virtual y gaming",
                content = "El futuro de los videojuegos con tecnologías inmersivas.",
                source = "VR Gaming",
                publishTime = "Hace 4 horas",
                category = "Gaming"
            ),
            NewsItem(
                id = 10,
                title = "Blockchain y criptomonedas",
                content = "Análisis del impacto de la tecnología blockchain en las finanzas.",
                source = "CryptoNews",
                publishTime = "Hace 6 horas",
                category = "Fintech"
=======
                id = 1,
                title = "Google intensifica la ciberseguridad con IA",
                content = "Google presentó un asistente de inteligencia artificial llamado CODER MENDER, basado en Gemini, utilizado para corregir fallas de código automáticamente. Incluye un nuevo programa de recompensas y la actualización del Marco de IA Segura 2.0.",
                detailedContent = "Google ha anunciado el lanzamiento de CODER MENDER, un asistente autónomo de inteligencia artificial diseñado para detectar y corregir vulnerabilidades de código de forma automática.\n\nEste nuevo agente se basa en Gemini, la IA desarrollada por Microsoft, y forma parte del fortalecimiento del programa de ciberseguridad de Google.\n\nAdemás, la compañía presentó una actualización del Marco de IA Segura 2.0 y un nuevo programa de recompensas para investigadores que descubran fallas críticas en el software.\n\nEl objetivo es crear un ecosistema digital más protegido, donde las IA actúen como guardianes automáticos del código.",
                source = "Wired",
                sourceLink = "https://www.wired.com",
                publishTime = "Hace 2 horas",
                category = "Ciberseguridad"
            ),
            NewsItem(
                id = 2,
                title = "Japón desarrolla una computadora cuántica nacional",
                content = "Japón ha construido una computadora cuántica superconductora totalmente nacional, sin importar piezas extranjeras. El proyecto, liderado por la Universidad de Osaka con RIKEN y Fujitsu, incluye hardware y software propio llamado OQTOPUS. Será presentada en la Expo 2025 de Osaka.",
                detailedContent = "Japón ha construido la primera computadora cuántica superconductora fabricada sin importar componentes extranjeros, un logro histórico que marca su independencia tecnológica.\n\nEl proyecto fue liderado por la Universidad de Osaka, con el apoyo de RIKEN y Fujitsu, e incluye tanto el hardware como un software propio de código abierto llamado OQTOPUS.\n\nEsta computadora será presentada en la Expo 2025 de Osaka, y busca posicionar a Japón como líder mundial en la tecnología cuántica y la innovación científica.",
                source = "Infobae",
                sourceLink = "https://www.infobae.com",
                publishTime = "Hace 4 horas",
                category = "Tecnología"
            ),
            NewsItem(
                id = 3,
                title = "China lanza la primera red de banda ancha 10G del mundo",
                content = "China lanzó oficialmente la primera red 10G del mundo en la provincia de Hebei, desarrollada por Huawei y China Unicom. Con tecnología óptica 50G-PON, alcanza descargas de 9.834 Mbps y una latencia de 3 ms. Se expandirá a más de 100 regiones durante 2025.",
                detailedContent = "El 20 de abril de 2025, China lanzó oficialmente la primera red 10G del mundo, desarrollada por Huawei y China Unicom.\n\nEsta red utiliza la tecnología óptica 50G-PON, capaz de alcanzar velocidades de descarga de 9.834 Mbps y subida de 1.008 Mbps, con una latencia de apenas 3 milisegundos.\n\nGracias a esta innovación, se podrán descargar películas en 4K de 20 GB en menos de 20 segundos.\n\nLa red está diseñada para soportar realidad virtual, ciudades inteligentes, vehículos autónomos y cirugías remotas, y se implementará en más de 100 regiones chinas durante 2025.",
                source = "Unisabaneta.edu.co",
                sourceLink = "https://www.unisabaneta.edu.co",
                publishTime = "Hace 6 horas",
                category = "Telecomunicaciones"
            ),
            NewsItem(
                id = 4,
                title = "OpenAI lanza o1: una IA que razona como un humano",
                content = "OpenAI presentó el modelo o1, una IA que razona paso a paso como un humano. Analiza, verifica y reflexiona antes de responder, mejorando la resolución de problemas en matemáticas, ciencias y programación, con un proceso más transparente y confiable.",
                detailedContent = "OpenAI ha presentado o1, un modelo de inteligencia artificial capaz de razonar paso a paso como un humano.\n\nA diferencia de los modelos tradicionales que solo reconocen patrones, o1 analiza, verifica y reflexiona antes de responder, logrando resultados más precisos en matemáticas, ciencias y programación.\n\nEl modelo también muestra su proceso de pensamiento, aumentando la transparencia y la confianza en sus respuestas.\n\nEsta innovación marca un salto hacia IA más explicables y responsables, ideales para aplicaciones críticas y educativas.",
                source = "OpenAI Blog",
                sourceLink = "https://openai.com/blog",
                publishTime = "Hace 8 horas",
                category = "Inteligencia Artificial"
            ),
            NewsItem(
                id = 5,
                title = "Microsoft y NVIDIA lanzan la supercomputadora más potente del mundo para IA",
                content = "Microsoft Azure y NVIDIA presentaron el clúster GB300 NVL72, con 4,608 GPU NVIDIA Blackwell Ultra y rendimiento de 1.44 exaflops. Permite entrenar modelos avanzados de IA, impulsando el desarrollo de agentes inteligentes y sistemas de razonamiento complejo.",
                detailedContent = "Microsoft Azure y NVIDIA anunciaron el lanzamiento de la supercomputadora GB300 NVL72, el clúster de producción más potente del planeta, diseñado para entrenar modelos avanzados de inteligencia artificial.\n\nEste sistema integra 4,608 GPU NVIDIA Blackwell Ultra, interconectadas mediante Quantum-X800 InfiniBand, alcanzando una potencia de 1.44 exaflops por máquina virtual y 37 TB de memoria unificada.\n\nGracias a esta infraestructura, se podrán entrenar modelos multimodales y sistemas de razonamiento complejo como los utilizados por OpenAI, reforzando el liderazgo estadounidense en la próxima generación de IA.",
                source = "NVIDIA Blog",
                sourceLink = "https://blogs.nvidia.com",
                publishTime = "Hace 10 horas",
                category = "Computación"
            ),
            NewsItem(
                id = 6,
                title = "Científicos crean 'minicerebros' humanos para impulsar computadoras biológicas",
                content = "Investigadores suizos de FinalSpark desarrollan biocomputadoras basadas en organoides cerebrales cultivados de células humanas. Estos 'minicerebros' procesan señales eléctricas y podrían complementar la IA tradicional consumiendo menos energía.",
                detailedContent = "Investigadores suizos de la empresa FinalSpark están desarrollando biocomputadoras basadas en organoides cerebrales, pequeños grupos de neuronas cultivadas a partir de células de piel humana.\n\nEstos \"minicerebros\" pueden procesar señales eléctricas y responder a comandos básicos, representando un primer paso hacia computadoras biológicas que consumen una fracción de la energía de los sistemas actuales.\n\nAunque aún son experimentales —los organoides sobreviven unos cuatro meses—, los científicos creen que esta tecnología podría complementar la inteligencia artificial tradicional y ayudar a estudiar enfermedades neurológicas.",
                source = "BBC Mundo",
                sourceLink = "https://www.bbc.com/mundo",
                publishTime = "Hace 12 horas",
                category = "Biotecnología"
            ),
            NewsItem(
                id = 7,
                title = "Python 3.14 Beta disponible para desarrolladores",
                content = "La versión beta de Python 3.14 introduce el compilador 'Pepperfish', mejorando la velocidad de ejecución hasta en un 30%. También añade herramientas para programación asíncrona y paralela.",
                detailedContent = "La versión beta de Python 3.14 ya está disponible e introduce el compilador \"Pepperfish\", que mejora la velocidad de ejecución en un 30% respecto a la versión anterior.\n\nTambién incluye nuevas herramientas para programación asíncrona y paralela, pensadas para mejorar el rendimiento en sistemas distribuidos y aplicaciones de IA.\n\nEsta versión busca optimizar el flujo de trabajo de los desarrolladores, manteniendo la filosofía de simplicidad y potencia del lenguaje.",
                source = "Python.org",
                sourceLink = "https://www.python.org",
                publishTime = "Hace 14 horas",
                category = "Programación"
            ),
            NewsItem(
                id = 8,
                title = "Apple lanza los chips M5 con IA integrada",
                content = "Durante el evento 'Apple October 2025', la compañía presentó los procesadores M5, optimizados para tareas de IA y aprendizaje automático local, con un 40% más de eficiencia en modelos CoreML.",
                detailedContent = "En su evento \"Apple October 2025\", la compañía presentó los nuevos procesadores M5, diseñados con módulos de IA integrados para ejecutar tareas de aprendizaje automático directamente desde el dispositivo.\n\nEstos chips prometen un 40% más de eficiencia energética y un rendimiento superior en modelos desarrollados con CoreML, el entorno de aprendizaje automático de Apple.\n\nLa empresa busca con esto potenciar la IA local en Mac, iPad y iPhone, garantizando velocidad y privacidad sin depender de la nube.",
                source = "Apple Newsroom",
                sourceLink = "https://www.apple.com/newsroom",
                publishTime = "Hace 16 horas",
                category = "Hardware"
            ),
            NewsItem(
                id = 9,
                title = "Windows 12 integra Copilot de forma nativa",
                content = "Microsoft lanzó oficialmente Windows 12 con Copilot integrado en el sistema operativo. El asistente puede escribir scripts, automatizar configuraciones y generar código en PowerShell o Python según el contexto.",
                detailedContent = "Microsoft lanzó oficialmente Windows 12, que llega con Copilot integrado directamente en el sistema operativo.\n\nEl asistente puede escribir scripts, automatizar configuraciones y generar código en PowerShell o Python, adaptándose al contexto del usuario.\n\nEsta versión representa un cambio importante en la interacción con el sistema operativo, combinando productividad y automatización mediante inteligencia artificial nativa.",
                source = "Microsoft News",
                sourceLink = "https://news.microsoft.com",
                publishTime = "Hace 18 horas",
                category = "Software"
>>>>>>> fd539a0 (Version Final)
            )
        )

        setupSearch()
        return binding.root
    }

    private fun setupSearch() {
        // Configurar RecyclerView
        binding.recyclerViewSearch.layoutManager = LinearLayoutManager(requireContext())
        searchAdapter = NewsAdapter(allArticles)
        binding.recyclerViewSearch.adapter = searchAdapter

        // Configurar búsqueda en tiempo real
        binding.searchBar.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                performSearch(s.toString())
            }
            
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun performSearch(query: String) {
        if (query.isBlank()) {
            // Mostrar todos los artículos si no hay búsqueda
            searchAdapter = NewsAdapter(allArticles)
        } else {
            // Filtrar artículos basado en la consulta
            val filteredArticles = allArticles.filter { article ->
                article.title.contains(query, ignoreCase = true) ||
                article.content.contains(query, ignoreCase = true) ||
                article.source.contains(query, ignoreCase = true) ||
                article.category.contains(query, ignoreCase = true)
            }
            searchAdapter = NewsAdapter(filteredArticles)
        }
        
        binding.recyclerViewSearch.adapter = searchAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
