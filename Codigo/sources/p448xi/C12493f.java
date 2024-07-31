package p448xi;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import dm.C7056b;
import dm.C7061e;
import dm.C7068l;
import dm.InterfaceC7060d;
import dm.InterfaceC7080x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xi.f */
/* loaded from: classes3.dex */
public final class C12493f {

    /* renamed from: a */
    private static final C7061e f33847a = C7061e.m20753l(":");

    /* renamed from: b */
    private static final C12491d[] f33848b;

    /* renamed from: c */
    private static final Map<C7061e, Integer> f33849c;

    /* renamed from: xi.f$a */
    /* loaded from: classes3.dex */
    static final class a {

        /* renamed from: a */
        private final List<C12491d> f33850a;

        /* renamed from: b */
        private final InterfaceC7060d f33851b;

        /* renamed from: c */
        private int f33852c;

        /* renamed from: d */
        private int f33853d;

        /* renamed from: e */
        C12491d[] f33854e;

        /* renamed from: f */
        int f33855f;

        /* renamed from: g */
        int f33856g;

        /* renamed from: h */
        int f33857h;

        a(int i10, int i11, InterfaceC7080x interfaceC7080x) {
            this.f33850a = new ArrayList();
            this.f33854e = new C12491d[8];
            this.f33855f = r0.length - 1;
            this.f33856g = 0;
            this.f33857h = 0;
            this.f33852c = i10;
            this.f33853d = i11;
            this.f33851b = C7068l.m20803b(interfaceC7080x);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, InterfaceC7080x interfaceC7080x) {
            this(i10, i10, interfaceC7080x);
        }

        /* renamed from: a */
        private void m40850a() {
            int i10 = this.f33853d;
            int i11 = this.f33857h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m40851b();
                } else {
                    m40853d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        private void m40851b() {
            Arrays.fill(this.f33854e, (Object) null);
            this.f33855f = this.f33854e.length - 1;
            this.f33856g = 0;
            this.f33857h = 0;
        }

        /* renamed from: c */
        private int m40852c(int i10) {
            return this.f33855f + 1 + i10;
        }

        /* renamed from: d */
        private int m40853d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33854e.length;
                while (true) {
                    length--;
                    i11 = this.f33855f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f33854e[length].f33846c;
                    i10 -= i13;
                    this.f33857h -= i13;
                    this.f33856g--;
                    i12++;
                }
                C12491d[] c12491dArr = this.f33854e;
                System.arraycopy(c12491dArr, i11 + 1, c12491dArr, i11 + 1 + i12, this.f33856g);
                this.f33855f += i12;
            }
            return i12;
        }

