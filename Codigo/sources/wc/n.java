package wc;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import wc.n;
import xc.f0;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    private final f f29879a;

    /* renamed from: b */
    private final vc.n f29880b;

    /* renamed from: c */
    private String f29881c;

    /* renamed from: d */
    private final a f29882d = new a(false);

    /* renamed from: e */
    private final a f29883e = new a(true);

    /* renamed from: f */
    private final j f29884f = new j(RecognitionOptions.ITF);

    /* renamed from: g */
    private final AtomicMarkableReference<String> f29885g = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        final AtomicMarkableReference<d> f29886a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f29887b = new AtomicReference<>(null);

        /* renamed from: c */
        private final boolean f29888c;

        public a(boolean z10) {
            this.f29888c = z10;
            this.f29886a = new AtomicMarkableReference<>(new d(64, z10 ? 8192 : RecognitionOptions.UPC_E), false);
        }

        public /* synthetic */ Void c() {
            this.f29887b.set(null);
            e();
            return null;
        }

        private void d() {
            m mVar = new Callable() { // from class: wc.m
                public /* synthetic */ m() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c10;
                    c10 = n.a.this.c();
                    return c10;
                }
            };
            if (e2.c.a(this.f29887b, null, mVar)) {
                n.this.f29880b.h(mVar);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f29886a.isMarked()) {
                    map = this.f29886a.getReference().a();
                    AtomicMarkableReference<d> atomicMarkableReference = this.f29886a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                n.this.f29879a.q(n.this.f29881c, map, this.f29888c);
            }
        }

        public Map<String, String> b() {
            return this.f29886a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (!this.f29886a.getReference().d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<d> atomicMarkableReference = this.f29886a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                d();
                return true;
            }
        }
    }

    public n(String str, ad.f fVar, vc.n nVar) {
        this.f29881c = str;
        this.f29879a = new f(fVar);
        this.f29880b = nVar;
    }

    public /* synthetic */ Object j() {
        n();
        return null;
    }

    public /* synthetic */ Object k(List list) {
        this.f29879a.r(this.f29881c, list);
        return null;
    }

    public static n l(String str, ad.f fVar, vc.n nVar) {
        f fVar2 = new f(fVar);
        n nVar2 = new n(str, fVar, nVar);
        nVar2.f29882d.f29886a.getReference().e(fVar2.i(str, false));
        nVar2.f29883e.f29886a.getReference().e(fVar2.i(str, true));
        nVar2.f29885g.set(fVar2.k(str), false);
        nVar2.f29884f.c(fVar2.j(str));
        return nVar2;
    }

    public static String m(String str, ad.f fVar) {
        return new f(fVar).k(str);
    }

    private void n() {
        boolean z10;
        String str;
        synchronized (this.f29885g) {
            z10 = false;
            if (this.f29885g.isMarked()) {
                str = i();
                this.f29885g.set(str, false);
                z10 = true;
            } else {
                str = null;
            }
        }
        if (z10) {
            this.f29879a.s(this.f29881c, str);
        }
    }

    public Map<String, String> f() {
        return this.f29882d.b();
    }

    public Map<String, String> g() {
        return this.f29883e.b();
    }

    public List<f0.e.d.AbstractC0519e> h() {
        return this.f29884f.a();
    }

    public String i() {
        return this.f29885g.getReference();
    }

    public boolean o(String str, String str2) {
        return this.f29882d.f(str, str2);
    }

    public boolean p(String str, String str2) {
        return this.f29883e.f(str, str2);
    }

    public void q(String str) {
        synchronized (this.f29881c) {
            this.f29881c = str;
            Map<String, String> b10 = this.f29882d.b();
            List<i> b11 = this.f29884f.b();
            if (i() != null) {
                this.f29879a.s(str, i());
            }
            if (!b10.isEmpty()) {
                this.f29879a.p(str, b10);
            }
            if (!b11.isEmpty()) {
                this.f29879a.r(str, b11);
            }
        }
    }

    public void r(String str) {
        String c10 = d.c(str, RecognitionOptions.UPC_E);
        synchronized (this.f29885g) {
            if (vc.i.y(c10, this.f29885g.getReference())) {
                return;
            }
            this.f29885g.set(c10, true);
            this.f29880b.h(new Callable() { // from class: wc.k
                public /* synthetic */ k() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object j10;
                    j10 = n.this.j();
                    return j10;
                }
            });
        }
    }

    public boolean s(List<i> list) {
        synchronized (this.f29884f) {
            if (!this.f29884f.c(list)) {
                return false;
            }
            this.f29880b.h(new Callable() { // from class: wc.l

                /* renamed from: b */
                public final /* synthetic */ List f29877b;

                public /* synthetic */ l(List list2) {
                    r2 = list2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object k10;
                    k10 = n.this.k(r2);
                    return k10;
                }
            });
            return true;
        }
    }
}
