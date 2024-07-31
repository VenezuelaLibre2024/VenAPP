package f8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f8.a;
import g7.l;
import g7.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s8.g0;
import t6.b3;
import t6.u1;
import t8.r0;
import x6.m;

/* loaded from: classes.dex */
public class b implements g0.a<f8.a> {

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f15024a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f15025a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15026b;

        /* renamed from: c, reason: collision with root package name */
        private final a f15027c;

        /* renamed from: d, reason: collision with root package name */
        private final List<Pair<String, Object>> f15028d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f15027c = aVar;
            this.f15025a = str;
            this.f15026b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i10 = 0; i10 < this.f15028d.size(); i10++) {
                Pair<String, Object> pair = this.f15028d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f15027c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f15026b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e10 = e(this, name, this.f15025a);
                            if (e10 == null) {
                                i10 = 1;
                            } else {
                                a(e10.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw b3.c(null, e10);
            }
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw b3.c(null, e10);
            }
        }

        protected final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0241b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw b3.c(null, e10);
            }
        }

        protected final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0241b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw b3.c(null, e10);
            }
        }

        protected final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0241b(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser);

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f15028d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: f8.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0241b extends b3 {
        public C0241b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f15029e;

        /* renamed from: f, reason: collision with root package name */
        private UUID f15030f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f15031g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // f8.b.a
        public Object b() {
            UUID uuid = this.f15030f;
            return new a.C0240a(uuid, l.a(uuid, this.f15031g), q(this.f15031g));
        }

        @Override // f8.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // f8.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f15029e = false;
            }
        }

        @Override // f8.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f15029e = true;
                this.f15030f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // f8.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f15029e) {
                this.f15031g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: e, reason: collision with root package name */
        private u1 f15032e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J = r0.J(str);
                byte[][] i10 = t8.e.i(J);
                if (i10 == null) {
                    arrayList.add(J);
                } else {
                    Collections.addAll(arrayList, i10);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // f8.b.a
        public Object b() {
            return this.f15032e;
        }

        @Override // f8.b.a
        public void n(XmlPullParser xmlPullParser) {
            int i10;
            u1.b bVar = new u1.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.M("video/mp4").n0(k(xmlPullParser, "MaxWidth")).S(k(xmlPullParser, "MaxHeight")).V(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = "audio/mp4a-latm";
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q10 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q10.isEmpty() && "audio/mp4a-latm".equals(r10)) {
                    q10 = Collections.singletonList(v6.a.a(k11, k10));
                }
                bVar.M("audio/mp4").J(k10).h0(k11).V(q10);
            } else if (intValue == 3) {
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = RecognitionOptions.UPC_E;
                    }
                    bVar.M("application/mp4").e0(i10);
                }
                i10 = 0;
                bVar.M("application/mp4").e0(i10);
            } else {
                bVar.M("application/mp4");
            }
            this.f15032e = bVar.U(xmlPullParser.getAttributeValue(null, "Index")).W((String) c("Name")).g0(r10).I(k(xmlPullParser, "Bitrate")).X((String) c("Language")).G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends a {

        /* renamed from: e, reason: collision with root package name */
        private final List<a.b> f15033e;

        /* renamed from: f, reason: collision with root package name */
        private int f15034f;

        /* renamed from: g, reason: collision with root package name */
        private int f15035g;

        /* renamed from: h, reason: collision with root package name */
        private long f15036h;

        /* renamed from: i, reason: collision with root package name */
        private long f15037i;

        /* renamed from: j, reason: collision with root package name */
        private long f15038j;

        /* renamed from: k, reason: collision with root package name */
        private int f15039k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f15040l;

        /* renamed from: m, reason: collision with root package name */
        private a.C0240a f15041m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f15039k = -1;
            this.f15041m = null;
            this.f15033e = new LinkedList();
        }

        @Override // f8.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f15033e.add((a.b) obj);
            } else if (obj instanceof a.C0240a) {
                t8.a.g(this.f15041m == null);
                this.f15041m = (a.C0240a) obj;
            }
        }

        @Override // f8.b.a
        public Object b() {
            int size = this.f15033e.size();
            a.b[] bVarArr = new a.b[size];
            this.f15033e.toArray(bVarArr);
            if (this.f15041m != null) {
                a.C0240a c0240a = this.f15041m;
                m mVar = new m(new m.b(c0240a.f15005a, "video/mp4", c0240a.f15006b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f15008a;
                    if (i11 == 2 || i11 == 1) {
                        u1[] u1VarArr = bVar.f15017j;
                        for (int i12 = 0; i12 < u1VarArr.length; i12++) {
                            u1VarArr[i12] = u1VarArr[i12].c().O(mVar).G();
                        }
                    }
                }
            }
            return new f8.a(this.f15034f, this.f15035g, this.f15036h, this.f15037i, this.f15038j, this.f15039k, this.f15040l, this.f15041m, bVarArr);
        }

        @Override // f8.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f15034f = k(xmlPullParser, "MajorVersion");
            this.f15035g = k(xmlPullParser, "MinorVersion");
            this.f15036h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f15037i = l(xmlPullParser, "Duration");
            this.f15038j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f15039k = i(xmlPullParser, "LookaheadCount", -1);
            this.f15040l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f15036h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends a {

        /* renamed from: e, reason: collision with root package name */
        private final String f15042e;

        /* renamed from: f, reason: collision with root package name */
        private final List<u1> f15043f;

        /* renamed from: g, reason: collision with root package name */
        private int f15044g;

        /* renamed from: h, reason: collision with root package name */
        private String f15045h;

        /* renamed from: i, reason: collision with root package name */
        private long f15046i;

        /* renamed from: j, reason: collision with root package name */
        private String f15047j;

        /* renamed from: k, reason: collision with root package name */
        private String f15048k;

        /* renamed from: l, reason: collision with root package name */
        private int f15049l;

        /* renamed from: m, reason: collision with root package name */
        private int f15050m;

        /* renamed from: n, reason: collision with root package name */
        private int f15051n;

        /* renamed from: o, reason: collision with root package name */
        private int f15052o;

        /* renamed from: p, reason: collision with root package name */
        private String f15053p;

        /* renamed from: q, reason: collision with root package name */
        private ArrayList<Long> f15054q;

        /* renamed from: r, reason: collision with root package name */
        private long f15055r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f15042e = str;
            this.f15043f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) {
            int s10 = s(xmlPullParser);
            this.f15044g = s10;
            p("Type", Integer.valueOf(s10));
            this.f15045h = this.f15044g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            p("Subtype", this.f15045h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f15047j = attributeValue;
            p("Name", attributeValue);
            this.f15048k = m(xmlPullParser, "Url");
            this.f15049l = i(xmlPullParser, "MaxWidth", -1);
            this.f15050m = i(xmlPullParser, "MaxHeight", -1);
            this.f15051n = i(xmlPullParser, "DisplayWidth", -1);
            this.f15052o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f15053p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = i(xmlPullParser, "TimeScale", -1);
            this.f15046i = i10;
            if (i10 == -1) {
                this.f15046i = ((Long) c("TimeScale")).longValue();
            }
            this.f15054q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) {
            int size = this.f15054q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f15055r == -1) {
                        throw b3.c("Unable to infer start time", null);
                    }
                    j10 = this.f15055r + this.f15054q.get(size - 1).longValue();
                }
            }
            this.f15054q.add(Long.valueOf(j10));
            this.f15055r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f15055r == -9223372036854775807L) {
                throw b3.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f15054q.add(Long.valueOf((this.f15055r * j12) + j10));
                i10++;
            }
        }

        private int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0241b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw b3.c("Invalid key value[" + attributeValue + "]", null);
        }

        @Override // f8.b.a
        public void a(Object obj) {
            if (obj instanceof u1) {
                this.f15043f.add((u1) obj);
            }
        }

        @Override // f8.b.a
        public Object b() {
            u1[] u1VarArr = new u1[this.f15043f.size()];
            this.f15043f.toArray(u1VarArr);
            return new a.b(this.f15042e, this.f15048k, this.f15044g, this.f15045h, this.f15046i, this.f15047j, this.f15049l, this.f15050m, this.f15051n, this.f15052o, this.f15053p, u1VarArr, this.f15054q, this.f15055r);
        }

        @Override // f8.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // f8.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f15024a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // s8.g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f8.a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f15024a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (f8.a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw b3.c(null, e10);
        }
    }
}
