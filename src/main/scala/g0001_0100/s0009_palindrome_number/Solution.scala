package g0001_0100.s0009_palindrome_number

// #Easy #Math #Udemy_Integers

object Solution {
    def isPalindrome(x: Int): Boolean = {
        if (x < 0) {
            false
        } else {
            var rev = 0
            var localX = x
            while (localX > 0) {
                rev *= 10
                rev += localX % 10
                localX /= 10
            }
            rev == x
        }
    }
}
