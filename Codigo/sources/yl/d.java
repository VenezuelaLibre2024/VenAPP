package yl;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import dk.z;
import dm.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f32028a;

    /* renamed from: b, reason: collision with root package name */
    private static final c[] f32029b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<dm.e, Integer> f32030c;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f32031a;

        /* renamed from: b, reason: collision with root package name */
        private int f32032b;

        /* renamed from: c, reason: collision with root package name */
        private final List<c> f32033c;

        /* renamed from: d, reason: collision with root package name */
        private final dm.d f32034d;

        /* renamed from: e, reason: collision with root package name */
        public c[] f32035e;

        /* renamed from: f, reason: collision with root package name */
        private int f32036f;

        /* renamed from: g, reason: collision with root package name */
        public int f32037g;

        /* renamed from: h, reason: collision with root package name */
        public int f32038h;

        public a(x source, int i10, int i11) {
            kotlin.jvm.internal.n.e(source, "source");
            this.f32031a = i10;
            this.f32032b = i11;
            this.f32033c = new ArrayList();
            this.f32034d = dm.l.b(source);
            this.f32035e = new c[8];
            this.f32036f = r2.length - 1;
        }

        public /* synthetic */ a(x xVar, int i10, int i11, int i12, kotlin.jvm.internal.g gVar) {
            this(xVar, i10, (i12 & 4) != 0 ? i10 : i11);
        }

        private final void a() {
            int i10 = this.f32032b;
            int i11 = this.f32038h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            dk.l.l(this.f32035e, null, 0, 0, 6, null);
            this.f32036f = this.f32035e.length - 1;
            this.f32037g = 0;
            this.f32038h = 0;
        }

        private final int c(int i10) {
            return this.f32036f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f32035e.length;
                while (true) {
                    length--;
                    i11 = this.f32036f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f32035e[length];
                    kotlin.jvm.internal.n.b(cVar);
                    int i13 = cVar.f32027c;
                    i10 -= i13;
                    this.f32038h -= i13;
                    this.f32037g--;
                    i12++;
                }
                c[] cVarArr = this.f32035e;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f32037g);
                this.f32036f += i12;
            }
            return i12;
        }

        private final dm.e f(int i10) {
            c cVar;
            if (!h(i10)) {
                int c10 = c(i10 - d.f32028a.c().length);
                if (c10 >= 0) {
                    c[] cVarArr = this.f32035e;
                    if (c10 < cVarArr.length) {
                        cVar = cVarArr[c10];
                        kotlin.jvm.internal.n.b(cVar);
                    }
                }
                throw new IOException(kotlin.jvm.internal.n.k("Header index too large ", Integer.valueOf(i10 + 1)));
            }
            cVar = d.f32028a.c()[i10];
            return cVar.f32025a;
        }

        private final void g(int i10, c cVar) {
            this.f32033c.add(cVar);
            int i11 = cVar.f32027c;
            if (i10 != -1) {
                c cVar2 = this.f32035e[c(i10)];
                kotlin.jvm.internal.n.b(cVar2);
                i11 -= cVar2.f32027c;
            }
            int i12 = this.f32032b;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f32038h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f32037g + 1;
                c[] cVarArr = this.f32035e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f32036f = this.f32035e.length - 1;
                    this.f32035e = cVarArr2;
                }
                int i14 = this.f32036f;
                this.f32036f = i14 - 1;
                this.f32035e[i14] = cVar;
                this.f32037g++;
            } else {
                this.f32035e[i10 + c(i10) + d10] = cVar;
            }
            this.f32038h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f32028a.c().length - 1;
        }

        private final int i() {
            return rl.d.d(this.f32034d.readByte(), 255);
        }

        private final void l(int i10) {
            if (h(i10)) {
                this.f32033c.add(d.f32028a.c()[i10]);
                return;
            }
            int c10 = c(i10 - d.f32028a.c().length);
            if (c10 >= 0) {
                c[] cVarArr = this.f32035e;
                if (c10 < cVarArr.length) {
                    List<c> list = this.f32033c;
                    c cVar = cVarArr[c10];
                    kotlin.jvm.internal.n.b(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException(kotlin.jvm.internal.n.k("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        private final void o() {
            g(-1, new c(d.f32028a.a(j()), j()));
        }

        private final void p(int i10) {
            this.f32033c.add(new c(f(i10), j()));
        }

        private final void q() {
            this.f32033c.add(new c(d.f32028a.a(j()), j()));
        }

        public final List<c> e() {
            List<c> f02;
            f02 = z.f0(this.f32033c);
            this.f32033c.clear();
            return f02;
        }

        public final dm.e j() {
            int i10 = i();
            boolean z10 = (i10 & RecognitionOptions.ITF) == 128;
            long m10 = m(i10, 127);
            if (!z10) {
                return this.f32034d.w0(m10);
            }
            dm.b bVar = new dm.b();
            k.f32196a.b(this.f32034d, m10, bVar);
            return bVar.I();
        }

        public final void k() {
            while (!this.f32034d.G0()) {
                int d10 = rl.d.d(this.f32034d.readByte(), 255);
                if (d10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((d10 & RecognitionOptions.ITF) == 128) {
                    l(m(d10, 127) - 1);
                } else if (d10 == 64) {
                    o();
                } else if ((d10 & 64) == 64) {
                    n(m(d10, 63) - 1);
                } else if ((d10 & 32) == 32) {
                    int m10 = m(d10, 31);
                    this.f32032b = m10;
                    if (m10 < 0 || m10 > this.f32031a) {
                        throw new IOException(kotlin.jvm.internal.n.k("Invalid dynamic table size update ", Integer.valueOf(this.f32032b)));
                    }
                    a();
                } else if (d10 == 16 || d10 == 0) {
                    q();
                } else {
                    p(m(d10, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & RecognitionOptions.ITF) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f32039a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f32040b;

        /* renamed from: c, reason: collision with root package name */
        private final dm.b f32041c;

        /* renamed from: d, reason: collision with root package name */
        private int f32042d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f32043e;

        /* renamed from: f, reason: collision with root package name */
        public int f32044f;

        /* renamed from: g, reason: collision with root package name */
        public c[] f32045g;

        /* renamed from: h, reason: collision with root package name */
        private int f32046h;

        /* renamed from: i, reason: collision with root package name */
        public int f32047i;

        /* renamed from: j, reason: collision with root package name */
        public int f32048j;

        public b(int i10, boolean z10, dm.b out) {
            kotlin.jvm.internal.n.e(out, "out");
            this.f32039a = i10;
            this.f32040b = z10;
            this.f32041c = out;
            this.f32042d = a.e.API_PRIORITY_OTHER;
            this.f32044f = i10;
            this.f32045g = new c[8];
            this.f32046h = r2.length - 1;
        }

        public /* synthetic */ b(int i10, boolean z10, dm.b bVar, int i11, kotlin.jvm.internal.g gVar) {
            this((i11 & 1) != 0 ? RecognitionOptions.AZTEC : i10, (i11 & 2) != 0 ? true : z10, bVar);
        }

        private final void a() {
            int i10 = this.f32044f;
            int i11 = this.f32048j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            dk.l.l(this.f32045g, null, 0, 0, 6, null);
            this.f32046h = this.f32045g.length - 1;
            this.f32047i = 0;
            this.f32048j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f32045g.length;
                while (true) {
                    length--;
                    i11 = this.f32046h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f32045g[length];
                    kotlin.jvm.internal.n.b(cVar);
                    i10 -= cVar.f32027c;
                    int i13 = this.f32048j;
                    c cVar2 = this.f32045g[length];
                    kotlin.jvm.internal.n.b(cVar2);
                    this.f32048j = i13 - cVar2.f32027c;
                    this.f32047i--;
                    i12++;
                }
                c[] cVarArr = this.f32045g;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f32047i);
                c[] cVarArr2 = this.f32045g;
                int i14 = this.f32046h;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f32046h += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f32027c;
            int i11 = this.f32044f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f32048j + i10) - i11);
            int i12 = this.f32047i + 1;
            c[] cVarArr = this.f32045g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f32046h = this.f32045g.length - 1;
                this.f32045g = cVarArr2;
            }
            int i13 = this.f32046h;
            this.f32046h = i13 - 1;
            this.f32045g[i13] = cVar;
            this.f32047i++;
            this.f32048j += i10;
        }

        public final void e(int i10) {
            this.f32039a = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f32044f;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f32042d = Math.min(this.f32042d, min);
            }
            this.f32043e = true;
            this.f32044f = min;
            a();
        }

        public final void f(dm.e data) {
            int B;
            int i10;
            kotlin.jvm.internal.n.e(data, "data");
            if (this.f32040b) {
                k kVar = k.f32196a;
                if (kVar.d(data) < data.B()) {
                    dm.b bVar = new dm.b();
                    kVar.c(data, bVar);
                    data = bVar.I();
                    B = data.B();
                    i10 = RecognitionOptions.ITF;
                    h(B, 127, i10);
                    this.f32041c.b0(data);
                }
            }
            B = data.B();
            i10 = 0;
            h(B, 127, i10);
            this.f32041c.b0(data);
        }

        public final void g(List<c> headerBlock) {
            int i10;
            int i11;
            kotlin.jvm.internal.n.e(headerBlock, "headerBlock");
            if (this.f32043e) {
                int i12 = this.f32042d;
                if (i12 < this.f32044f) {
                    h(i12, 31, 32);
                }
                this.f32043e = false;
                this.f32042d = a.e.API_PRIORITY_OTHER;
                h(this.f32044f, 31, 32);
            }
            int size = headerBlock.size();
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                c cVar = headerBlock.get(i13);
                dm.e D = cVar.f32025a.D();
                dm.e eVar = cVar.f32026b;
                d dVar = d.f32028a;
                Integer num = dVar.b().get(D);
                if (num != null) {
                    i11 = num.intValue() + 1;
                    if (2 <= i11 && i11 < 8) {
                        if (kotlin.jvm.internal.n.a(dVar.c()[i11 - 1].f32026b, eVar)) {
                            i10 = i11;
                        } else if (kotlin.jvm.internal.n.a(dVar.c()[i11].f32026b, eVar)) {
                            i11++;
                            i10 = i11;
                        }
                    }
                    i10 = i11;
                    i11 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i11 == -1) {
                    int i15 = this.f32046h + 1;
                    int length = this.f32045g.length;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        }
                        int i16 = i15 + 1;
                        c cVar2 = this.f32045g[i15];
                        kotlin.jvm.internal.n.b(cVar2);
                        if (kotlin.jvm.internal.n.a(cVar2.f32025a, D)) {
                            c cVar3 = this.f32045g[i15];
                            kotlin.jvm.internal.n.b(cVar3);
                            if (kotlin.jvm.internal.n.a(cVar3.f32026b, eVar)) {
                                i11 = d.f32028a.c().length + (i15 - this.f32046h);
                                break;
                            } else if (i10 == -1) {
                                i10 = d.f32028a.c().length + (i15 - this.f32046h);
                            }
                        }
                        i15 = i16;
                    }
                }
                if (i11 != -1) {
                    h(i11, 127, RecognitionOptions.ITF);
                } else {
                    if (i10 == -1) {
                        this.f32041c.writeByte(64);
                        f(D);
                    } else if (!D.C(c.f32019e) || kotlin.jvm.internal.n.a(c.f32024j, D)) {
                        h(i10, 63, 64);
                    } else {
                        h(i10, 15, 0);
                        f(eVar);
                    }
                    f(eVar);
                    d(cVar);
                }
                i13 = i14;
            }
        }

        public final void h(int i10, int i11, int i12) {
            int i13;
            dm.b bVar;
            if (i10 < i11) {
                bVar = this.f32041c;
                i13 = i10 | i12;
            } else {
                this.f32041c.writeByte(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f32041c.writeByte(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                bVar = this.f32041c;
            }
            bVar.writeByte(i13);
        }
    }

    static {
        d dVar = new d();
        f32028a = dVar;
        dm.e eVar = c.f32021g;
        dm.e eVar2 = c.f32022h;
        dm.e eVar3 = c.f32023i;
        dm.e eVar4 = c.f32020f;
        f32029b = new c[]{new c(c.f32024j, ""), new c(eVar, "GET"), new c(eVar, "POST"), new c(eVar2, "/"), new c(eVar2, "/index.html"), new c(eVar3, "http"), new c(eVar3, "https"), new c(eVar4, "200"), new c(eVar4, "204"), new c(eVar4, "206"), new c(eVar4, "304"), new c(eVar4, "400"), new c(eVar4, "404"), new c(eVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f32030c = dVar.d();
    }

    private d() {
    }

    private final Map<dm.e, Integer> d() {
        c[] cVarArr = f32029b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            c[] cVarArr2 = f32029b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f32025a)) {
                linkedHashMap.put(cVarArr2[i10].f32025a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<dm.e, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.n.d(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final dm.e a(dm.e name) {
        kotlin.jvm.internal.n.e(name, "name");
        int B = name.B();
        int i10 = 0;
        while (i10 < B) {
            int i11 = i10 + 1;
            byte m10 = name.m(i10);
            if (65 <= m10 && m10 <= 90) {
                throw new IOException(kotlin.jvm.internal.n.k("PROTOCOL_ERROR response malformed: mixed case name: ", name.F()));
            }
            i10 = i11;
        }
        return name;
    }

    public final Map<dm.e, Integer> b() {
        return f32030c;
    }

    public final c[] c() {
        return f32029b;
    }
}
