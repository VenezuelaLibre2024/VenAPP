package p026b8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010a8.C0059q;
import p026b8.C1677g;
import p026b8.C1678h;
import p119g7.C7476l;
import p216l7.C9400a;
import p351s8.C10822g0;
import p361t6.C11005b3;
import p361t6.C11081p;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11168p0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;
import p436x6.C12318m;

/* renamed from: b8.j */
/* loaded from: classes.dex */
public final class C1680j implements C10822g0.a<AbstractC1679i> {

    /* renamed from: a */
    private final C1678h f7230a;

    /* renamed from: b */
    private final C1677g f7231b;

    /* renamed from: c */
    private static final Pattern f7206c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    private static final Pattern f7207d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f7208e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f7209f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    private static final Pattern f7210g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f7211h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    private static final Pattern f7212i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    private static final Pattern f7213j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    private static final Pattern f7214k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    private static final Pattern f7215l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f7216m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    private static final Pattern f7217n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    private static final Pattern f7218o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    private static final Pattern f7219p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    private static final Pattern f7220q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    private static final Pattern f7221r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    private static final Pattern f7222s = m9250c("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    private static final Pattern f7223t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    private static final Pattern f7224u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    private static final Pattern f7225v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    private static final Pattern f7226w = m9250c("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    private static final Pattern f7227x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    private static final Pattern f7228y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    private static final Pattern f7229z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A */
    private static final Pattern f7178A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    private static final Pattern f7179B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    private static final Pattern f7180C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    private static final Pattern f7181D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    private static final Pattern f7182E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    private static final Pattern f7183F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    private static final Pattern f7184G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    private static final Pattern f7185H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    private static final Pattern f7186I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f7187J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    private static final Pattern f7188K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    private static final Pattern f7189L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    private static final Pattern f7190M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    private static final Pattern f7191N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    private static final Pattern f7192O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f7193P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f7194Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    private static final Pattern f7195R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    private static final Pattern f7196S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    private static final Pattern f7197T = m9250c("AUTOSELECT");

    /* renamed from: U */
    private static final Pattern f7198U = m9250c("DEFAULT");

    /* renamed from: V */
    private static final Pattern f7199V = m9250c("FORCED");

    /* renamed from: W */
    private static final Pattern f7200W = m9250c("INDEPENDENT");

    /* renamed from: X */
    private static final Pattern f7201X = m9250c("GAP");

    /* renamed from: Y */
    private static final Pattern f7202Y = m9250c("PRECISE");

    /* renamed from: Z */
    private static final Pattern f7203Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0 */
    private static final Pattern f7204a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0 */
    private static final Pattern f7205b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: b8.j$a */
    /* loaded from: classes.dex */
    public static final class a extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b8.j$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final BufferedReader f7232a;

        /* renamed from: b */
        private final Queue<String> f7233b;

        /* renamed from: c */
        private String f7234c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f7233b = queue;
            this.f7232a = bufferedReader;
        }

