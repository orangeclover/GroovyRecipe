assert "\n".find(~/./) == null

assert "\n".find(~/(?m)./) == null

assert "\n".find(~/(?s)./) == "\n"