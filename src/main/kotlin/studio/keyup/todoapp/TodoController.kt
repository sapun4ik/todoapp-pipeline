package studio.keyup.todoapp

import org.apache.commons.logging.LogFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {

    @GetMapping("/{message}")
    fun get(@PathVariable message: String): String {
        log.info(message)
        return message
    }

    companion object {
        private val log = LogFactory.getLog(TodoController::class.java)
    }
}