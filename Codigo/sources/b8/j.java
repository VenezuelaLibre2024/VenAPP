package b8;

import a8.q;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b8.g;
import b8.h;
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
import s8.g0;
import t6.b3;
import t6.p;
import t6.u1;
import t8.p0;
import t8.r0;
import t8.s;
import t8.w;
import x6.m;

/* loaded from: classes.dex */
public final class j implements g0.a<i> {

    /* renamed from: a, reason: collision with root package name */
    private final h f6308a;

    /* renamed from: b, reason: collision with root package name */
    private final g f6309b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f6284c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f6285d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f6286e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f6287f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f6288g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f6289h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f6290i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f6291j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f6292k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f6293l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f6294m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f6295n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f6296o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f6297p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f6298q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f6299r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f6300s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f6301t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f6302u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f6303v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    private static final Pattern f6304w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    private static final Pattern f6305x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    private static final Pattern f6306y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    private static final Pattern f6307z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern T = c("AUTOSELECT");
    private static final Pattern U = c("DEFAULT");
    private static final Pattern V = c("FORCED");
    private static final Pattern W = c("INDEPENDENT");
    private static final Pattern X = c("GAP");
    private static final Pattern Y = c("PRECISE");
    private static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    private static final Pattern f6282a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    private static final Pattern f6283b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* loaded from: classes.dex */
    public static final class a extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final BufferedReader f6310a;

        /* renamed from: b, reason: collision with root package name */
        private final Queue<String> f6311b;

