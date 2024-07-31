package p319ql;

import cm.AbstractC2057c;
import cm.C2058d;
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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10543r;
import p341rl.C10727d;
import p406vl.C11978e;
import p406vl.C11981h;

/* renamed from: ql.y */
/* loaded from: classes3.dex */
public class C10550y implements Cloneable {

    /* renamed from: O */
    public static final b f26503O = new b(null);

    /* renamed from: P */
    private static final List<EnumC10551z> f26504P = C10727d.m32663w(EnumC10551z.HTTP_2, EnumC10551z.HTTP_1_1);

    /* renamed from: Q */
    private static final List<C10537l> f26505Q = C10727d.m32663w(C10537l.f26404i, C10537l.f26406k);

    /* renamed from: A */
    private final SSLSocketFactory f26506A;

    /* renamed from: B */
    private final X509TrustManager f26507B;

    /* renamed from: C */
    private final List<C10537l> f26508C;

    /* renamed from: D */
    private final List<EnumC10551z> f26509D;

    /* renamed from: E */
    private final HostnameVerifier f26510E;

    /* renamed from: F */
    private final C10532g f26511F;

    /* renamed from: G */
    private final AbstractC2057c f26512G;

    /* renamed from: H */
    private final int f26513H;

    /* renamed from: I */
    private final int f26514I;

    /* renamed from: J */
    private final int f26515J;

    /* renamed from: K */
    private final int f26516K;

    /* renamed from: L */
    private final int f26517L;

    /* renamed from: M */
    private final long f26518M;

    /* renamed from: N */
    private final C11981h f26519N;

    /* renamed from: a */
    private final C10541p f26520a;

    /* renamed from: b */
    private final C10536k f26521b;

    /* renamed from: c */
    private final List<InterfaceC10547v> f26522c;

    /* renamed from: d */
    private final List<InterfaceC10547v> f26523d;

    /* renamed from: e */
    private final AbstractC10543r.c f26524e;

    /* renamed from: f */
    private final boolean f26525f;

    /* renamed from: r */
    private final InterfaceC10522b f26526r;

    /* renamed from: s */
    private final boolean f26527s;

    /* renamed from: t */
    private final boolean f26528t;

    /* renamed from: u */
    private final InterfaceC10539n f26529u;

    /* renamed from: v */
    private final InterfaceC10542q f26530v;

    /* renamed from: w */
    private final Proxy f26531w;

    /* renamed from: x */
    private final ProxySelector f26532x;

    /* renamed from: y */
    private final InterfaceC10522b f26533y;

    /* renamed from: z */
    private final SocketFactory f26534z;

    /* renamed from: ql.y$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: A */
        private int f26535A;

        /* renamed from: B */
        private long f26536B;

        /* renamed from: C */
        private C11981h f26537C;

        /* renamed from: a */
        private C10541p f26538a = new C10541p();

        /* renamed from: b */
        private C10536k f26539b = new C10536k();

        /* renamed from: c */
        private final List<InterfaceC10547v> f26540c = new ArrayList();

        /* renamed from: d */
        private final List<InterfaceC10547v> f26541d = new ArrayList();

        /* renamed from: e */
        private AbstractC10543r.c f26542e = C10727d.m32647g(AbstractC10543r.f26444b);

        /* renamed from: f */
        private boolean f26543f = true;

        /* renamed from: g */
        private InterfaceC10522b f26544g;

        /* renamed from: h */
        private boolean f26545h;

        /* renamed from: i */
        private boolean f26546i;

        /* renamed from: j */
        private InterfaceC10539n f26547j;

        /* renamed from: k */
        private InterfaceC10542q f26548k;

        /* renamed from: l */
        private Proxy f26549l;

        /* renamed from: m */
        private ProxySelector f26550m;

        /* renamed from: n */
        private InterfaceC10522b f26551n;

        /* renamed from: o */
        private SocketFactory f26552o;

        /* renamed from: p */
        private SSLSocketFactory f26553p;

        /* renamed from: q */
        private X509TrustManager f26554q;

        /* renamed from: r */
        private List<C10537l> f26555r;

        /* renamed from: s */
        private List<? extends EnumC10551z> f26556s;

        /* renamed from: t */
        private HostnameVerifier f26557t;

        /* renamed from: u */
        private C10532g f26558u;

        /* renamed from: v */
        private AbstractC2057c f26559v;

        /* renamed from: w */
        private int f26560w;

        /* renamed from: x */
        private int f26561x;

        /* renamed from: y */
        private int f26562y;

