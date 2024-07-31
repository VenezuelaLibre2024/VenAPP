package j3;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.h;
import d4.a;
import j3.f;
import j3.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private b<R> A;
    private int B;
    private EnumC0308h C;
    private g D;
    private long E;
    private boolean F;
    private Object G;
    private Thread H;
    private h3.f I;
    private h3.f J;
    private Object K;
    private h3.a L;
    private com.bumptech.glide.load.data.d<?> M;
    private volatile j3.f N;
    private volatile boolean O;
    private volatile boolean P;
    private boolean Q;

    /* renamed from: d */
    private final e f19592d;

    /* renamed from: e */
    private final androidx.core.util.e<h<?>> f19593e;

    /* renamed from: s */
    private com.bumptech.glide.d f19596s;

    /* renamed from: t */
    private h3.f f19597t;

    /* renamed from: u */
    private com.bumptech.glide.g f19598u;

    /* renamed from: v */
    private n f19599v;

    /* renamed from: w */
    private int f19600w;

    /* renamed from: x */
    private int f19601x;

    /* renamed from: y */
    private j f19602y;

    /* renamed from: z */
    private h3.h f19603z;

    /* renamed from: a */
    private final j3.g<R> f19589a = new j3.g<>();

    /* renamed from: b */
    private final List<Throwable> f19590b = new ArrayList();

    /* renamed from: c */
    private final d4.c f19591c = d4.c.a();

    /* renamed from: f */
    private final d<?> f19594f = new d<>();

    /* renamed from: r */
    private final f f19595r = new f();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19604a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19605b;

        /* renamed from: c */
        static final /* synthetic */ int[] f19606c;

        static {
            int[] iArr = new int[h3.c.values().length];
            f19606c = iArr;
            try {
                iArr[h3.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19606c[h3.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0308h.values().length];
            f19605b = iArr2;
            try {
                iArr2[EnumC0308h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19605b[EnumC0308h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19605b[EnumC0308h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19605b[EnumC0308h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19605b[EnumC0308h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f19604a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19604a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19604a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<R> {
        void b(v<R> vVar, h3.a aVar, boolean z10);

        void c(q qVar);

        void d(h<?> hVar);
    }

    /* loaded from: classes.dex */
    public final class c<Z> implements i.a<Z> {

        /* renamed from: a */
        private final h3.a f19607a;

        c(h3.a aVar) {
            this.f19607a = aVar;
        }

        @Override // j3.i.a
        public v<Z> a(v<Z> vVar) {
            return h.this.D(this.f19607a, vVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d<Z> {

        /* renamed from: a */
        private h3.f f19609a;

        /* renamed from: b */
        private h3.k<Z> f19610b;

        /* renamed from: c */
        private u<Z> f19611c;

        d() {
        }

        void a() {
            this.f19609a = null;
            this.f19610b = null;
            this.f19611c = null;
        }

        void b(e eVar, h3.h hVar) {
            d4.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f19609a, new j3.e(this.f19610b, this.f19611c, hVar));
            } finally {
                this.f19611c.d();
                d4.b.e();
            }
        }

        boolean c() {
            return this.f19611c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(h3.f fVar, h3.k<X> kVar, u<X> uVar) {
            this.f19609a = fVar;
            this.f19610b = kVar;
            this.f19611c = uVar;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        l3.a a();
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private boolean f19612a;

        /* renamed from: b */
        private boolean f19613b;

        /* renamed from: c */
        private boolean f19614c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f19614c || z10 || this.f19613b) && this.f19612a;
        }

        synchronized boolean b() {
            this.f19613b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f19614c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f19612a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f19613b = false;
            this.f19612a = false;
            this.f19614c = false;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: j3.h$h */
    /* loaded from: classes.dex */
    public enum EnumC0308h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public h(e eVar, androidx.core.util.e<h<?>> eVar2) {
        this.f19592d = eVar;
        this.f19593e = eVar2;
    }

    private void A() {
        K();
        this.A.c(new q("Failed to load resource", new ArrayList(this.f19590b)));
        C();
    }

    private void B() {
        if (this.f19595r.b()) {
            F();
        }
    }

    private void C() {
        if (this.f19595r.c()) {
            F();
        }
    }

    private void F() {
        this.f19595r.e();
        this.f19594f.a();
        this.f19589a.a();
        this.O = false;
        this.f19596s = null;
        this.f19597t = null;
        this.f19603z = null;
        this.f19598u = null;
        this.f19599v = null;
        this.A = null;
        this.C = null;
        this.N = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.E = 0L;
        this.P = false;
        this.G = null;
        this.f19590b.clear();
        this.f19593e.a(this);
    }

    private void G(g gVar) {
        this.D = gVar;
        this.A.d(this);
    }

    private void H() {
        this.H = Thread.currentThread();
        this.E = c4.g.b();
        boolean z10 = false;
        while (!this.P && this.N != null && !(z10 = this.N.a())) {
            this.C = s(this.C);
            this.N = r();
            if (this.C == EnumC0308h.SOURCE) {
                G(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.C == EnumC0308h.FINISHED || this.P) && !z10) {
            A();
        }
    }

    private <Data, ResourceType> v<R> I(Data data, h3.a aVar, t<Data, ResourceType, R> tVar) {
        h3.h t10 = t(aVar);
        com.bumptech.glide.load.data.e<Data> l10 = this.f19596s.h().l(data);
        try {
            return tVar.a(l10, t10, this.f19600w, this.f19601x, new c(aVar));
        } finally {
            l10.b();
        }
    }

    private void J() {
        int i10 = a.f19604a[this.D.ordinal()];
        if (i10 == 1) {
            this.C = s(EnumC0308h.INITIALIZE);
            this.N = r();
        } else if (i10 != 2) {
            if (i10 == 3) {
                q();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.D);
        }
        H();
    }

    private void K() {
        Throwable th2;
        this.f19591c.c();
        if (!this.O) {
            this.O = true;
            return;
        }
        if (this.f19590b.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f19590b;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private <Data> v<R> o(com.bumptech.glide.load.data.d<?> dVar, Data data, h3.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long b10 = c4.g.b();
            v<R> p10 = p(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                w("Decoded result " + p10, b10);
            }
            return p10;
        } finally {
            dVar.b();
        }
    }

    private <Data> v<R> p(Data data, h3.a aVar) {
        return I(data, aVar, this.f19589a.h(data.getClass()));
    }

    private void q() {
        v<R> vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            x("Retrieved data", this.E, "data: " + this.K + ", cache key: " + this.I + ", fetcher: " + this.M);
        }
        try {
            vVar = o(this.M, this.K, this.L);
        } catch (q e10) {
            e10.i(this.J, this.L);
            this.f19590b.add(e10);
            vVar = null;
        }
        if (vVar != null) {
            z(vVar, this.L, this.Q);
        } else {
            H();
        }
    }

    private j3.f r() {
        int i10 = a.f19605b[this.C.ordinal()];
        if (i10 == 1) {
            return new w(this.f19589a, this);
        }
        if (i10 == 2) {
            return new j3.c(this.f19589a, this);
        }
        if (i10 == 3) {
            return new z(this.f19589a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.C);
    }

    private EnumC0308h s(EnumC0308h enumC0308h) {
        int i10 = a.f19605b[enumC0308h.ordinal()];
        if (i10 == 1) {
            return this.f19602y.a() ? EnumC0308h.DATA_CACHE : s(EnumC0308h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.F ? EnumC0308h.FINISHED : EnumC0308h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0308h.FINISHED;
        }
        if (i10 == 5) {
            return this.f19602y.b() ? EnumC0308h.RESOURCE_CACHE : s(EnumC0308h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0308h);
    }

    private h3.h t(h3.a aVar) {
        h3.h hVar = this.f19603z;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = aVar == h3.a.RESOURCE_DISK_CACHE || this.f19589a.x();
        h3.g<Boolean> gVar = q3.q.f23459j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return hVar;
        }
        h3.h hVar2 = new h3.h();
        hVar2.d(this.f19603z);
        hVar2.f(gVar, Boolean.valueOf(z10));
        return hVar2;
    }

    private int u() {
        return this.f19598u.ordinal();
    }

    private void w(String str, long j10) {
        x(str, j10, null);
    }

    private void x(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(c4.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f19599v);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void y(v<R> vVar, h3.a aVar, boolean z10) {
        K();
        this.A.b(vVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z(v<R> vVar, h3.a aVar, boolean z10) {
        u uVar;
        d4.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).initialize();
            }
            if (this.f19594f.c()) {
                vVar = u.b(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            y(vVar, aVar, z10);
            this.C = EnumC0308h.ENCODE;
            try {
                if (this.f19594f.c()) {
                    this.f19594f.b(this.f19592d, this.f19603z);
                }
                B();
            } finally {
                if (uVar != 0) {
                    uVar.d();
                }
            }
        } finally {
            d4.b.e();
        }
    }

    <Z> v<Z> D(h3.a aVar, v<Z> vVar) {
        v<Z> vVar2;
        h3.l<Z> lVar;
        h3.c cVar;
        h3.f dVar;
        Class<?> cls = vVar.get().getClass();
        h3.k<Z> kVar = null;
        if (aVar != h3.a.RESOURCE_DISK_CACHE) {
            h3.l<Z> s10 = this.f19589a.s(cls);
            lVar = s10;
            vVar2 = s10.a(this.f19596s, vVar, this.f19600w, this.f19601x);
        } else {
            vVar2 = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.q();
        }
        if (this.f19589a.w(vVar2)) {
            kVar = this.f19589a.n(vVar2);
            cVar = kVar.a(this.f19603z);
        } else {
            cVar = h3.c.NONE;
        }
        h3.k kVar2 = kVar;
        if (!this.f19602y.d(!this.f19589a.y(this.I), aVar, cVar)) {
            return vVar2;
        }
        if (kVar2 == null) {
            throw new h.d(vVar2.get().getClass());
        }
        int i10 = a.f19606c[cVar.ordinal()];
        if (i10 == 1) {
            dVar = new j3.d(this.I, this.f19597t);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            dVar = new x(this.f19589a.b(), this.I, this.f19597t, this.f19600w, this.f19601x, lVar, cls, this.f19603z);
        }
        u b10 = u.b(vVar2);
        this.f19594f.d(dVar, kVar2, b10);
        return b10;
    }

    public void E(boolean z10) {
        if (this.f19595r.d(z10)) {
            F();
        }
    }

    public boolean L() {
        EnumC0308h s10 = s(EnumC0308h.INITIALIZE);
        return s10 == EnumC0308h.RESOURCE_CACHE || s10 == EnumC0308h.DATA_CACHE;
    }

    @Override // j3.f.a
    public void b(h3.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, h3.a aVar, h3.f fVar2) {
        this.I = fVar;
        this.K = obj;
        this.M = dVar;
        this.L = aVar;
        this.J = fVar2;
        this.Q = fVar != this.f19589a.c().get(0);
        if (Thread.currentThread() != this.H) {
            G(g.DECODE_DATA);
            return;
        }
        d4.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            q();
        } finally {
            d4.b.e();
        }
    }

    @Override // d4.a.f
    public d4.c h() {
        return this.f19591c;
    }

    @Override // j3.f.a
    public void i(h3.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, h3.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f19590b.add(qVar);
        if (Thread.currentThread() != this.H) {
            G(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            H();
        }
    }

    @Override // j3.f.a
    public void l() {
        G(g.SWITCH_TO_SOURCE_SERVICE);
    }

    public void m() {
        this.P = true;
        j3.f fVar = this.N;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: n */
    public int compareTo(h<?> hVar) {
        int u10 = u() - hVar.u();
        return u10 == 0 ? this.B - hVar.B : u10;
    }

    @Override // java.lang.Runnable
    public void run() {
        d4.b.c("DecodeJob#run(reason=%s, model=%s)", this.D, this.G);
        com.bumptech.glide.load.data.d<?> dVar = this.M;
        try {
            try {
                try {
                    if (this.P) {
                        A();
                        if (dVar != null) {
                            dVar.b();
                        }
                        d4.b.e();
                        return;
                    }
                    J();
                    if (dVar != null) {
                        dVar.b();
                    }
                    d4.b.e();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.P + ", stage: " + this.C, th2);
                    }
                    if (this.C != EnumC0308h.ENCODE) {
                        this.f19590b.add(th2);
                        A();
                    }
                    if (!this.P) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (j3.b e10) {
                throw e10;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            d4.b.e();
            throw th3;
        }
    }

    public h<R> v(com.bumptech.glide.d dVar, Object obj, n nVar, h3.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, h3.l<?>> map, boolean z10, boolean z11, boolean z12, h3.h hVar, b<R> bVar, int i12) {
        this.f19589a.v(dVar, obj, fVar, i10, i11, jVar, cls, cls2, gVar, hVar, map, z10, z11, this.f19592d);
        this.f19596s = dVar;
        this.f19597t = fVar;
        this.f19598u = gVar;
        this.f19599v = nVar;
        this.f19600w = i10;
        this.f19601x = i11;
        this.f19602y = jVar;
        this.F = z12;
        this.f19603z = hVar;
        this.A = bVar;
        this.B = i12;
        this.D = g.INITIALIZE;
        this.G = obj;
        return this;
    }
}
