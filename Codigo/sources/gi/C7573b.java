package gi;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gi.b */
/* loaded from: classes3.dex */
public class C7573b {

    /* renamed from: a */
    private static final Map<String, String> f17908a = new HashMap();

    static {
        m23006a("epub", "application/epub+zip");
        m23006a("ogx", "application/ogg");
        m23006a("odp", "application/vnd.oasis.opendocument.presentation");
        m23006a("otp", "application/vnd.oasis.opendocument.presentation-template");
        m23006a("yt", "application/vnd.youtube.yt");
        m23006a("hwp", "application/x-hwp");
        m23006a("3gpp", "video/3gpp");
        m23006a("3gp", "video/3gpp");
        m23006a("3gpp2", "video/3gpp2");
        m23006a("3g2", "video/3gpp2");
        m23006a("oga", "audio/ogg");
        m23006a("ogg", "audio/ogg");
        m23006a("spx", "audio/ogg");
        m23006a("dng", "image/x-adobe-dng");
        m23006a("cr2", "image/x-canon-cr2");
        m23006a("raf", "image/x-fuji-raf");
        m23006a("nef", "image/x-nikon-nef");
        m23006a("nrw", "image/x-nikon-nrw");
        m23006a("orf", "image/x-olympus-orf");
        m23006a("rw2", "image/x-panasonic-rw2");
        m23006a("pef", "image/x-pentax-pef");
        m23006a("srw", "image/x-samsung-srw");
        m23006a("arw", "image/x-sony-arw");
        m23006a("ogv", "video/ogg");
        m23006a("tgz", "application/x-gtar-compressed");
        m23006a("taz", "application/x-gtar-compressed");
        m23006a("csv", "text/csv");
        m23006a("gz", "application/gzip");
        m23006a("cab", "application/vnd.ms-cab-compressed");
        m23006a("7z", "application/x-7z-compressed");
        m23006a("bz", "application/x-bzip");
        m23006a("bz2", "application/x-bzip2");
        m23006a("z", "application/x-compress");
        m23006a("jar", "application/x-java-archive");
        m23006a("lzma", "application/x-lzma");
        m23006a("xz", "application/x-xz");
        m23006a("m3u", "audio/x-mpegurl");
        m23006a("m3u8", "audio/x-mpegurl");
        m23006a("p7b", "application/x-pkcs7-certificates");
        m23006a("spc", "application/x-pkcs7-certificates");
        m23006a("p7c", "application/pkcs7-mime");
        m23006a("p7s", "application/pkcs7-signature");
        m23006a("es", "application/ecmascript");
        m23006a("js", "application/javascript");
        m23006a("json", "application/json");
        m23006a("ts", "application/typescript");
        m23006a("perl", "text/x-perl");
        m23006a("pl", "text/x-perl");
        m23006a("pm", "text/x-perl");
        m23006a("py", "text/x-python");
        m23006a("py3", "text/x-python");
        m23006a("py3x", "text/x-python");
        m23006a("pyx", "text/x-python");
        m23006a("wsgi", "text/x-python");
        m23006a("rb", "text/ruby");
        m23006a("sh", "application/x-sh");
        m23006a("yaml", "text/x-yaml");
        m23006a("yml", "text/x-yaml");
        m23006a("asm", "text/x-asm");
        m23006a("s", "text/x-asm");
        m23006a("cs", "text/x-csharp");
        m23006a("azw", "application/vnd.amazon.ebook");
        m23006a("ibooks", "application/x-ibooks+zip");
        m23006a("mobi", "application/x-mobipocket-ebook");
        m23006a("woff", "font/woff");
        m23006a("woff2", "font/woff2");
        m23006a("msg", "application/vnd.ms-outlook");
        m23006a("eml", "message/rfc822");
        m23006a("eot", "application/vnd.ms-fontobject");
        m23006a("ttf", "font/ttf");
        m23006a("otf", "font/otf");
        m23006a("ttc", "font/collection");
        m23006a("markdown", "text/markdown");
        m23006a("md", "text/markdown");
        m23006a("mkd", "text/markdown");
        m23006a("conf", "text/plain");
        m23006a("ini", "text/plain");
        m23006a("list", "text/plain");
        m23006a("log", "text/plain");
        m23006a("prop", "text/plain");
        m23006a("properties", "text/plain");
        m23006a("rc", "text/plain");
        m23006a("flv", "video/x-flv");
    }

    /* renamed from: a */
    private static void m23006a(String str, String str2) {
        Map<String, String> map = f17908a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: b */
    public static String m23007b(File file) {
        int lastIndexOf = file.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String lowerCase = file.getName().substring(lastIndexOf + 1).toLowerCase();
        String str = f17908a.get(lowerCase);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        return !TextUtils.isEmpty(mimeTypeFromExtension) ? mimeTypeFromExtension : "application/octet-stream";
    }
}
