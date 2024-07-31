package a7;

import com.google.common.collect.h1;
import java.util.ArrayList;
import t6.b3;
import t6.u1;
import t8.e0;
import t8.s;
import t8.w;
import y6.b0;
import y6.i;
import y6.k;
import y6.l;
import y6.m;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: c, reason: collision with root package name */
    private int f71c;

    /* renamed from: e, reason: collision with root package name */
    private a7.c f73e;

    /* renamed from: h, reason: collision with root package name */
    private long f76h;

    /* renamed from: i, reason: collision with root package name */
    private e f77i;

    /* renamed from: m, reason: collision with root package name */
    private int f81m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f82n;

    /* renamed from: a, reason: collision with root package name */
    private final e0 f69a = new e0(12);

    /* renamed from: b, reason: collision with root package name */
    private final c f70b = new c();

    /* renamed from: d, reason: collision with root package name */
    private m f72d = new i();

    /* renamed from: g, reason: collision with root package name */
    private e[] f75g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    private long f79k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f80l = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f78j = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f74f = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0004b implements z {

        /* renamed from: a, reason: collision with root package name */
        private final long f83a;

        public C0004b(long j10) {
            this.f83a = j10;
        }

        @Override // y6.z
        public z.a d(long j10) {
            z.a i10 = b.this.f75g[0].i(j10);
            for (int i11 = 1; i11 < b.this.f75g.length; i11++) {
                z.a i12 = b.this.f75g[i11].i(j10);
                if (i12.f31796a.f31688b < i10.f31796a.f31688b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        @Override // y6.z
        public boolean h() {
            return true;
        }

        @Override // y6.z
        public long i() {
            return this.f83a;
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f85a;

        /* renamed from: b, reason: collision with root package name */
        public int f86b;

        /* renamed from: c, reason: collision with root package name */
        public int f87c;

        private c() {
        }

        public void a(e0 e0Var) {
            this.f85a = e0Var.u();
            this.f86b = e0Var.u();
            this.f87c = 0;
        }

        public void b(e0 e0Var) {
            a(e0Var);
            if (this.f85a == 1414744396) {
                this.f87c = e0Var.u();
                return;
            }
            throw b3.a("LIST expected, found: " + this.f85a, null);
        }
    }

    private static void d(l lVar) {
        if ((lVar.getPosition() & 1) == 1) {
            lVar.n(1);
        }
    }

    private e g(int i10) {
        for (e eVar : this.f75g) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void h(e0 e0Var) {
        f c10 = f.c(1819436136, e0Var);
        if (c10.getType() != 1819436136) {
            throw b3.a("Unexpected header list type " + c10.getType(), null);
        }
        a7.c cVar = (a7.c) c10.b(a7.c.class);
        if (cVar == null) {
            throw b3.a("AviHeader not found", null);
        }
        this.f73e = cVar;
        this.f74f = cVar.f90c * cVar.f88a;
        ArrayList arrayList = new ArrayList();
        h1<a7.a> it = c10.f110a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a7.a next = it.next();
            if (next.getType() == 1819440243) {
                int i11 = i10 + 1;
                e k10 = k((f) next, i10);
                if (k10 != null) {
                    arrayList.add(k10);
                }
                i10 = i11;
            }
        }
        this.f75g = (e[]) arrayList.toArray(new e[0]);
        this.f72d.q();
    }

    private void i(e0 e0Var) {
        long j10 = j(e0Var);
        while (e0Var.a() >= 16) {
            int u10 = e0Var.u();
            int u11 = e0Var.u();
            long u12 = e0Var.u() + j10;
            e0Var.u();
            e g10 = g(u10);
            if (g10 != null) {
                if ((u11 & 16) == 16) {
                    g10.b(u12);
                }
                g10.k();
            }
        }
        for (e eVar : this.f75g) {
            eVar.c();
        }
        this.f82n = true;
        this.f72d.p(new C0004b(this.f74f));
    }

    private long j(e0 e0Var) {
        if (e0Var.a() < 16) {
            return 0L;
        }
        int f10 = e0Var.f();
        e0Var.V(8);
        long u10 = e0Var.u();
        long j10 = this.f79k;
        long j11 = u10 <= j10 ? j10 + 8 : 0L;
        e0Var.U(f10);
        return j11;
    }

    private e k(f fVar, int i10) {
        String str;
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            str = "Missing Stream Header";
        } else {
            if (gVar != null) {
                long a10 = dVar.a();
                u1 u1Var = gVar.f112a;
                u1.b c10 = u1Var.c();
                c10.T(i10);
                int i11 = dVar.f97f;
                if (i11 != 0) {
                    c10.Y(i11);
                }
                h hVar = (h) fVar.b(h.class);
                if (hVar != null) {
                    c10.W(hVar.f113a);
                }
                int k10 = w.k(u1Var.f26517w);
                if (k10 != 1 && k10 != 2) {
                    return null;
                }
                b0 d10 = this.f72d.d(i10, k10);
                d10.c(c10.G());
                e eVar = new e(i10, k10, a10, dVar.f96e, d10);
                this.f74f = a10;
                return eVar;
            }
            str = "Missing Stream Format";
        }
        s.i("AviExtractor", str);
        return null;
    }

    private int l(l lVar) {
        if (lVar.getPosition() >= this.f80l) {
            return -1;
        }
        e eVar = this.f77i;
        if (eVar == null) {
            d(lVar);
            lVar.q(this.f69a.e(), 0, 12);
            this.f69a.U(0);
            int u10 = this.f69a.u();
            if (u10 == 1414744396) {
                this.f69a.U(8);
                lVar.n(this.f69a.u() != 1769369453 ? 8 : 12);
                lVar.f();
                return 0;
            }
            int u11 = this.f69a.u();
            if (u10 == 1263424842) {
                this.f76h = lVar.getPosition() + u11 + 8;
                return 0;
            }
            lVar.n(8);
            lVar.f();
            e g10 = g(u10);
            if (g10 == null) {
                this.f76h = lVar.getPosition() + u11;
                return 0;
            }
            g10.n(u11);
            this.f77i = g10;
        } else if (eVar.m(lVar)) {
            this.f77i = null;
        }
        return 0;
    }

    private boolean m(l lVar, y yVar) {
        boolean z10;
        if (this.f76h != -1) {
            long position = lVar.getPosition();
            long j10 = this.f76h;
            if (j10 < position || j10 > 262144 + position) {
                yVar.f31795a = j10;
                z10 = true;
                this.f76h = -1L;
                return z10;
            }
            lVar.n((int) (j10 - position));
        }
        z10 = false;
        this.f76h = -1L;
        return z10;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f76h = -1L;
        this.f77i = null;
        for (e eVar : this.f75g) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f71c = 6;
        } else if (this.f75g.length == 0) {
            this.f71c = 0;
        } else {
            this.f71c = 3;
        }
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f71c = 0;
        this.f72d = mVar;
        this.f76h = -1L;
    }

    @Override // y6.k
    public boolean e(l lVar) {
        lVar.q(this.f69a.e(), 0, 12);
        this.f69a.U(0);
        if (this.f69a.u() != 1179011410) {
            return false;
        }
        this.f69a.V(4);
        return this.f69a.u() == 541677121;
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        if (m(lVar, yVar)) {
            return 1;
        }
        switch (this.f71c) {
            case 0:
                if (!e(lVar)) {
                    throw b3.a("AVI Header List not found", null);
                }
                lVar.n(12);
                this.f71c = 1;
                return 0;
            case 1:
                lVar.readFully(this.f69a.e(), 0, 12);
                this.f69a.U(0);
                this.f70b.b(this.f69a);
                c cVar = this.f70b;
                if (cVar.f87c == 1819436136) {
                    this.f78j = cVar.f86b;
                    this.f71c = 2;
                    return 0;
                }
                throw b3.a("hdrl expected, found: " + this.f70b.f87c, null);
            case 2:
                int i10 = this.f78j - 4;
                e0 e0Var = new e0(i10);
                lVar.readFully(e0Var.e(), 0, i10);
                h(e0Var);
                this.f71c = 3;
                return 0;
            case 3:
                if (this.f79k != -1) {
                    long position = lVar.getPosition();
                    long j10 = this.f79k;
                    if (position != j10) {
                        this.f76h = j10;
                        return 0;
                    }
                }
                lVar.q(this.f69a.e(), 0, 12);
                lVar.f();
                this.f69a.U(0);
                this.f70b.a(this.f69a);
                int u10 = this.f69a.u();
                int i11 = this.f70b.f85a;
                if (i11 == 1179011410) {
                    lVar.n(12);
                    return 0;
                }
                if (i11 != 1414744396 || u10 != 1769369453) {
                    this.f76h = lVar.getPosition() + this.f70b.f86b + 8;
                    return 0;
                }
                long position2 = lVar.getPosition();
                this.f79k = position2;
                this.f80l = position2 + this.f70b.f86b + 8;
                if (!this.f82n) {
                    if (((a7.c) t8.a.e(this.f73e)).a()) {
                        this.f71c = 4;
                        this.f76h = this.f80l;
                        return 0;
                    }
                    this.f72d.p(new z.b(this.f74f));
                    this.f82n = true;
                }
                this.f76h = lVar.getPosition() + 12;
                this.f71c = 6;
                return 0;
            case 4:
                lVar.readFully(this.f69a.e(), 0, 8);
                this.f69a.U(0);
                int u11 = this.f69a.u();
                int u12 = this.f69a.u();
                if (u11 == 829973609) {
                    this.f71c = 5;
                    this.f81m = u12;
                } else {
                    this.f76h = lVar.getPosition() + u12;
                }
                return 0;
            case 5:
                e0 e0Var2 = new e0(this.f81m);
                lVar.readFully(e0Var2.e(), 0, this.f81m);
                i(e0Var2);
                this.f71c = 6;
                this.f76h = this.f79k;
                return 0;
            case 6:
                return l(lVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // y6.k
    public void release() {
    }
}
