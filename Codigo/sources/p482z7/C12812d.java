package p482z7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5876h0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p082eb.C7147c;
import p082eb.C7149e;
import p250n7.C9672a;
import p351s8.C10822g0;
import p361t6.C11005b3;
import p361t6.C11081p;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11168p0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11174s0;
import p363t8.C11178w;
import p436x6.C12318m;
import p482z7.AbstractC12819k;

/* renamed from: z7.d */
/* loaded from: classes.dex */
public class C12812d extends DefaultHandler implements C10822g0.a<C12811c> {

    /* renamed from: b */
    private static final Pattern f34923b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    private static final Pattern f34924c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    private static final Pattern f34925d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    private static final int[] f34926e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    private final XmlPullParserFactory f34927a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z7.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C11108u1 f34928a;

        /* renamed from: b */
        public final AbstractC5907w<C12810b> f34929b;

        /* renamed from: c */
        public final AbstractC12819k f34930c;

        /* renamed from: d */
        public final String f34931d;

        /* renamed from: e */
        public final ArrayList<C12318m.b> f34932e;

        /* renamed from: f */
        public final ArrayList<C12813e> f34933f;

        /* renamed from: g */
        public final long f34934g;

        /* renamed from: h */
        public final List<C12813e> f34935h;

        /* renamed from: i */
        public final List<C12813e> f34936i;

