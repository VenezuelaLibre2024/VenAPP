package p266o6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p098f6.C7298b;
import p132h6.AbstractC7639i;
import p132h6.AbstractC7646p;
import p132h6.C7638h;
import p154i6.AbstractC7854f;
import p154i6.AbstractC7855g;
import p154i6.InterfaceC7853e;
import p154i6.InterfaceC7861m;
import p196k6.C9169a;
import p196k6.C9171c;
import p215l6.C9399a;
import p289p6.AbstractC10081k;
import p289p6.InterfaceC10065c;
import p289p6.InterfaceC10067d;
import p305q6.C10277a;
import p305q6.InterfaceC10278b;
import p327r6.InterfaceC10625a;

/* renamed from: o6.r */
/* loaded from: classes.dex */
public class C9810r {

    /* renamed from: a */
    private final Context f24214a;

    /* renamed from: b */
    private final InterfaceC7853e f24215b;

    /* renamed from: c */
    private final InterfaceC10067d f24216c;

    /* renamed from: d */
    private final InterfaceC9816x f24217d;

    /* renamed from: e */
    private final Executor f24218e;

    /* renamed from: f */
    private final InterfaceC10278b f24219f;

    /* renamed from: g */
    private final InterfaceC10625a f24220g;

    /* renamed from: h */
    private final InterfaceC10625a f24221h;

    /* renamed from: i */
    private final InterfaceC10065c f24222i;

