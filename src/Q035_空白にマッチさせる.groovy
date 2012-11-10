assert (~/\s/).matcher("a a").find() == true

assert (~/\s/).matcher("a	a").find() == true

assert (~/\s/).matcher("a　a").find() == false
