package com.neewrobert.bookstore

import io.micrometer.core.annotation.Counted
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/store")
class BookController {

    @Counted
    @PostMapping("/{id}/buy")
    fun buyBook(@PathVariable id: Int, @RequestParam quantity: Int): ResponseEntity<String> {
        return ResponseEntity.ok().build()
    }



}