    public C9810r(Context context, InterfaceC7853e interfaceC7853e, InterfaceC10067d interfaceC10067d, InterfaceC9816x interfaceC9816x, Executor executor, InterfaceC10278b interfaceC10278b, InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, InterfaceC10065c interfaceC10065c) {
        this.f24214a = context;
        this.f24215b = interfaceC7853e;
        this.f24216c = interfaceC10067d;
        this.f24217d = interfaceC9816x;
        this.f24218e = executor;
        this.f24219f = interfaceC10278b;
        this.f24220g = interfaceC10625a;
        this.f24221h = interfaceC10625a2;
        this.f24222i = interfaceC10065c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m29462l(AbstractC7646p abstractC7646p) {
        return Boolean.valueOf(this.f24216c.mo30027k0(abstractC7646p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m29463m(AbstractC7646p abstractC7646p) {
        return this.f24216c.mo30024K(abstractC7646p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m29464n(Iterable iterable, AbstractC7646p abstractC7646p, long j10) {
        this.f24216c.mo30029o0(iterable);
        this.f24216c.mo30026f1(abstractC7646p, this.f24220g.mo32385a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m29465o(Iterable iterable) {
        this.f24216c.mo30031v(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m29466p() {
        this.f24222i.mo30020a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m29467q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f24222i.mo30022f(((Integer) r0.getValue()).intValue(), C9171c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m29468r(AbstractC7646p abstractC7646p, long j10) {
        this.f24216c.mo30026f1(abstractC7646p, this.f24220g.mo32385a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m29469s(AbstractC7646p abstractC7646p, int i10) {
        this.f24217d.mo29439b(abstractC7646p, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m29470t(final AbstractC7646p abstractC7646p, final int i10, Runnable runnable) {
        try {
            try {
                InterfaceC10278b interfaceC10278b = this.f24219f;
                final InterfaceC10067d interfaceC10067d = this.f24216c;
                Objects.requireNonNull(interfaceC10067d);
                interfaceC10278b.mo30126b(new InterfaceC10278b.a() { // from class: o6.i
                    @Override // p305q6.InterfaceC10278b.a
                    /* renamed from: n */
                    public final Object mo28964n() {
                        return Integer.valueOf(InterfaceC10067d.this.mo30030u());
                    }
                });
                if (m29472k()) {
                    m29473u(abstractC7646p, i10);
                } else {
                    this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.j
                        @Override // p305q6.InterfaceC10278b.a
                        /* renamed from: n */
                        public final Object mo28964n() {
                            Object m29469s;
                            m29469s = C9810r.this.m29469s(abstractC7646p, i10);
                            return m29469s;
                        }
                    });
                }
            } catch (C10277a unused) {
                this.f24217d.mo29439b(abstractC7646p, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC7639i m29471j(InterfaceC7861m interfaceC7861m) {
        InterfaceC10278b interfaceC10278b = this.f24219f;
        final InterfaceC10065c interfaceC10065c = this.f24222i;
        Objects.requireNonNull(interfaceC10065c);
        return interfaceC7861m.mo11801a(AbstractC7639i.m23206a().mo23177i(this.f24220g.mo32385a()).mo23179k(this.f24221h.mo32385a()).mo23178j("GDT_CLIENT_METRICS").mo23176h(new C7638h(C7298b.m21878b("proto"), ((C9169a) interfaceC10278b.mo30126b(new InterfaceC10278b.a() { // from class: o6.h
            @Override // p305q6.InterfaceC10278b.a
            /* renamed from: n */
            public final Object mo28964n() {
                return InterfaceC10065c.this.mo30021e();
            }
        })).m27089f())).mo23172d());
    }

    /* renamed from: k */
    boolean m29472k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f24214a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    public AbstractC7855g m29473u(final AbstractC7646p abstractC7646p, int i10) {
        AbstractC7855g mo11802b;
        InterfaceC7861m interfaceC7861m = this.f24215b.get(abstractC7646p.mo23191b());
        long j10 = 0;
        AbstractC7855g m24158e = AbstractC7855g.m24158e(0L);
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.k
                @Override // p305q6.InterfaceC10278b.a
                /* renamed from: n */
                public final Object mo28964n() {
                    Boolean m29462l;
                    m29462l = C9810r.this.m29462l(abstractC7646p);
                    return m29462l;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.l
                    @Override // p305q6.InterfaceC10278b.a
                    /* renamed from: n */
                    public final Object mo28964n() {
                        Iterable m29463m;
                        m29463m = C9810r.this.m29463m(abstractC7646p);
                        return m29463m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m24158e;
                }
                if (interfaceC7861m == null) {
                    C9399a.m27989b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC7646p);
                    mo11802b = AbstractC7855g.m24156a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC10081k) it.next()).mo30017b());
                    }
                    if (abstractC7646p.m23226e()) {
                        arrayList.add(m29471j(interfaceC7861m));
                    }
                    mo11802b = interfaceC7861m.mo11802b(AbstractC7854f.m24155a().mo24147b(arrayList).mo24148c(abstractC7646p.mo23192c()).mo24146a());
                }
                m24158e = mo11802b;
                if (m24158e.mo24150c() == AbstractC7855g.a.TRANSIENT_ERROR) {
                    this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.m
                        @Override // p305q6.InterfaceC10278b.a
                        /* renamed from: n */
                        public final Object mo28964n() {
                            Object m29464n;
                            m29464n = C9810r.this.m29464n(iterable, abstractC7646p, j11);
                            return m29464n;
                        }
                    });
                    this.f24217d.mo29438a(abstractC7646p, i10 + 1, true);
                    return m24158e;
                }
                this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.n
                    @Override // p305q6.InterfaceC10278b.a
                    /* renamed from: n */
                    public final Object mo28964n() {
                        Object m29465o;
                        m29465o = C9810r.this.m29465o(iterable);
                        return m29465o;
                    }
                });
                if (m24158e.mo24150c() == AbstractC7855g.a.OK) {
                    j10 = Math.max(j11, m24158e.mo24149b());
                    if (abstractC7646p.m23226e()) {
                        this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.o
                            @Override // p305q6.InterfaceC10278b.a
                            /* renamed from: n */
                            public final Object mo28964n() {
                                Object m29466p;
                                m29466p = C9810r.this.m29466p();
                                return m29466p;
                            }
                        });
                    }
                } else if (m24158e.mo24150c() == AbstractC7855g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String mo23170j = ((AbstractC10081k) it2.next()).mo30017b().mo23170j();
                        hashMap.put(mo23170j, !hashMap.containsKey(mo23170j) ? 1 : Integer.valueOf(((Integer) hashMap.get(mo23170j)).intValue() + 1));
                    }
                    this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.p
                        @Override // p305q6.InterfaceC10278b.a
                        /* renamed from: n */
                        public final Object mo28964n() {
                            Object m29467q;
                            m29467q = C9810r.this.m29467q(hashMap);
                            return m29467q;
                        }
                    });
                }
            }
            this.f24219f.mo30126b(new InterfaceC10278b.a() { // from class: o6.q
                @Override // p305q6.InterfaceC10278b.a
                /* renamed from: n */
                public final Object mo28964n() {
                    Object m29468r;
                    m29468r = C9810r.this.m29468r(abstractC7646p, j11);
                    return m29468r;
                }
            });
            return m24158e;
        }
    }

    /* renamed from: v */
    public void m29474v(final AbstractC7646p abstractC7646p, final int i10, final Runnable runnable) {
        this.f24218e.execute(new Runnable() { // from class: o6.g
            @Override // java.lang.Runnable
            public final void run() {
                C9810r.this.m29470t(abstractC7646p, i10, runnable);
            }
        });
    }
}
