@Grab('com.googlecode.juniversalchardet:juniversalchardet:1.0.3')

            
import org.mozilla.universalchardet.UniversalDetector

def String getCodeName(fileName) {
    f = new File(fileName)
    fis = new FileInputStream(f)
    len = (int)f.length()
    buf = new byte[len];

    detector = new UniversalDetector(null);
    while ((nread = fis.read(buf)) > 0 && ! detector.isDone()) {
        detector.handleData(buf, 0, nread);
    }
    detector.dataEnd();

    encoding = detector.getDetectedCharset()
    encoding = (encoding != null) ? encoding : "Unkown"
    detector.reset();
    return encoding;

}


println "EUC.txt:" + getCodeName("../test/input/EUC.txt")
println "ISO-2022-JP.txt:" + getCodeName("../test/input/ISO-2022-JP.txt")
println "JIS.txt:" + getCodeName("../test/input/JIS.txt")
println "SJIS.txt:" + getCodeName("../test/input/SJIS.txt")
println "UTF-8.txt:" + getCodeName("../test/input/UTF-8.txt")
