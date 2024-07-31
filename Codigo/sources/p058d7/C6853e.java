package p058d7;

import com.google.common.collect.AbstractC5907w;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p058d7.C6850b;
import p361t6.C11005b3;
import p363t8.C11173s;
import p363t8.C11174s0;

/* renamed from: d7.e */
/* loaded from: classes.dex */
final class C6853e {

    /* renamed from: a */
    private static final String[] f15177a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f15178b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f15179c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C6850b m19809a(String str) {
        try {
            return m19810b(str);
        } catch (NumberFormatException | XmlPullParserException | C11005b3 unused) {
            C11173s.m34970i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static C6850b m19810b(String str) {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!C11174s0.m34981f(newPullParser, "x:xmpmeta")) {
            throw C11005b3.m33715a("Couldn't find xmp metadata", null);
        }
        AbstractC5907w<C6850b.a> m15081v = AbstractC5907w.m15081v();
        long j10 = -9223372036854775807L;
        do {
            newPullParser.next();
            if (!C11174s0.m34981f(newPullParser, "rdf:Description")) {
                if (C11174s0.m34981f(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (C11174s0.m34981f(newPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                m15081v = m19814f(newPullParser, str2, str3);
            } else {
                if (!m19812d(newPullParser)) {
                    return null;
                }
                j10 = m19813e(newPullParser);
                m15081v = m19811c(newPullParser);
            }
        } while (!C11174s0.m34979d(newPullParser, "x:xmpmeta"));
        if (m15081v.isEmpty()) {
            return null;
        }
        return new C6850b(j10, m15081v);
    }

    /* renamed from: c */
    private static AbstractC5907w<C6850b.a> m19811c(XmlPullParser xmlPullParser) {
        for (String str : f15179c) {
            String m34976a = C11174s0.m34976a(xmlPullParser, str);
            if (m34976a != null) {
                return AbstractC5907w.m15083x(new C6850b.a("image/jpeg", "Primary", 0L, 0L), new C6850b.a("video/mp4", "MotionPhoto", Long.parseLong(m34976a), 0L));
            }
        }
        return AbstractC5907w.m15081v();
    }

    /* renamed from: d */
    private static boolean m19812d(XmlPullParser xmlPullParser) {
        for (String str : f15177a) {
            String m34976a = C11174s0.m34976a(xmlPullParser, str);
            if (m34976a != null) {
                return Integer.parseInt(m34976a) == 1;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static long m19813e(XmlPullParser xmlPullParser) {
        for (String str : f15178b) {
            String m34976a = C11174s0.m34976a(xmlPullParser, str);
            if (m34976a != null) {
                long parseLong = Long.parseLong(m34976a);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    private static AbstractC5907w<C6850b.a> m19814f(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, str3)) {
                String m34976a = C11174s0.m34976a(xmlPullParser, str2 + ":Mime");
                String m34976a2 = C11174s0.m34976a(xmlPullParser, str2 + ":Semantic");
                String m34976a3 = C11174s0.m34976a(xmlPullParser, str2 + ":Length");
                String m34976a4 = C11174s0.m34976a(xmlPullParser, str2 + ":Padding");
                if (m34976a == null || m34976a2 == null) {
                    return AbstractC5907w.m15081v();
                }
                m15077p.mo14724a(new C6850b.a(m34976a, m34976a2, m34976a3 != null ? Long.parseLong(m34976a3) : 0L, m34976a4 != null ? Long.parseLong(m34976a4) : 0L));
            }
        } while (!C11174s0.m34979d(xmlPullParser, str4));
        return m15077p.m15094k();
    }
}