        /* renamed from: f */
        private C7061e m40854f(int i10) {
            C12491d c12491d;
            if (!m40856i(i10)) {
                int m40852c = m40852c(i10 - C12493f.f33848b.length);
                if (m40852c >= 0) {
                    C12491d[] c12491dArr = this.f33854e;
                    if (m40852c < c12491dArr.length) {
                        c12491d = c12491dArr[m40852c];
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            c12491d = C12493f.f33848b[i10];
            return c12491d.f33844a;
        }

        /* renamed from: h */
        private void m40855h(int i10, C12491d c12491d) {
            this.f33850a.add(c12491d);
            int i11 = c12491d.f33846c;
            if (i10 != -1) {
                i11 -= this.f33854e[m40852c(i10)].f33846c;
            }
            int i12 = this.f33853d;
            if (i11 > i12) {
                m40851b();
                return;
            }
            int m40853d = m40853d((this.f33857h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f33856g + 1;
                C12491d[] c12491dArr = this.f33854e;
                if (i13 > c12491dArr.length) {
                    C12491d[] c12491dArr2 = new C12491d[c12491dArr.length * 2];
                    System.arraycopy(c12491dArr, 0, c12491dArr2, c12491dArr.length, c12491dArr.length);
                    this.f33855f = this.f33854e.length - 1;
                    this.f33854e = c12491dArr2;
                }
                int i14 = this.f33855f;
                this.f33855f = i14 - 1;
                this.f33854e[i14] = c12491d;
                this.f33856g++;
            } else {
                this.f33854e[i10 + m40852c(i10) + m40853d] = c12491d;
            }
            this.f33857h += i11;
        }

        /* renamed from: i */
        private boolean m40856i(int i10) {
            return i10 >= 0 && i10 <= C12493f.f33848b.length - 1;
        }

        /* renamed from: j */
        private int m40857j() {
            return this.f33851b.readByte() & 255;
        }

        /* renamed from: m */
        private void m40858m(int i10) {
            if (m40856i(i10)) {
                this.f33850a.add(C12493f.f33848b[i10]);
                return;
            }
            int m40852c = m40852c(i10 - C12493f.f33848b.length);
            if (m40852c >= 0) {
                C12491d[] c12491dArr = this.f33854e;
                if (m40852c <= c12491dArr.length - 1) {
                    this.f33850a.add(c12491dArr[m40852c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: o */
        private void m40859o(int i10) {
            m40855h(-1, new C12491d(m40854f(i10), m40865k()));
        }

        /* renamed from: p */
        private void m40860p() {
            m40855h(-1, new C12491d(C12493f.m40848e(m40865k()), m40865k()));
        }

        /* renamed from: q */
        private void m40861q(int i10) {
            this.f33850a.add(new C12491d(m40854f(i10), m40865k()));
        }

        /* renamed from: r */
        private void m40862r() {
            this.f33850a.add(new C12491d(C12493f.m40848e(m40865k()), m40865k()));
        }

        /* renamed from: e */
        public List<C12491d> m40863e() {
            ArrayList arrayList = new ArrayList(this.f33850a);
            this.f33850a.clear();
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public void m40864g(int i10) {
            this.f33852c = i10;
            this.f33853d = i10;
            m40850a();
        }

        /* renamed from: k */
        C7061e m40865k() {
            int m40857j = m40857j();
            boolean z10 = (m40857j & RecognitionOptions.ITF) == 128;
            int m40867n = m40867n(m40857j, 127);
            return z10 ? C7061e.m20754u(C12495h.m40908f().m40909c(this.f33851b.mo20722g0(m40867n))) : this.f33851b.mo20739w0(m40867n);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l */
        public void m40866l() {
            while (!this.f33851b.mo20695G0()) {
                int readByte = this.f33851b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & RecognitionOptions.ITF) == 128) {
                    m40858m(m40867n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m40860p();
                } else if ((readByte & 64) == 64) {
                    m40859o(m40867n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m40867n = m40867n(readByte, 31);
                    this.f33853d = m40867n;
                    if (m40867n < 0 || m40867n > this.f33852c) {
                        throw new IOException("Invalid dynamic table size update " + this.f33853d);
                    }
                    m40850a();
                } else if (readByte == 16 || readByte == 0) {
                    m40862r();
                } else {
                    m40861q(m40867n(readByte, 15) - 1);
                }
            }
        }

        /* renamed from: n */
        int m40867n(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int m40857j = m40857j();
                if ((m40857j & RecognitionOptions.ITF) == 0) {
                    return i11 + (m40857j << i13);
                }
                i11 += (m40857j & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* renamed from: xi.f$b */
    /* loaded from: classes3.dex */
    static final class b {

        /* renamed from: a */
        private final C7056b f33858a;

        /* renamed from: b */
        private boolean f33859b;

        /* renamed from: c */
        int f33860c;

        /* renamed from: d */
        private int f33861d;

        /* renamed from: e */
        private boolean f33862e;

        /* renamed from: f */
        private int f33863f;

        /* renamed from: g */
        C12491d[] f33864g;

        /* renamed from: h */
        int f33865h;

        /* renamed from: i */
        private int f33866i;

        /* renamed from: j */
        private int f33867j;

        b(int i10, boolean z10, C7056b c7056b) {
            this.f33861d = C5101a.e.API_PRIORITY_OTHER;
            this.f33864g = new C12491d[8];
            this.f33866i = r0.length - 1;
            this.f33860c = i10;
            this.f33863f = i10;
            this.f33859b = z10;
            this.f33858a = c7056b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C7056b c7056b) {
            this(RecognitionOptions.AZTEC, false, c7056b);
        }

        /* renamed from: a */
        private void m40868a() {
            Arrays.fill(this.f33864g, (Object) null);
            this.f33866i = this.f33864g.length - 1;
            this.f33865h = 0;
            this.f33867j = 0;
        }

        /* renamed from: b */
        private int m40869b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33864g.length;
                while (true) {
                    length--;
                    i11 = this.f33866i;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f33864g[length].f33846c;
                    i10 -= i13;
                    this.f33867j -= i13;
                    this.f33865h--;
                    i12++;
                }
                C12491d[] c12491dArr = this.f33864g;
                System.arraycopy(c12491dArr, i11 + 1, c12491dArr, i11 + 1 + i12, this.f33865h);
                this.f33866i += i12;
            }
            return i12;
        }

        /* renamed from: c */
        private void m40870c(C12491d c12491d) {
            int i10 = c12491d.f33846c;
            int i11 = this.f33863f;
            if (i10 > i11) {
                m40868a();
                return;
            }
            m40869b((this.f33867j + i10) - i11);
            int i12 = this.f33865h + 1;
            C12491d[] c12491dArr = this.f33864g;
            if (i12 > c12491dArr.length) {
                C12491d[] c12491dArr2 = new C12491d[c12491dArr.length * 2];
                System.arraycopy(c12491dArr, 0, c12491dArr2, c12491dArr.length, c12491dArr.length);
                this.f33866i = this.f33864g.length - 1;
                this.f33864g = c12491dArr2;
            }
            int i13 = this.f33866i;
            this.f33866i = i13 - 1;
            this.f33864g[i13] = c12491d;
            this.f33865h++;
            this.f33867j += i10;
        }

        /* renamed from: d */
        void m40871d(C7061e c7061e) {
            int m20756B;
            int i10;
            if (!this.f33859b || C12495h.m40908f().m40911e(c7061e.mo20759E()) >= c7061e.m20756B()) {
                m20756B = c7061e.m20756B();
                i10 = 0;
            } else {
                C7056b c7056b = new C7056b();
                C12495h.m40908f().m40910d(c7061e.mo20759E(), c7056b.m20692E());
                c7061e = c7056b.m20697I();
                m20756B = c7061e.m20756B();
                i10 = RecognitionOptions.ITF;
            }
            m40873f(m20756B, 127, i10);
            this.f33858a.mo20715b0(c7061e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m40872e(java.util.List<p448xi.C12491d> r14) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p448xi.C12493f.b.m40872e(java.util.List):void");
        }

        /* renamed from: f */
        void m40873f(int i10, int i11, int i12) {
            int i13;
            C7056b c7056b;
            if (i10 < i11) {
                c7056b = this.f33858a;
                i13 = i10 | i12;
            } else {
                this.f33858a.writeByte(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f33858a.writeByte(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                c7056b = this.f33858a;
            }
            c7056b.writeByte(i13);
        }
    }

    static {
        C7061e c7061e = C12491d.f33838e;
        C7061e c7061e2 = C12491d.f33839f;
        C7061e c7061e3 = C12491d.f33840g;
        C7061e c7061e4 = C12491d.f33837d;
        f33848b = new C12491d[]{new C12491d(C12491d.f33841h, ""), new C12491d(c7061e, "GET"), new C12491d(c7061e, "POST"), new C12491d(c7061e2, "/"), new C12491d(c7061e2, "/index.html"), new C12491d(c7061e3, "http"), new C12491d(c7061e3, "https"), new C12491d(c7061e4, "200"), new C12491d(c7061e4, "204"), new C12491d(c7061e4, "206"), new C12491d(c7061e4, "304"), new C12491d(c7061e4, "400"), new C12491d(c7061e4, "404"), new C12491d(c7061e4, "500"), new C12491d("accept-charset", ""), new C12491d("accept-encoding", "gzip, deflate"), new C12491d("accept-language", ""), new C12491d("accept-ranges", ""), new C12491d("accept", ""), new C12491d("access-control-allow-origin", ""), new C12491d("age", ""), new C12491d("allow", ""), new C12491d("authorization", ""), new C12491d("cache-control", ""), new C12491d("content-disposition", ""), new C12491d("content-encoding", ""), new C12491d("content-language", ""), new C12491d("content-length", ""), new C12491d("content-location", ""), new C12491d("content-range", ""), new C12491d("content-type", ""), new C12491d("cookie", ""), new C12491d("date", ""), new C12491d("etag", ""), new C12491d("expect", ""), new C12491d("expires", ""), new C12491d("from", ""), new C12491d(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new C12491d("if-match", ""), new C12491d("if-modified-since", ""), new C12491d("if-none-match", ""), new C12491d("if-range", ""), new C12491d("if-unmodified-since", ""), new C12491d("last-modified", ""), new C12491d("link", ""), new C12491d("location", ""), new C12491d("max-forwards", ""), new C12491d("proxy-authenticate", ""), new C12491d("proxy-authorization", ""), new C12491d("range", ""), new C12491d("referer", ""), new C12491d("refresh", ""), new C12491d("retry-after", ""), new C12491d("server", ""), new C12491d("set-cookie", ""), new C12491d("strict-transport-security", ""), new C12491d("transfer-encoding", ""), new C12491d("user-agent", ""), new C12491d("vary", ""), new C12491d("via", ""), new C12491d("www-authenticate", "")};
        f33849c = m40849f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static C7061e m40848e(C7061e c7061e) {
        int m20756B = c7061e.m20756B();
        for (int i10 = 0; i10 < m20756B; i10++) {
            byte m20765m = c7061e.m20765m(i10);
            if (m20765m >= 65 && m20765m <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c7061e.m20760F());
            }
        }
        return c7061e;
    }

    /* renamed from: f */
    private static Map<C7061e, Integer> m40849f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f33848b.length);
        int i10 = 0;
        while (true) {
            C12491d[] c12491dArr = f33848b;
            if (i10 >= c12491dArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c12491dArr[i10].f33844a)) {
                linkedHashMap.put(c12491dArr[i10].f33844a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
