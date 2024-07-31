package ql;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ql.r;

/* loaded from: classes3.dex */
public class y implements Cloneable {
    public static final b O = new b(null);
    private static final List<z> P = rl.d.w(z.HTTP_2, z.HTTP_1_1);
    private static final List<l> Q = rl.d.w(l.f24310i, l.f24312k);
    private final SSLSocketFactory A;
    private final X509TrustManager B;
    private final List<l> C;
    private final List<z> D;
    private final HostnameVerifier E;
    private final g F;
    private final cm.c G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private final long M;
    private final vl.h N;

    /* renamed from: a */
    private final p f24409a;

    /* renamed from: b */
    private final k f24410b;

    /* renamed from: c */
    private final List<v> f24411c;

    /* renamed from: d */
    private final List<v> f24412d;

    /* renamed from: e */
    private final r.c f24413e;

    /* renamed from: f */
    private final boolean f24414f;

    /* renamed from: r */
    private final ql.b f24415r;

    /* renamed from: s */
    private final boolean f24416s;

    /* renamed from: t */
    private final boolean f24417t;

    /* renamed from: u */
    private final n f24418u;

    /* renamed from: v */
    private final q f24419v;

    /* renamed from: w */
    private final Proxy f24420w;

    /* renamed from: x */
    private final ProxySelector f24421x;

    /* renamed from: y */
    private final ql.b f24422y;

    /* renamed from: z */
    private final SocketFactory f24423z;

    /* loaded from: classes3.dex */
    public static final class a {
        private int A;
        private long B;
        private vl.h C;

        /* renamed from: a */
        private p f24424a = new p();

        /* renamed from: b */
        private k f24425b = new k();

        /* renamed from: c */
        private final List<v> f24426c = new ArrayList();

        /* renamed from: d */
        private final List<v> f24427d = new ArrayList();

        /* renamed from: e */
        private r.c f24428e = rl.d.g(r.f24350b);

        /* renamed from: f */
        private boolean f24429f = true;

        /* renamed from: g */
        private ql.b f24430g;

        /* renamed from: h */
        private boolean f24431h;

        /* renamed from: i */
        private boolean f24432i;

        /* renamed from: j */
        private n f24433j;

        /* renamed from: k */
        private q f24434k;

        /* renamed from: l */
        private Proxy f24435l;

        /* renamed from: m */
        private ProxySelector f24436m;

        /* renamed from: n */
        private ql.b f24437n;

        /* renamed from: o */
        private SocketFactory f24438o;

        /* renamed from: p */
        private SSLSocketFactory f24439p;

        /* renamed from: q */
        private X509TrustManager f24440q;

        /* renamed from: r */
        private List<l> f24441r;

        /* renamed from: s */
        private List<? extends z> f24442s;

        /* renamed from: t */
        private HostnameVerifier f24443t;

        /* renamed from: u */
        private g f24444u;

        /* renamed from: v */
        private cm.c f24445v;

        /* renamed from: w */
        private int f24446w;

        /* renamed from: x */
        private int f24447x;

        /* renamed from: y */
        private int f24448y;

        /* renamed from: z */
        private int f24449z;

        public a() {
            ql.b bVar = ql.b.f24153b;
            this.f24430g = bVar;
            this.f24431h = true;
            this.f24432i = true;
            this.f24433j = n.f24336b;
            this.f24434k = q.f24347b;
            this.f24437n = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.n.d(socketFactory, "getDefault()");
            this.f24438o = socketFactory;
            b bVar2 = y.O;
            this.f24441r = bVar2.a();
            this.f24442s = bVar2.b();
            this.f24443t = cm.d.f7199a;
            this.f24444u = g.f24222d;
            this.f24447x = ModuleDescriptor.MODULE_VERSION;
            this.f24448y = ModuleDescriptor.MODULE_VERSION;
            this.f24449z = ModuleDescriptor.MODULE_VERSION;
            this.B = 1024L;
        }

        public final boolean A() {
            return this.f24429f;
        }

        public final vl.h B() {
            return this.C;
        }

        public final SocketFactory C() {
            return this.f24438o;
        }

        public final SSLSocketFactory D() {
            return this.f24439p;
        }

        public final int E() {
            return this.f24449z;
        }

        public final X509TrustManager F() {
            return this.f24440q;
        }

        public final a G(long j10, TimeUnit unit) {
            kotlin.jvm.internal.n.e(unit, "unit");
            I(rl.d.k("timeout", j10, unit));
            return this;
        }

