package xi;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import dm.l;
import dm.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final dm.e f31327a = dm.e.l(":");

    /* renamed from: b, reason: collision with root package name */
    private static final d[] f31328b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<dm.e, Integer> f31329c;

    /* loaded from: classes3.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f31330a;

        /* renamed from: b, reason: collision with root package name */
        private final dm.d f31331b;

        /* renamed from: c, reason: collision with root package name */
        private int f31332c;

        /* renamed from: d, reason: collision with root package name */
        private int f31333d;

        /* renamed from: e, reason: collision with root package name */
        d[] f31334e;

        /* renamed from: f, reason: collision with root package name */
        int f31335f;

        /* renamed from: g, reason: collision with root package name */
        int f31336g;

        /* renamed from: h, reason: collision with root package name */
        int f31337h;

        a(int i10, int i11, x xVar) {
            this.f31330a = new ArrayList();
            this.f31334e = new d[8];
            this.f31335f = r0.length - 1;
            this.f31336g = 0;
            this.f31337h = 0;
            this.f31332c = i10;
            this.f31333d = i11;
            this.f31331b = l.b(xVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, x xVar) {
            this(i10, i10, xVar);
        }

        private void a() {
            int i10 = this.f31333d;
            int i11 = this.f31337h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f31334e, (Object) null);
            this.f31335f = this.f31334e.length - 1;
            this.f31336g = 0;
            this.f31337h = 0;
        }

        private int c(int i10) {
            return this.f31335f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f31334e.length;
                while (true) {
                    length--;
                    i11 = this.f31335f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f31334e[length].f31326c;
                    i10 -= i13;
                    this.f31337h -= i13;
                    this.f31336g--;
                    i12++;
                }
                d[] dVarArr = this.f31334e;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f31336g);
                this.f31335f += i12;
            }
            return i12;
        }

        private dm.e f(int i10) {
            d dVar;
            if (!i(i10)) {
                int c10 = c(i10 - f.f31328b.length);
                if (c10 >= 0) {
                    d[] dVarArr = this.f31334e;
                    if (c10 < dVarArr.length) {
                        dVar = dVarArr[c10];
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            dVar = f.f31328b[i10];
            return dVar.f31324a;
        }

        private void h(int i10, d dVar) {
            this.f31330a.add(dVar);
            int i11 = dVar.f31326c;
            if (i10 != -1) {
                i11 -= this.f31334e[c(i10)].f31326c;
            }
            int i12 = this.f31333d;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f31337h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f31336g + 1;
                d[] dVarArr = this.f31334e;
                if (i13 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f31335f = this.f31334e.length - 1;
                    this.f31334e = dVarArr2;
                }
                int i14 = this.f31335f;
                this.f31335f = i14 - 1;
                this.f31334e[i14] = dVar;
                this.f31336g++;
            } else {
                this.f31334e[i10 + c(i10) + d10] = dVar;
            }
            this.f31337h += i11;
        }

        private boolean i(int i10) {
            return i10 >= 0 && i10 <= f.f31328b.length - 1;
        }

        private int j() {
            return this.f31331b.readByte() & 255;
        }

        private void m(int i10) {
            if (i(i10)) {
                this.f31330a.add(f.f31328b[i10]);
                return;
            }
            int c10 = c(i10 - f.f31328b.length);
            if (c10 >= 0) {
                d[] dVarArr = this.f31334e;
                if (c10 <= dVarArr.length - 1) {
                    this.f31330a.add(dVarArr[c10]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void o(int i10) {
            h(-1, new d(f(i10), k()));
        }

        private void p() {
            h(-1, new d(f.e(k()), k()));
        }

        private void q(int i10) {
            this.f31330a.add(new d(f(i10), k()));
        }

        private void r() {
            this.f31330a.add(new d(f.e(k()), k()));
        }

        public List<d> e() {
            ArrayList arrayList = new ArrayList(this.f31330a);
            this.f31330a.clear();
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void g(int i10) {
            this.f31332c = i10;
            this.f31333d = i10;
            a();
        }

        dm.e k() {
            int j10 = j();
            boolean z10 = (j10 & RecognitionOptions.ITF) == 128;
            int n10 = n(j10, 127);
            return z10 ? dm.e.u(h.f().c(this.f31331b.g0(n10))) : this.f31331b.w0(n10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void l() {
            while (!this.f31331b.G0()) {
                int readByte = this.f31331b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & RecognitionOptions.ITF) == 128) {
                    m(n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    p();
                } else if ((readByte & 64) == 64) {
                    o(n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n10 = n(readByte, 31);
                    this.f31333d = n10;
                    if (n10 < 0 || n10 > this.f31332c) {
                        throw new IOException("Invalid dynamic table size update " + this.f31333d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    r();
                } else {
                    q(n(readByte, 15) - 1);
                }
            }
        }

        int n(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int j10 = j();
                if ((j10 & RecognitionOptions.ITF) == 0) {
                    return i11 + (j10 << i13);
                }
                i11 += (j10 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final dm.b f31338a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31339b;

        /* renamed from: c, reason: collision with root package name */
        int f31340c;

        /* renamed from: d, reason: collision with root package name */
        private int f31341d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f31342e;

        /* renamed from: f, reason: collision with root package name */
        private int f31343f;

        /* renamed from: g, reason: collision with root package name */
        d[] f31344g;

        /* renamed from: h, reason: collision with root package name */
        int f31345h;

        /* renamed from: i, reason: collision with root package name */
        private int f31346i;

        /* renamed from: j, reason: collision with root package name */
        private int f31347j;

        b(int i10, boolean z10, dm.b bVar) {
            this.f31341d = a.e.API_PRIORITY_OTHER;
            this.f31344g = new d[8];
            this.f31346i = r0.length - 1;
            this.f31340c = i10;
            this.f31343f = i10;
            this.f31339b = z10;
            this.f31338a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(dm.b bVar) {
            this(RecognitionOptions.AZTEC, false, bVar);
        }

        private void a() {
            Arrays.fill(this.f31344g, (Object) null);
            this.f31346i = this.f31344g.length - 1;
            this.f31345h = 0;
            this.f31347j = 0;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f31344g.length;
                while (true) {
                    length--;
                    i11 = this.f31346i;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f31344g[length].f31326c;
                    i10 -= i13;
                    this.f31347j -= i13;
                    this.f31345h--;
                    i12++;
                }
                d[] dVarArr = this.f31344g;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f31345h);
                this.f31346i += i12;
            }
            return i12;
        }

        private void c(d dVar) {
            int i10 = dVar.f31326c;
            int i11 = this.f31343f;
            if (i10 > i11) {
                a();
                return;
            }
            b((this.f31347j + i10) - i11);
            int i12 = this.f31345h + 1;
            d[] dVarArr = this.f31344g;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f31346i = this.f31344g.length - 1;
                this.f31344g = dVarArr2;
            }
            int i13 = this.f31346i;
            this.f31346i = i13 - 1;
            this.f31344g[i13] = dVar;
            this.f31345h++;
            this.f31347j += i10;
        }

        void d(dm.e eVar) {
            int B;
            int i10;
            if (!this.f31339b || h.f().e(eVar.E()) >= eVar.B()) {
                B = eVar.B();
                i10 = 0;
            } else {
                dm.b bVar = new dm.b();
                h.f().d(eVar.E(), bVar.E());
                eVar = bVar.I();
                B = eVar.B();
                i10 = RecognitionOptions.ITF;
            }
            f(B, 127, i10);
            this.f31338a.b0(eVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(java.util.List<xi.d> r14) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: xi.f.b.e(java.util.List):void");
        }

        void f(int i10, int i11, int i12) {
            int i13;
            dm.b bVar;
            if (i10 < i11) {
                bVar = this.f31338a;
                i13 = i10 | i12;
            } else {
                this.f31338a.writeByte(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f31338a.writeByte(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                bVar = this.f31338a;
            }
            bVar.writeByte(i13);
        }
    }

    static {
        dm.e eVar = d.f31318e;
        dm.e eVar2 = d.f31319f;
        dm.e eVar3 = d.f31320g;
        dm.e eVar4 = d.f31317d;
        f31328b = new d[]{new d(d.f31321h, ""), new d(eVar, "GET"), new d(eVar, "POST"), new d(eVar2, "/"), new d(eVar2, "/index.html"), new d(eVar3, "http"), new d(eVar3, "https"), new d(eVar4, "200"), new d(eVar4, "204"), new d(eVar4, "206"), new d(eVar4, "304"), new d(eVar4, "400"), new d(eVar4, "404"), new d(eVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f31329c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dm.e e(dm.e eVar) {
        int B = eVar.B();
        for (int i10 = 0; i10 < B; i10++) {
            byte m10 = eVar.m(i10);
            if (m10 >= 65 && m10 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + eVar.F());
            }
        }
        return eVar;
    }

    private static Map<dm.e, Integer> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f31328b.length);
        int i10 = 0;
        while (true) {
            d[] dVarArr = f31328b;
            if (i10 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i10].f31324a)) {
                linkedHashMap.put(dVarArr[i10].f31324a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
