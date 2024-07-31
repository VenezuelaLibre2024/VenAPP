package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: i */
    public static final n0.a<Integer> f2536i = n0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j */
    public static final n0.a<Integer> f2537j = n0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    final List<r0> f2538a;

    /* renamed from: b */
    final n0 f2539b;

    /* renamed from: c */
    final int f2540c;

    /* renamed from: d */
    final Range<Integer> f2541d;

    /* renamed from: e */
    final List<k> f2542e;

    /* renamed from: f */
    private final boolean f2543f;

    /* renamed from: g */
    private final f2 f2544g;

    /* renamed from: h */
    private final s f2545h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Set<r0> f2546a;

        /* renamed from: b */
        private l1 f2547b;

        /* renamed from: c */
        private int f2548c;

        /* renamed from: d */
        private Range<Integer> f2549d;

        /* renamed from: e */
        private List<k> f2550e;

        /* renamed from: f */
        private boolean f2551f;

        /* renamed from: g */
        private n1 f2552g;

        /* renamed from: h */
        private s f2553h;

        public a() {
            this.f2546a = new HashSet();
            this.f2547b = m1.a0();
            this.f2548c = -1;
            this.f2549d = b2.f2445a;
            this.f2550e = new ArrayList();
            this.f2551f = false;
            this.f2552g = n1.g();
        }

        private a(l0 l0Var) {
            HashSet hashSet = new HashSet();
            this.f2546a = hashSet;
            this.f2547b = m1.a0();
            this.f2548c = -1;
            this.f2549d = b2.f2445a;
            this.f2550e = new ArrayList();
            this.f2551f = false;
            this.f2552g = n1.g();
            hashSet.addAll(l0Var.f2538a);
            this.f2547b = m1.b0(l0Var.f2539b);
            this.f2548c = l0Var.f2540c;
            this.f2549d = l0Var.f2541d;
            this.f2550e.addAll(l0Var.b());
            this.f2551f = l0Var.i();
            this.f2552g = n1.h(l0Var.g());
        }

        public static a j(k2<?> k2Var) {
            b q10 = k2Var.q(null);
            if (q10 != null) {
                a aVar = new a();
                q10.a(k2Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + k2Var.u(k2Var.toString()));
        }

        public static a k(l0 l0Var) {
            return new a(l0Var);
        }

        public void a(Collection<k> collection) {
            Iterator<k> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void b(f2 f2Var) {
            this.f2552g.f(f2Var);
        }

        public void c(k kVar) {
            if (this.f2550e.contains(kVar)) {
                return;
            }
            this.f2550e.add(kVar);
        }

        public <T> void d(n0.a<T> aVar, T t10) {
            this.f2547b.r(aVar, t10);
        }

        public void e(n0 n0Var) {
            for (n0.a<?> aVar : n0Var.e()) {
                Object g10 = this.f2547b.g(aVar, null);
                Object a10 = n0Var.a(aVar);
                if (g10 instanceof k1) {
                    ((k1) g10).a(((k1) a10).c());
                } else {
                    if (a10 instanceof k1) {
                        a10 = ((k1) a10).clone();
                    }
                    this.f2547b.p(aVar, n0Var.h(aVar), a10);
                }
            }
        }

        public void f(r0 r0Var) {
            this.f2546a.add(r0Var);
        }

        public void g(String str, Object obj) {
            this.f2552g.i(str, obj);
        }

        public l0 h() {
            return new l0(new ArrayList(this.f2546a), p1.Y(this.f2547b), this.f2548c, this.f2549d, new ArrayList(this.f2550e), this.f2551f, f2.c(this.f2552g), this.f2553h);
        }

        public void i() {
            this.f2546a.clear();
        }

        public Range<Integer> l() {
            return this.f2549d;
        }

        public Set<r0> m() {
            return this.f2546a;
        }

        public int n() {
            return this.f2548c;
        }

        public void o(s sVar) {
            this.f2553h = sVar;
        }

        public void p(Range<Integer> range) {
            this.f2549d = range;
        }

        public void q(n0 n0Var) {
            this.f2547b = m1.b0(n0Var);
        }

        public void r(int i10) {
            this.f2548c = i10;
        }

        public void s(boolean z10) {
            this.f2551f = z10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(k2<?> k2Var, a aVar);
    }

    l0(List<r0> list, n0 n0Var, int i10, Range<Integer> range, List<k> list2, boolean z10, f2 f2Var, s sVar) {
        this.f2538a = list;
        this.f2539b = n0Var;
        this.f2540c = i10;
        this.f2541d = range;
        this.f2542e = Collections.unmodifiableList(list2);
        this.f2543f = z10;
        this.f2544g = f2Var;
        this.f2545h = sVar;
    }

    public static l0 a() {
        return new a().h();
    }

    public List<k> b() {
        return this.f2542e;
    }

    public s c() {
        return this.f2545h;
    }

    public Range<Integer> d() {
        return this.f2541d;
    }

    public n0 e() {
        return this.f2539b;
    }

    public List<r0> f() {
        return Collections.unmodifiableList(this.f2538a);
    }

    public f2 g() {
        return this.f2544g;
    }

    public int h() {
        return this.f2540c;
    }

    public boolean i() {
        return this.f2543f;
    }
}
