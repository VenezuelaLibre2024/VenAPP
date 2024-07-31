package y;

import android.util.Log;
import androidx.camera.core.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import y.v0;

/* loaded from: classes.dex */
public class r0 implements e.a, v0.a {

    /* renamed from: b, reason: collision with root package name */
    final q f31559b;

    /* renamed from: c, reason: collision with root package name */
    r f31560c;

    /* renamed from: d, reason: collision with root package name */
    private i0 f31561d;

    /* renamed from: e, reason: collision with root package name */
    private final List<i0> f31562e;

    /* renamed from: a, reason: collision with root package name */
    final Deque<v0> f31558a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    boolean f31563f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f31564a;

        a(j jVar) {
            this.f31564a = jVar;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            if (this.f31564a.b()) {
                return;
            }
            if (th2 instanceof w.g0) {
                r0.this.f31560c.j((w.g0) th2);
            } else {
                r0.this.f31560c.j(new w.g0(2, "Failed to submit capture request", th2));
            }
            r0.this.f31559b.c();
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            r0.this.f31559b.c();
        }
    }

    public r0(q qVar) {
        androidx.camera.core.impl.utils.q.a();
        this.f31559b = qVar;
        this.f31562e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f31561d = null;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(i0 i0Var) {
        this.f31562e.remove(i0Var);
    }

    private com.google.common.util.concurrent.f<Void> m(j jVar) {
        androidx.camera.core.impl.utils.q.a();
        this.f31559b.b();
        com.google.common.util.concurrent.f<Void> a10 = this.f31559b.a(jVar.a());
        a0.f.b(a10, new a(jVar), z.a.d());
        return a10;
    }

    private void n(final i0 i0Var) {
        androidx.core.util.h.m(!f());
        this.f31561d = i0Var;
        i0Var.l().addListener(new Runnable() { // from class: y.o0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.h();
            }
        }, z.a.a());
        this.f31562e.add(i0Var);
        i0Var.m().addListener(new Runnable() { // from class: y.p0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.i(i0Var);
            }
        }, z.a.a());
    }

    @Override // androidx.camera.core.e.a
    public void a(androidx.camera.core.o oVar) {
        z.a.d().execute(new Runnable() { // from class: y.q0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.g();
            }
        });
    }

    @Override // y.v0.a
    public void b(v0 v0Var) {
        androidx.camera.core.impl.utils.q.a();
        w.o0.a("TakePictureManager", "Add a new request for retrying.");
        this.f31558a.addFirst(v0Var);
        g();
    }

    public void e() {
        androidx.camera.core.impl.utils.q.a();
        w.g0 g0Var = new w.g0(3, "Camera is closed.", null);
        Iterator<v0> it = this.f31558a.iterator();
        while (it.hasNext()) {
            it.next().r(g0Var);
        }
        this.f31558a.clear();
        Iterator it2 = new ArrayList(this.f31562e).iterator();
        while (it2.hasNext()) {
            ((i0) it2.next()).i(g0Var);
        }
    }

    boolean f() {
        return this.f31561d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        androidx.camera.core.impl.utils.q.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (f()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f31563f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f31560c.h() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        v0 poll = this.f31558a.poll();
        if (poll == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        i0 i0Var = new i0(poll, this);
        n(i0Var);
        androidx.core.util.d<j, f0> e10 = this.f31560c.e(poll, i0Var, i0Var.l());
        j jVar = e10.f3867a;
        Objects.requireNonNull(jVar);
        f0 f0Var = e10.f3868b;
        Objects.requireNonNull(f0Var);
        this.f31560c.l(f0Var);
        i0Var.r(m(jVar));
    }

    public void j() {
        androidx.camera.core.impl.utils.q.a();
        this.f31563f = true;
        i0 i0Var = this.f31561d;
        if (i0Var != null) {
            i0Var.j();
        }
    }

    public void k() {
        androidx.camera.core.impl.utils.q.a();
        this.f31563f = false;
        g();
    }

    public void l(r rVar) {
        androidx.camera.core.impl.utils.q.a();
        this.f31560c = rVar;
        rVar.k(this);
    }
}
