package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import java.util.Map;

/* loaded from: classes.dex */
final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ca.b f9436a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p0 f9437b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(p0 p0Var, ca.b bVar) {
        this.f9437b = p0Var;
        this.f9436a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        p0 p0Var = this.f9437b;
        map = p0Var.f9447f.f9364w;
        bVar = p0Var.f9443b;
        l0 l0Var = (l0) map.get(bVar);
        if (l0Var == null) {
            return;
        }
        if (!this.f9436a.y1()) {
            l0Var.E(this.f9436a, null);
            return;
        }
        this.f9437b.f9446e = true;
        fVar = this.f9437b.f9442a;
        if (fVar.requiresSignIn()) {
            this.f9437b.h();
            return;
        }
        try {
            p0 p0Var2 = this.f9437b;
            fVar3 = p0Var2.f9442a;
            fVar4 = p0Var2.f9442a;
            fVar3.getRemoteService(null, fVar4.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f9437b.f9442a;
            fVar2.disconnect("Failed to get service from broker.");
            l0Var.E(new ca.b(10), null);
        }
    }
}
