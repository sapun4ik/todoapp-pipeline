package studio.keyup.todoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoappPipelineApplication

fun main(args: Array<String>) {
    runApplication<TodoappPipelineApplication>(*args)
}
