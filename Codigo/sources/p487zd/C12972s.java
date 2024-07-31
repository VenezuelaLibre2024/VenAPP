package p487zd;

import de.AbstractC6896i;
import de.C6888a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6879a;
import p311qd.InterfaceC10458r;
import p311qd.InterfaceC10459s;
import p311qd.InterfaceC10460t;
import p311qd.InterfaceC10461u;
import p311qd.InterfaceC10462v;
import p487zd.C12972s;

/* renamed from: zd.s */
/* loaded from: classes.dex */
public class C12972s {

    /* renamed from: a */
    private final Executor f35283a;

    /* renamed from: b */
    private Map<InterfaceC10458r, a> f35284b = new HashMap();

    /* renamed from: c */
    private Map<InterfaceC10459s, b> f35285c = new HashMap();

    /* renamed from: d */
    private Map<InterfaceC10461u, c> f35286d = new HashMap();

    /* renamed from: e */
    private Map<InterfaceC10462v, e> f35287e = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zd.s$a */
    /* loaded from: classes.dex */
    public static class a extends d<InterfaceC10458r> {
        /* renamed from: b */
        public InterfaceC10458r m42937b() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zd.s$b */
    /* loaded from: classes.dex */
    public static class b extends d<InterfaceC10459s> {
        /* renamed from: b */
        public InterfaceC10459s m42938b() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zd.s$c */
    /* loaded from: classes.dex */
    public static class c extends d<InterfaceC10461u> {
        /* renamed from: b */
        public InterfaceC10461u m42939b() {
            return null;
        }
    }

    /* renamed from: zd.s$d */
    /* loaded from: classes.dex */
    private static abstract class d<T> {

        /* renamed from: a */
        private final Executor f35288a;

        /* renamed from: a */
        public Executor m42940a(Executor executor) {
            Executor executor2 = this.f35288a;
            return executor2 == null ? executor : executor2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zd.s$e */
    /* loaded from: classes.dex */
    public static class e extends d<InterfaceC10462v> {
        /* renamed from: b */
        public InterfaceC10462v m42941b() {
            return null;
        }
    }

    public C12972s(@InterfaceC6879a Executor executor) {
        this.f35283a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m42928g(c cVar, AbstractC6896i abstractC6896i, InterfaceC10460t.b bVar) {
        cVar.m42939b();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m42929h(e eVar, AbstractC6896i abstractC6896i) {
        eVar.m42941b();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m42930i(a aVar, AbstractC6896i abstractC6896i, C6888a c6888a) {
        aVar.m42937b();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m42931j(b bVar, AbstractC6896i abstractC6896i) {
        bVar.m42938b();
        throw null;
    }

    /* renamed from: e */
    public void m42932e(final AbstractC6896i abstractC6896i, final InterfaceC10460t.b bVar) {
        for (final c cVar : this.f35286d.values()) {
            cVar.m42940a(this.f35283a).execute(new Runnable() { // from class: zd.o
                @Override // java.lang.Runnable
                public final void run() {
                    C12972s.m42928g(C12972s.c.this, abstractC6896i, bVar);
                }
            });
        }
    }

    /* renamed from: f */
    public void m42933f(final AbstractC6896i abstractC6896i) {
        for (final e eVar : this.f35287e.values()) {
            eVar.m42940a(this.f35283a).execute(new Runnable() { // from class: zd.p
                @Override // java.lang.Runnable
                public final void run() {
                    C12972s.m42929h(C12972s.e.this, abstractC6896i);
                }
            });
        }
    }

    /* renamed from: k */
    public void m42934k(final AbstractC6896i abstractC6896i, final C6888a c6888a) {
        for (final a aVar : this.f35284b.values()) {
            aVar.m42940a(this.f35283a).execute(new Runnable() { // from class: zd.r
                @Override // java.lang.Runnable
                public final void run() {
                    C12972s.m42930i(C12972s.a.this, abstractC6896i, c6888a);
                }
            });
        }
    }

    /* renamed from: l */
    public void m42935l(final AbstractC6896i abstractC6896i) {
        for (final b bVar : this.f35285c.values()) {
            bVar.m42940a(this.f35283a).execute(new Runnable() { // from class: zd.q
                @Override // java.lang.Runnable
                public final void run() {
                    C12972s.m42931j(C12972s.b.this, abstractC6896i);
                }
            });
        }
    }

    /* renamed from: m */
    public void m42936m() {
        this.f35284b.clear();
        this.f35287e.clear();
        this.f35286d.clear();
        this.f35285c.clear();
    }
}
