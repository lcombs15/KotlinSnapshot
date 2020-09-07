package com.example.springconsumer

import com.karumi.kotlinsnapshot.matchWithSnapshot
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpringConsumerApplicationTests {

    @Test
    fun contextLoads() {
        9001.matchWithSnapshot()
    }

}
