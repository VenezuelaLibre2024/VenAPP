package p100f8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p100f8.C7314a;
import p119g7.C7476l;
import p119g7.C7480p;
import p351s8.C10822g0;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11145e;
import p363t8.C11172r0;
import p396v6.C11631a;
import p436x6.C12318m;

/* renamed from: f8.b */
/* loaded from: classes.dex */
public class C7315b implements C10822g0.a<C7314a> {

    /* renamed from: a */
    private final XmlPullParserFactory f16447a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.b$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        private final String f16448a;

        /* renamed from: b */
        private final String f16449b;

        /* renamed from: c */
        private final a f16450c;

        /* renamed from: d */
        private final List<Pair<String, Object>> f16451d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f16450c = aVar;
            this.f16448a = str;
            this.f16449b = str2;
        }

        /* renamed from: e */
        private a m21923e(a aVar, String str, String str2) {
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

        /* renamed from: a */
        protected void mo21924a(Object obj) {
        }

        /* renamed from: b */
        protected abstract Object mo21925b();

        /* renamed from: c */
        protected final Object m21926c(String str) {
            for (int i10 = 0; i10 < this.f16451d.size(); i10++) {
                Pair<String, Object> pair = this.f16451d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f16450c;
            if (aVar == null) {
                return null;
            }
            return aVar.m21926c(str);
        }

        /* renamed from: d */
        protected boolean mo21927d(String str) {
            return false;
        }

        /* renamed from: f */
        public final Object m21928f(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f16449b.equals(name)) {
                        mo21936n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (mo21927d(name)) {
                            mo21936n(xmlPullParser);
                        } else {
                            a m21923e = m21923e(this, name, this.f16448a);
                            if (m21923e == null) {
                                i10 = 1;
                            } else {
                                mo21924a(m21923e.m21928f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        mo21937o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo21930h(xmlPullParser);
                    if (!mo21927d(name2)) {
                        return mo21925b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: g */
        protected final boolean m21929g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        /* renamed from: h */
        protected void mo21930h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        protected final int m21931i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C11005b3.m33717c(null, e10);
            }
        }

        /* renamed from: j */
        protected final long m21932j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C11005b3.m33717c(null, e10);
            }
        }

        /* renamed from: k */
        protected final int m21933k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C11005b3.m33717c(null, e10);
            }
        }

        /* renamed from: l */
        protected final long m21934l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C11005b3.m33717c(null, e10);
            }
        }

        /* renamed from: m */
        protected final String m21935m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        /* renamed from: n */
        protected abstract void mo21936n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        protected void mo21937o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        protected final void m21938p(String str, Object obj) {
            this.f16451d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: f8.b$b */
    /* loaded from: classes.dex */
    public static class b extends C11005b3 {
        public b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.b$c */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: e */
        private boolean f16452e;

        /* renamed from: f */
        private UUID f16453f;

        /* renamed from: g */
        private byte[] f16454g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: q */
        private static C7480p[] m21939q(byte[] bArr) {
            return new C7480p[]{new C7480p(true, null, 8, m21940r(bArr), 0, 0, null)};
        }

        /* renamed from: r */
        private static byte[] m21940r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            m21942t(decode, 0, 3);
            m21942t(decode, 1, 2);
            m21942t(decode, 4, 5);
            m21942t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        private static String m21941s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* renamed from: t */
        private static void m21942t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // p100f8.C7315b.a
        /* renamed from: b */
        public Object mo21925b() {
            UUID uuid = this.f16453f;
            return new C7314a.a(uuid, C7476l.m22727a(uuid, this.f16454g), m21939q(this.f16454g));
        }

        @Override // p100f8.C7315b.a
        /* renamed from: d */
        public boolean mo21927d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p100f8.C7315b.a
        /* renamed from: h */
        public void mo21930h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f16452e = false;
            }
        }

        @Override // p100f8.C7315b.a
        /* renamed from: n */
        public void mo21936n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f16452e = true;
                this.f16453f = UUID.fromString(m21941s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p100f8.C7315b.a
        /* renamed from: o */
        public void mo21937o(XmlPullParser xmlPullParser) {
            if (this.f16452e) {
                this.f16454g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.b$d */
    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: e */
        private C11108u1 f16455e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: q */
        private static List<byte[]> m21943q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] m34874J = C11172r0.m34874J(str);
                byte[][] m34652i = C11145e.m34652i(m34874J);
                if (m34652i == null) {
                    arrayList.add(m34874J);
                } else {
                    Collections.addAll(arrayList, m34652i);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        private static String m21944r(String str) {
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

        @Override // p100f8.C7315b.a
        /* renamed from: b */
        public Object mo21925b() {
            return this.f16455e;
        }

        @Override // p100f8.C7315b.a
        /* renamed from: n */
        public void mo21936n(XmlPullParser xmlPullParser) {
            int i10;
            C11108u1.b bVar = new C11108u1.b();
            String m21944r = m21944r(m21935m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) m21926c("Type")).intValue();
            if (intValue == 2) {
                bVar.m34532M("video/mp4").m34559n0(m21933k(xmlPullParser, "MaxWidth")).m34538S(m21933k(xmlPullParser, "MaxHeight")).m34541V(m21943q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (m21944r == null) {
                    m21944r = "audio/mp4a-latm";
                }
                int m21933k = m21933k(xmlPullParser, "Channels");
                int m21933k2 = m21933k(xmlPullParser, "SamplingRate");
                List<byte[]> m21943q = m21943q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (m21943q.isEmpty() && "audio/mp4a-latm".equals(m21944r)) {
                    m21943q = Collections.singletonList(C11631a.m36457a(m21933k2, m21933k));
                }
                bVar.m34532M("audio/mp4").m34529J(m21933k).m34553h0(m21933k2).m34541V(m21943q);
            } else if (intValue == 3) {
                String str = (String) m21926c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = RecognitionOptions.UPC_E;
                    }
                    bVar.m34532M("application/mp4").m34550e0(i10);
                }
                i10 = 0;
                bVar.m34532M("application/mp4").m34550e0(i10);
            } else {
                bVar.m34532M("application/mp4");
            }
            this.f16455e = bVar.m34540U(xmlPullParser.getAttributeValue(null, "Index")).m34542W((String) m21926c("Name")).m34552g0(m21944r).m34528I(m21933k(xmlPullParser, "Bitrate")).m34543X((String) m21926c("Language")).m34526G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.b$e */
    /* loaded from: classes.dex */
    public static class e extends a {

        /* renamed from: e */
        private final List<C7314a.b> f16456e;

        /* renamed from: f */
        private int f16457f;

        /* renamed from: g */
        private int f16458g;

        /* renamed from: h */
        private long f16459h;

        /* renamed from: i */
        private long f16460i;

        /* renamed from: j */
        private long f16461j;

        /* renamed from: k */
        private int f16462k;

        /* renamed from: l */
        private boolean f16463l;

        /* renamed from: m */
        private C7314a.a f16464m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f16462k = -1;
            this.f16464m = null;
            this.f16456e = new LinkedList();
        }

        @Override // p100f8.C7315b.a
        /* renamed from: a */
        public void mo21924a(Object obj) {
            if (obj instanceof C7314a.b) {
                this.f16456e.add((C7314a.b) obj);
            } else if (obj instanceof C7314a.a) {
                C11137a.m34605g(this.f16464m == null);
                this.f16464m = (C7314a.a) obj;
            }
        }

        @Override // p100f8.C7315b.a
        /* renamed from: b */
        public Object mo21925b() {
            int size = this.f16456e.size();
            C7314a.b[] bVarArr = new C7314a.b[size];
            this.f16456e.toArray(bVarArr);
            if (this.f16464m != null) {
                C7314a.a aVar = this.f16464m;
                C12318m c12318m = new C12318m(new C12318m.b(aVar.f16428a, "video/mp4", aVar.f16429b));
                for (int i10 = 0; i10 < size; i10++) {
                    C7314a.b bVar = bVarArr[i10];
                    int i11 = bVar.f16431a;
                    if (i11 == 2 || i11 == 1) {
                        C11108u1[] c11108u1Arr = bVar.f16440j;
                        for (int i12 = 0; i12 < c11108u1Arr.length; i12++) {
                            c11108u1Arr[i12] = c11108u1Arr[i12].m34488c().m34534O(c12318m).m34526G();
                        }
                    }
                }
            }
            return new C7314a(this.f16457f, this.f16458g, this.f16459h, this.f16460i, this.f16461j, this.f16462k, this.f16463l, this.f16464m, bVarArr);
        }

        @Override // p100f8.C7315b.a
        /* renamed from: n */
        public void mo21936n(XmlPullParser xmlPullParser) {
            this.f16457f = m21933k(xmlPullParser, "MajorVersion");
            this.f16458g = m21933k(xmlPullParser, "MinorVersion");
            this.f16459h = m21932j(xmlPullParser, "TimeScale", 10000000L);
            this.f16460i = m21934l(xmlPullParser, "Duration");
            this.f16461j = m21932j(xmlPullParser, "DVRWindowLength", 0L);
            this.f16462k = m21931i(xmlPullParser, "LookaheadCount", -1);
            this.f16463l = m21929g(xmlPullParser, "IsLive", false);
            m21938p("TimeScale", Long.valueOf(this.f16459h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.b$f */
    /* loaded from: classes.dex */
    public static class f extends a {

        /* renamed from: e */
        private final String f16465e;

        /* renamed from: f */
        private final List<C11108u1> f16466f;

        /* renamed from: g */
        private int f16467g;

        /* renamed from: h */
        private String f16468h;

        /* renamed from: i */
        private long f16469i;

        /* renamed from: j */
        private String f16470j;

        /* renamed from: k */
        private String f16471k;

        /* renamed from: l */
        private int f16472l;

        /* renamed from: m */
        private int f16473m;

        /* renamed from: n */
        private int f16474n;

        /* renamed from: o */
        private int f16475o;

        /* renamed from: p */
        private String f16476p;

        /* renamed from: q */
        private ArrayList<Long> f16477q;

        /* renamed from: r */
        private long f16478r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f16465e = str;
            this.f16466f = new LinkedList();
        }

        /* renamed from: q */
        private void m21945q(XmlPullParser xmlPullParser) {
            int m21947s = m21947s(xmlPullParser);
            this.f16467g = m21947s;
            m21938p("Type", Integer.valueOf(m21947s));
            this.f16468h = this.f16467g == 3 ? m21935m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            m21938p("Subtype", this.f16468h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f16470j = attributeValue;
            m21938p("Name", attributeValue);
            this.f16471k = m21935m(xmlPullParser, "Url");
            this.f16472l = m21931i(xmlPullParser, "MaxWidth", -1);
            this.f16473m = m21931i(xmlPullParser, "MaxHeight", -1);
            this.f16474n = m21931i(xmlPullParser, "DisplayWidth", -1);
            this.f16475o = m21931i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f16476p = attributeValue2;
            m21938p("Language", attributeValue2);
            long m21931i = m21931i(xmlPullParser, "TimeScale", -1);
            this.f16469i = m21931i;
            if (m21931i == -1) {
                this.f16469i = ((Long) m21926c("TimeScale")).longValue();
            }
            this.f16477q = new ArrayList<>();
        }

        /* renamed from: r */
        private void m21946r(XmlPullParser xmlPullParser) {
            int size = this.f16477q.size();
            long m21932j = m21932j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (m21932j == -9223372036854775807L) {
                if (size == 0) {
                    m21932j = 0;
                } else {
                    if (this.f16478r == -1) {
                        throw C11005b3.m33717c("Unable to infer start time", null);
                    }
                    m21932j = this.f16478r + this.f16477q.get(size - 1).longValue();
                }
            }
            this.f16477q.add(Long.valueOf(m21932j));
            this.f16478r = m21932j(xmlPullParser, "d", -9223372036854775807L);
            long m21932j2 = m21932j(xmlPullParser, "r", 1L);
            if (m21932j2 > 1 && this.f16478r == -9223372036854775807L) {
                throw C11005b3.m33717c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j10 = i10;
                if (j10 >= m21932j2) {
                    return;
                }
                this.f16477q.add(Long.valueOf((this.f16478r * j10) + m21932j));
                i10++;
            }
        }

        /* renamed from: s */
        private int m21947s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new b("Type");
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
            throw C11005b3.m33717c("Invalid key value[" + attributeValue + "]", null);
        }

        @Override // p100f8.C7315b.a
        /* renamed from: a */
        public void mo21924a(Object obj) {
            if (obj instanceof C11108u1) {
                this.f16466f.add((C11108u1) obj);
            }
        }

        @Override // p100f8.C7315b.a
        /* renamed from: b */
        public Object mo21925b() {
            C11108u1[] c11108u1Arr = new C11108u1[this.f16466f.size()];
            this.f16466f.toArray(c11108u1Arr);
            return new C7314a.b(this.f16465e, this.f16471k, this.f16467g, this.f16468h, this.f16469i, this.f16470j, this.f16472l, this.f16473m, this.f16474n, this.f16475o, this.f16476p, c11108u1Arr, this.f16477q, this.f16478r);
        }

        @Override // p100f8.C7315b.a
        /* renamed from: d */
        public boolean mo21927d(String str) {
            return "c".equals(str);
        }

        @Override // p100f8.C7315b.a
        /* renamed from: n */
        public void mo21936n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m21946r(xmlPullParser);
            } else {
                m21945q(xmlPullParser);
            }
        }
    }

    public C7315b() {
        try {
            this.f16447a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // p351s8.C10822g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7314a mo9273a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f16447a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C7314a) new e(null, uri.toString()).m21928f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw C11005b3.m33717c(null, e10);
        }
    }
}
