package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p0 implements c.InterfaceC0149c, l1 {

    /* renamed from: a */
    private final a.f f9442a;

    /* renamed from: b */
    private final b f9443b;

    /* renamed from: c */
    private com.google.android.gms.common.internal.k f9444c = null;

    /* renamed from: d */
    private Set f9445d = null;

    /* renamed from: e */
    private boolean f9446e = false;

    /* renamed from: f */
    final /* synthetic */ g f9447f;

    public p0(g gVar, a.f fVar, b bVar) {
        this.f9447f = gVar;
        this.f9442a = fVar;
        this.f9443b = bVar;
    }

    public final void h() {
        com.google.android.gms.common.internal.k kVar;
        if (!this.f9446e || (kVar = this.f9444c) == null) {
            return;
        }
        this.f9442a.getRemoteService(kVar, this.f9445d);
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void a(ca.b bVar) {
        Map map;
        map = this.f9447f.f9364w;
        l0 l0Var = (l0) map.get(this.f9443b);
        if (l0Var != null) {
            l0Var.F(bVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void b(com.google.android.gms.common.internal.k kVar, Set set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new ca.b(4));
        } else {
            this.f9444c = kVar;
            this.f9445d = set;
            h();
        }
    }

    @Override // com.google.android.gms.common.internal.c.InterfaceC0149c
    public final void c(ca.b bVar) {
        Handler handler;
        handler = this.f9447f.A;
        handler.post(new o0(this, bVar));
    }
}
