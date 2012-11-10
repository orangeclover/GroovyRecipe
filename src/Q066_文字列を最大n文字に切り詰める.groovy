def takeNchars(str, n) {
    if (str.size() == 0) return str
    return str[0..n-1]
}


result = takeNchars("abcdefgh", 5)
assert result == "abcde"
assert result.size() == 5
println result

result = takeNchars("あいうえおかき", 5)
assert result == "あいうえお"
assert result.size() == 5
println result

result = takeNchars("ab\n\nde", 5)
assert result == "ab\n\nd"
assert result.size() == 5
println result

result = takeNchars("", 5)
assert result == ""
assert result.size() == 0
println result