        /* renamed from: a */
        public boolean m9275a() {
            String trim;
            if (this.f7234c != null) {
                return true;
            }
            if (!this.f7233b.isEmpty()) {
                this.f7234c = (String) C11137a.m34603e(this.f7233b.poll());
                return true;
            }
            do {
                String readLine = this.f7232a.readLine();
                this.f7234c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f7234c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m9276b() {
            if (!m9275a()) {
                throw new NoSuchElementException();
            }
            String str = this.f7234c;
            this.f7234c = null;
            return str;
        }
    }

    public C1680j() {
        this(C1678h.f7154n, null);
    }

    public C1680j(C1678h c1678h, C1677g c1677g) {
        this.f7230a = c1678h;
        this.f7231b = c1677g;
    }

    /* renamed from: A */
    private static long m9246A(String str, Pattern pattern) {
        return new BigDecimal(m9272z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    /* renamed from: B */
    private static String m9247B(String str, Map<String, String> map) {
        Matcher matcher = f7205b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: C */
    private static int m9248C(BufferedReader bufferedReader, boolean z10, int i10) {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !C11172r0.m34953v0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    /* renamed from: b */
    private static boolean m9249b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int m9248C = m9248C(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (m9248C != "#EXTM3U".charAt(i10)) {
                return false;
            }
            m9248C = bufferedReader.read();
        }
        return C11172r0.m34953v0(m9248C(bufferedReader, false, m9248C));
    }

    /* renamed from: c */
    private static Pattern m9250c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: d */
    private static C12318m m9251d(String str, C12318m.b[] bVarArr) {
        C12318m.b[] bVarArr2 = new C12318m.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].m39845b(null);
        }
        return new C12318m(str, bVarArr2);
    }

    /* renamed from: e */
    private static String m9252e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    /* renamed from: f */
    private static C1678h.b m9253f(ArrayList<C1678h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C1678h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f7172d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static C1678h.b m9254g(ArrayList<C1678h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C1678h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f7173e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static C1678h.b m9255h(ArrayList<C1678h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C1678h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f7171c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static double m9256j(String str, Pattern pattern) {
        return Double.parseDouble(m9272z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    private static C12318m.b m9257k(String str, String str2, Map<String, String> map) {
        String m9267u = m9267u(str, f7187J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m9272z = m9272z(str, f7188K, map);
            return new C12318m.b(C11081p.f28574d, "video/mp4", Base64.decode(m9272z.substring(m9272z.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C12318m.b(C11081p.f28574d, "hls", C11172r0.m34935m0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(m9267u)) {
            return null;
        }
        String m9272z2 = m9272z(str, f7188K, map);
        byte[] decode = Base64.decode(m9272z2.substring(m9272z2.indexOf(44)), 0);
        UUID uuid = C11081p.f28575e;
        return new C12318m.b(uuid, "video/mp4", C7476l.m22727a(uuid, decode));
    }

    /* renamed from: l */
    private static String m9258l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: m */
    private static int m9259m(String str, Pattern pattern) {
        return Integer.parseInt(m9272z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    private static long m9260n(String str, Pattern pattern) {
        return Long.parseLong(m9272z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x01c6, code lost:
    
        if (r12 != null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p026b8.C1677g m9261o(p026b8.C1678h r92, p026b8.C1677g r93, p026b8.C1680j.b r94, java.lang.String r95) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p026b8.C1680j.m9261o(b8.h, b8.g, b8.j$b, java.lang.String):b8.g");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x034e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* renamed from: p */
    private static C1678h m9262p(b bVar, String str) {
        char c10;
        C11108u1 c11108u1;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z10;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i11;
        int i12;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String m9247B;
        HashMap hashMap;
        int i13;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (!bVar.m9275a()) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList19 = arrayList16;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList13;
                ArrayList arrayList22 = arrayList14;
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = arrayList18;
                boolean z13 = z11;
                ArrayList arrayList25 = arrayList17;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                    C1678h.b bVar2 = (C1678h.b) arrayList11.get(i14);
                    if (hashSet.add(bVar2.f7169a)) {
                        C11137a.m34605g(bVar2.f7170b.f28795u == null);
                        arrayList26.add(bVar2.m9245a(bVar2.f7170b.m34488c().m34545Z(new C9400a(new C0059q(null, null, (List) C11137a.m34603e((ArrayList) hashMap4.get(bVar2.f7169a))))).m34526G()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList27 = null;
                C11108u1 c11108u12 = null;
                int i15 = 0;
                while (i15 < arrayList19.size()) {
                    ArrayList arrayList28 = arrayList19;
                    String str7 = (String) arrayList28.get(i15);
                    String m9272z = m9272z(str7, f7194Q, hashMap3);
                    String m9272z2 = m9272z(str7, f7193P, hashMap3);
                    C11108u1.b m34543X = new C11108u1.b().m34540U(m9272z + ":" + m9272z2).m34542W(m9272z2).m34532M(str6).m34554i0(m9270x(str7)).m34550e0(m9269w(str7, hashMap3)).m34543X(m9268v(str7, f7192O, hashMap3));
                    String m9268v = m9268v(str7, f7188K, hashMap3);
                    Uri m34839e = m9268v == null ? uri : C11168p0.m34839e(str, m9268v);
                    arrayList19 = arrayList28;
                    String str8 = str6;
                    C9400a c9400a = new C9400a(new C0059q(m9272z, m9272z2, Collections.emptyList()));
                    String m9272z3 = m9272z(str7, f7190M, hashMap3);
                    m9272z3.hashCode();
                    switch (m9272z3.hashCode()) {
                        case -959297733:
                            if (m9272z3.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -333210994:
                            if (m9272z3.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 62628790:
                            if (m9272z3.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 81665115:
                            if (m9272z3.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                            c11108u1 = c11108u12;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            C1678h.b m9254g = m9254g(arrayList11, m9272z);
                            if (m9254g != null) {
                                String m34878L = C11172r0.m34878L(m9254g.f7170b.f28794t, 3);
                                m34543X.m34530K(m34878L);
                                str2 = C11178w.m34999g(m34878L);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            m34543X.m34552g0(str2).m34545Z(c9400a);
                            if (m34839e != null) {
                                C1678h.a aVar = new C1678h.a(m34839e, m34543X.m34526G(), m9272z, m9272z2);
                                arrayList3 = arrayList22;
                                arrayList3.add(aVar);
                                break;
                            } else {
                                arrayList3 = arrayList22;
                                C11173s.m34970i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            c11108u1 = c11108u12;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            String m9272z4 = m9272z(str7, f7196S, hashMap3);
                            if (m9272z4.startsWith("CC")) {
                                parseInt = Integer.parseInt(m9272z4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(m9272z4.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            m34543X.m34552g0(str3).m34527H(parseInt);
                            arrayList27.add(m34543X.m34526G());
                            arrayList3 = arrayList22;
                            break;
                        case 2:
                            arrayList2 = arrayList20;
                            C1678h.b m9253f = m9253f(arrayList11, m9272z);
                            if (m9253f != null) {
                                c11108u1 = c11108u12;
                                String m34878L2 = C11172r0.m34878L(m9253f.f7170b.f28794t, 1);
                                m34543X.m34530K(m34878L2);
                                str4 = C11178w.m34999g(m34878L2);
                            } else {
                                c11108u1 = c11108u12;
                                str4 = null;
                            }
                            String m9268v2 = m9268v(str7, f7212i, hashMap3);
                            if (m9268v2 != null) {
                                m34543X.m34529J(Integer.parseInt(C11172r0.m34893S0(m9268v2, "/")[0]));
                                if ("audio/eac3".equals(str4) && m9268v2.endsWith("/JOC")) {
                                    m34543X.m34530K("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            m34543X.m34552g0(str4);
                            if (m34839e != null) {
                                m34543X.m34545Z(c9400a);
                                arrayList = arrayList21;
                                arrayList.add(new C1678h.a(m34839e, m34543X.m34526G(), m9272z, m9272z2));
                            } else {
                                arrayList = arrayList21;
                                if (m9253f != null) {
                                    c11108u1 = m34543X.m34526G();
                                }
                            }
                            arrayList3 = arrayList22;
                            break;
                        case 3:
                            C1678h.b m9255h = m9255h(arrayList11, m9272z);
                            if (m9255h != null) {
                                C11108u1 c11108u13 = m9255h.f7170b;
                                String m34878L3 = C11172r0.m34878L(c11108u13.f28794t, 2);
                                m34543X.m34530K(m34878L3).m34552g0(C11178w.m34999g(m34878L3)).m34559n0(c11108u13.f28768B).m34538S(c11108u13.f28769C).m34537R(c11108u13.f28770D);
                            }
                            if (m34839e != null) {
                                m34543X.m34545Z(c9400a);
                                arrayList2 = arrayList20;
                                arrayList2.add(new C1678h.a(m34839e, m34543X.m34526G(), m9272z, m9272z2));
                                c11108u1 = c11108u12;
                                arrayList3 = arrayList22;
                                arrayList = arrayList21;
                                break;
                            }
                        default:
                            c11108u1 = c11108u12;
                            arrayList3 = arrayList22;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            break;
                    }
                    i15++;
                    arrayList22 = arrayList3;
                    arrayList21 = arrayList;
                    arrayList20 = arrayList2;
                    str6 = str8;
                    c11108u12 = c11108u1;
                    uri = null;
                }
                return new C1678h(str, arrayList24, arrayList26, arrayList20, arrayList21, arrayList22, arrayList23, c11108u12, z12 ? Collections.emptyList() : arrayList27, z13, hashMap3, arrayList25);
            }
            String m9276b = bVar.m9276b();
            if (m9276b.startsWith("#EXT")) {
                arrayList18.add(m9276b);
            }
            boolean startsWith = m9276b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z14 = z11;
            if (m9276b.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(m9272z(m9276b, f7193P, hashMap3), m9272z(m9276b, f7203Z, hashMap3));
            } else {
                if (m9276b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList10 = arrayList16;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList5 = arrayList15;
                    arrayList6 = arrayList18;
                    arrayList4 = arrayList17;
                    z11 = true;
                } else if (m9276b.startsWith("#EXT-X-MEDIA")) {
                    arrayList16.add(m9276b);
                } else if (m9276b.startsWith("#EXT-X-SESSION-KEY")) {
                    C12318m.b m9257k = m9257k(m9276b, m9267u(m9276b, f7186I, "identity", hashMap3), hashMap3);
                    if (m9257k != null) {
                        arrayList17.add(new C12318m(m9258l(m9272z(m9276b, f7185H, hashMap3)), m9257k));
                    }
                } else if (m9276b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z12 | m9276b.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        i10 = 16384;
                        z10 = contains;
                    } else {
                        z10 = contains;
                        i10 = 0;
                    }
                    int m9259m = m9259m(m9276b, f7211h);
                    arrayList4 = arrayList17;
                    arrayList5 = arrayList15;
                    int m9265s = m9265s(m9276b, f7206c, -1);
                    String m9268v3 = m9268v(m9276b, f7213j, hashMap3);
                    arrayList6 = arrayList18;
                    String m9268v4 = m9268v(m9276b, f7214k, hashMap3);
                    arrayList7 = arrayList14;
                    if (m9268v4 != null) {
                        String[] m34891R0 = C11172r0.m34891R0(m9268v4, "x");
                        int parseInt2 = Integer.parseInt(m34891R0[0]);
                        int parseInt3 = Integer.parseInt(m34891R0[1]);
                        if (parseInt2 <= 0 || parseInt3 <= 0) {
                            parseInt3 = -1;
                            i13 = -1;
                        } else {
                            i13 = parseInt2;
                        }
                        arrayList8 = arrayList13;
                        i12 = parseInt3;
                        i11 = i13;
                    } else {
                        arrayList8 = arrayList13;
                        i11 = -1;
                        i12 = -1;
                    }
                    String m9268v5 = m9268v(m9276b, f7215l, hashMap3);
                    float parseFloat = m9268v5 != null ? Float.parseFloat(m9268v5) : -1.0f;
                    arrayList9 = arrayList12;
                    String m9268v6 = m9268v(m9276b, f7207d, hashMap3);
                    arrayList10 = arrayList16;
                    String m9268v7 = m9268v(m9276b, f7208e, hashMap3);
                    HashMap hashMap5 = hashMap2;
                    String m9268v8 = m9268v(m9276b, f7209f, hashMap3);
                    String m9268v9 = m9268v(m9276b, f7210g, hashMap3);
                    if (startsWith) {
                        m9247B = m9272z(m9276b, f7188K, hashMap3);
                    } else {
                        if (!bVar.m9275a()) {
                            throw C11005b3.m33717c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        m9247B = m9247B(bVar.m9276b(), hashMap3);
                    }
                    Uri m34839e2 = C11168p0.m34839e(str5, m9247B);
                    arrayList11.add(new C1678h.b(m34839e2, new C11108u1.b().m34539T(arrayList11.size()).m34532M("application/x-mpegURL").m34530K(m9268v3).m34528I(m9265s).m34547b0(m9259m).m34559n0(i11).m34538S(i12).m34537R(parseFloat).m34550e0(i10).m34526G(), m9268v6, m9268v7, m9268v8, m9268v9));
                    hashMap = hashMap5;
                    ArrayList arrayList29 = (ArrayList) hashMap.get(m34839e2);
                    if (arrayList29 == null) {
                        arrayList29 = new ArrayList();
                        hashMap.put(m34839e2, arrayList29);
                    }
                    arrayList29.add(new C0059q.b(m9265s, m9259m, m9268v6, m9268v7, m9268v8, m9268v9));
                    z11 = z14;
                    z12 = z10;
                }
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            }
            hashMap = hashMap2;
            arrayList10 = arrayList16;
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList5 = arrayList15;
            arrayList6 = arrayList18;
            arrayList4 = arrayList17;
            z11 = z14;
            hashMap2 = hashMap;
            arrayList17 = arrayList4;
            arrayList15 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
            str5 = str;
        }
    }

    /* renamed from: q */
    private static boolean m9263q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    /* renamed from: r */
    private static double m9264r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) C11137a.m34603e(matcher.group(1))) : d10;
    }

    /* renamed from: s */
    private static int m9265s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) C11137a.m34603e(matcher.group(1))) : i10;
    }

    /* renamed from: t */
    private static long m9266t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) C11137a.m34603e(matcher.group(1))) : j10;
    }

    /* renamed from: u */
    private static String m9267u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) C11137a.m34603e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : m9247B(str2, map);
    }

    /* renamed from: v */
    private static String m9268v(String str, Pattern pattern, Map<String, String> map) {
        return m9267u(str, pattern, null, map);
    }

    /* renamed from: w */
    private static int m9269w(String str, Map<String, String> map) {
        String m9268v = m9268v(str, f7195R, map);
        if (TextUtils.isEmpty(m9268v)) {
            return 0;
        }
        String[] m34891R0 = C11172r0.m34891R0(m9268v, ",");
        int i10 = C11172r0.m34946s(m34891R0, "public.accessibility.describes-video") ? RecognitionOptions.UPC_A : 0;
        if (C11172r0.m34946s(m34891R0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= RecognitionOptions.AZTEC;
        }
        if (C11172r0.m34946s(m34891R0, "public.accessibility.describes-music-and-sound")) {
            i10 |= RecognitionOptions.UPC_E;
        }
        return C11172r0.m34946s(m34891R0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: x */
    private static int m9270x(String str) {
        boolean m9263q = m9263q(str, f7198U, false);
        ?? r02 = m9263q;
        if (m9263q(str, f7199V, false)) {
            r02 = (m9263q ? 1 : 0) | 2;
        }
        return m9263q(str, f7197T, false) ? r02 | 4 : r02;
    }

    /* renamed from: y */
    private static C1677g.f m9271y(String str) {
        double m9264r = m9264r(str, f7221r, -9.223372036854776E18d);
        long j10 = m9264r == -9.223372036854776E18d ? -9223372036854775807L : (long) (m9264r * 1000000.0d);
        boolean m9263q = m9263q(str, f7222s, false);
        double m9264r2 = m9264r(str, f7224u, -9.223372036854776E18d);
        long j11 = m9264r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m9264r2 * 1000000.0d);
        double m9264r3 = m9264r(str, f7225v, -9.223372036854776E18d);
        return new C1677g.f(j10, m9263q, j11, m9264r3 != -9.223372036854776E18d ? (long) (m9264r3 * 1000000.0d) : -9223372036854775807L, m9263q(str, f7226w, false));
    }

    /* renamed from: z */
    private static String m9272z(String str, Pattern pattern, Map<String, String> map) {
        String m9268v = m9268v(str, pattern, map);
        if (m9268v != null) {
            return m9268v;
        }
        throw C11005b3.m33717c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // p351s8.C10822g0.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC1679i mo9273a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!m9249b(bufferedReader)) {
                throw C11005b3.m33717c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    C11172r0.m34936n(bufferedReader);
                    throw C11005b3.m33717c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return m9262p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return m9261o(this.f7230a, this.f7231b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            C11172r0.m34936n(bufferedReader);
        }
    }
}