        /* renamed from: c, reason: collision with root package name */
        private String f6312c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f6311b = queue;
            this.f6310a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f6312c != null) {
                return true;
            }
            if (!this.f6311b.isEmpty()) {
                this.f6312c = (String) t8.a.e(this.f6311b.poll());
                return true;
            }
            do {
                String readLine = this.f6310a.readLine();
                this.f6312c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f6312c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f6312c;
            this.f6312c = null;
            return str;
        }
    }

    public j() {
        this(h.f6258n, null);
    }

    public j(h hVar, g gVar) {
        this.f6308a = hVar;
        this.f6309b = gVar;
    }

    private static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String B(String str, Map<String, String> map) {
        Matcher matcher = f6283b0.matcher(str);
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

    private static int C(BufferedReader bufferedReader, boolean z10, int i10) {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !r0.v0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C2 = C(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (C2 != "#EXTM3U".charAt(i10)) {
                return false;
            }
            C2 = bufferedReader.read();
        }
        return r0.v0(C(bufferedReader, false, C2));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static m d(String str, m.b[] bVarArr) {
        m.b[] bVarArr2 = new m.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].b(null);
        }
        return new m(str, bVarArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static h.b f(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f6276d)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b g(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f6277e)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b h(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f6275c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static m.b k(String str, String str2, Map<String, String> map) {
        String u10 = u(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z10 = z(str, K, map);
            return new m.b(p.f26347d, "video/mp4", Base64.decode(z10.substring(z10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new m.b(p.f26347d, "hls", r0.m0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(u10)) {
            return null;
        }
        String z11 = z(str, K, map);
        byte[] decode = Base64.decode(z11.substring(z11.indexOf(44)), 0);
        UUID uuid = p.f26348e;
        return new m.b(uuid, "video/mp4", g7.l.a(uuid, decode));
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x01c6, code lost:
    
        if (r12 != null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static b8.g o(b8.h r92, b8.g r93, b8.j.b r94, java.lang.String r95) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.j.o(b8.h, b8.g, b8.j$b, java.lang.String):b8.g");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x034e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    private static h p(b bVar, String str) {
        char c10;
        u1 u1Var;
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
        String B2;
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
            if (!bVar.a()) {
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
                    h.b bVar2 = (h.b) arrayList11.get(i14);
                    if (hashSet.add(bVar2.f6273a)) {
                        t8.a.g(bVar2.f6274b.f26515u == null);
                        arrayList26.add(bVar2.a(bVar2.f6274b.c().Z(new l7.a(new q(null, null, (List) t8.a.e((ArrayList) hashMap4.get(bVar2.f6273a))))).G()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList27 = null;
                u1 u1Var2 = null;
                int i15 = 0;
                while (i15 < arrayList19.size()) {
                    ArrayList arrayList28 = arrayList19;
                    String str7 = (String) arrayList28.get(i15);
                    String z14 = z(str7, Q, hashMap3);
                    String z15 = z(str7, P, hashMap3);
                    u1.b X2 = new u1.b().U(z14 + ":" + z15).W(z15).M(str6).i0(x(str7)).e0(w(str7, hashMap3)).X(v(str7, O, hashMap3));
                    String v10 = v(str7, K, hashMap3);
                    Uri e10 = v10 == null ? uri : p0.e(str, v10);
                    arrayList19 = arrayList28;
                    String str8 = str6;
                    l7.a aVar = new l7.a(new q(z14, z15, Collections.emptyList()));
                    String z16 = z(str7, M, hashMap3);
                    z16.hashCode();
                    switch (z16.hashCode()) {
                        case -959297733:
                            if (z16.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -333210994:
                            if (z16.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 62628790:
                            if (z16.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 81665115:
                            if (z16.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                            u1Var = u1Var2;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            h.b g10 = g(arrayList11, z14);
                            if (g10 != null) {
                                String L2 = r0.L(g10.f6274b.f26514t, 3);
                                X2.K(L2);
                                str2 = w.g(L2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            X2.g0(str2).Z(aVar);
                            if (e10 != null) {
                                h.a aVar2 = new h.a(e10, X2.G(), z14, z15);
                                arrayList3 = arrayList22;
                                arrayList3.add(aVar2);
                                break;
                            } else {
                                arrayList3 = arrayList22;
                                s.i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            u1Var = u1Var2;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            String z17 = z(str7, S, hashMap3);
                            if (z17.startsWith("CC")) {
                                parseInt = Integer.parseInt(z17.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(z17.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            X2.g0(str3).H(parseInt);
                            arrayList27.add(X2.G());
                            arrayList3 = arrayList22;
                            break;
                        case 2:
                            arrayList2 = arrayList20;
                            h.b f10 = f(arrayList11, z14);
                            if (f10 != null) {
                                u1Var = u1Var2;
                                String L3 = r0.L(f10.f6274b.f26514t, 1);
                                X2.K(L3);
                                str4 = w.g(L3);
                            } else {
                                u1Var = u1Var2;
                                str4 = null;
                            }
                            String v11 = v(str7, f6290i, hashMap3);
                            if (v11 != null) {
                                X2.J(Integer.parseInt(r0.S0(v11, "/")[0]));
                                if ("audio/eac3".equals(str4) && v11.endsWith("/JOC")) {
                                    X2.K("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            X2.g0(str4);
                            if (e10 != null) {
                                X2.Z(aVar);
                                arrayList = arrayList21;
                                arrayList.add(new h.a(e10, X2.G(), z14, z15));
                            } else {
                                arrayList = arrayList21;
                                if (f10 != null) {
                                    u1Var = X2.G();
                                }
                            }
                            arrayList3 = arrayList22;
                            break;
                        case 3:
                            h.b h10 = h(arrayList11, z14);
                            if (h10 != null) {
                                u1 u1Var3 = h10.f6274b;
                                String L4 = r0.L(u1Var3.f26514t, 2);
                                X2.K(L4).g0(w.g(L4)).n0(u1Var3.B).S(u1Var3.C).R(u1Var3.D);
                            }
                            if (e10 != null) {
                                X2.Z(aVar);
                                arrayList2 = arrayList20;
                                arrayList2.add(new h.a(e10, X2.G(), z14, z15));
                                u1Var = u1Var2;
                                arrayList3 = arrayList22;
                                arrayList = arrayList21;
                                break;
                            }
                        default:
                            u1Var = u1Var2;
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
                    u1Var2 = u1Var;
                    uri = null;
                }
                return new h(str, arrayList24, arrayList26, arrayList20, arrayList21, arrayList22, arrayList23, u1Var2, z12 ? Collections.emptyList() : arrayList27, z13, hashMap3, arrayList25);
            }
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList18.add(b10);
            }
            boolean startsWith = b10.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z18 = z11;
            if (b10.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(z(b10, P, hashMap3), z(b10, Z, hashMap3));
            } else {
                if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList10 = arrayList16;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList5 = arrayList15;
                    arrayList6 = arrayList18;
                    arrayList4 = arrayList17;
                    z11 = true;
                } else if (b10.startsWith("#EXT-X-MEDIA")) {
                    arrayList16.add(b10);
                } else if (b10.startsWith("#EXT-X-SESSION-KEY")) {
                    m.b k10 = k(b10, u(b10, I, "identity", hashMap3), hashMap3);
                    if (k10 != null) {
                        arrayList17.add(new m(l(z(b10, H, hashMap3)), k10));
                    }
                } else if (b10.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z12 | b10.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        i10 = 16384;
                        z10 = contains;
                    } else {
                        z10 = contains;
                        i10 = 0;
                    }
                    int m10 = m(b10, f6289h);
                    arrayList4 = arrayList17;
                    arrayList5 = arrayList15;
                    int s10 = s(b10, f6284c, -1);
                    String v12 = v(b10, f6291j, hashMap3);
                    arrayList6 = arrayList18;
                    String v13 = v(b10, f6292k, hashMap3);
                    arrayList7 = arrayList14;
                    if (v13 != null) {
                        String[] R0 = r0.R0(v13, "x");
                        int parseInt2 = Integer.parseInt(R0[0]);
                        int parseInt3 = Integer.parseInt(R0[1]);
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
                    String v14 = v(b10, f6293l, hashMap3);
                    float parseFloat = v14 != null ? Float.parseFloat(v14) : -1.0f;
                    arrayList9 = arrayList12;
                    String v15 = v(b10, f6285d, hashMap3);
                    arrayList10 = arrayList16;
                    String v16 = v(b10, f6286e, hashMap3);
                    HashMap hashMap5 = hashMap2;
                    String v17 = v(b10, f6287f, hashMap3);
                    String v18 = v(b10, f6288g, hashMap3);
                    if (startsWith) {
                        B2 = z(b10, K, hashMap3);
                    } else {
                        if (!bVar.a()) {
                            throw b3.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        B2 = B(bVar.b(), hashMap3);
                    }
                    Uri e11 = p0.e(str5, B2);
                    arrayList11.add(new h.b(e11, new u1.b().T(arrayList11.size()).M("application/x-mpegURL").K(v12).I(s10).b0(m10).n0(i11).S(i12).R(parseFloat).e0(i10).G(), v15, v16, v17, v18));
                    hashMap = hashMap5;
                    ArrayList arrayList29 = (ArrayList) hashMap.get(e11);
                    if (arrayList29 == null) {
                        arrayList29 = new ArrayList();
                        hashMap.put(e11, arrayList29);
                    }
                    arrayList29.add(new q.b(s10, m10, v15, v16, v17, v18));
                    z11 = z18;
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
            z11 = z18;
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

    private static boolean q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) t8.a.e(matcher.group(1))) : d10;
    }

    private static int s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) t8.a.e(matcher.group(1))) : i10;
    }

    private static long t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) t8.a.e(matcher.group(1))) : j10;
    }

    private static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) t8.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String v10 = v(str, R, map);
        if (TextUtils.isEmpty(v10)) {
            return 0;
        }
        String[] R0 = r0.R0(v10, ",");
        int i10 = r0.s(R0, "public.accessibility.describes-video") ? RecognitionOptions.UPC_A : 0;
        if (r0.s(R0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= RecognitionOptions.AZTEC;
        }
        if (r0.s(R0, "public.accessibility.describes-music-and-sound")) {
            i10 |= RecognitionOptions.UPC_E;
        }
        return r0.s(R0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int x(String str) {
        boolean q10 = q(str, U, false);
        ?? r02 = q10;
        if (q(str, V, false)) {
            r02 = (q10 ? 1 : 0) | 2;
        }
        return q(str, T, false) ? r02 | 4 : r02;
    }

    private static g.f y(String str) {
        double r10 = r(str, f6299r, -9.223372036854776E18d);
        long j10 = r10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r10 * 1000000.0d);
        boolean q10 = q(str, f6300s, false);
        double r11 = r(str, f6302u, -9.223372036854776E18d);
        long j11 = r11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r11 * 1000000.0d);
        double r12 = r(str, f6303v, -9.223372036854776E18d);
        return new g.f(j10, q10, j11, r12 != -9.223372036854776E18d ? (long) (r12 * 1000000.0d) : -9223372036854775807L, q(str, f6304w, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) {
        String v10 = v(str, pattern, map);
        if (v10 != null) {
            return v10;
        }
        throw b3.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // s8.g0.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public i a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw b3.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    r0.n(bufferedReader);
                    throw b3.c("Failed to parse the playlist, could not identify any tags.", null);
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
                        return p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return o(this.f6308a, this.f6309b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            r0.n(bufferedReader);
        }
    }
}
