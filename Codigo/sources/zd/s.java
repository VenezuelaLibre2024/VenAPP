package zd;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import qd.t;
import zd.s;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a */
    private final Executor f32732a;

    /* renamed from: b */
    private Map<qd.r, a> f32733b = new HashMap();

    /* renamed from: c */
    private Map<qd.s, b> f32734c = new HashMap();

    /* renamed from: d */
    private Map<qd.u, c> f32735d = new HashMap();

    /* renamed from: e */
    private Map<qd.v, e> f32736e = new HashMap();

    /* loaded from: classes.dex */
    public static class a extends d<qd.r> {
        public qd.r b() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d<qd.s> {
        public qd.s b() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d<qd.u> {
        public qd.u b() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class d<T> {

        /* renamed from: a */
        private final Executor f32737a;

        public Executor a(Executor executor) {
            Executor executor2 = this.f32737a;
            return executor2 == null ? executor : executor2;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d<qd.v> {
        public qd.v b() {
            return null;
        }
    }

    public s(@dc.a Executor executor) {
        this.f32732a = executor;
    }

    public static /* synthetic */ void g(c cVar, de.i iVar, t.b bVar) {
        cVar.b();
        throw null;
    }

    public static /* synthetic */ void h(e eVar, de.i iVar) {
        eVar.b();
        throw null;
    }

    public static /* synthetic */ void i(a aVar, de.i iVar, de.a aVar2) {
        aVar.b();
        throw null;
    }

    public static /* synthetic */ void j(b bVar, de.i iVar) {
        bVar.b();
        throw null;
    }

    public void e(de.i iVar, t.b bVar) {
        for (c cVar : this.f32735d.values()) {
            cVar.a(this.f32732a).execute(new Runnable() { // from class: zd.o

                /* renamed from: b */
                public final /* synthetic */ de.i f32686b;

                /* renamed from: c */
                public final /* synthetic */ t.b f32687c;

                public /* synthetic */ o(de.i iVar2, t.b bVar2) {
                    r2 = iVar2;
                    r3 = bVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.g(s.c.this, r2, r3);
                }
            });
        }
    }

    public void f(de.i iVar) {
        for (e eVar : this.f32736e.values()) {
            eVar.a(this.f32732a).execute(new Runnable() { // from class: zd.p

                /* renamed from: b */
                public final /* synthetic */ de.i f32698b;

                public /* synthetic */ p(de.i iVar2) {
                    r2 = iVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.h(s.e.this, r2);
                }
            });
        }
    }

    public void k(de.i iVar, de.a aVar) {
        for (a aVar2 : this.f32733b.values()) {
            aVar2.a(this.f32732a).execute(new Runnable() { // from class: zd.r

                /* renamed from: b */
                public final /* synthetic */ de.i f32724b;

                /* renamed from: c */
                public final /* synthetic */ de.a f32725c;

                public /* synthetic */ r(de.i iVar2, de.a aVar3) {
                    r2 = iVar2;
                    r3 = aVar3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.i(s.a.this, r2, r3);
                }
            });
        }
    }

    public void l(de.i iVar) {
        for (b bVar : this.f32734c.values()) {
            bVar.a(this.f32732a).execute(new Runnable() { // from class: zd.q

                /* renamed from: b */
                public final /* synthetic */ de.i f32708b;

                public /* synthetic */ q(de.i iVar2) {
                    r2 = iVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.j(s.b.this, r2);
                }
            });
        }
    }

    public void m() {
        this.f32733b.clear();
        this.f32736e.clear();
        this.f32735d.clear();
        this.f32734c.clear();
    }
}