        /* renamed from: z */
        private int f26563z;

        public a() {
            InterfaceC10522b interfaceC10522b = InterfaceC10522b.f26195b;
            this.f26544g = interfaceC10522b;
            this.f26545h = true;
            this.f26546i = true;
            this.f26547j = InterfaceC10539n.f26430b;
            this.f26548k = InterfaceC10542q.f26441b;
            this.f26551n = interfaceC10522b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C9322n.m27780d(socketFactory, "getDefault()");
            this.f26552o = socketFactory;
            b bVar = C10550y.f26503O;
            this.f26555r = bVar.m32031a();
            this.f26556s = bVar.m32032b();
            this.f26557t = C2058d.f8151a;
            this.f26558u = C10532g.f26264d;
            this.f26561x = ModuleDescriptor.MODULE_VERSION;
            this.f26562y = ModuleDescriptor.MODULE_VERSION;
            this.f26563z = ModuleDescriptor.MODULE_VERSION;
            this.f26536B = 1024L;
        }

        /* renamed from: A */
        public final boolean m31994A() {
            return this.f26543f;
        }

        /* renamed from: B */
        public final C11981h m31995B() {
            return this.f26537C;
        }

        /* renamed from: C */
        public final SocketFactory m31996C() {
            return this.f26552o;
        }

        /* renamed from: D */
        public final SSLSocketFactory m31997D() {
            return this.f26553p;
        }

        /* renamed from: E */
        public final int m31998E() {
            return this.f26563z;
        }

        /* renamed from: F */
        public final X509TrustManager m31999F() {
            return this.f26554q;
        }

        /* renamed from: G */
        public final a m32000G(long j10, TimeUnit unit) {
            C9322n.m27781e(unit, "unit");
            m32002I(C10727d.m32651k("timeout", j10, unit));
            return this;
        }

        /* renamed from: H */
        public final void m32001H(int i10) {
            this.f26561x = i10;
        }

        /* renamed from: I */
        public final void m32002I(int i10) {
            this.f26562y = i10;
        }

        /* renamed from: J */
        public final void m32003J(int i10) {
            this.f26563z = i10;
        }

        /* renamed from: K */
        public final a m32004K(long j10, TimeUnit unit) {
            C9322n.m27781e(unit, "unit");
            m32003J(C10727d.m32651k("timeout", j10, unit));
            return this;
        }

        /* renamed from: a */
        public final C10550y m32005a() {
            return new C10550y(this);
        }

        /* renamed from: b */
        public final a m32006b(long j10, TimeUnit unit) {
            C9322n.m27781e(unit, "unit");
            m32001H(C10727d.m32651k("timeout", j10, unit));
            return this;
        }

        /* renamed from: c */
        public final InterfaceC10522b m32007c() {
            return this.f26544g;
        }

        /* renamed from: d */
        public final C10524c m32008d() {
            return null;
        }

        /* renamed from: e */
        public final int m32009e() {
            return this.f26560w;
        }

        /* renamed from: f */
        public final AbstractC2057c m32010f() {
            return this.f26559v;
        }

        /* renamed from: g */
        public final C10532g m32011g() {
            return this.f26558u;
        }

        /* renamed from: h */
        public final int m32012h() {
            return this.f26561x;
        }

        /* renamed from: i */
        public final C10536k m32013i() {
            return this.f26539b;
        }

        /* renamed from: j */
        public final List<C10537l> m32014j() {
            return this.f26555r;
        }

        /* renamed from: k */
        public final InterfaceC10539n m32015k() {
            return this.f26547j;
        }

        /* renamed from: l */
        public final C10541p m32016l() {
            return this.f26538a;
        }

        /* renamed from: m */
        public final InterfaceC10542q m32017m() {
            return this.f26548k;
        }

        /* renamed from: n */
        public final AbstractC10543r.c m32018n() {
            return this.f26542e;
        }

        /* renamed from: o */
        public final boolean m32019o() {
            return this.f26545h;
        }

        /* renamed from: p */
        public final boolean m32020p() {
            return this.f26546i;
        }

        /* renamed from: q */
        public final HostnameVerifier m32021q() {
            return this.f26557t;
        }

        /* renamed from: r */
        public final List<InterfaceC10547v> m32022r() {
            return this.f26540c;
        }

        /* renamed from: s */
        public final long m32023s() {
            return this.f26536B;
        }

        /* renamed from: t */
        public final List<InterfaceC10547v> m32024t() {
            return this.f26541d;
        }

