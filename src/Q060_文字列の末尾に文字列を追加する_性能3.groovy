
(1..5).each{
    buf = ""
    start = System.currentTimeMillis();
    (1..1000).each{
        buf <<= "xxx|"
    }
    end =  System.currentTimeMillis();
    println end - start
}

(1..5).each{
    buf = ""
    start = System.currentTimeMillis();
    (1..10000).each{
        buf <<= "xxx|"
    }
    end =  System.currentTimeMillis();
    println end - start
}