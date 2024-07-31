package p397v7;

import android.content.Context;
import com.google.android.gms.common.api.C5101a;
import com.google.common.collect.AbstractC5907w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p082eb.InterfaceC7166v;
import p120g8.C7495m;
import p120g8.InterfaceC7494l;
import p351s8.C10840r;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10827j;
import p361t6.C11010c2;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11685a1;
import p397v7.C11724q0;
import p397v7.InterfaceC11684a0;
import p436x6.InterfaceC12332x;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: v7.q */
/* loaded from: classes.dex */
public final class C11723q implements InterfaceC11684a0.a {

    /* renamed from: a */
    private final a f30827a;

    /* renamed from: b */
    private InterfaceC10827j.a f30828b;

    /* renamed from: c */
    private InterfaceC11684a0.a f30829c;

    /* renamed from: d */
    private InterfaceC10816d0 f30830d;

    /* renamed from: e */
    private long f30831e;

    /* renamed from: f */
    private long f30832f;

    /* renamed from: g */
    private long f30833g;

    /* renamed from: h */
    private float f30834h;

    /* renamed from: i */
    private float f30835i;

    /* renamed from: j */
    private boolean f30836j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC12626p f30837a;

        /* renamed from: b */
        private final Map<Integer, InterfaceC7166v<InterfaceC11684a0.a>> f30838b = new HashMap();

        /* renamed from: c */
        private final Set<Integer> f30839c = new HashSet();

        /* renamed from: d */
        private final Map<Integer, InterfaceC11684a0.a> f30840d = new HashMap();

        /* renamed from: e */
        private InterfaceC10827j.a f30841e;

        /* renamed from: f */
        private InterfaceC12332x f30842f;

        /* renamed from: g */
        private InterfaceC10816d0 f30843g;

