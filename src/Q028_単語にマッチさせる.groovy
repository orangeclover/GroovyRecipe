assert "Java spec".find(/\bspec\b/) == "spec"

assert  "Java specification".find(/\bspec\b/) == null

assert  "うどん".find(/\bうどん\b/) == "うどん"

assert  "ちきしょうどんだけだよ".find(/\bうどん\b/) == null

assert  "あいうabc".find(/あいう\b/) == null
