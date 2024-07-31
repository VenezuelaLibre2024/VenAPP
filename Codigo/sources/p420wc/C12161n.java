package p420wc;

import ad.C0103f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p420wc.C12161n;
import p442xc.AbstractC12426f0;
import vc.C11839i;
import vc.C11849n;

/* renamed from: wc.n */
/* loaded from: classes.dex */
public class C12161n {

    /* renamed from: a */
    private final C12153f f32344a;

    /* renamed from: b */
    private final C11849n f32345b;

    /* renamed from: c */
    private String f32346c;

    /* renamed from: d */
    private final a f32347d = new a(false);

    /* renamed from: e */
    private final a f32348e = new a(true);

    /* renamed from: f */
    private final C12157j f32349f = new C12157j(RecognitionOptions.ITF);

    /* renamed from: g */
    private final AtomicMarkableReference<String> f32350g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wc.n$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        final AtomicMarkableReference<C12151d> f32351a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f32352b = new AtomicReference<>(null);

        /* renamed from: c */
        private final boolean f32353c;

        public a(boolean z10) {
            this.f32353c = z10;
            this.f32351a = new AtomicMarkableReference<>(new C12151d(64, z10 ? 8192 : RecognitionOptions.UPC_E), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m39013c() {
            this.f32352b.set(null);
            m39015e();
            return null;
        }

        /* renamed from: d */
        private void m39014d() {
            Callable callable = new Callable() { // from class: wc.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m39013c;
                    m39013c = C12161n.a.this.m39013c();
                    return m39013c;
                }
            };
            if (C7099c.m20926a(this.f32352b, null, callable)) {
                C12161n.this.f32345b.m37770h(callable);
            }
        }

        /* renamed from: e */
        private void m39015e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f32351a.isMarked()) {
                    map = this.f32351a.getReference().m38927a();
                    AtomicMarkableReference<C12151d> atomicMarkableReference = this.f32351a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C12161n.this.f32344a.m38953q(C12161n.this.f32346c, map, this.f32353c);
            }
        }

        /* renamed from: b */
        public Map<String, String> m39016b() {
            return this.f32351a.getReference().m38927a();
        }

        /* renamed from: f */
        public boolean m39017f(String str, String str2) {
            synchronized (this) {
                if (!this.f32351a.getReference().m38928d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<C12151d> atomicMarkableReference = this.f32351a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                m39014d();
                return true;
            }
        }
    }

    public C12161n(String str, C0103f c0103f, C11849n c11849n) {
        this.f32346c = str;
        this.f32344a = new C12153f(c0103f);
        this.f32345b = c11849n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Object m38998j() {
        m39002n();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object m38999k(List list) {
        this.f32344a.m38954r(this.f32346c, list);
        return null;
    }

    /* renamed from: l */
    public static C12161n m39000l(String str, C0103f c0103f, C11849n c11849n) {
        C12153f c12153f = new C12153f(c0103f);
        C12161n c12161n = new C12161n(str, c0103f, c11849n);
        c12161n.f32347d.f32351a.getReference().m38929e(c12153f.m38949i(str, false));
        c12161n.f32348e.f32351a.getReference().m38929e(c12153f.m38949i(str, true));
        c12161n.f32350g.set(c12153f.m38951k(str), false);
        c12161n.f32349f.m38992c(c12153f.m38950j(str));
        return c12161n;
    }

    /* renamed from: m */
    public static String m39001m(String str, C0103f c0103f) {
        return new C12153f(c0103f).m38951k(str);
    }

    /* renamed from: n */
    private void m39002n() {
        boolean z10;
        String str;
        synchronized (this.f32350g) {
            z10 = false;
            if (this.f32350g.isMarked()) {
                str = m39006i();
                this.f32350g.set(str, false);
                z10 = true;
            } else {
                str = null;
            }
        }
        if (z10) {
            this.f32344a.m38955s(this.f32346c, str);
        }
    }

    /* renamed from: f */
    public Map<String, String> m39003f() {
        return this.f32347d.m39016b();
    }

    /* renamed from: g */
    public Map<String, String> m39004g() {
        return this.f32348e.m39016b();
    }

    /* renamed from: h */
    public List<AbstractC12426f0.e.d.AbstractC13287e> m39005h() {
        return this.f32349f.m38990a();
    }

    /* renamed from: i */
    public String m39006i() {
        return this.f32350g.getReference();
    }

    /* renamed from: o */
    public boolean m39007o(String str, String str2) {
        return this.f32347d.m39017f(str, str2);
    }

    /* renamed from: p */
    public boolean m39008p(String str, String str2) {
        return this.f32348e.m39017f(str, str2);
    }

    /* renamed from: q */
    public void m39009q(String str) {
        synchronized (this.f32346c) {
            this.f32346c = str;
            Map<String, String> m39016b = this.f32347d.m39016b();
            List<AbstractC12156i> m38991b = this.f32349f.m38991b();
            if (m39006i() != null) {
                this.f32344a.m38955s(str, m39006i());
            }
            if (!m39016b.isEmpty()) {
                this.f32344a.m38952p(str, m39016b);
            }
            if (!m38991b.isEmpty()) {
                this.f32344a.m38954r(str, m38991b);
            }
        }
    }

    /* renamed from: r */
    public void m39010r(String str) {
        String m38926c = C12151d.m38926c(str, RecognitionOptions.UPC_E);
        synchronized (this.f32350g) {
            if (C11839i.m37744y(m38926c, this.f32350g.getReference())) {
                return;
            }
            this.f32350g.set(m38926c, true);
            this.f32345b.m37770h(new Callable() { // from class: wc.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m38998j;
                    m38998j = C12161n.this.m38998j();
                    return m38998j;
                }
            });
        }
    }

    /* renamed from: s */
    public boolean m39011s(List<AbstractC12156i> list) {
        synchronized (this.f32349f) {
            if (!this.f32349f.m38992c(list)) {
                return false;
            }
            final List<AbstractC12156i> m38991b = this.f32349f.m38991b();
            this.f32345b.m37770h(new Callable() { // from class: wc.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m38999k;
                    m38999k = C12161n.this.m38999k(m38991b);
                    return m38999k;
                }
            });
            return true;
        }
    }
}
