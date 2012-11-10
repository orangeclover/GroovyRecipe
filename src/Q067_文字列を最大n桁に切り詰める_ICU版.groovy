@Grab('com.ibm.icu:icu4j:50.1')
import com.ibm.icu.lang.UCharacter
import com.ibm.icu.lang.UProperty


def getWidth(int codePoint) {
    int value = UCharacter.getIntPropertyValue(codePoint, UProperty.EAST_ASIAN_WIDTH)
    switch(value) {
        case UCharacter.EastAsianWidth.NARROW:
        case UCharacter.EastAsianWidth.NEUTRAL:
        case UCharacter.EastAsianWidth.HALFWIDTH:
            return 1;
        case UCharacter.EastAsianWidth.FULLWIDTH:
        case UCharacter.EastAsianWidth.WIDE:
            return 2;
        case UCharacter.EastAsianWidth.AMBIGUOUS:
            return (["ja", "vi", "kr", "zh"].contains(Locale.getDefault().getLanguage())) ? 2 : 1
        default:
            return 1;
    }
}


def takeNcols(str, n) {
    result = ""
    length = 0
    for ( c in str) {
        length += getWidth((int)c)
        if ( length > n ) {
            break
        }
        result +=c
    }
    return result


}
assert takeNcols("あいうえおabcdeかきくけこfghij", 10) == "あいうえお"
assert takeNcols("１ｶﾅ亜、α（）㌁■Aa=()ال", 10) == "１ｶﾅ亜、α"