        /* renamed from: u */
        public final int m32025u() {
            return this.f26535A;
        }

        /* renamed from: v */
        public final List<EnumC10551z> m32026v() {
            return this.f26556s;
        }

        /* renamed from: w */
        public final Proxy m32027w() {
            return this.f26549l;
        }

        /* renamed from: x */
        public final InterfaceC10522b m32028x() {
            return this.f26551n;
        }

        /* renamed from: y */
        public final ProxySelector m32029y() {
            return this.f26550m;
        }

        /* renamed from: z */
        public final int m32030z() {
            return this.f26562y;
        }
    }

    /* renamed from: ql.y$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final List<C10537l> m32031a() {
            return C10550y.f26505Q;
        }

        /* renamed from: b */
        public final List<EnumC10551z> m32032b() {
            return C10550y.f26504P;
        }
    }

    public C10550y() {
        this(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r0 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10550y(p319ql.C10550y.a r4) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p319ql.C10550y.<init>(ql.y$a):void");
    }

    /* renamed from: H */
    private final void m31963H() {
        boolean z10;
        if (!(!this.f26522c.contains(null))) {
            throw new IllegalStateException(C9322n.m27787k("Null interceptor: ", m31989u()).toString());
        }
        if (!(!this.f26523d.contains(null))) {
            throw new IllegalStateException(C9322n.m27787k("Null network interceptor: ", m31990v()).toString());
        }
        List<C10537l> list = this.f26508C;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C10537l) it.next()).m31755f()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!z10) {
            if (this.f26506A == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f26512G == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f26507B == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f26506A == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f26512G == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f26507B == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!C9322n.m27777a(this.f26511F, C10532g.f26264d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: A */
    public final Proxy m31966A() {
        return this.f26531w;
    }

    /* renamed from: B */
    public final InterfaceC10522b m31967B() {
        return this.f26533y;
    }

    /* renamed from: C */
    public final ProxySelector m31968C() {
        return this.f26532x;
    }

    /* renamed from: D */
    public final int m31969D() {
        return this.f26515J;
    }

    /* renamed from: E */
    public final boolean m31970E() {
        return this.f26525f;
    }

    /* renamed from: F */
    public final SocketFactory m31971F() {
        return this.f26534z;
    }

    /* renamed from: G */
    public final SSLSocketFactory m31972G() {
        SSLSocketFactory sSLSocketFactory = this.f26506A;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: I */
    public final int m31973I() {
        return this.f26516K;
    }

    /* renamed from: c */
    public final InterfaceC10522b m31974c() {
        return this.f26526r;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public final C10524c m31975d() {
        return null;
    }

    /* renamed from: e */
    public final int m31976e() {
        return this.f26513H;
    }

    /* renamed from: g */
    public final C10532g m31977g() {
        return this.f26511F;
    }

    /* renamed from: h */
    public final int m31978h() {
        return this.f26514I;
    }

    /* renamed from: i */
    public final C10536k m31979i() {
        return this.f26521b;
    }

    /* renamed from: j */
    public final List<C10537l> m31980j() {
        return this.f26508C;
    }

    /* renamed from: k */
    public final InterfaceC10539n m31981k() {
        return this.f26529u;
    }

    /* renamed from: l */
    public final C10541p m31982l() {
        return this.f26520a;
    }

    /* renamed from: m */
    public final InterfaceC10542q m31983m() {
        return this.f26530v;
    }

    /* renamed from: p */
    public final AbstractC10543r.c m31984p() {
        return this.f26524e;
    }

    /* renamed from: q */
    public final boolean m31985q() {
        return this.f26527s;
    }

    /* renamed from: r */
    public final boolean m31986r() {
        return this.f26528t;
    }

    /* renamed from: s */
    public final C11981h m31987s() {
        return this.f26519N;
    }

    /* renamed from: t */
    public final HostnameVerifier m31988t() {
        return this.f26510E;
    }

    /* renamed from: u */
    public final List<InterfaceC10547v> m31989u() {
        return this.f26522c;
    }

    /* renamed from: v */
    public final List<InterfaceC10547v> m31990v() {
        return this.f26523d;
    }

    /* renamed from: w */
    public InterfaceC10528e m31991w(C10521a0 request) {
        C9322n.m27781e(request, "request");
        return new C11978e(this, request, false);
    }

    /* renamed from: x */
    public final int m31992x() {
        return this.f26517L;
    }

    /* renamed from: z */
    public final List<EnumC10551z> m31993z() {
        return this.f26509D;
    }
}
