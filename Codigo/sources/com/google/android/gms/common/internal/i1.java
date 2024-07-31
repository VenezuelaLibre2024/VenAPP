package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class i1 extends y0 {

    /* renamed from: a, reason: collision with root package name */
    private c f9589a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9590b;

    public i1(c cVar, int i10) {
        this.f9589a = cVar;
        this.f9590b = i10;
    }

    @Override // com.google.android.gms.common.internal.m
    public final void O(int i10, IBinder iBinder, Bundle bundle) {
        s.k(this.f9589a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f9589a.onPostInitHandler(i10, iBinder, bundle, this.f9590b);
        this.f9589a = null;
    }

    @Override // com.google.android.gms.common.internal.m
    public final void S0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.m
    public final void W1(int i10, IBinder iBinder, m1 m1Var) {
        c cVar = this.f9589a;
        s.k(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        s.j(m1Var);
        c.zzj(cVar, m1Var);
        O(i10, iBinder, m1Var.f9602a);
    }
}
