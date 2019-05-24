package fi.zalando.icecube.sherlock

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertTrue

class SampleSpek : Spek({
  given("application context") {
    on("some action") {
      it("should not fail") {
        assertTrue(true, "oops...")
      }
      it("should pass") {
        assertTrue(true)
      }
    }
  }
})
