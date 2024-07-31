package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.r;
import com.bumptech.glide.manager.s;
import com.bumptech.glide.manager.v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class k implements ComponentCallbacks2, m {

    /* renamed from: w, reason: collision with root package name */
    private static final y3.i f7416w = y3.i.f0(Bitmap.class).M();

    /* renamed from: x, reason: collision with root package name */
    private static final y3.i f7417x = y3.i.f0(u3.c.class).M();

    /* renamed from: y, reason: collision with root package name */
    private static final y3.i f7418y = y3.i.g0(j3.j.f19622c).P(g.LOW).X(true);

    /* renamed from: a, reason: collision with root package name */
    protected final com.bumptech.glide.b f7419a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f7420b;

    /* renamed from: c, reason: collision with root package name */
    final com.bumptech.glide.manager.l f7421c;

    /* renamed from: d, reason: collision with root package name */
    private final s f7422d;

    /* renamed from: e, reason: collision with root package name */
    private final r f7423e;

    /* renamed from: f, reason: collision with root package name */
    private final v f7424f;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f7425r;

    /* renamed from: s, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f7426s;

    /* renamed from: t, reason: collision with root package name */
    private final CopyOnWriteArrayList<y3.h<Object>> f7427t;

    /* renamed from: u, reason: collision with root package name */
    private y3.i f7428u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7429v;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f7421c.b(kVar);
        }
    }

    /* loaded from: classes.dex */
    private class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final s f7431a;

        b(s sVar) {
            this.f7431a = sVar;
        }

        @Override // com.bumptech.glide.manager.c.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f7431a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, com.bumptech.glide.manager.l lVar, r rVar, Context context) {
        this(bVar, lVar, rVar, new s(), bVar.h(), context);
    }

    k(com.bumptech.glide.b bVar, com.bumptech.glide.manager.l lVar, r rVar, s sVar, com.bumptech.glide.manager.d dVar, Context context) {
        this.f7424f = new v();
        a aVar = new a();
        this.f7425r = aVar;
        this.f7419a = bVar;
        this.f7421c = lVar;
        this.f7423e = rVar;
        this.f7422d = sVar;
        this.f7420b = context;
        com.bumptech.glide.manager.c a10 = dVar.a(context.getApplicationContext(), new b(sVar));
        this.f7426s = a10;
        bVar.p(this);
        if (c4.l.q()) {
            c4.l.u(aVar);
        } else {
            lVar.b(this);
        }
        lVar.b(a10);
        this.f7427t = new CopyOnWriteArrayList<>(bVar.j().b());
        v(bVar.j().c());
    }

    private void y(z3.d<?> dVar) {
        boolean x10 = x(dVar);
        y3.e f10 = dVar.f();
        if (x10 || this.f7419a.q(dVar) || f10 == null) {
            return;
        }
        dVar.h(null);
        f10.clear();
    }

    public k c(y3.h<Object> hVar) {
        this.f7427t.add(hVar);
        return this;
    }

    public <ResourceType> j<ResourceType> d(Class<ResourceType> cls) {
        return new j<>(this.f7419a, this, cls, this.f7420b);
    }

    public j<Bitmap> k() {
        return d(Bitmap.class).a(f7416w);
    }

    public j<Drawable> l() {
        return d(Drawable.class);
    }

    public void m(z3.d<?> dVar) {
        if (dVar == null) {
            return;
        }
        y(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<y3.h<Object>> n() {
        return this.f7427t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized y3.i o() {
        return this.f7428u;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onDestroy() {
        this.f7424f.onDestroy();
        Iterator<z3.d<?>> it = this.f7424f.d().iterator();
        while (it.hasNext()) {
            m(it.next());
        }
        this.f7424f.c();
        this.f7422d.b();
        this.f7421c.a(this);
        this.f7421c.a(this.f7426s);
        c4.l.v(this.f7425r);
        this.f7419a.t(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onStart() {
        u();
        this.f7424f.onStart();
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onStop() {
        t();
        this.f7424f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f7429v) {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> l<?, T> p(Class<T> cls) {
        return this.f7419a.j().d(cls);
    }

    public j<Drawable> q(Object obj) {
        return l().t0(obj);
    }

    public synchronized void r() {
        this.f7422d.c();
    }

    public synchronized void s() {
        r();
        Iterator<k> it = this.f7423e.a().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public synchronized void t() {
        this.f7422d.d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f7422d + ", treeNode=" + this.f7423e + "}";
    }

    public synchronized void u() {
        this.f7422d.f();
    }

    protected synchronized void v(y3.i iVar) {
        this.f7428u = iVar.clone().b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void w(z3.d<?> dVar, y3.e eVar) {
        this.f7424f.k(dVar);
        this.f7422d.g(eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean x(z3.d<?> dVar) {
        y3.e f10 = dVar.f();
        if (f10 == null) {
            return true;
        }
        if (!this.f7422d.a(f10)) {
            return false;
        }
        this.f7424f.l(dVar);
        dVar.h(null);
        return true;
    }
}
