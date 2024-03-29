package th.ac.kku.cis.lab_pokemon_api
/*
data class PokemonResModel(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)

data class Pokemon(
    val name: Int,
    val url: String
)
*/

data class PokemonList(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)

data class Pokemon(
    val name: String,
    val url: String
)