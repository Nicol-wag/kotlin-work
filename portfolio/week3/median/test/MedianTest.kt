// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median when size=1 is the only element" {
        median(listOf(7.5f)) shouldBe (7.5f plusOrMinus tolerance)
    }

    "Median when size=2 is the mean of both elements" {
        median(listOf(5.0f, 2.0f)) shouldBe (3.5f plusOrMinus tolerance)
    }

    "Median when size=3 is the middle value after sorting" {
        median(listOf(2.0f, 9.0f, 1.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }

    "Median when size=4 is the mean of the two middle values after sorting" {
        median(listOf(10.0f, 1.0f, 4.0f, 3.0f)) shouldBe (3.5f plusOrMinus tolerance)
    }
})
