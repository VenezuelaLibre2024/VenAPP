package gi;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f16271a = new HashMap();

    static {
        a("epub", "application/epub+zip");
        a("ogx", "application/ogg");
        a("odp", "application/vnd.oasis.opendocument.presentation");
        a("otp", "application/vnd.oasis.opendocument.presentation-template");
        a("yt", "application/vnd.youtube.yt");
        a("hwp", "application/x-hwp");
        a("3gpp", "video/3gpp");
        a("3gp", "video/3gpp");
        a("3gpp2", "video/3gpp2");
        a("3g2", "video/3gpp2");
        a("oga", "audio/ogg");
        a("ogg", "audio/ogg");
        a("spx", "audio/ogg");
        a("dng", "image/x-adobe-dng");
        a("cr2", "image/x-canon-cr2");
        a("raf", "image/x-fuji-raf");
        a("nef", "image/x-nikon-nef");
        a("nrw", "image/x-nikon-nrw");
        a("orf", "image/x-olympus-orf");
        a("rw2", "image/x-panasonic-rw2");
        a("pef", "image/x-pentax-pef");
        a("srw", "image/x-samsung-srw");
        a("arw", "image/x-sony-arw");
        a("ogv", "video/ogg");
        a("tgz", "application/x-gtar-compressed");
        a("taz", "application/x-gtar-compressed");
        a("csv", "text/csv");
        a("gz", "application/gzip");
        a("cab", "application/vnd.ms-cab-compressed");
        a("7z", "application/x-7z-compressed");
        a("bz", "application/x-bzip");
        a("bz2", "application/x-bzip2");
        a("z", "application/x-compress");
        a("jar", "application/x-java-archive");
        a("lzma", "application/x-lzma");
        a("xz", "application/x-xz");
        a("m3u", "audio/x-mpegurl");
        a("m3u8", "audio/x-mpegurl");
        a("p7b", "application/x-pkcs7-certificates");
        a("spc", "application/x-pkcs7-certificates");
        a("p7c", "application/pkcs7-mime");
        a("p7s", "application/pkcs7-signature");
        a("es", "application/ecmascript");
        a("js", "application/javascript");
        a("json", "application/json");
        a("ts", "application/typescript");
        a("perl", "text/x-perl");
        a("pl", "text/x-perl");
        a("pm", "text/x-perl");
        a("py", "text/x-python");
        a("py3", "text/x-python");
        a("py3x", "text/x-python");
        a("pyx", "text/x-python");
        a("wsgi", "text/x-python");
        a("rb", "text/ruby");
        a("sh", "application/x-sh");
        a("yaml", "text/x-yaml");
        a("yml", "text/x-yaml");
        a("asm", "text/x-asm");
        a("s", "text/x-asm");
        a("cs", "text/x-csharp");
        a("azw", "application/vnd.amazon.ebook");
        a("ibooks", "application/x-ibooks+zip");
        a("mobi", "application/x-mobipocket-ebook");
        a("woff", "font/woff");
        a("woff2", "font/woff2");
        a("msg", "application/vnd.ms-outlook");
        a("eml", "message/rfc822");
        a("eot", "application/vnd.ms-fontobject");
        a("ttf", "font/ttf");
        a("otf", "font/otf");
        a("ttc", "font/collection");
        a("markdown", "text/markdown");
        a("md", "text/markdown");
        a("mkd", "text/markdown");
        a("conf", "text/plain");
        a("ini", "text/plain");
        a("list", "text/plain");
        a("log", "text/plain");
        a("prop", "text/plain");
        a("properties", "text/plain");
        a("rc", "text/plain");
        a("flv", "video/x-flv");
    }

    private static void a(String str, String str2) {
        Map<String, String> map = f16271a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    public static String b(File file) {
        int lastIndexOf = file.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String lowerCase = file.getName().substring(lastIndexOf + 1).toLowerCase();
        String str = f16271a.get(lowerCase);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        return !TextUtils.isEmpty(mimeTypeFromExtension) ? mimeTypeFromExtension : "application/octet-stream";
    }
}
