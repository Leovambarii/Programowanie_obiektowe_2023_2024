package my_spring_project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringProjectApplication

fun main(args: Array<String>) {
    runApplication<SpringProjectApplication>(*args)
}
