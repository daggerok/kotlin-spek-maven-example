package fi.zalando.icecube.sherlock

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertFailsWith

/* internal */ class SampleSpek : Spek({
  describe("application context") {
    val set by memoized { mutableSetOf<String>() }

    context("is empty") {
      it("should have a size of 0") {
        assertEquals(0, set.size)
      }

      it("should throw when first is invoked") {
        assertFailsWith(NoSuchElementException::class) {
          set.first()
        }
      }
    }

    context("some action") {
      it("should not fail") {
        assertTrue(true, "oops...")
      }
      it("should pass") {
        assertTrue(true)
      }
    }
  }
})
