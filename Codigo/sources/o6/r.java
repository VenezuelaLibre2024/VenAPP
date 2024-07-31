package o6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import i6.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k6.c;
import q6.b;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a */
    private final Context f22281a;

    /* renamed from: b */
    private final i6.e f22282b;

    /* renamed from: c */
    private final p6.d f22283c;

    /* renamed from: d */
    private final x f22284d;

    /* renamed from: e */
    private final Executor f22285e;

    /* renamed from: f */
    private final q6.b f22286f;

    /* renamed from: g */
    private final r6.a f22287g;

    /* renamed from: h */
    private final r6.a f22288h;

    /* renamed from: i */
    private final p6.c f22289i;

    public r(Context context, i6.e eVar, p6.d dVar, x xVar, Executor executor, q6.b bVar, r6.a aVar, r6.a aVar2, p6.c cVar) {
        this.f22281a = context;
        this.f22282b = eVar;
        this.f22283c = dVar;
        this.f22284d = xVar;
        this.f22285e = executor;
        this.f22286f = bVar;
        this.f22287g = aVar;
        this.f22288h = aVar2;
        this.f22289i = cVar;
    }

    public /* synthetic */ Boolean l(h6.p pVar) {
        return Boolean.valueOf(this.f22283c.k0(pVar));
    }

    public /* synthetic */ Iterable m(h6.p pVar) {
        return this.f22283c.K(pVar);
    }

    public /* synthetic */ Object n(Iterable iterable, h6.p pVar, long j10) {
        this.f22283c.o0(iterable);
        this.f22283c.f1(pVar, this.f22287g.a() + j10);
        return null;
    }

    public /* synthetic */ Object o(Iterable iterable) {
        this.f22283c.v(iterable);
        return null;
    }

    public /* synthetic */ Object p() {
        this.f22289i.a();
        return null;
    }

    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f22289i.f(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public /* synthetic */ Object r(h6.p pVar, long j10) {
        this.f22283c.f1(pVar, this.f22287g.a() + j10);
        return null;
    }

    public /* synthetic */ Object s(h6.p pVar, int i10) {
        this.f22284d.b(pVar, i10 + 1);
        return null;
    }

    public /* synthetic */ void t(h6.p pVar, int i10, Runnable runnable) {
        try {
            try {
                q6.b bVar = this.f22286f;
                p6.d dVar = this.f22283c;
                Objects.requireNonNull(dVar);
                bVar.b(new b.a() { // from class: o6.i
                    public /* synthetic */ i() {
                    }

                    @Override // q6.b.a
                    public final Object n() {
                        return Integer.valueOf(p6.d.this.u());
                    }
                });
                if (k()) {
                    u(pVar, i10);
                } else {
                    this.f22286f.b(new b.a() { // from class: o6.j

                        /* renamed from: b */
                        public final /* synthetic */ h6.p f22263b;

                        /* renamed from: c */
                        public final /* synthetic */ int f22264c;

                        public /* synthetic */ j(h6.p pVar2, int i102) {
                            r2 = pVar2;
                            r3 = i102;
                        }

                        @Override // q6.b.a
                        public final Object n() {
                            Object s10;
                            s10 = r.this.s(r2, r3);
                            return s10;
                        }
                    });
                }
            } catch (q6.a unused) {
                this.f22284d.b(pVar2, i102 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public h6.i j(i6.m mVar) {
        q6.b bVar = this.f22286f;
        p6.c cVar = this.f22289i;
        Objects.requireNonNull(cVar);
        return mVar.a(h6.i.a().i(this.f22287g.a()).k(this.f22288h.a()).j("GDT_CLIENT_METRICS").h(new h6.h(f6.b.b("proto"), ((k6.a) bVar.b(new b.a() { // from class: o6.h
            public /* synthetic */ h() {
            }

            @Override // q6.b.a
            public final Object n() {
                return p6.c.this.e();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f22281a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public i6.g u(h6.p pVar, int i10) {
        i6.g b10;
        i6.m mVar = this.f22282b.get(pVar.b());
        long j10 = 0;
        i6.g e10 = i6.g.e(0L);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f22286f.b(new b.a() { // from class: o6.k

                /* renamed from: b */
                public final /* synthetic */ h6.p f22266b;

                public /* synthetic */ k(h6.p pVar2) {
                    r2 = pVar2;
                }

                @Override // q6.b.a
                public final Object n() {
                    Boolean l10;
                    l10 = r.this.l(r2);
                    return l10;
                }
            })).booleanValue()) {
                Iterable iterable = (Iterable) this.f22286f.b(new b.a() { // from class: o6.l

                    /* renamed from: b */
                    public final /* synthetic */ h6.p f22268b;

                    public /* synthetic */ l(h6.p pVar2) {
                        r2 = pVar2;
                    }

                    @Override // q6.b.a
                    public final Object n() {
                        Iterable m10;
                        m10 = r.this.m(r2);
                        return m10;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (mVar == null) {
                    l6.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar2);
                    b10 = i6.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((p6.k) it.next()).b());
                    }
                    if (pVar2.e()) {
                        arrayList.add(j(mVar));
                    }
                    b10 = mVar.b(i6.f.a().b(arrayList).c(pVar2.c()).a());
                }
                e10 = b10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f22286f.b(new b.a() { // from class: o6.m

                        /* renamed from: b */
                        public final /* synthetic */ Iterable f22270b;

                        /* renamed from: c */
                        public final /* synthetic */ h6.p f22271c;

                        /* renamed from: d */
                        public final /* synthetic */ long f22272d;

                        public /* synthetic */ m(Iterable iterable2, h6.p pVar2, long j112) {
                            r2 = iterable2;
                            r3 = pVar2;
                            r4 = j112;
                        }

                        @Override // q6.b.a
                        public final Object n() {
                            Object n10;
                            n10 = r.this.n(r2, r3, r4);
                            return n10;
                        }
                    });
                    this.f22284d.a(pVar2, i10 + 1, true);
                    return e10;
                }
                this.f22286f.b(new b.a() { // from class: o6.n

                    /* renamed from: b */
                    public final /* synthetic */ Iterable f22274b;

                    public /* synthetic */ n(Iterable iterable2) {
                        r2 = iterable2;
                    }

                    @Override // q6.b.a
                    public final Object n() {
                        Object o10;
                        o10 = r.this.o(r2);
                        return o10;
                    }
                });
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j112, e10.b());
                    if (pVar2.e()) {
                        this.f22286f.b(new b.a() { // from class: o6.o
                            public /* synthetic */ o() {
                            }

                            @Override // q6.b.a
                            public final Object n() {
                                Object p10;
                                p10 = r.this.p();
                                return p10;
                            }
                        });
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        String j12 = ((p6.k) it2.next()).b().j();
                        hashMap.put(j12, !hashMap.containsKey(j12) ? 1 : Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                    }
                    this.f22286f.b(new b.a() { // from class: o6.p

                        /* renamed from: b */
                        public final /* synthetic */ Map f22277b;

                        public /* synthetic */ p(Map hashMap2) {
                            r2 = hashMap2;
                        }

                        @Override // q6.b.a
                        public final Object n() {
                            Object q10;
                            q10 = r.this.q(r2);
                            return q10;
                        }
                    });
                }
            }
            this.f22286f.b(new b.a() { // from class: o6.q

                /* renamed from: b */
                public final /* synthetic */ h6.p f22279b;

                /* renamed from: c */
                public final /* synthetic */ long f22280c;

                public /* synthetic */ q(h6.p pVar2, long j112) {
                    r2 = pVar2;
                    r3 = j112;
                }

                @Override // q6.b.a
                public final Object n() {
                    Object r10;
                    r10 = r.this.r(r2, r3);
                    return r10;
                }
            });
            return e10;
        }
    }

    public void v(h6.p pVar, int i10, Runnable runnable) {
        this.f22285e.execute(new Runnable() { // from class: o6.g

            /* renamed from: b */
            public final /* synthetic */ h6.p f22257b;

            /* renamed from: c */
            public final /* synthetic */ int f22258c;

            /* renamed from: d */
            public final /* synthetic */ Runnable f22259d;

            public /* synthetic */ g(h6.p pVar2, int i102, Runnable runnable2) {
                r2 = pVar2;
                r3 = i102;
                r4 = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(r2, r3, r4);
            }
        });
    }
}
