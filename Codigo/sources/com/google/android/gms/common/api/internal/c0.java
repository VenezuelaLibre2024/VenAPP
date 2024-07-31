package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class c0 extends d2 {

    /* renamed from: e */
    private final androidx.collection.b f9338e;

    /* renamed from: f */
    private final g f9339f;

    c0(j jVar, g gVar, ca.f fVar) {
        super(jVar, fVar);
        this.f9338e = new androidx.collection.b();
        this.f9339f = gVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, g gVar, b bVar) {
        j fragment = LifecycleCallback.getFragment(activity);
        c0 c0Var = (c0) fragment.b("ConnectionlessLifecycleHelper", c0.class);
        if (c0Var == null) {
            c0Var = new c0(fragment, gVar, ca.f.n());
        }
        com.google.android.gms.common.internal.s.k(bVar, "ApiKey cannot be null");
        c0Var.f9338e.add(bVar);
        gVar.d(c0Var);
    }

    private final void k() {
        if (this.f9338e.isEmpty()) {
            return;
        }
        this.f9339f.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.d2
    protected final void b(ca.b bVar, int i10) {
        this.f9339f.K(bVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.d2
    protected final void c() {
        this.f9339f.b();
    }

    public final androidx.collection.b i() {
        return this.f9338e;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.d2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.d2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f9339f.e(this);
    }
}
