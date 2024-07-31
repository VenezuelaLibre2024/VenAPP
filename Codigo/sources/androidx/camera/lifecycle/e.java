package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.utils.g;
import androidx.camera.core.impl.utils.q;
import androidx.camera.core.impl.y0;
import androidx.concurrent.futures.c;
import androidx.core.util.h;
import androidx.lifecycle.k;
import com.google.common.util.concurrent.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import w.i;
import w.j1;
import w.n;
import w.o;
import w.p;
import w.v;
import w.w;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final e f2796h = new e();

    /* renamed from: c, reason: collision with root package name */
    private f<v> f2799c;

    /* renamed from: f, reason: collision with root package name */
    private v f2802f;

    /* renamed from: g, reason: collision with root package name */
    private Context f2803g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2797a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private w.b f2798b = null;

    /* renamed from: d, reason: collision with root package name */
    private f<Void> f2800d = a0.f.h(null);

    /* renamed from: e, reason: collision with root package name */
    private final LifecycleCameraRepository f2801e = new LifecycleCameraRepository();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f2804a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f2805b;

        a(c.a aVar, v vVar) {
            this.f2804a = aVar;
            this.f2805b = vVar;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            this.f2804a.f(th2);
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            this.f2804a.c(this.f2805b);
        }
    }

    private e() {
    }

    private int g() {
        v vVar = this.f2802f;
        if (vVar == null) {
            return 0;
        }
        return vVar.e().d().b();
    }

    public static f<e> h(final Context context) {
        h.k(context);
        return a0.f.o(f2796h.i(context), new m.a() { // from class: androidx.camera.lifecycle.b
            @Override // m.a
            public final Object apply(Object obj) {
                e j10;
                j10 = e.j(context, (v) obj);
                return j10;
            }
        }, z.a.a());
    }

    private f<v> i(Context context) {
        synchronized (this.f2797a) {
            f<v> fVar = this.f2799c;
            if (fVar != null) {
                return fVar;
            }
            final v vVar = new v(context, this.f2798b);
            f<v> a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.lifecycle.c
                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object l10;
                    l10 = e.this.l(vVar, aVar);
                    return l10;
                }
            });
            this.f2799c = a10;
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e j(Context context, v vVar) {
        e eVar = f2796h;
        eVar.n(vVar);
        eVar.o(g.a(context));
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object l(final v vVar, c.a aVar) {
        synchronized (this.f2797a) {
            a0.f.b(a0.d.a(this.f2800d).e(new a0.a() { // from class: androidx.camera.lifecycle.d
                @Override // a0.a
                public final f apply(Object obj) {
                    f i10;
                    i10 = v.this.i();
                    return i10;
                }
            }, z.a.a()), new a(aVar, vVar), z.a.a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    private void m(int i10) {
        v vVar = this.f2802f;
        if (vVar == null) {
            return;
        }
        vVar.e().d().c(i10);
    }

    private void n(v vVar) {
        this.f2802f = vVar;
    }

    private void o(Context context) {
        this.f2803g = context;
    }

    i d(k kVar, p pVar, j1 j1Var, List<w.k> list, androidx.camera.core.w... wVarArr) {
        u uVar;
        u c10;
        q.a();
        p.a c11 = p.a.c(pVar);
        int length = wVarArr.length;
        int i10 = 0;
        while (true) {
            uVar = null;
            if (i10 >= length) {
                break;
            }
            p F = wVarArr[i10].i().F(null);
            if (F != null) {
                Iterator<n> it = F.c().iterator();
                while (it.hasNext()) {
                    c11.a(it.next());
                }
            }
            i10++;
        }
        LinkedHashSet<c0> a10 = c11.b().a(this.f2802f.f().a());
        if (a10.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        LifecycleCamera c12 = this.f2801e.c(kVar, b0.e.x(a10));
        Collection<LifecycleCamera> e10 = this.f2801e.e();
        for (androidx.camera.core.w wVar : wVarArr) {
            for (LifecycleCamera lifecycleCamera : e10) {
                if (lifecycleCamera.p(wVar) && lifecycleCamera != c12) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", wVar));
                }
            }
        }
        if (c12 == null) {
            c12 = this.f2801e.b(kVar, new b0.e(a10, this.f2802f.e().d(), this.f2802f.d(), this.f2802f.h()));
        }
        Iterator<n> it2 = pVar.c().iterator();
        while (it2.hasNext()) {
            n next = it2.next();
            if (next.a() != n.f29524a && (c10 = y0.a(next.a()).c(c12.b(), this.f2803g)) != null) {
                if (uVar != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                uVar = c10;
            }
        }
        c12.l(uVar);
        if (wVarArr.length == 0) {
            return c12;
        }
        this.f2801e.a(c12, j1Var, list, Arrays.asList(wVarArr), this.f2802f.e().d());
        return c12;
    }

    public i e(k kVar, p pVar, androidx.camera.core.w... wVarArr) {
        if (g() == 2) {
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        }
        m(1);
        return d(kVar, pVar, null, Collections.emptyList(), wVarArr);
    }

    public List<o> f() {
        ArrayList arrayList = new ArrayList();
        Iterator<c0> it = this.f2802f.f().a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        return arrayList;
    }

    public void p() {
        q.a();
        m(0);
        this.f2801e.k();
    }
}
