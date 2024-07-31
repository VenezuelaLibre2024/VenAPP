package p112g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.utils.C0688q;
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0984h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p407w.C12015i1;
import p407w.C12029o0;
import p407w.InterfaceC12047x0;
import p474z.C12747a;

/* renamed from: g0.v0 */
/* loaded from: classes.dex */
public class C7430v0 {

    /* renamed from: a */
    final InterfaceC7422r0 f17259a;

    /* renamed from: b */
    final InterfaceC0606c0 f17260b;

    /* renamed from: c */
    private c f17261c;

    /* renamed from: d */
    private b f17262d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0.v0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<InterfaceC12047x0> {
        a() {
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            C12029o0.m38649l("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th2);
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC12047x0 interfaceC12047x0) {
            C0984h.m4833k(interfaceC12047x0);
            C7430v0.this.f17259a.mo22405a(interfaceC12047x0);
        }
    }

    /* renamed from: g0.v0$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: c */
        public static b m22425c(C7414n0 c7414n0, List<d> list) {
            return new C7393d(c7414n0, list);
        }

        /* renamed from: a */
        public abstract List<d> mo22317a();

        /* renamed from: b */
        public abstract C7414n0 mo22318b();
    }

    /* renamed from: g0.v0$c */
    /* loaded from: classes.dex */
    public static class c extends HashMap<d, C7414n0> {
    }

    /* renamed from: g0.v0$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        /* renamed from: h */
        public static d m22426h(int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
            return new C7395e(UUID.randomUUID(), i10, i11, rect, size, i12, z10);
        }

        /* renamed from: i */
        public static d m22427i(C7414n0 c7414n0) {
            return m22426h(c7414n0.m22354u(), c7414n0.m22349p(), c7414n0.m22347n(), C0689r.m3346d(c7414n0.m22347n(), c7414n0.m22351r()), c7414n0.m22351r(), c7414n0.m22350q());
        }

        /* renamed from: a */
        public abstract Rect mo22320a();

        /* renamed from: b */
        public abstract int mo22321b();

        /* renamed from: c */
        public abstract boolean mo22322c();

        /* renamed from: d */
        public abstract int mo22323d();

        /* renamed from: e */
        public abstract Size mo22324e();

        /* renamed from: f */
        public abstract int mo22325f();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract UUID mo22326g();
    }

    public C7430v0(InterfaceC0606c0 interfaceC0606c0, InterfaceC7422r0 interfaceC7422r0) {
        this.f17260b = interfaceC0606c0;
        this.f17259a = interfaceC7422r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m22415g(C7414n0 c7414n0, Map.Entry<d, C7414n0> entry) {
        C0009f.m16b(entry.getValue().m22344j(c7414n0.m22353t().mo2989e(), entry.getKey().mo22321b(), entry.getKey().mo22320a(), entry.getKey().mo22323d(), entry.getKey().mo22322c(), c7414n0.m22355v() ? this.f17260b : null), new a(), C12747a.m42283d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m22414f() {
        c cVar = this.f17261c;
        if (cVar != null) {
            Iterator<C7414n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().m22343i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m22416h(Map map, C12015i1.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int mo38588c = hVar.mo38588c() - ((d) entry.getKey()).mo22323d();
            if (((d) entry.getKey()).mo22322c()) {
                mo38588c = -mo38588c;
            }
            ((C7414n0) entry.getValue()).m22341D(C0689r.m3359q(mo38588c), -1);
        }
    }

    /* renamed from: j */
    private void m22417j(final C7414n0 c7414n0, Map<d, C7414n0> map) {
        for (final Map.Entry<d, C7414n0> entry : map.entrySet()) {
            m22415g(c7414n0, entry);
            entry.getValue().m22342f(new Runnable() { // from class: g0.t0
                @Override // java.lang.Runnable
                public final void run() {
                    C7430v0.this.m22415g(c7414n0, entry);
                }
            });
        }
    }

    /* renamed from: k */
    private void m22418k(C7414n0 c7414n0, Map<d, C7414n0> map) {
        C12015i1 m22345k = c7414n0.m22345k(this.f17260b);
        m22422l(m22345k, map);
        this.f17259a.mo22406b(m22345k);
    }

    /* renamed from: n */
    private C7414n0 m22419n(C7414n0 c7414n0, d dVar) {
        Rect mo22320a = dVar.mo22320a();
        int mo22323d = dVar.mo22323d();
        boolean mo22322c = dVar.mo22322c();
        Matrix matrix = new Matrix(c7414n0.m22352s());
        matrix.postConcat(C0689r.m3345c(new RectF(mo22320a), C0689r.m3356n(dVar.mo22324e()), mo22323d, mo22322c));
        C0984h.m4823a(C0689r.m3349g(C0689r.m3346d(mo22320a, mo22323d), dVar.mo22324e()));
        return new C7414n0(dVar.mo22325f(), dVar.mo22321b(), c7414n0.m22353t().mo2990f().mo2995e(dVar.mo22324e()).mo2991a(), matrix, false, C0689r.m3354l(dVar.mo22324e()), c7414n0.m22351r() - mo22323d, -1, c7414n0.m22350q() != mo22322c);
    }

    /* renamed from: e */
    public InterfaceC7422r0 m22420e() {
        return this.f17259a;
    }

    /* renamed from: i */
    public void m22421i() {
        this.f17259a.release();
        C12747a.m42283d().execute(new Runnable() { // from class: g0.u0
            @Override // java.lang.Runnable
            public final void run() {
                C7430v0.this.m22414f();
            }
        });
    }

    /* renamed from: l */
    void m22422l(C12015i1 c12015i1, final Map<d, C7414n0> map) {
        c12015i1.m38614w(C12747a.m42283d(), new C12015i1.i() { // from class: g0.s0
            @Override // p407w.C12015i1.i
            /* renamed from: a */
            public final void mo22373a(C12015i1.h hVar) {
                C7430v0.m22416h(map, hVar);
            }
        });
    }

    /* renamed from: m */
    public c m22423m(b bVar) {
        C0688q.m3339a();
        this.f17262d = bVar;
        this.f17261c = new c();
        C7414n0 mo22318b = bVar.mo22318b();
        for (d dVar : bVar.mo22317a()) {
            this.f17261c.put(dVar, m22419n(mo22318b, dVar));
        }
        m22418k(mo22318b, this.f17261c);
        m22417j(mo22318b, this.f17261c);
        return this.f17261c;
    }
}
