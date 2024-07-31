package io.grpc.internal;

import io.grpc.internal.e0;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.y0;

/* loaded from: classes3.dex */
public final class g1 extends vi.t0<g1> {
    private static final Logger H = Logger.getLogger(g1.class.getName());
    static final long I = TimeUnit.MINUTES.toMillis(30);
    static final long J = TimeUnit.SECONDS.toMillis(1);
    private static final o1<? extends Executor> K = f2.c(q0.f19101u);
    private static final vi.v L = vi.v.c();
    private static final vi.o M = vi.o.a();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private final c F;
    private final b G;

    /* renamed from: a, reason: collision with root package name */
    o1<? extends Executor> f18854a;

    /* renamed from: b, reason: collision with root package name */
    o1<? extends Executor> f18855b;

    /* renamed from: c, reason: collision with root package name */
    private final List<vi.h> f18856c;

    /* renamed from: d, reason: collision with root package name */
    final vi.a1 f18857d;

    /* renamed from: e, reason: collision with root package name */
    y0.d f18858e;

    /* renamed from: f, reason: collision with root package name */
    final String f18859f;

    /* renamed from: g, reason: collision with root package name */
    final vi.b f18860g;

    /* renamed from: h, reason: collision with root package name */
    private final SocketAddress f18861h;

    /* renamed from: i, reason: collision with root package name */
    String f18862i;

    /* renamed from: j, reason: collision with root package name */
    String f18863j;

    /* renamed from: k, reason: collision with root package name */
    String f18864k;

    /* renamed from: l, reason: collision with root package name */
    boolean f18865l;

    /* renamed from: m, reason: collision with root package name */
    vi.v f18866m;

    /* renamed from: n, reason: collision with root package name */
    vi.o f18867n;

    /* renamed from: o, reason: collision with root package name */
    long f18868o;

    /* renamed from: p, reason: collision with root package name */
    int f18869p;

    /* renamed from: q, reason: collision with root package name */
    int f18870q;

    /* renamed from: r, reason: collision with root package name */
    long f18871r;

    /* renamed from: s, reason: collision with root package name */
    long f18872s;

    /* renamed from: t, reason: collision with root package name */
    boolean f18873t;

    /* renamed from: u, reason: collision with root package name */
    vi.c0 f18874u;

    /* renamed from: v, reason: collision with root package name */
    int f18875v;

    /* renamed from: w, reason: collision with root package name */
    Map<String, ?> f18876w;

    /* renamed from: x, reason: collision with root package name */
    boolean f18877x;

    /* renamed from: y, reason: collision with root package name */
    vi.d1 f18878y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f18879z;

    /* loaded from: classes3.dex */
    public interface b {
        int a();
    }

    /* loaded from: classes3.dex */
    public interface c {
        t a();
    }

    /* loaded from: classes3.dex */
    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.g1.b
        public int a() {
            return 443;
        }
    }

    public g1(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    public g1(String str, vi.e eVar, vi.b bVar, c cVar, b bVar2) {
        o1<? extends Executor> o1Var = K;
        this.f18854a = o1Var;
        this.f18855b = o1Var;
        this.f18856c = new ArrayList();
        vi.a1 d10 = vi.a1.d();
        this.f18857d = d10;
        this.f18858e = d10.c();
        this.f18864k = "pick_first";
        this.f18866m = L;
        this.f18867n = M;
        this.f18868o = I;
        this.f18869p = 5;
        this.f18870q = 5;
        this.f18871r = 16777216L;
        this.f18872s = 1048576L;
        this.f18873t = true;
        this.f18874u = vi.c0.g();
        this.f18877x = true;
        this.f18879z = true;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = true;
        this.f18859f = (String) eb.o.p(str, "target");
        this.f18860g = bVar;
        this.F = (c) eb.o.p(cVar, "clientTransportFactoryBuilder");
        this.f18861h = null;
        if (bVar2 != null) {
            this.G = bVar2;
        } else {
            this.G = new d();
        }
    }

    @Override // vi.t0
    public vi.s0 a() {
        return new h1(new f1(this, this.F.a(), new e0.a(), f2.c(q0.f19101u), q0.f19103w, d(), k2.f18945a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.G.a();
    }

    List<vi.h> d() {
        boolean z10;
        vi.h hVar;
        ArrayList arrayList = new ArrayList(this.f18856c);
        List<vi.h> a10 = vi.g0.a();
        if (a10 != null) {
            arrayList.addAll(a10);
            z10 = true;
        } else {
            z10 = false;
        }
        vi.h hVar2 = null;
        if (!z10 && this.f18879z) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class<?> cls2 = Boolean.TYPE;
                hVar = (vi.h) cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.A), Boolean.valueOf(this.B), Boolean.valueOf(this.C), Boolean.valueOf(this.D));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                H.log(Level.FINE, "Unable to apply census stats", e10);
                hVar = null;
            }
            if (hVar != null) {
                arrayList.add(0, hVar);
            }
        }
        if (!z10 && this.E) {
            try {
                hVar2 = (vi.h) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                H.log(Level.FINE, "Unable to apply census stats", e11);
            }
            if (hVar2 != null) {
                arrayList.add(0, hVar2);
            }
        }
        return arrayList;
    }
}
