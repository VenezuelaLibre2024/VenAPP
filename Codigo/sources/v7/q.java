package v7;

import android.content.Context;
import com.google.android.gms.common.api.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s8.j;
import s8.r;
import t6.c2;
import t6.u1;
import v7.a0;
import v7.a1;
import v7.q0;
import y6.z;

/* loaded from: classes.dex */
public final class q implements a0.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f28417a;

    /* renamed from: b, reason: collision with root package name */
    private j.a f28418b;

    /* renamed from: c, reason: collision with root package name */
    private a0.a f28419c;

    /* renamed from: d, reason: collision with root package name */
    private s8.d0 f28420d;

    /* renamed from: e, reason: collision with root package name */
    private long f28421e;

    /* renamed from: f, reason: collision with root package name */
    private long f28422f;

    /* renamed from: g, reason: collision with root package name */
    private long f28423g;

    /* renamed from: h, reason: collision with root package name */
    private float f28424h;

    /* renamed from: i, reason: collision with root package name */
    private float f28425i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28426j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final y6.p f28427a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Integer, eb.v<a0.a>> f28428b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Set<Integer> f28429c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Map<Integer, a0.a> f28430d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private j.a f28431e;

        /* renamed from: f, reason: collision with root package name */
        private x6.x f28432f;

        /* renamed from: g, reason: collision with root package name */
        private s8.d0 f28433g;

        public a(y6.p pVar) {
            this.f28427a = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ a0.a k(j.a aVar) {
            return new q0.b(aVar, this.f28427a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private eb.v<v7.a0.a> l(int r5) {
            /*
                r4 = this;
                java.util.Map<java.lang.Integer, eb.v<v7.a0$a>> r0 = r4.f28428b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L19
                java.util.Map<java.lang.Integer, eb.v<v7.a0$a>> r0 = r4.f28428b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r0.get(r5)
                eb.v r5 = (eb.v) r5
                return r5
            L19:
                s8.j$a r0 = r4.f28431e
                java.lang.Object r0 = t8.a.e(r0)
                s8.j$a r0 = (s8.j.a) r0
                java.lang.Class<v7.a0$a> r1 = v7.a0.a.class
                r2 = 0
                if (r5 == 0) goto L5e
                r3 = 1
                if (r5 == r3) goto L52
                r3 = 2
                if (r5 == r3) goto L46
                r3 = 3
                if (r5 == r3) goto L3a
                r1 = 4
                if (r5 == r1) goto L33
                goto L6a
            L33:
                v7.p r1 = new v7.p     // Catch: java.lang.ClassNotFoundException -> L6a
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L6a
            L38:
                r2 = r1
                goto L6a
            L3a:
                java.lang.Class<com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory> r0 = com.google.android.exoplayer2.source.rtsp.RtspMediaSource.Factory.class
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6a
                v7.o r1 = new v7.o     // Catch: java.lang.ClassNotFoundException -> L6a
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L6a
                goto L38
            L46:
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6a
                v7.n r3 = new v7.n     // Catch: java.lang.ClassNotFoundException -> L6a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6a
                goto L69
            L52:
                java.lang.Class<com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6a
                v7.m r3 = new v7.m     // Catch: java.lang.ClassNotFoundException -> L6a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6a
                goto L69
            L5e:
                java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6a
                v7.l r3 = new v7.l     // Catch: java.lang.ClassNotFoundException -> L6a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6a
            L69:
                r2 = r3
            L6a:
                java.util.Map<java.lang.Integer, eb.v<v7.a0$a>> r0 = r4.f28428b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0.put(r1, r2)
                if (r2 == 0) goto L7e
                java.util.Set<java.lang.Integer> r0 = r4.f28429c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.add(r5)
            L7e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: v7.q.a.l(int):eb.v");
        }

        public a0.a f(int i10) {
            a0.a aVar = this.f28430d.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            eb.v<a0.a> l10 = l(i10);
            if (l10 == null) {
                return null;
            }
            a0.a aVar2 = l10.get();
            x6.x xVar = this.f28432f;
            if (xVar != null) {
                aVar2.b(xVar);
            }
            s8.d0 d0Var = this.f28433g;
            if (d0Var != null) {
                aVar2.c(d0Var);
            }
            this.f28430d.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void m(j.a aVar) {
            if (aVar != this.f28431e) {
                this.f28431e = aVar;
                this.f28428b.clear();
                this.f28430d.clear();
            }
        }

        public void n(x6.x xVar) {
            this.f28432f = xVar;
            Iterator<a0.a> it = this.f28430d.values().iterator();
            while (it.hasNext()) {
                it.next().b(xVar);
            }
        }

        public void o(s8.d0 d0Var) {
            this.f28433g = d0Var;
            Iterator<a0.a> it = this.f28430d.values().iterator();
            while (it.hasNext()) {
                it.next().c(d0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements y6.k {

        /* renamed from: a, reason: collision with root package name */
        private final u1 f28434a;

        public b(u1 u1Var) {
            this.f28434a = u1Var;
        }

        @Override // y6.k
        public void a(long j10, long j11) {
        }

        @Override // y6.k
        public void b(y6.m mVar) {
            y6.b0 d10 = mVar.d(0, 3);
            mVar.p(new z.b(-9223372036854775807L));
            mVar.q();
            d10.c(this.f28434a.c().g0("text/x-unknown").K(this.f28434a.f26517w).G());
        }

        @Override // y6.k
        public boolean e(y6.l lVar) {
            return true;
        }

        @Override // y6.k
        public int f(y6.l lVar, y6.y yVar) {
            return lVar.a(a.e.API_PRIORITY_OTHER) == -1 ? -1 : 0;
        }

        @Override // y6.k
        public void release() {
        }
    }

    public q(Context context, y6.p pVar) {
        this(new r.a(context), pVar);
    }

    public q(j.a aVar, y6.p pVar) {
        this.f28418b = aVar;
        a aVar2 = new a(pVar);
        this.f28417a = aVar2;
        aVar2.m(aVar);
        this.f28421e = -9223372036854775807L;
        this.f28422f = -9223372036854775807L;
        this.f28423g = -9223372036854775807L;
        this.f28424h = -3.4028235E38f;
        this.f28425i = -3.4028235E38f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ a0.a e(Class cls) {
        return j(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ a0.a f(Class cls, j.a aVar) {
        return k(cls, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6.k[] g(u1 u1Var) {
        y6.k[] kVarArr = new y6.k[1];
        g8.l lVar = g8.l.f16090a;
        kVarArr[0] = lVar.a(u1Var) ? new g8.m(lVar.b(u1Var), u1Var) : new b(u1Var);
        return kVarArr;
    }

    private static a0 h(c2 c2Var, a0 a0Var) {
        c2.d dVar = c2Var.f25884f;
        if (dVar.f25906a == 0 && dVar.f25907b == Long.MIN_VALUE && !dVar.f25909d) {
            return a0Var;
        }
        long C0 = t8.r0.C0(c2Var.f25884f.f25906a);
        long C02 = t8.r0.C0(c2Var.f25884f.f25907b);
        c2.d dVar2 = c2Var.f25884f;
        return new e(a0Var, C0, C02, !dVar2.f25910e, dVar2.f25908c, dVar2.f25909d);
    }

    private a0 i(c2 c2Var, a0 a0Var) {
        t8.a.e(c2Var.f25880b);
        c2Var.f25880b.getClass();
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a0.a j(Class<? extends a0.a> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a0.a k(Class<? extends a0.a> cls, j.a aVar) {
        try {
            return cls.getConstructor(j.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // v7.a0.a
    public a0 a(c2 c2Var) {
        t8.a.e(c2Var.f25880b);
        String scheme = c2Var.f25880b.f25953a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((a0.a) t8.a.e(this.f28419c)).a(c2Var);
        }
        c2.h hVar = c2Var.f25880b;
        int p02 = t8.r0.p0(hVar.f25953a, hVar.f25954b);
        a0.a f10 = this.f28417a.f(p02);
        t8.a.j(f10, "No suitable media source factory found for content type: " + p02);
        c2.g.a c10 = c2Var.f25882d.c();
        if (c2Var.f25882d.f25943a == -9223372036854775807L) {
            c10.k(this.f28421e);
        }
        if (c2Var.f25882d.f25946d == -3.4028235E38f) {
            c10.j(this.f28424h);
        }
        if (c2Var.f25882d.f25947e == -3.4028235E38f) {
            c10.h(this.f28425i);
        }
        if (c2Var.f25882d.f25944b == -9223372036854775807L) {
            c10.i(this.f28422f);
        }
        if (c2Var.f25882d.f25945c == -9223372036854775807L) {
            c10.g(this.f28423g);
        }
        c2.g f11 = c10.f();
        if (!f11.equals(c2Var.f25882d)) {
            c2Var = c2Var.c().c(f11).a();
        }
        a0 a10 = f10.a(c2Var);
        com.google.common.collect.w<c2.l> wVar = ((c2.h) t8.r0.j(c2Var.f25880b)).f25958f;
        if (!wVar.isEmpty()) {
            a0[] a0VarArr = new a0[wVar.size() + 1];
            a0VarArr[0] = a10;
            for (int i10 = 0; i10 < wVar.size(); i10++) {
                if (this.f28426j) {
                    final u1 G = new u1.b().g0(wVar.get(i10).f25973b).X(wVar.get(i10).f25974c).i0(wVar.get(i10).f25975d).e0(wVar.get(i10).f25976e).W(wVar.get(i10).f25977f).U(wVar.get(i10).f25978g).G();
                    q0.b bVar = new q0.b(this.f28418b, new y6.p() { // from class: v7.k
                        @Override // y6.p
                        public final y6.k[] c() {
                            y6.k[] g10;
                            g10 = q.g(u1.this);
                            return g10;
                        }
                    });
                    s8.d0 d0Var = this.f28420d;
                    if (d0Var != null) {
                        bVar.c(d0Var);
                    }
                    a0VarArr[i10 + 1] = bVar.a(c2.f(wVar.get(i10).f25972a.toString()));
                } else {
                    a1.b bVar2 = new a1.b(this.f28418b);
                    s8.d0 d0Var2 = this.f28420d;
                    if (d0Var2 != null) {
                        bVar2.b(d0Var2);
                    }
                    a0VarArr[i10 + 1] = bVar2.a(wVar.get(i10), -9223372036854775807L);
                }
            }
            a10 = new j0(a0VarArr);
        }
        return i(c2Var, h(c2Var, a10));
    }

    @Override // v7.a0.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public q b(x6.x xVar) {
        this.f28417a.n((x6.x) t8.a.f(xVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // v7.a0.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public q c(s8.d0 d0Var) {
        this.f28420d = (s8.d0) t8.a.f(d0Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f28417a.o(d0Var);
        return this;
    }
}
