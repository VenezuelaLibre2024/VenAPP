package a8;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b8.g;
import com.google.common.collect.e0;
import com.google.common.collect.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s8.m0;
import s8.n;
import t6.u1;
import t6.u3;
import t8.p0;
import t8.r0;
import u6.m3;
import v7.d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private final h f128a;

    /* renamed from: b */
    private final s8.j f129b;

    /* renamed from: c */
    private final s8.j f130c;

    /* renamed from: d */
    private final s f131d;

    /* renamed from: e */
    private final Uri[] f132e;

    /* renamed from: f */
    private final u1[] f133f;

    /* renamed from: g */
    private final b8.l f134g;

    /* renamed from: h */
    private final d1 f135h;

    /* renamed from: i */
    private final List<u1> f136i;

    /* renamed from: k */
    private final m3 f138k;

    /* renamed from: l */
    private boolean f139l;

    /* renamed from: n */
    private IOException f141n;

    /* renamed from: o */
    private Uri f142o;

    /* renamed from: p */
    private boolean f143p;

    /* renamed from: q */
    private q8.r f144q;

    /* renamed from: s */
    private boolean f146s;

    /* renamed from: j */
    private final a8.e f137j = new a8.e(4);

    /* renamed from: m */
    private byte[] f140m = r0.f26749f;

    /* renamed from: r */
    private long f145r = -9223372036854775807L;

    /* loaded from: classes.dex */
    public static final class a extends x7.l {

        /* renamed from: l */
        private byte[] f147l;

        public a(s8.j jVar, s8.n nVar, u1 u1Var, int i10, Object obj, byte[] bArr) {
            super(jVar, nVar, 3, u1Var, i10, obj, bArr);
        }

        @Override // x7.l
        protected void g(byte[] bArr, int i10) {
            this.f147l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f147l;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public x7.f f148a;

        /* renamed from: b */
        public boolean f149b;

        /* renamed from: c */
        public Uri f150c;

        public b() {
            a();
        }

        public void a() {
            this.f148a = null;
            this.f149b = false;
            this.f150c = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends x7.b {

        /* renamed from: e */
        private final List<g.e> f151e;

        /* renamed from: f */
        private final long f152f;

        /* renamed from: g */
        private final String f153g;

        public c(String str, long j10, List<g.e> list) {
            super(0L, list.size() - 1);
            this.f153g = str;
            this.f152f = j10;
            this.f151e = list;
        }

        @Override // x7.o
        public long a() {
            c();
            return this.f152f + this.f151e.get((int) d()).f6246e;
        }

        @Override // x7.o
        public long b() {
            c();
            g.e eVar = this.f151e.get((int) d());
            return this.f152f + eVar.f6246e + eVar.f6244c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends q8.c {

        /* renamed from: h */
        private int f154h;

        public d(d1 d1Var, int[] iArr) {
            super(d1Var, iArr);
            this.f154h = e(d1Var.d(iArr[0]));
        }

        @Override // q8.r
        public void g(long j10, long j11, long j12, List<? extends x7.n> list, x7.o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j(this.f154h, elapsedRealtime)) {
                for (int i10 = this.f23632b - 1; i10 >= 0; i10--) {
                    if (!j(i10, elapsedRealtime)) {
                        this.f154h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // q8.r
        public int h() {
            return this.f154h;
        }

        @Override // q8.r
        public Object m() {
            return null;
        }

        @Override // q8.r
        public int t() {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final g.e f155a;

        /* renamed from: b */
        public final long f156b;

        /* renamed from: c */
        public final int f157c;

        /* renamed from: d */
        public final boolean f158d;

        public e(g.e eVar, long j10, int i10) {
            this.f155a = eVar;
            this.f156b = j10;
            this.f157c = i10;
            this.f158d = (eVar instanceof g.b) && ((g.b) eVar).f6236x;
        }
    }

    public f(h hVar, b8.l lVar, Uri[] uriArr, u1[] u1VarArr, g gVar, m0 m0Var, s sVar, List<u1> list, m3 m3Var) {
        this.f128a = hVar;
        this.f134g = lVar;
        this.f132e = uriArr;
        this.f133f = u1VarArr;
        this.f131d = sVar;
        this.f136i = list;
        this.f138k = m3Var;
        s8.j a10 = gVar.a(1);
        this.f129b = a10;
        if (m0Var != null) {
            a10.l(m0Var);
        }
        this.f130c = gVar.a(3);
        this.f135h = new d1(u1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((u1VarArr[i10].f26510e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f144q = new d(this.f135h, hb.e.l(arrayList));
    }

    private static Uri d(b8.g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f6248r) == null) {
            return null;
        }
        return p0.e(gVar.f6279a, str);
    }

    private Pair<Long, Integer> f(i iVar, boolean z10, b8.g gVar, long j10, long j11) {
        if (iVar != null && !z10) {
            if (!iVar.h()) {
                return new Pair<>(Long.valueOf(iVar.f30644j), Integer.valueOf(iVar.f164o));
            }
            Long valueOf = Long.valueOf(iVar.f164o == -1 ? iVar.g() : iVar.f30644j);
            int i10 = iVar.f164o;
            return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = gVar.f6233u + j10;
        if (iVar != null && !this.f143p) {
            j11 = iVar.f30607g;
        }
        if (!gVar.f6227o && j11 >= j12) {
            return new Pair<>(Long.valueOf(gVar.f6223k + gVar.f6230r.size()), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int f10 = r0.f(gVar.f6230r, Long.valueOf(j13), true, !this.f134g.j() || iVar == null);
        long j14 = f10 + gVar.f6223k;
        if (f10 >= 0) {
            g.d dVar = gVar.f6230r.get(f10);
            List<g.b> list = j13 < dVar.f6246e + dVar.f6244c ? dVar.f6241x : gVar.f6231s;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                g.b bVar = list.get(i11);
                if (j13 >= bVar.f6246e + bVar.f6244c) {
                    i11++;
                } else if (bVar.f6235w) {
                    j14 += list == gVar.f6231s ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(r1));
    }

    private static e g(b8.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f6223k);
        if (i11 == gVar.f6230r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f6231s.size()) {
                return new e(gVar.f6231s.get(i10), j10, i10);
            }
            return null;
        }
        g.d dVar = gVar.f6230r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f6241x.size()) {
            return new e(dVar.f6241x.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f6230r.size()) {
            return new e(gVar.f6230r.get(i12), j10 + 1, -1);
        }
        if (gVar.f6231s.isEmpty()) {
            return null;
        }
        return new e(gVar.f6231s.get(0), j10 + 1, 0);
    }

    static List<g.e> i(b8.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f6223k);
        if (i11 < 0 || gVar.f6230r.size() < i11) {
            return w.v();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < gVar.f6230r.size()) {
            if (i10 != -1) {
                g.d dVar = gVar.f6230r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f6241x.size()) {
                    List<g.b> list = dVar.f6241x;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<g.d> list2 = gVar.f6230r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (gVar.f6226n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < gVar.f6231s.size()) {
                List<g.b> list3 = gVar.f6231s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private x7.f l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f137j.c(uri);
        if (c10 != null) {
            this.f137j.b(uri, c10);
            return null;
        }
        return new a(this.f130c, new n.b().i(uri).b(1).a(), this.f133f[i10], this.f144q.t(), this.f144q.m(), this.f140m);
    }

    private long s(long j10) {
        long j11 = this.f145r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void w(b8.g gVar) {
        this.f145r = gVar.f6227o ? -9223372036854775807L : gVar.e() - this.f134g.c();
    }

    public x7.o[] a(i iVar, long j10) {
        int i10;
        int e10 = iVar == null ? -1 : this.f135h.e(iVar.f30604d);
        int length = this.f144q.length();
        x7.o[] oVarArr = new x7.o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int b10 = this.f144q.b(i11);
            Uri uri = this.f132e[b10];
            if (this.f134g.g(uri)) {
                b8.g o10 = this.f134g.o(uri, z10);
                t8.a.e(o10);
                long c10 = o10.f6220h - this.f134g.c();
                i10 = i11;
                Pair<Long, Integer> f10 = f(iVar, b10 != e10 ? true : z10, o10, c10, j10);
                oVarArr[i10] = new c(o10.f6279a, c10, i(o10, ((Long) f10.first).longValue(), ((Integer) f10.second).intValue()));
            } else {
                oVarArr[i11] = x7.o.f30645a;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public long b(long j10, u3 u3Var) {
        int h10 = this.f144q.h();
        Uri[] uriArr = this.f132e;
        b8.g o10 = (h10 >= uriArr.length || h10 == -1) ? null : this.f134g.o(uriArr[this.f144q.r()], true);
        if (o10 == null || o10.f6230r.isEmpty() || !o10.f6281c) {
            return j10;
        }
        long c10 = o10.f6220h - this.f134g.c();
        long j11 = j10 - c10;
        int f10 = r0.f(o10.f6230r, Long.valueOf(j11), true, true);
        long j12 = o10.f6230r.get(f10).f6246e;
        return u3Var.a(j11, j12, f10 != o10.f6230r.size() - 1 ? o10.f6230r.get(f10 + 1).f6246e : j12) + c10;
    }

    public int c(i iVar) {
        if (iVar.f164o == -1) {
            return 1;
        }
        b8.g gVar = (b8.g) t8.a.e(this.f134g.o(this.f132e[this.f135h.e(iVar.f30604d)], false));
        int i10 = (int) (iVar.f30644j - gVar.f6223k);
        if (i10 < 0) {
            return 1;
        }
        List<g.b> list = i10 < gVar.f6230r.size() ? gVar.f6230r.get(i10).f6241x : gVar.f6231s;
        if (iVar.f164o >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(iVar.f164o);
        if (bVar.f6236x) {
            return 0;
        }
        return r0.c(Uri.parse(p0.d(gVar.f6279a, bVar.f6242a)), iVar.f30602b.f25288a) ? 1 : 2;
    }

    public void e(long j10, long j11, List<i> list, boolean z10, b bVar) {
        b8.g gVar;
        long j12;
        Uri uri;
        int i10;
        i iVar = list.isEmpty() ? null : (i) e0.d(list);
        int e10 = iVar == null ? -1 : this.f135h.e(iVar.f30604d);
        long j13 = j11 - j10;
        long s10 = s(j10);
        if (iVar != null && !this.f143p) {
            long d10 = iVar.d();
            j13 = Math.max(0L, j13 - d10);
            if (s10 != -9223372036854775807L) {
                s10 = Math.max(0L, s10 - d10);
            }
        }
        this.f144q.g(j10, j13, s10, list, a(iVar, j11));
        int r10 = this.f144q.r();
        boolean z11 = e10 != r10;
        Uri uri2 = this.f132e[r10];
        if (!this.f134g.g(uri2)) {
            bVar.f150c = uri2;
            this.f146s &= uri2.equals(this.f142o);
            this.f142o = uri2;
            return;
        }
        b8.g o10 = this.f134g.o(uri2, true);
        t8.a.e(o10);
        this.f143p = o10.f6281c;
        w(o10);
        long c10 = o10.f6220h - this.f134g.c();
        Pair<Long, Integer> f10 = f(iVar, z11, o10, c10, j11);
        long longValue = ((Long) f10.first).longValue();
        int intValue = ((Integer) f10.second).intValue();
        if (longValue >= o10.f6223k || iVar == null || !z11) {
            gVar = o10;
            j12 = c10;
            uri = uri2;
            i10 = r10;
        } else {
            Uri uri3 = this.f132e[e10];
            b8.g o11 = this.f134g.o(uri3, true);
            t8.a.e(o11);
            j12 = o11.f6220h - this.f134g.c();
            Pair<Long, Integer> f11 = f(iVar, false, o11, j12, j11);
            longValue = ((Long) f11.first).longValue();
            intValue = ((Integer) f11.second).intValue();
            i10 = e10;
            uri = uri3;
            gVar = o11;
        }
        if (longValue < gVar.f6223k) {
            this.f141n = new v7.b();
            return;
        }
        e g10 = g(gVar, longValue, intValue);
        if (g10 == null) {
            if (!gVar.f6227o) {
                bVar.f150c = uri;
                this.f146s &= uri.equals(this.f142o);
                this.f142o = uri;
                return;
            } else {
                if (z10 || gVar.f6230r.isEmpty()) {
                    bVar.f149b = true;
                    return;
                }
                g10 = new e((g.e) e0.d(gVar.f6230r), (gVar.f6223k + gVar.f6230r.size()) - 1, -1);
            }
        }
        this.f146s = false;
        this.f142o = null;
        Uri d11 = d(gVar, g10.f155a.f6243b);
        x7.f l10 = l(d11, i10);
        bVar.f148a = l10;
        if (l10 != null) {
            return;
        }
        Uri d12 = d(gVar, g10.f155a);
        x7.f l11 = l(d12, i10);
        bVar.f148a = l11;
        if (l11 != null) {
            return;
        }
        boolean w10 = i.w(iVar, uri, gVar, g10, j12);
        if (w10 && g10.f158d) {
            return;
        }
        bVar.f148a = i.j(this.f128a, this.f129b, this.f133f[i10], j12, gVar, g10, uri, this.f136i, this.f144q.t(), this.f144q.m(), this.f139l, this.f131d, iVar, this.f137j.a(d12), this.f137j.a(d11), w10, this.f138k);
    }

    public int h(long j10, List<? extends x7.n> list) {
        return (this.f141n != null || this.f144q.length() < 2) ? list.size() : this.f144q.q(j10, list);
    }

    public d1 j() {
        return this.f135h;
    }

    public q8.r k() {
        return this.f144q;
    }

    public boolean m(x7.f fVar, long j10) {
        q8.r rVar = this.f144q;
        return rVar.i(rVar.c(this.f135h.e(fVar.f30604d)), j10);
    }

    public void n() {
        IOException iOException = this.f141n;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f142o;
        if (uri == null || !this.f146s) {
            return;
        }
        this.f134g.b(uri);
    }

    public boolean o(Uri uri) {
        return r0.s(this.f132e, uri);
    }

    public void p(x7.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f140m = aVar.h();
            this.f137j.b(aVar.f30602b.f25288a, (byte[]) t8.a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int c10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f132e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (c10 = this.f144q.c(i10)) == -1) {
            return true;
        }
        this.f146s |= uri.equals(this.f142o);
        return j10 == -9223372036854775807L || (this.f144q.i(c10, j10) && this.f134g.k(uri, j10));
    }

    public void r() {
        this.f141n = null;
    }

    public void t(boolean z10) {
        this.f139l = z10;
    }

    public void u(q8.r rVar) {
        this.f144q = rVar;
    }

    public boolean v(long j10, x7.f fVar, List<? extends x7.n> list) {
        if (this.f141n != null) {
            return false;
        }
        return this.f144q.k(j10, fVar, list);
    }
}
