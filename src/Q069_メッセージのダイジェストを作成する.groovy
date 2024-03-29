//ref http://www.techscore.com/tech/Java/JavaSE/Utility/10-2/

import java.security.MessageDigest

java.security.MessageDigest.metaClass.hexDigest { target ->
    delegate.update(target.getBytes())
    def digest = delegate.digest()
    digestHex = ""
    digest.each{c ->
        tmp = sprintf("%02x", c & 0xff)
        digestHex +=tmp

    }
    return digestHex
}

def md = MessageDigest.getInstance("MD5")

def target = "abcdefghijklmn" * 1024
assert md.hexDigest(target) == "80fb5e0d7dd99e4891f7036c53818e37"

target = "abcdefghijklmn" * 1024 + "x"
assert md.hexDigest(target) == "a3008b9b09e13a35ec12f46568b40d0b"

