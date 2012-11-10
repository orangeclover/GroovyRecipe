String.metaClass.breakingrRplaceFirst << { regex, replacement ->
    def str = delegate.value as String;
    def replacedStr = str.replaceFirst(regex, replacement);
    delegate.value = replacedStr as String;
    delegate.count = replacedStr.size();
}

str1 = "あいあいあい"
str1.breakingrRplaceFirst(/あい/,"")
println  str1