        public a(InterfaceC12626p interfaceC12626p) {
            this.f30837a = interfaceC12626p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ InterfaceC11684a0.a m36991k(InterfaceC10827j.a aVar) {
            return new C11724q0.b(aVar, this.f30837a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private p082eb.InterfaceC7166v<p397v7.InterfaceC11684a0.a> m36992l(int r5) {
            /*
                r4 = this;
                java.util.Map<java.lang.Integer, eb.v<v7.a0$a>> r0 = r4.f30838b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L19
                java.util.Map<java.lang.Integer, eb.v<v7.a0$a>> r0 = r4.f30838b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r0.get(r5)
                eb.v r5 = (p082eb.InterfaceC7166v) r5
                return r5
            L19:
                s8.j$a r0 = r4.f30841e
                java.lang.Object r0 = p363t8.C11137a.m34603e(r0)
                s8.j$a r0 = (p351s8.InterfaceC10827j.a) r0
                java.lang.Class<v7.a0$a> r1 = p397v7.InterfaceC11684a0.a.class
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
                java.util.Map<java.lang.Integer, eb.v<v7.a0$a>> r0 = r4.f30838b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0.put(r1, r2)
                if (r2 == 0) goto L7e
                java.util.Set<java.lang.Integer> r0 = r4.f30839c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.add(r5)
            L7e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p397v7.C11723q.a.m36992l(int):eb.v");
        }

        /* renamed from: f */
        public InterfaceC11684a0.a m36993f(int i10) {
            InterfaceC11684a0.a aVar = this.f30840d.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            InterfaceC7166v<InterfaceC11684a0.a> m36992l = m36992l(i10);
            if (m36992l == null) {
                return null;
            }
            InterfaceC11684a0.a aVar2 = m36992l.get();
            InterfaceC12332x interfaceC12332x = this.f30842f;
            if (interfaceC12332x != null) {
                aVar2.mo11847b(interfaceC12332x);
            }
            InterfaceC10816d0 interfaceC10816d0 = this.f30843g;
            if (interfaceC10816d0 != null) {
                aVar2.mo11848c(interfaceC10816d0);
            }
            this.f30840d.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        /* renamed from: m */
        public void m36994m(InterfaceC10827j.a aVar) {
            if (aVar != this.f30841e) {
                this.f30841e = aVar;
                this.f30838b.clear();
                this.f30840d.clear();
            }
        }

        /* renamed from: n */
        public void m36995n(InterfaceC12332x interfaceC12332x) {
            this.f30842f = interfaceC12332x;
            Iterator<InterfaceC11684a0.a> it = this.f30840d.values().iterator();
            while (it.hasNext()) {
                it.next().mo11847b(interfaceC12332x);
            }
        }

        /* renamed from: o */
        public void m36996o(InterfaceC10816d0 interfaceC10816d0) {
            this.f30843g = interfaceC10816d0;
            Iterator<InterfaceC11684a0.a> it = this.f30840d.values().iterator();
            while (it.hasNext()) {
                it.next().mo11848c(interfaceC10816d0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.q$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC12621k {

        /* renamed from: a */
        private final C11108u1 f30844a;

        public b(C11108u1 c11108u1) {
            this.f30844a = c11108u1;
        }

        @Override // p459y6.InterfaceC12621k
        /* renamed from: a */
        public void mo121a(long j10, long j11) {
        }

        @Override // p459y6.InterfaceC12621k
        /* renamed from: b */
        public void mo122b(InterfaceC12623m interfaceC12623m) {
            InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(0, 3);
            interfaceC12623m.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
            interfaceC12623m.mo324q();
            mo308d.mo332c(this.f30844a.m34488c().m34552g0("text/x-unknown").m34530K(this.f30844a.f28797w).m34526G());
        }

        @Override // p459y6.InterfaceC12621k
        /* renamed from: e */
        public boolean mo123e(InterfaceC12622l interfaceC12622l) {
            return true;
        }

        @Override // p459y6.InterfaceC12621k
        /* renamed from: f */
        public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
            return interfaceC12622l.mo41532a(C5101a.e.API_PRIORITY_OTHER) == -1 ? -1 : 0;
        }

        @Override // p459y6.InterfaceC12621k
        public void release() {
        }
    }

    public C11723q(Context context, InterfaceC12626p interfaceC12626p) {
        this(new C10840r.a(context), interfaceC12626p);
    }

    public C11723q(InterfaceC10827j.a aVar, InterfaceC12626p interfaceC12626p) {
        this.f30828b = aVar;
        a aVar2 = new a(interfaceC12626p);
        this.f30827a = aVar2;
        aVar2.m36994m(aVar);
        this.f30831e = -9223372036854775807L;
        this.f30832f = -9223372036854775807L;
        this.f30833g = -9223372036854775807L;
        this.f30834h = -3.4028235E38f;
        this.f30835i = -3.4028235E38f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ InterfaceC11684a0.a m36973e(Class cls) {
        return m36978j(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC11684a0.a m36974f(Class cls, InterfaceC10827j.a aVar) {
        return m36979k(cls, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ InterfaceC12621k[] m36975g(C11108u1 c11108u1) {
        InterfaceC12621k[] interfaceC12621kArr = new InterfaceC12621k[1];
        InterfaceC7494l interfaceC7494l = InterfaceC7494l.f17704a;
        interfaceC12621kArr[0] = interfaceC7494l.mo22812a(c11108u1) ? new C7495m(interfaceC7494l.mo22813b(c11108u1), c11108u1) : new b(c11108u1);
        return interfaceC12621kArr;
    }

    /* renamed from: h */
    private static InterfaceC11684a0 m36976h(C11010c2 c11010c2, InterfaceC11684a0 interfaceC11684a0) {
        C11010c2.d dVar = c11010c2.f28028f;
        if (dVar.f28050a == 0 && dVar.f28051b == Long.MIN_VALUE && !dVar.f28053d) {
            return interfaceC11684a0;
        }
        long m34861C0 = C11172r0.m34861C0(c11010c2.f28028f.f28050a);
        long m34861C02 = C11172r0.m34861C0(c11010c2.f28028f.f28051b);
        C11010c2.d dVar2 = c11010c2.f28028f;
        return new C11695e(interfaceC11684a0, m34861C0, m34861C02, !dVar2.f28054e, dVar2.f28052c, dVar2.f28053d);
    }

    /* renamed from: i */
    private InterfaceC11684a0 m36977i(C11010c2 c11010c2, InterfaceC11684a0 interfaceC11684a0) {
        C11137a.m34603e(c11010c2.f28024b);
        c11010c2.f28024b.getClass();
        return interfaceC11684a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static InterfaceC11684a0.a m36978j(Class<? extends InterfaceC11684a0.a> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static InterfaceC11684a0.a m36979k(Class<? extends InterfaceC11684a0.a> cls, InterfaceC10827j.a aVar) {
        try {
            return cls.getConstructor(InterfaceC10827j.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // p397v7.InterfaceC11684a0.a
    /* renamed from: a */
    public InterfaceC11684a0 mo11846a(C11010c2 c11010c2) {
        C11137a.m34603e(c11010c2.f28024b);
        String scheme = c11010c2.f28024b.f28097a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((InterfaceC11684a0.a) C11137a.m34603e(this.f30829c)).mo11846a(c11010c2);
        }
        C11010c2.h hVar = c11010c2.f28024b;
        int m34941p0 = C11172r0.m34941p0(hVar.f28097a, hVar.f28098b);
        InterfaceC11684a0.a m36993f = this.f30827a.m36993f(m34941p0);
        C11137a.m34608j(m36993f, "No suitable media source factory found for content type: " + m34941p0);
        C11010c2.g.a m33765c = c11010c2.f28026d.m33765c();
        if (c11010c2.f28026d.f28087a == -9223372036854775807L) {
            m33765c.m33776k(this.f30831e);
        }
        if (c11010c2.f28026d.f28090d == -3.4028235E38f) {
            m33765c.m33775j(this.f30834h);
        }
        if (c11010c2.f28026d.f28091e == -3.4028235E38f) {
            m33765c.m33773h(this.f30835i);
        }
        if (c11010c2.f28026d.f28088b == -9223372036854775807L) {
            m33765c.m33774i(this.f30832f);
        }
        if (c11010c2.f28026d.f28089c == -9223372036854775807L) {
            m33765c.m33772g(this.f30833g);
        }
        C11010c2.g m33771f = m33765c.m33771f();
        if (!m33771f.equals(c11010c2.f28026d)) {
            c11010c2 = c11010c2.m33727c().m33730c(m33771f).m33728a();
        }
        InterfaceC11684a0 mo11846a = m36993f.mo11846a(c11010c2);
        AbstractC5907w<C11010c2.l> abstractC5907w = ((C11010c2.h) C11172r0.m34928j(c11010c2.f28024b)).f28102f;
        if (!abstractC5907w.isEmpty()) {
            InterfaceC11684a0[] interfaceC11684a0Arr = new InterfaceC11684a0[abstractC5907w.size() + 1];
            interfaceC11684a0Arr[0] = mo11846a;
            for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
                if (this.f30836j) {
                    final C11108u1 m34526G = new C11108u1.b().m34552g0(abstractC5907w.get(i10).f28117b).m34543X(abstractC5907w.get(i10).f28118c).m34554i0(abstractC5907w.get(i10).f28119d).m34550e0(abstractC5907w.get(i10).f28120e).m34542W(abstractC5907w.get(i10).f28121f).m34540U(abstractC5907w.get(i10).f28122g).m34526G();
                    C11724q0.b bVar = new C11724q0.b(this.f30828b, new InterfaceC12626p() { // from class: v7.k
                        @Override // p459y6.InterfaceC12626p
                        /* renamed from: c */
                        public final InterfaceC12621k[] mo9153c() {
                            InterfaceC12621k[] m36975g;
                            m36975g = C11723q.m36975g(C11108u1.this);
                            return m36975g;
                        }
                    });
                    InterfaceC10816d0 interfaceC10816d0 = this.f30830d;
                    if (interfaceC10816d0 != null) {
                        bVar.mo11848c(interfaceC10816d0);
                    }
                    interfaceC11684a0Arr[i10 + 1] = bVar.mo11846a(C11010c2.m33726f(abstractC5907w.get(i10).f28116a.toString()));
                } else {
                    C11685a1.b bVar2 = new C11685a1.b(this.f30828b);
                    InterfaceC10816d0 interfaceC10816d02 = this.f30830d;
                    if (interfaceC10816d02 != null) {
                        bVar2.m36822b(interfaceC10816d02);
                    }
                    interfaceC11684a0Arr[i10 + 1] = bVar2.m36821a(abstractC5907w.get(i10), -9223372036854775807L);
                }
            }
            mo11846a = new C11710j0(interfaceC11684a0Arr);
        }
        return m36977i(c11010c2, m36976h(c11010c2, mo11846a));
    }

    @Override // p397v7.InterfaceC11684a0.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C11723q mo11847b(InterfaceC12332x interfaceC12332x) {
        this.f30827a.m36995n((InterfaceC12332x) C11137a.m34604f(interfaceC12332x, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // p397v7.InterfaceC11684a0.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C11723q mo11848c(InterfaceC10816d0 interfaceC10816d0) {
        this.f30830d = (InterfaceC10816d0) C11137a.m34604f(interfaceC10816d0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f30827a.m36996o(interfaceC10816d0);
        return this;
    }
}
