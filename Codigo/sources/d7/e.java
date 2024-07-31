package d7;

import com.google.common.collect.w;
import d7.b;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t6.b3;
import t8.s;
import t8.s0;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f13823a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f13824b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f13825c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | XmlPullParserException | b3 unused) {
            s.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!s0.f(newPullParser, "x:xmpmeta")) {
            throw b3.a("Couldn't find xmp metadata", null);
        }
        w<b.a> v10 = w.v();
        long j10 = -9223372036854775807L;
        do {
            newPullParser.next();
            if (!s0.f(newPullParser, "rdf:Description")) {
                if (s0.f(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (s0.f(newPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                v10 = f(newPullParser, str2, str3);
            } else {
                if (!d(newPullParser)) {
                    return null;
                }
                j10 = e(newPullParser);
                v10 = c(newPullParser);
            }
        } while (!s0.d(newPullParser, "x:xmpmeta"));
        if (v10.isEmpty()) {
            return null;
        }
        return new b(j10, v10);
    }

    private static w<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f13825c) {
            String a10 = s0.a(xmlPullParser, str);
            if (a10 != null) {
                return w.x(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a10), 0L));
            }
        }
        return w.v();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f13823a) {
            String a10 = s0.a(xmlPullParser, str);
            if (a10 != null) {
                return Integer.parseInt(a10) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f13824b) {
            String a10 = s0.a(xmlPullParser, str);
            if (a10 != null) {
                long parseLong = Long.parseLong(a10);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static w<b.a> f(XmlPullParser xmlPullParser, String str, String str2) {
        w.a p10 = w.p();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (s0.f(xmlPullParser, str3)) {
                String a10 = s0.a(xmlPullParser, str2 + ":Mime");
                String a11 = s0.a(xmlPullParser, str2 + ":Semantic");
                String a12 = s0.a(xmlPullParser, str2 + ":Length");
                String a13 = s0.a(xmlPullParser, str2 + ":Padding");
                if (a10 == null || a11 == null) {
                    return w.v();
                }
                p10.a(new b.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0L, a13 != null ? Long.parseLong(a13) : 0L));
            }
        } while (!s0.d(xmlPullParser, str4));
        return p10.k();
    }
}
