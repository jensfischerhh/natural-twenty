package org.openended.naturaltwenty

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ApiController(val playerCharacterRepository: PlayerCharacterRepository) {

    @GetMapping("/player-characters/{id}")
    fun getPlayerCharacter(@PathVariable id: String) = playerCharacterRepository.findById(id = id)
}