        public a(C11108u1 c11108u1, List<C12810b> list, AbstractC12819k abstractC12819k, String str, ArrayList<C12318m.b> arrayList, ArrayList<C12813e> arrayList2, List<C12813e> list2, List<C12813e> list3, long j10) {
            this.f34928a = c11108u1;
            this.f34929b = AbstractC5907w.m15079r(list);
            this.f34930c = abstractC12819k;
            this.f34931d = str;
            this.f34932e = arrayList;
            this.f34933f = arrayList2;
            this.f34935h = list2;
            this.f34936i = list3;
            this.f34934g = j10;
        }
    }

    public C12812d() {
        try {
            this.f34927a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: D */
    protected static int m42463D(List<C12813e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12813e c12813e = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c12813e.f34937a) && (str = c12813e.f34938b) != null) {
                Matcher matcher = f34924c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C11173s.m34970i("MpdParser", "Unable to parse CEA-608 channel number from: " + c12813e.f34938b);
            }
        }
        return -1;
    }

    /* renamed from: E */
    protected static int m42464E(List<C12813e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12813e c12813e = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c12813e.f34937a) && (str = c12813e.f34938b) != null) {
                Matcher matcher = f34925d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C11173s.m34970i("MpdParser", "Unable to parse CEA-708 service block number from: " + c12813e.f34938b);
            }
        }
        return -1;
    }

    /* renamed from: H */
    protected static long m42465H(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : C11172r0.m34875J0(attributeValue);
    }

    /* renamed from: I */
    protected static C12813e m42466I(XmlPullParser xmlPullParser, String str) {
        String m42482r0 = m42482r0(xmlPullParser, "schemeIdUri", "");
        String m42482r02 = m42482r0(xmlPullParser, "value", null);
        String m42482r03 = m42482r0(xmlPullParser, FacebookMediationAdapter.KEY_ID, null);
        do {
            xmlPullParser.next();
        } while (!C11174s0.m34979d(xmlPullParser, str));
        return new C12813e(m42482r0, m42482r02, m42482r03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: J */
    protected static int m42467J(XmlPullParser xmlPullParser) {
        char c10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String m21253e = C7147c.m21253e(attributeValue);
        m21253e.hashCode();
        switch (m21253e.hashCode()) {
            case 1596796:
                if (m21253e.equals("4000")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2937391:
                if (m21253e.equals("a000")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3094035:
                if (m21253e.equals("f801")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3133436:
                if (m21253e.equals("fa01")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    /* renamed from: K */
    protected static int m42468K(XmlPullParser xmlPullParser) {
        int m42474U = m42474U(xmlPullParser, "value", -1);
        if (m42474U <= 0 || m42474U >= 33) {
            return -1;
        }
        return m42474U;
    }

    /* renamed from: L */
    protected static int m42469L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    /* renamed from: M */
    protected static long m42470M(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : C11172r0.m34877K0(attributeValue);
    }

    /* renamed from: N */
    protected static String m42471N(List<C12813e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12813e c12813e = list.get(i10);
            String str = c12813e.f34937a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(c12813e.f34938b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(c12813e.f34938b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: R */
    protected static float m42472R(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    /* renamed from: S */
    protected static float m42473S(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f34923b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        float f11 = parseInt;
        return !TextUtils.isEmpty(matcher.group(2)) ? f11 / Integer.parseInt(r2) : f11;
    }

    /* renamed from: U */
    protected static int m42474U(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    /* renamed from: W */
    protected static long m42475W(List<C12813e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12813e c12813e = list.get(i10);
            if (C7147c.m21249a("http://dashif.org/guidelines/last-segment-number", c12813e.f34937a)) {
                return Long.parseLong(c12813e.f34938b);
            }
        }
        return -1L;
    }

    /* renamed from: X */
    protected static long m42476X(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    /* renamed from: Z */
    protected static int m42477Z(XmlPullParser xmlPullParser) {
        int m42474U = m42474U(xmlPullParser, "value", -1);
        if (m42474U < 0) {
            return -1;
        }
        int[] iArr = f34926e;
        if (m42474U < iArr.length) {
            return iArr[m42474U];
        }
        return -1;
    }

    /* renamed from: b */
    private long m42478b(List<AbstractC12819k.d> list, long j10, long j11, int i10, long j12) {
        int m34934m = i10 >= 0 ? i10 + 1 : (int) C11172r0.m34934m(j12 - j10, j11);
        for (int i11 = 0; i11 < m34934m; i11++) {
            list.add(m42522m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    /* renamed from: p */
    private static int m42479p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        C11137a.m34605g(i10 == i11);
        return i10;
    }

    /* renamed from: q */
    private static String m42480q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C11137a.m34605g(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    private static void m42481r(ArrayList<C12318m.b> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            C12318m.b bVar = arrayList.get(i10);
            if (C11081p.f28573c.equals(bVar.f33054b) && (str = bVar.f33055c) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C12318m.b bVar2 = arrayList.get(i11);
            if (C11081p.f28572b.equals(bVar2.f33054b) && bVar2.f33055c == null) {
                arrayList.set(i11, new C12318m.b(C11081p.f28573c, str, bVar2.f33056d, bVar2.f33057e));
            }
        }
    }

    /* renamed from: r0 */
    protected static String m42482r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: s */
    private static void m42483s(ArrayList<C12318m.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C12318m.b bVar = arrayList.get(size);
            if (!bVar.m39846c()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i10).m39844a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    /* renamed from: s0 */
    protected static String m42484s0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m42488w(xmlPullParser);
            }
        } while (!C11174s0.m34979d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: t */
    private static long m42485t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: u */
    private static String m42486u(String str, String str2) {
        if (C11178w.m35007o(str)) {
            return C11178w.m34995c(str2);
        }
        if (C11178w.m35011s(str)) {
            return C11178w.m35006n(str2);
        }
        if (C11178w.m35010r(str) || C11178w.m35008p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String m34999g = C11178w.m34999g(str2);
        return "text/vtt".equals(m34999g) ? "application/x-mp4-vtt" : m34999g;
    }

    /* renamed from: v */
    private boolean m42487v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public static void m42488w(XmlPullParser xmlPullParser) {
        if (C11174s0.m34980e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (C11174s0.m34980e(xmlPullParser)) {
                    i10++;
                } else if (C11174s0.m34978c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: A */
    protected int m42489A(XmlPullParser xmlPullParser) {
        char c10;
        String m42482r0 = m42482r0(xmlPullParser, "schemeIdUri", null);
        m42482r0.hashCode();
        int i10 = -1;
        switch (m42482r0.hashCode()) {
            case -2128649360:
                if (m42482r0.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1352850286:
                if (m42482r0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (m42482r0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (m42482r0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -79006963:
                if (m42482r0.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 312179081:
                if (m42482r0.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (m42482r0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 4:
                i10 = m42468K(xmlPullParser);
                break;
            case 1:
                i10 = m42474U(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i10 = m42467J(xmlPullParser);
                break;
            case 3:
                i10 = m42477Z(xmlPullParser);
                break;
            case 5:
                i10 = m42469L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!C11174s0.m34979d(xmlPullParser, "AudioChannelConfiguration"));
        return i10;
    }

    /* renamed from: B */
    protected long m42490B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    /* renamed from: C */
    protected List<C12810b> m42491C(XmlPullParser xmlPullParser, List<C12810b> list, boolean z10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String m42484s0 = m42484s0(xmlPullParser, "BaseURL");
        if (C11168p0.m34836b(m42484s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = m42484s0;
            }
            return C5876h0.m14881j(new C12810b(m42484s0, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12810b c12810b = list.get(i10);
            String m34838d = C11168p0.m34838d(c12810b.f34906a, m42484s0);
            String str = attributeValue3 == null ? m34838d : attributeValue3;
            if (z10) {
                parseInt = c12810b.f34908c;
                parseInt2 = c12810b.f34909d;
                str = c12810b.f34907b;
            }
            arrayList.add(new C12810b(m34838d, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.UUID] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, p436x6.C12318m.b> m42492F(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p482z7.C12812d.m42492F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: G */
    protected int m42493G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* renamed from: O */
    protected Pair<Long, C9672a> m42494O(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) {
        long m42476X = m42476X(xmlPullParser, FacebookMediationAdapter.KEY_ID, 0L);
        long m42476X2 = m42476X(xmlPullParser, "duration", -9223372036854775807L);
        long m42476X3 = m42476X(xmlPullParser, "presentationTime", 0L);
        long m34885O0 = C11172r0.m34885O0(m42476X2, 1000L, j10);
        long m34885O02 = C11172r0.m34885O0(m42476X3 - j11, 1000000L, j10);
        String m42482r0 = m42482r0(xmlPullParser, "messageData", null);
        byte[] m42495P = m42495P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(m34885O02);
        if (m42482r0 != null) {
            m42495P = C11172r0.m34935m0(m42482r0);
        }
        return Pair.create(valueOf, m42504d(str, str2, m42476X, m34885O0, m42495P));
    }

    /* renamed from: P */
    protected byte[] m42495P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, C7149e.f16019c.name());
        while (true) {
            xmlPullParser.nextToken();
            if (C11174s0.m34979d(xmlPullParser, "Event")) {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    /* renamed from: Q */
    protected C12814f m42496Q(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        long j10;
        ArrayList arrayList;
        String m42482r0 = m42482r0(xmlPullParser, "schemeIdUri", "");
        String m42482r02 = m42482r0(xmlPullParser, "value", "");
        long m42476X = m42476X(xmlPullParser, "timescale", 1L);
        long m42476X2 = m42476X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(RecognitionOptions.UPC_A);
        while (true) {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j11 = m42476X2;
                j10 = m42476X2;
                arrayList = arrayList2;
                arrayList.add(m42494O(xmlPullParser, m42482r0, m42482r02, m42476X, j11, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j10 = m42476X2;
                arrayList = arrayList2;
                m42488w(xmlPullParser);
            }
            if (C11174s0.m34979d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            m42476X2 = j10;
        }
        long[] jArr = new long[arrayList.size()];
        C9672a[] c9672aArr = new C9672a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            c9672aArr[i10] = (C9672a) pair.second;
        }
        return m42506e(m42482r0, m42482r02, m42476X, jArr, c9672aArr);
    }

    /* renamed from: T */
    protected C12817i m42497T(XmlPullParser xmlPullParser) {
        return m42505d0(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: V */
    protected String m42498V(XmlPullParser xmlPullParser) {
        return m42484s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e7 A[LOOP:0: B:18:0x00a4->B:26:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p482z7.C12811c m42499Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p482z7.C12812d.m42499Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):z7.c");
    }

    /* renamed from: a0 */
    protected Pair<C12815g, Long> m42500a0(XmlPullParser xmlPullParser, List<C12810b> list, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j15;
        AbstractC12819k m42521l0;
        C12812d c12812d = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        long m42470M = m42470M(xmlPullParser2, "start", j10);
        long j16 = -9223372036854775807L;
        long j17 = j12 != -9223372036854775807L ? j12 + m42470M : -9223372036854775807L;
        long m42470M2 = m42470M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j18 = j11;
        boolean z11 = false;
        long j19 = -9223372036854775807L;
        AbstractC12819k abstractC12819k = null;
        C12813e c12813e = null;
        while (true) {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    j18 = c12812d.m42490B(xmlPullParser2, j18);
                    z11 = true;
                }
                arrayList6.addAll(c12812d.m42491C(xmlPullParser2, list, z10));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j15 = j16;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (C11174s0.m34981f(xmlPullParser2, "AdaptationSet")) {
                    j14 = j18;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(m42535y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, abstractC12819k, m42470M2, j18, j19, j17, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j14 = j18;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (C11174s0.m34981f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(m42496Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        arrayList3 = arrayList7;
                        if (C11174s0.m34981f(xmlPullParser2, "SegmentBase")) {
                            abstractC12819k = m42517j0(xmlPullParser2, null);
                            obj = null;
                            j18 = j14;
                            j15 = -9223372036854775807L;
                        } else {
                            if (C11174s0.m34981f(xmlPullParser2, "SegmentList")) {
                                long m42490B = m42490B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                m42521l0 = m42519k0(xmlPullParser, null, j17, m42470M2, j14, m42490B, j13);
                                j19 = m42490B;
                                j18 = j14;
                                j15 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (C11174s0.m34981f(xmlPullParser2, "SegmentTemplate")) {
                                    long m42490B2 = m42490B(xmlPullParser2, -9223372036854775807L);
                                    j15 = -9223372036854775807L;
                                    m42521l0 = m42521l0(xmlPullParser, null, AbstractC5907w.m15081v(), j17, m42470M2, j14, m42490B2, j13);
                                    j19 = m42490B2;
                                    j18 = j14;
                                } else {
                                    j15 = -9223372036854775807L;
                                    if (C11174s0.m34981f(xmlPullParser2, "AssetIdentifier")) {
                                        c12813e = m42466I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        m42488w(xmlPullParser);
                                    }
                                    j18 = j14;
                                }
                            }
                            abstractC12819k = m42521l0;
                        }
                    }
                }
                obj = null;
                j15 = -9223372036854775807L;
                j18 = j14;
            }
            if (C11174s0.m34979d(xmlPullParser2, "Period")) {
                return Pair.create(m42512h(attributeValue, m42470M, arrayList2, arrayList3, c12813e), Long.valueOf(m42470M2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j16 = j15;
            c12812d = this;
        }
    }

    /* renamed from: b0 */
    protected String[] m42501b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    /* renamed from: c */
    protected C12809a m42502c(int i10, int i11, List<AbstractC12818j> list, List<C12813e> list2, List<C12813e> list3, List<C12813e> list4) {
        return new C12809a(i10, i11, list, list2, list3, list4);
    }

    /* renamed from: c0 */
    protected C12816h m42503c0(XmlPullParser xmlPullParser) {
        String str = null;
        String m42482r0 = m42482r0(xmlPullParser, "moreInformationURL", null);
        String m42482r02 = m42482r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C11174s0.m34981f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C11174s0.m34981f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m42488w(xmlPullParser);
            }
            String str4 = str3;
            if (C11174s0.m34979d(xmlPullParser, "ProgramInformation")) {
                return new C12816h(str, str2, str4, m42482r0, m42482r02);
            }
            str3 = str4;
        }
    }

    /* renamed from: d */
    protected C9672a m42504d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new C9672a(str, str2, j11, j10, bArr);
    }

    /* renamed from: d0 */
    protected C12817i m42505d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return m42514i(attributeValue, j10, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return m42514i(attributeValue, j10, j11);
    }

    /* renamed from: e */
    protected C12814f m42506e(String str, String str2, long j10, long[] jArr, C9672a[] c9672aArr) {
        return new C12814f(str, str2, j10, jArr, c9672aArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ee A[LOOP:0: B:2:0x006a->B:11:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01ee], SYNTHETIC] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p482z7.C12812d.a m42507e0(org.xmlpull.v1.XmlPullParser r36, java.util.List<p482z7.C12810b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<p482z7.C12813e> r46, java.util.List<p482z7.C12813e> r47, java.util.List<p482z7.C12813e> r48, java.util.List<p482z7.C12813e> r49, p482z7.AbstractC12819k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p482z7.C12812d.m42507e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, z7.k, long, long, long, long, long, boolean):z7.d$a");
    }

    /* renamed from: f */
    protected C11108u1 m42508f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<C12813e> list, List<C12813e> list2, String str4, List<C12813e> list3, List<C12813e> list4) {
        String str5 = str4;
        String m42486u = m42486u(str2, str5);
        if ("audio/eac3".equals(m42486u)) {
            m42486u = m42471N(list4);
            if ("audio/eac3-joc".equals(m42486u)) {
                str5 = "ec+3";
            }
        }
        int m42528p0 = m42528p0(list);
        int m42515i0 = m42515i0(list) | m42509f0(list2) | m42513h0(list3) | m42513h0(list4);
        Pair<Integer, Integer> m42530t0 = m42530t0(list3);
        C11108u1.b m34543X = new C11108u1.b().m34540U(str).m34532M(str2).m34552g0(m42486u).m34530K(str5).m34547b0(i14).m34554i0(m42528p0).m34550e0(m42515i0).m34543X(str3);
        int i15 = -1;
        C11108u1.b m34558m0 = m34543X.m34557l0(m42530t0 != null ? ((Integer) m42530t0.first).intValue() : -1).m34558m0(m42530t0 != null ? ((Integer) m42530t0.second).intValue() : -1);
        if (C11178w.m35011s(m42486u)) {
            m34558m0.m34559n0(i10).m34538S(i11).m34537R(f10);
        } else if (C11178w.m35007o(m42486u)) {
            m34558m0.m34529J(i12).m34553h0(i13);
        } else if (C11178w.m35010r(m42486u)) {
            if ("application/cea-608".equals(m42486u)) {
                i15 = m42463D(list2);
            } else if ("application/cea-708".equals(m42486u)) {
                i15 = m42464E(list2);
            }
            m34558m0.m34527H(i15);
        } else if (C11178w.m35008p(m42486u)) {
            m34558m0.m34559n0(i10).m34538S(i11);
        }
        return m34558m0.m34526G();
    }

    /* renamed from: f0 */
    protected int m42509f0(List<C12813e> list) {
        int m42531u0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C12813e c12813e = list.get(i11);
            if (C7147c.m21249a("urn:mpeg:dash:role:2011", c12813e.f34937a)) {
                m42531u0 = m42511g0(c12813e.f34938b);
            } else if (C7147c.m21249a("urn:tva:metadata:cs:AudioPurposeCS:2007", c12813e.f34937a)) {
                m42531u0 = m42531u0(c12813e.f34938b);
            }
            i10 |= m42531u0;
        }
        return i10;
    }

    /* renamed from: g */
    protected C12811c m42510g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, C12816h c12816h, C12823o c12823o, C12820l c12820l, Uri uri, List<C12815g> list) {
        return new C12811c(j10, j11, j12, z10, j13, j14, j15, j16, c12816h, c12823o, c12820l, uri, list);
    }

    /* renamed from: g0 */
    protected int m42511g0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return RecognitionOptions.ITF;
            case 1:
                return RecognitionOptions.UPC_A;
            case 2:
                return RecognitionOptions.PDF417;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return RecognitionOptions.QR_CODE;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: h */
    protected C12815g m42512h(String str, long j10, List<C12809a> list, List<C12814f> list2, C12813e c12813e) {
        return new C12815g(str, j10, list, list2, c12813e);
    }

    /* renamed from: h0 */
    protected int m42513h0(List<C12813e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (C7147c.m21249a("http://dashif.org/guidelines/trickmode", list.get(i11).f34937a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    /* renamed from: i */
    protected C12817i m42514i(String str, long j10, long j11) {
        return new C12817i(str, j10, j11);
    }

    /* renamed from: i0 */
    protected int m42515i0(List<C12813e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C12813e c12813e = list.get(i11);
            if (C7147c.m21249a("urn:mpeg:dash:role:2011", c12813e.f34937a)) {
                i10 |= m42511g0(c12813e.f34938b);
            }
        }
        return i10;
    }

    /* renamed from: j */
    protected AbstractC12818j m42516j(a aVar, String str, String str2, ArrayList<C12318m.b> arrayList, ArrayList<C12813e> arrayList2) {
        C11108u1.b m34488c = aVar.f34928a.m34488c();
        if (str != null) {
            m34488c.m34542W(str);
        }
        String str3 = aVar.f34931d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C12318m.b> arrayList3 = aVar.f34932e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m42481r(arrayList3);
            m42483s(arrayList3);
            m34488c.m34534O(new C12318m(str2, arrayList3));
        }
        ArrayList<C12813e> arrayList4 = aVar.f34933f;
        arrayList4.addAll(arrayList2);
        return AbstractC12818j.m42542o(aVar.f34934g, m34488c.m34526G(), aVar.f34929b, aVar.f34930c, arrayList4, aVar.f34935h, aVar.f34936i, null);
    }

    /* renamed from: j0 */
    protected AbstractC12819k.e m42517j0(XmlPullParser xmlPullParser, AbstractC12819k.e eVar) {
        long j10;
        long j11;
        long m42476X = m42476X(xmlPullParser, "timescale", eVar != null ? eVar.f34974b : 1L);
        long m42476X2 = m42476X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f34975c : 0L);
        long j12 = eVar != null ? eVar.f34988d : 0L;
        long j13 = eVar != null ? eVar.f34989e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j11 = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - j11) + 1;
        } else {
            j10 = j13;
            j11 = j12;
        }
        C12817i c12817i = eVar != null ? eVar.f34973a : null;
        do {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "Initialization")) {
                c12817i = m42497T(xmlPullParser);
            } else {
                m42488w(xmlPullParser);
            }
        } while (!C11174s0.m34979d(xmlPullParser, "SegmentBase"));
        return m42524n(c12817i, m42476X, m42476X2, j11, j10);
    }

    /* renamed from: k */
    protected AbstractC12819k.b m42518k(C12817i c12817i, long j10, long j11, long j12, long j13, List<AbstractC12819k.d> list, long j14, List<C12817i> list2, long j15, long j16) {
        return new AbstractC12819k.b(c12817i, j10, j11, j12, j13, list, j14, list2, C11172r0.m34861C0(j15), C11172r0.m34861C0(j16));
    }

    /* renamed from: k0 */
    protected AbstractC12819k.b m42519k0(XmlPullParser xmlPullParser, AbstractC12819k.b bVar, long j10, long j11, long j12, long j13, long j14) {
        long m42476X = m42476X(xmlPullParser, "timescale", bVar != null ? bVar.f34974b : 1L);
        long m42476X2 = m42476X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f34975c : 0L);
        long m42476X3 = m42476X(xmlPullParser, "duration", bVar != null ? bVar.f34977e : -9223372036854775807L);
        long m42476X4 = m42476X(xmlPullParser, "startNumber", bVar != null ? bVar.f34976d : 1L);
        long m42485t = m42485t(j12, j13);
        List<AbstractC12819k.d> list = null;
        List<C12817i> list2 = null;
        C12817i c12817i = null;
        do {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "Initialization")) {
                c12817i = m42497T(xmlPullParser);
            } else if (C11174s0.m34981f(xmlPullParser, "SegmentTimeline")) {
                list = m42523m0(xmlPullParser, m42476X, j11);
            } else if (C11174s0.m34981f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(m42525n0(xmlPullParser));
            } else {
                m42488w(xmlPullParser);
            }
        } while (!C11174s0.m34979d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (c12817i == null) {
                c12817i = bVar.f34973a;
            }
            if (list == null) {
                list = bVar.f34978f;
            }
            if (list2 == null) {
                list2 = bVar.f34982j;
            }
        }
        return m42518k(c12817i, m42476X, m42476X2, m42476X4, m42476X3, list, m42485t, list2, j14, j10);
    }

    /* renamed from: l */
    protected AbstractC12819k.c m42520l(C12817i c12817i, long j10, long j11, long j12, long j13, long j14, List<AbstractC12819k.d> list, long j15, C12822n c12822n, C12822n c12822n2, long j16, long j17) {
        return new AbstractC12819k.c(c12817i, j10, j11, j12, j13, j14, list, j15, c12822n, c12822n2, C11172r0.m34861C0(j16), C11172r0.m34861C0(j17));
    }

    /* renamed from: l0 */
    protected AbstractC12819k.c m42521l0(XmlPullParser xmlPullParser, AbstractC12819k.c cVar, List<C12813e> list, long j10, long j11, long j12, long j13, long j14) {
        long m42476X = m42476X(xmlPullParser, "timescale", cVar != null ? cVar.f34974b : 1L);
        long m42476X2 = m42476X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f34975c : 0L);
        long m42476X3 = m42476X(xmlPullParser, "duration", cVar != null ? cVar.f34977e : -9223372036854775807L);
        long m42476X4 = m42476X(xmlPullParser, "startNumber", cVar != null ? cVar.f34976d : 1L);
        long m42475W = m42475W(list);
        long m42485t = m42485t(j12, j13);
        List<AbstractC12819k.d> list2 = null;
        C12822n m42532v0 = m42532v0(xmlPullParser, "media", cVar != null ? cVar.f34984k : null);
        C12822n m42532v02 = m42532v0(xmlPullParser, "initialization", cVar != null ? cVar.f34983j : null);
        C12817i c12817i = null;
        do {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "Initialization")) {
                c12817i = m42497T(xmlPullParser);
            } else if (C11174s0.m34981f(xmlPullParser, "SegmentTimeline")) {
                list2 = m42523m0(xmlPullParser, m42476X, j11);
            } else {
                m42488w(xmlPullParser);
            }
        } while (!C11174s0.m34979d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (c12817i == null) {
                c12817i = cVar.f34973a;
            }
            if (list2 == null) {
                list2 = cVar.f34978f;
            }
        }
        return m42520l(c12817i, m42476X, m42476X2, m42476X4, m42475W, m42476X3, list2, m42485t, m42532v02, m42532v0, j14, j10);
    }

    /* renamed from: m */
    protected AbstractC12819k.d m42522m(long j10, long j11) {
        return new AbstractC12819k.d(j10, j11);
    }

    /* renamed from: m0 */
    protected List<AbstractC12819k.d> m42523m0(XmlPullParser xmlPullParser, long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "S")) {
                long m42476X = m42476X(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    j12 = m42478b(arrayList, j12, j13, i10, m42476X);
                }
                if (m42476X == -9223372036854775807L) {
                    m42476X = j12;
                }
                j13 = m42476X(xmlPullParser, "d", -9223372036854775807L);
                i10 = m42474U(xmlPullParser, "r", 0);
                z10 = true;
                j12 = m42476X;
            } else {
                m42488w(xmlPullParser);
            }
        } while (!C11174s0.m34979d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            m42478b(arrayList, j12, j13, i10, C11172r0.m34885O0(j11, j10, 1000L));
        }
        return arrayList;
    }

    /* renamed from: n */
    protected AbstractC12819k.e m42524n(C12817i c12817i, long j10, long j11, long j12, long j13) {
        return new AbstractC12819k.e(c12817i, j10, j11, j12, j13);
    }

    /* renamed from: n0 */
    protected C12817i m42525n0(XmlPullParser xmlPullParser) {
        return m42505d0(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: o */
    protected C12823o m42526o(String str, String str2) {
        return new C12823o(str, str2);
    }

    /* renamed from: o0 */
    protected int m42527o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* renamed from: p0 */
    protected int m42528p0(List<C12813e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C12813e c12813e = list.get(i11);
            if (C7147c.m21249a("urn:mpeg:dash:role:2011", c12813e.f34937a)) {
                i10 |= m42527o0(c12813e.f34938b);
            }
        }
        return i10;
    }

    /* renamed from: q0 */
    protected C12820l m42529q0(XmlPullParser xmlPullParser) {
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (C11174s0.m34981f(xmlPullParser, "Latency")) {
                j10 = m42476X(xmlPullParser, "target", -9223372036854775807L);
                j11 = m42476X(xmlPullParser, "min", -9223372036854775807L);
                j12 = m42476X(xmlPullParser, "max", -9223372036854775807L);
            } else if (C11174s0.m34981f(xmlPullParser, "PlaybackRate")) {
                f10 = m42472R(xmlPullParser, "min", -3.4028235E38f);
                f11 = m42472R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (C11174s0.m34979d(xmlPullParser, "ServiceDescription")) {
                return new C12820l(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    /* renamed from: t0 */
    protected Pair<Integer, Integer> m42530t0(List<C12813e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12813e c12813e = list.get(i10);
            if ((C7147c.m21249a("http://dashif.org/thumbnail_tile", c12813e.f34937a) || C7147c.m21249a("http://dashif.org/guidelines/thumbnail_tile", c12813e.f34937a)) && (str = c12813e.f34938b) != null) {
                String[] m34891R0 = C11172r0.m34891R0(str, "x");
                if (m34891R0.length == 2) {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(m34891R0[0])), Integer.valueOf(Integer.parseInt(m34891R0[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: u0 */
    protected int m42531u0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c10 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c10 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return RecognitionOptions.UPC_A;
            case 1:
                return RecognitionOptions.PDF417;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: v0 */
    protected C12822n m42532v0(XmlPullParser xmlPullParser, String str, C12822n c12822n) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? C12822n.m42560b(attributeValue) : c12822n;
    }

    /* renamed from: w0 */
    protected C12823o m42533w0(XmlPullParser xmlPullParser) {
        return m42526o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // p351s8.C10822g0.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C12811c mo9273a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f34927a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m42499Y(newPullParser, uri);
            }
            throw C11005b3.m33717c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw C11005b3.m33717c(null, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x030e A[LOOP:0: B:2:0x007c->B:10:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02ce A[EDGE_INSN: B:11:0x02ce->B:12:0x02ce BREAK  A[LOOP:0: B:2:0x007c->B:10:0x030e], SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p482z7.C12809a m42535y(org.xmlpull.v1.XmlPullParser r55, java.util.List<p482z7.C12810b> r56, p482z7.AbstractC12819k r57, long r58, long r60, long r62, long r64, long r66, boolean r68) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p482z7.C12812d.m42535y(org.xmlpull.v1.XmlPullParser, java.util.List, z7.k, long, long, long, long, long, boolean):z7.a");
    }

    /* renamed from: z */
    protected void m42536z(XmlPullParser xmlPullParser) {
        m42488w(xmlPullParser);
    }
}
