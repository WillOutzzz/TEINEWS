package com.example.teinews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teinews.databinding.FragmentReadLaterBinding

class ReadLaterFragment : Fragment() {

    private var _binding: FragmentReadLaterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReadLaterBinding.inflate(inflater, container, false)

        val savedArticles = listOf(
            NewsItem(
<<<<<<< HEAD
                id = 10,
                title = "Robótica y automatización en el hogar",
                content = "Cómo los robots domésticos están cambiando la forma en que vivimos y trabajamos en casa.",
                source = "HomeTech",
                publishTime = "Hace 3 días",
                category = "Robótica",
                isReadLater = true
            ),
            NewsItem(
                id = 11,
                title = "El impacto del metaverso en la educación",
                content = "Explorando cómo las tecnologías inmersivas están transformando el aprendizaje.",
                source = "EduTech",
                publishTime = "Hace 4 días",
                category = "Educación",
=======
                id = 2,
                title = "Japón desarrolla una computadora cuántica nacional",
                content = "Japón ha construido una computadora cuántica superconductora totalmente nacional, sin importar piezas extranjeras. El proyecto, liderado por la Universidad de Osaka con RIKEN y Fujitsu, incluye hardware y software propio llamado OQTOPUS. Será presentada en la Expo 2025 de Osaka.",
                detailedContent = "Japón ha construido la primera computadora cuántica superconductora fabricada sin importar componentes extranjeros, un logro histórico que marca su independencia tecnológica.\n\nEl proyecto fue liderado por la Universidad de Osaka, con el apoyo de RIKEN y Fujitsu, e incluye tanto el hardware como un software propio de código abierto llamado OQTOPUS.\n\nEsta computadora será presentada en la Expo 2025 de Osaka, y busca posicionar a Japón como líder mundial en la tecnología cuántica y la innovación científica.",
                source = "Infobae",
                sourceLink = "https://www.infobae.com",
                publishTime = "Hace 4 horas",
                category = "Tecnología",
                isReadLater = true
            ),
            NewsItem(
                id = 3,
                title = "China lanza la primera red de banda ancha 10G del mundo",
                content = "China lanzó oficialmente la primera red 10G del mundo en la provincia de Hebei, desarrollada por Huawei y China Unicom. Con tecnología óptica 50G-PON, alcanza descargas de 9.834 Mbps y una latencia de 3 ms. Se expandirá a más de 100 regiones durante 2025.",
                detailedContent = "El 20 de abril de 2025, China lanzó oficialmente la primera red 10G del mundo, desarrollada por Huawei y China Unicom.\n\nEsta red utiliza la tecnología óptica 50G-PON, capaz de alcanzar velocidades de descarga de 9.834 Mbps y subida de 1.008 Mbps, con una latencia de apenas 3 milisegundos.\n\nGracias a esta innovación, se podrán descargar películas en 4K de 20 GB en menos de 20 segundos.\n\nLa red está diseñada para soportar realidad virtual, ciudades inteligentes, vehículos autónomos y cirugías remotas, y se implementará en más de 100 regiones chinas durante 2025.",
                source = "Unisabaneta.edu.co",
                sourceLink = "https://www.unisabaneta.edu.co",
                publishTime = "Hace 6 horas",
                category = "Telecomunicaciones",
                isReadLater = true
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
                isReadLater = true
            ),
            NewsItem(
                id = 7,
                title = "Python 3.14 Beta disponible para desarrolladores",
                content = "La versión beta de Python 3.14 introduce el compilador 'Pepperfish', mejorando la velocidad de ejecución hasta en un 30%. También añade herramientas para programación asíncrona y paralela.",
                detailedContent = "La versión beta de Python 3.14 ya está disponible e introduce el compilador \"Pepperfish\", que mejora la velocidad de ejecución en un 30% respecto a la versión anterior.\n\nTambién incluye nuevas herramientas para programación asíncrona y paralela, pensadas para mejorar el rendimiento en sistemas distribuidos y aplicaciones de IA.\n\nEsta versión busca optimizar el flujo de trabajo de los desarrolladores, manteniendo la filosofía de simplicidad y potencia del lenguaje.",
                source = "Python.org",
                sourceLink = "https://www.python.org",
                publishTime = "Hace 14 horas",
                category = "Programación",
                isReadLater = true
            ),
            NewsItem(
                id = 9,
                title = "Windows 12 integra Copilot de forma nativa",
                content = "Microsoft lanzó oficialmente Windows 12 con Copilot integrado en el sistema operativo. El asistente puede escribir scripts, automatizar configuraciones y generar código en PowerShell o Python según el contexto.",
                detailedContent = "Microsoft lanzó oficialmente Windows 12, que llega con Copilot integrado directamente en el sistema operativo.\n\nEl asistente puede escribir scripts, automatizar configuraciones y generar código en PowerShell o Python, adaptándose al contexto del usuario.\n\nEsta versión representa un cambio importante en la interacción con el sistema operativo, combinando productividad y automatización mediante inteligencia artificial nativa.",
                source = "Microsoft News",
                sourceLink = "https://news.microsoft.com",
                publishTime = "Hace 18 horas",
                category = "Software",
>>>>>>> fd539a0 (Version Final)
                isReadLater = true
            )
        )

        binding.recyclerViewReadLater.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewReadLater.adapter = NewsAdapter(savedArticles)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
