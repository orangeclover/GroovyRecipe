import java.util.regex.Pattern;

assert Pattern.quote("*.txt") == /\Q*.txt\E/
assert Pattern.quote("what?") == /\Qwhat?\E/
assert Pattern.quote("[a-z]") == /\Q[a-z]\E/
assert Pattern.quote("*{a,b}") == /\Q*{a,b}\E/

assert ".." =~ Pattern.quote("..")
assert "xx" !=~ Pattern.quote("..")

assert ".." =~ /../
assert "xx" =~ /../