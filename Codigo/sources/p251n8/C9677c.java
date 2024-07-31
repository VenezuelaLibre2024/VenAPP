package p251n8;

import android.text.Layout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p082eb.C7147c;
import p120g8.AbstractC7490h;
import p120g8.C7493k;
import p120g8.InterfaceC7491i;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11174s0;

/* renamed from: n8.c */
/* loaded from: classes.dex */
public final class C9677c extends AbstractC7490h {

    /* renamed from: p */
    private static final Pattern f23777p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    private static final Pattern f23778q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    private static final Pattern f23779r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    static final Pattern f23780s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    static final Pattern f23781t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u */
    private static final Pattern f23782u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v */
    private static final Pattern f23783v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w */
    private static final b f23784w = new b(30.0f, 1, 1);

    /* renamed from: x */
    private static final a f23785x = new a(32, 15);

    /* renamed from: o */
    private final XmlPullParserFactory f23786o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n8.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int f23787a;

        /* renamed from: b */
        final int f23788b;

        a(int i10, int i11) {
            this.f23787a = i10;
            this.f23788b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n8.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final float f23789a;

        /* renamed from: b */
        final int f23790b;

        /* renamed from: c */
        final int f23791c;

        b(float f10, int i10, int i11) {
            this.f23789a = f10;
            this.f23790b = i10;
            this.f23791c = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n8.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final int f23792a;

        /* renamed from: b */
        final int f23793b;

        c(int i10, int i11) {
            this.f23792a = i10;
            this.f23793b = i11;
        }
    }

    public C9677c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f23786o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: B */
    private static C9681g m28988B(C9681g c9681g) {
        return c9681g == null ? new C9681g() : c9681g;
    }

    /* renamed from: C */
    private static boolean m28989C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(Constants.INFORMATION);
    }