        public final void H(int i10) {
            this.f24447x = i10;
        }

        public final void I(int i10) {
            this.f24448y = i10;
        }

        public final void J(int i10) {
            this.f24449z = i10;
        }

        public final a K(long j10, TimeUnit unit) {
            kotlin.jvm.internal.n.e(unit, "unit");
            J(rl.d.k("timeout", j10, unit));
            return this;
        }

        public final y a() {
            return new y(this);
        }

        public final a b(long j10, TimeUnit unit) {
            kotlin.jvm.internal.n.e(unit, "unit");
            H(rl.d.k("timeout", j10, unit));
            return this;
        }

        public final ql.b c() {
            return this.f24430g;
        }

        public final c d() {
            return null;
        }

        public final int e() {
            return this.f24446w;
        }

        public final cm.c f() {
            return this.f24445v;
        }

        public final g g() {
            return this.f24444u;
        }

        public final int h() {
            return this.f24447x;
        }

        public final k i() {
            return this.f24425b;
        }

        public final List<l> j() {
            return this.f24441r;
        }

        public final n k() {
            return this.f24433j;
        }

        public final p l() {
            return this.f24424a;
        }

        public final q m() {
            return this.f24434k;
        }

        public final r.c n() {
            return this.f24428e;
        }

        public final boolean o() {
            return this.f24431h;
        }

        public final boolean p() {
            return this.f24432i;
        }

        public final HostnameVerifier q() {
            return this.f24443t;
        }

        public final List<v> r() {
            return this.f24426c;
        }

        public final long s() {
            return this.B;
        }

        public final List<v> t() {
            return this.f24427d;
        }

        public final int u() {
            return this.A;
        }

        public final List<z> v() {
            return this.f24442s;
        }

        public final Proxy w() {
            return this.f24435l;
        }

        public final ql.b x() {
            return this.f24437n;
        }

        public final ProxySelector y() {
            return this.f24436m;
        }

        public final int z() {
            return this.f24448y;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final List<l> a() {
            return y.Q;
        }

        public final List<z> b() {
            return y.P;
        }
    }

    public y() {
        this(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r0 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(ql.y.a r4) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.y.<init>(ql.y$a):void");
    }

    private final void H() {
        boolean z10;
        if (!(!this.f24411c.contains(null))) {
            throw new IllegalStateException(kotlin.jvm.internal.n.k("Null interceptor: ", u()).toString());
        }
        if (!(!this.f24412d.contains(null))) {
            throw new IllegalStateException(kotlin.jvm.internal.n.k("Null network interceptor: ", v()).toString());
        }
        List<l> list = this.C;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!z10) {
            if (this.A == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.G == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.B == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.A == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.G == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.B == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!kotlin.jvm.internal.n.a(this.F, g.f24222d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final Proxy A() {
        return this.f24420w;
    }

    public final ql.b B() {
        return this.f24422y;
    }

    public final ProxySelector C() {
        return this.f24421x;
    }

    public final int D() {
        return this.J;
    }

    public final boolean E() {
        return this.f24414f;
    }

    public final SocketFactory F() {
        return this.f24423z;
    }

    public final SSLSocketFactory G() {
        SSLSocketFactory sSLSocketFactory = this.A;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int I() {
        return this.K;
    }

    public final ql.b c() {
        return this.f24415r;
    }

    public Object clone() {
        return super.clone();
    }

    public final c d() {
        return null;
    }

    public final int e() {
        return this.H;
    }

    public final g g() {
        return this.F;
    }

    public final int h() {
        return this.I;
    }

    public final k i() {
        return this.f24410b;
    }

    public final List<l> j() {
        return this.C;
    }

    public final n k() {
        return this.f24418u;
    }

    public final p l() {
        return this.f24409a;
    }

    public final q m() {
        return this.f24419v;
    }

    public final r.c p() {
        return this.f24413e;
    }

    public final boolean q() {
        return this.f24416s;
    }

    public final boolean r() {
        return this.f24417t;
    }

    public final vl.h s() {
        return this.N;
    }

    public final HostnameVerifier t() {
        return this.E;
    }

    public final List<v> u() {
        return this.f24411c;
    }

    public final List<v> v() {
        return this.f24412d;
    }

    public e w(a0 request) {
        kotlin.jvm.internal.n.e(request, "request");
        return new vl.e(this, request, false);
    }

    public final int x() {
        return this.L;
    }

    public final List<z> z() {
        return this.D;
    }
}
