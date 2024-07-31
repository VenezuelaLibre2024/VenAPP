package p363t8;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: t8.s0 */
/* loaded from: classes.dex */
public final class C11174s0 {
    /* renamed from: a */
    public static String m34976a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m34977b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (m34983h(xmlPullParser.getAttributeName(i10)).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m34978c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m34979d(XmlPullParser xmlPullParser, String str) {
        return m34978c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m34980e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m34981f(XmlPullParser xmlPullParser, String str) {
        return m34980e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m34982g(XmlPullParser xmlPullParser, String str) {
        return m34980e(xmlPullParser) && m34983h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    private static String m34983h(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
