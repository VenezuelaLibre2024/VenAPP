package t6;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t6.a3;
import v7.a0;
import v7.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    private final u6.m3 f25833a;

    /* renamed from: e, reason: collision with root package name */
    private final d f25837e;

    /* renamed from: h, reason: collision with root package name */
    private final u6.a f25840h;

    /* renamed from: i, reason: collision with root package name */
    private final t8.o f25841i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25843k;

    /* renamed from: l, reason: collision with root package name */
    private s8.m0 f25844l;

    /* renamed from: j, reason: collision with root package name */
    private v7.x0 f25842j = new x0.a(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<v7.y, c> f25835c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f25836d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f25834b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f25838f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final Set<c> f25839g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a implements v7.h0, x6.u {

        /* renamed from: a, reason: collision with root package name */
        private final c f25845a;

        public a(c cVar) {
            this.f25845a = cVar;
        }

        private Pair<Integer, a0.b> V(int i10, a0.b bVar) {
            a0.b bVar2 = null;
            if (bVar != null) {
                a0.b n10 = a3.n(this.f25845a, bVar);
                if (n10 == null) {
                    return null;
                }
                bVar2 = n10;
            }
            return Pair.create(Integer.valueOf(a3.r(this.f25845a, i10)), bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void W(Pair pair, v7.x xVar) {
            a3.this.f25840h.v(((Integer) pair.first).intValue(), (a0.b) pair.second, xVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void X(Pair pair) {
            a3.this.f25840h.u(((Integer) pair.first).intValue(), (a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Y(Pair pair) {
            a3.this.f25840h.B(((Integer) pair.first).intValue(), (a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Z(Pair pair) {
            a3.this.f25840h.C(((Integer) pair.first).intValue(), (a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a0(Pair pair, int i10) {
            a3.this.f25840h.J(((Integer) pair.first).intValue(), (a0.b) pair.second, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b0(Pair pair, Exception exc) {
            a3.this.f25840h.I(((Integer) pair.first).intValue(), (a0.b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c0(Pair pair) {
            a3.this.f25840h.y(((Integer) pair.first).intValue(), (a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d0(Pair pair, v7.u uVar, v7.x xVar) {
            a3.this.f25840h.D(((Integer) pair.first).intValue(), (a0.b) pair.second, uVar, xVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e0(Pair pair, v7.u uVar, v7.x xVar) {
            a3.this.f25840h.x(((Integer) pair.first).intValue(), (a0.b) pair.second, uVar, xVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f0(Pair pair, v7.u uVar, v7.x xVar, IOException iOException, boolean z10) {
            a3.this.f25840h.F(((Integer) pair.first).intValue(), (a0.b) pair.second, uVar, xVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g0(Pair pair, v7.u uVar, v7.x xVar) {
            a3.this.f25840h.G(((Integer) pair.first).intValue(), (a0.b) pair.second, uVar, xVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h0(Pair pair, v7.x xVar) {
            a3.this.f25840h.w(((Integer) pair.first).intValue(), (a0.b) t8.a.e((a0.b) pair.second), xVar);
        }

        @Override // x6.u
        public void B(int i10, a0.b bVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.z2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.Y(V);
                    }
                });
            }
        }

        @Override // x6.u
        public void C(int i10, a0.b bVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.Z(V);
                    }
                });
            }
        }

        @Override // v7.h0
        public void D(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.d0(V, uVar, xVar);
                    }
                });
            }
        }

        @Override // v7.h0
        public void F(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.f0(V, uVar, xVar, iOException, z10);
                    }
                });
            }
        }

        @Override // v7.h0
        public void G(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.g0(V, uVar, xVar);
                    }
                });
            }
        }

        @Override // x6.u
        public void I(int i10, a0.b bVar, final Exception exc) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.x2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.b0(V, exc);
                    }
                });
            }
        }

        @Override // x6.u
        public void J(int i10, a0.b bVar, final int i11) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.a0(V, i11);
                    }
                });
            }
        }

        @Override // x6.u
        public void u(int i10, a0.b bVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.X(V);
                    }
                });
            }
        }

        @Override // v7.h0
        public void v(int i10, a0.b bVar, final v7.x xVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.s2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.W(V, xVar);
                    }
                });
            }
        }

        @Override // v7.h0
        public void w(int i10, a0.b bVar, final v7.x xVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.v2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.h0(V, xVar);
                    }
                });
            }
        }

        @Override // v7.h0
        public void x(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.y2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.e0(V, uVar, xVar);
                    }
                });
            }
        }

        @Override // x6.u
        public void y(int i10, a0.b bVar) {
            final Pair<Integer, a0.b> V = V(i10, bVar);
            if (V != null) {
                a3.this.f25841i.h(new Runnable() { // from class: t6.w2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a3.a.this.c0(V);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final v7.a0 f25847a;

        /* renamed from: b, reason: collision with root package name */
        public final a0.c f25848b;

        /* renamed from: c, reason: collision with root package name */
        public final a f25849c;

        public b(v7.a0 a0Var, a0.c cVar, a aVar) {
            this.f25847a = a0Var;
            this.f25848b = cVar;
            this.f25849c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements m2 {

        /* renamed from: a, reason: collision with root package name */
        public final v7.w f25850a;

        /* renamed from: d, reason: collision with root package name */
        public int f25853d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f25854e;

        /* renamed from: c, reason: collision with root package name */
        public final List<a0.b> f25852c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f25851b = new Object();

        public c(v7.a0 a0Var, boolean z10) {
            this.f25850a = new v7.w(a0Var, z10);
        }

        @Override // t6.m2
        public d4 a() {
            return this.f25850a.Z();
        }

        public void b(int i10) {
            this.f25853d = i10;
            this.f25854e = false;
            this.f25852c.clear();
        }

        @Override // t6.m2
        public Object l() {
            return this.f25851b;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void c();
    }

    public a3(d dVar, u6.a aVar, t8.o oVar, u6.m3 m3Var) {
        this.f25833a = m3Var;
        this.f25837e = dVar;
        this.f25840h = aVar;
        this.f25841i = oVar;
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f25834b.remove(i12);
            this.f25836d.remove(remove.f25851b);
            g(i12, -remove.f25850a.Z().u());
            remove.f25854e = true;
            if (this.f25843k) {
                u(remove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f25834b.size()) {
            this.f25834b.get(i10).f25853d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f25838f.get(cVar);
        if (bVar != null) {
            bVar.f25847a.c(bVar.f25848b);
        }
    }

    private void k() {
        Iterator<c> it = this.f25839g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f25852c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f25839g.add(cVar);
        b bVar = this.f25838f.get(cVar);
        if (bVar != null) {
            bVar.f25847a.f(bVar.f25848b);
        }
    }

    private static Object m(Object obj) {
        return t6.a.A(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a0.b n(c cVar, a0.b bVar) {
        for (int i10 = 0; i10 < cVar.f25852c.size(); i10++) {
            if (cVar.f25852c.get(i10).f28546d == bVar.f28546d) {
                return bVar.c(p(cVar, bVar.f28543a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return t6.a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return t6.a.D(cVar.f25851b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(c cVar, int i10) {
        return i10 + cVar.f25853d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(v7.a0 a0Var, d4 d4Var) {
        this.f25837e.c();
    }

    private void u(c cVar) {
        if (cVar.f25854e && cVar.f25852c.isEmpty()) {
            b bVar = (b) t8.a.e(this.f25838f.remove(cVar));
            bVar.f25847a.b(bVar.f25848b);
            bVar.f25847a.g(bVar.f25849c);
            bVar.f25847a.q(bVar.f25849c);
            this.f25839g.remove(cVar);
        }
    }

    private void x(c cVar) {
        v7.w wVar = cVar.f25850a;
        a0.c cVar2 = new a0.c() { // from class: t6.n2
            @Override // v7.a0.c
            public final void a(v7.a0 a0Var, d4 d4Var) {
                a3.this.t(a0Var, d4Var);
            }
        };
        a aVar = new a(cVar);
        this.f25838f.put(cVar, new b(wVar, cVar2, aVar));
        wVar.j(t8.r0.y(), aVar);
        wVar.s(t8.r0.y(), aVar);
        wVar.a(cVar2, this.f25844l, this.f25833a);
    }

    public d4 A(int i10, int i11, v7.x0 x0Var) {
        t8.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f25842j = x0Var;
        B(i10, i11);
        return i();
    }

    public d4 C(List<c> list, v7.x0 x0Var) {
        B(0, this.f25834b.size());
        return f(this.f25834b.size(), list, x0Var);
    }

    public d4 D(v7.x0 x0Var) {
        int q10 = q();
        if (x0Var.getLength() != q10) {
            x0Var = x0Var.e().g(0, q10);
        }
        this.f25842j = x0Var;
        return i();
    }

    public d4 f(int i10, List<c> list, v7.x0 x0Var) {
        int i11;
        if (!list.isEmpty()) {
            this.f25842j = x0Var;
            for (int i12 = i10; i12 < list.size() + i10; i12++) {
                c cVar = list.get(i12 - i10);
                if (i12 > 0) {
                    c cVar2 = this.f25834b.get(i12 - 1);
                    i11 = cVar2.f25853d + cVar2.f25850a.Z().u();
                } else {
                    i11 = 0;
                }
                cVar.b(i11);
                g(i12, cVar.f25850a.Z().u());
                this.f25834b.add(i12, cVar);
                this.f25836d.put(cVar.f25851b, cVar);
                if (this.f25843k) {
                    x(cVar);
                    if (this.f25835c.isEmpty()) {
                        this.f25839g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public v7.y h(a0.b bVar, s8.b bVar2, long j10) {
        Object o10 = o(bVar.f28543a);
        a0.b c10 = bVar.c(m(bVar.f28543a));
        c cVar = (c) t8.a.e(this.f25836d.get(o10));
        l(cVar);
        cVar.f25852c.add(c10);
        v7.v e10 = cVar.f25850a.e(c10, bVar2, j10);
        this.f25835c.put(e10, cVar);
        k();
        return e10;
    }

    public d4 i() {
        if (this.f25834b.isEmpty()) {
            return d4.f26044a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25834b.size(); i11++) {
            c cVar = this.f25834b.get(i11);
            cVar.f25853d = i10;
            i10 += cVar.f25850a.Z().u();
        }
        return new n3(this.f25834b, this.f25842j);
    }

    public int q() {
        return this.f25834b.size();
    }

    public boolean s() {
        return this.f25843k;
    }

    public d4 v(int i10, int i11, int i12, v7.x0 x0Var) {
        t8.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f25842j = x0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f25834b.get(min).f25853d;
        t8.r0.B0(this.f25834b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f25834b.get(min);
            cVar.f25853d = i13;
            i13 += cVar.f25850a.Z().u();
            min++;
        }
        return i();
    }

    public void w(s8.m0 m0Var) {
        t8.a.g(!this.f25843k);
        this.f25844l = m0Var;
        for (int i10 = 0; i10 < this.f25834b.size(); i10++) {
            c cVar = this.f25834b.get(i10);
            x(cVar);
            this.f25839g.add(cVar);
        }
        this.f25843k = true;
    }

    public void y() {
        for (b bVar : this.f25838f.values()) {
            try {
                bVar.f25847a.b(bVar.f25848b);
            } catch (RuntimeException e10) {
                t8.s.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f25847a.g(bVar.f25849c);
            bVar.f25847a.q(bVar.f25849c);
        }
        this.f25838f.clear();
        this.f25839g.clear();
        this.f25843k = false;
    }

    public void z(v7.y yVar) {
        c cVar = (c) t8.a.e(this.f25835c.remove(yVar));
        cVar.f25850a.l(yVar);
        cVar.f25852c.remove(((v7.v) yVar).f28507a);
        if (!this.f25835c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