    /* renamed from: D */
    private static Layout.Alignment m28990D(String str) {
        String m21253e = C7147c.m21253e(str);
        m21253e.hashCode();
        char c10 = 65535;
        switch (m21253e.hashCode()) {
            case -1364013995:
                if (m21253e.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (m21253e.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (m21253e.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (m21253e.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (m21253e.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: E */
    private static a m28991E(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f23783v.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt((String) C11137a.m34603e(matcher.group(1)));
                int parseInt2 = Integer.parseInt((String) C11137a.m34603e(matcher.group(2)));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new a(parseInt, parseInt2);
                }
                throw new C7493k("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
        } else {
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed cell resolution: ");
        sb2.append(attributeValue);
        C11173s.m34970i("TtmlDecoder", sb2.toString());
        return aVar;
    }

    /* renamed from: F */
    private static void m28992F(String str, C9681g c9681g) {
        Matcher matcher;
        String[] m34891R0 = C11172r0.m34891R0(str, "\\s+");
        if (m34891R0.length == 1) {
            matcher = f23779r.matcher(str);
        } else {
            if (m34891R0.length != 2) {
                throw new C7493k("Invalid number of entries for fontSize: " + m34891R0.length + ".");
            }
            matcher = f23779r.matcher(m34891R0[1]);
            C11173s.m34970i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C7493k("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) C11137a.m34603e(matcher.group(3));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                c9681g.m29061z(3);
                break;
            case 1:
                c9681g.m29061z(2);
                break;
            case 2:
                c9681g.m29061z(1);
                break;
            default:
                throw new C7493k("Invalid unit for fontSize: '" + str2 + "'.");
        }
        c9681g.m29060y(Float.parseFloat((String) C11137a.m34603e(matcher.group(1))));
    }

    /* renamed from: G */
    private static b m28993G(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (C11172r0.m34891R0(attributeValue2, " ").length != 2) {
                throw new C7493k("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        b bVar = f23784w;
        int i10 = bVar.f23790b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f23791c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    /* renamed from: H */
    private static Map<String, C9681g> m28994H(XmlPullParser xmlPullParser, Map<String, C9681g> map, a aVar, c cVar, Map<String, C9679e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "style")) {
                String m34976a = C11174s0.m34976a(xmlPullParser, "style");
                C9681g m28999M = m28999M(xmlPullParser, new C9681g());
                if (m34976a != null) {
                    for (String str : m29000N(m34976a)) {
                        m28999M.m29037a(map.get(str));
                    }
                }
                String m29043g = m28999M.m29043g();
                if (m29043g != null) {
                    map.put(m29043g, m28999M);
                }
            } else if (C11174s0.m34981f(xmlPullParser, "region")) {
                C9679e m28997K = m28997K(xmlPullParser, aVar, cVar);
                if (m28997K != null) {
                    map2.put(m28997K.f23807a, m28997K);
                }
            } else if (C11174s0.m34981f(xmlPullParser, "metadata")) {
                m28995I(xmlPullParser, map3);
            }
        } while (!C11174s0.m34979d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: I */
    private static void m28995I(XmlPullParser xmlPullParser, Map<String, String> map) {
        String m34976a;
        do {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "image") && (m34976a = C11174s0.m34976a(xmlPullParser, FacebookMediationAdapter.KEY_ID)) != null) {
                map.put(m34976a, xmlPullParser.nextText());
            }
        } while (!C11174s0.m34979d(xmlPullParser, "metadata"));
    }

    /* renamed from: J */
    private static C9678d m28996J(XmlPullParser xmlPullParser, C9678d c9678d, Map<String, C9679e> map, b bVar) {
        long j10;
        long j11;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        C9681g m28999M = m28999M(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j14 = m29001O(attributeValue, bVar);
                    break;
                case 2:
                    j13 = m29001O(attributeValue, bVar);
                    break;
                case 3:
                    j12 = m29001O(attributeValue, bVar);
                    break;
                case 4:
                    String[] m29000N = m29000N(attributeValue);
                    if (m29000N.length > 0) {
                        strArr = m29000N;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c9678d != null) {
            long j15 = c9678d.f23797d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j16 = j12;
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j16 + j14;
            } else if (c9678d != null) {
                long j17 = c9678d.f23798e;
                if (j17 != j10) {
                    j11 = j17;
                }
            }
            return C9678d.m29004c(xmlPullParser.getName(), j16, j11, m28999M, strArr, str2, str, c9678d);
        }
        j11 = j13;
        return C9678d.m29004c(xmlPullParser.getName(), j16, j11, m28999M, strArr, str2, str, c9678d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
    
        if (r0.equals("tb") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p251n8.C9679e m28997K(org.xmlpull.v1.XmlPullParser r17, p251n8.C9677c.a r18, p251n8.C9677c.c r19) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n8.C9677c.m28997K(org.xmlpull.v1.XmlPullParser, n8.c$a, n8.c$c):n8.e");
    }

    /* renamed from: L */
    private static float m28998L(String str) {
        Matcher matcher = f23780s.matcher(str);
        if (!matcher.matches()) {
            C11173s.m34970i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C11137a.m34603e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            C11173s.m34971j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c4, code lost:
    
        if (r3.equals("text") == false) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x025b. Please report as an issue. */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p251n8.C9681g m28999M(org.xmlpull.v1.XmlPullParser r12, p251n8.C9681g r13) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n8.C9677c.m28999M(org.xmlpull.v1.XmlPullParser, n8.g):n8.g");
    }

    /* renamed from: N */
    private static String[] m29000N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C11172r0.m34891R0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m29001O(java.lang.String r13, p251n8.C9677c.b r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n8.C9677c.m29001O(java.lang.String, n8.c$b):long");
    }

    /* renamed from: P */
    private static c m29002P(XmlPullParser xmlPullParser) {
        StringBuilder sb2;
        String str;
        String m34976a = C11174s0.m34976a(xmlPullParser, "extent");
        if (m34976a == null) {
            return null;
        }
        Matcher matcher = f23782u.matcher(m34976a);
        if (matcher.matches()) {
            try {
                return new c(Integer.parseInt((String) C11137a.m34603e(matcher.group(1))), Integer.parseInt((String) C11137a.m34603e(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb2 = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb2.append(str);
        sb2.append(m34976a);
        C11173s.m34970i("TtmlDecoder", sb2.toString());
        return null;
    }

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f23786o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C9679e(""));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f23784w;
            a aVar = f23785x;
            int i11 = 0;
            C9682h c9682h = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C9678d c9678d = (C9678d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m28993G(newPullParser);
                            aVar = m28991E(newPullParser, f23785x);
                            cVar = m29002P(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (m28989C(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                m28994H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    C9678d m28996J = m28996J(newPullParser, c9678d, hashMap2, bVar);
                                    arrayDeque.push(m28996J);
                                    if (c9678d != null) {
                                        c9678d.m29012a(m28996J);
                                    }
                                } catch (C7493k e10) {
                                    C11173s.m34971j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            C11173s.m34967f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar3;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((C9678d) C11137a.m34603e(c9678d)).m29012a(C9678d.m29005d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c9682h = new C9682h((C9678d) C11137a.m34603e((C9678d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (c9682h != null) {
                return c9682h;
            }
            throw new C7493k("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new C7493k("Unable to decode source", e12);
        }
    }
}
