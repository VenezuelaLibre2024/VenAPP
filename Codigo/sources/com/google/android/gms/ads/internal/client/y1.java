package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class y1 implements x8.r {

    /* renamed from: a, reason: collision with root package name */
    private final String f8797a;

    /* renamed from: b, reason: collision with root package name */
    private final x1 f8798b;

    public y1(x1 x1Var) {
        String str;
        this.f8798b = x1Var;
        try {
            str = x1Var.zze();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            str = null;
        }
        this.f8797a = str;
    }

    public final x1 a() {
        return this.f8798b;
    }

    public final String toString() {
        return this.f8797a;
    }
}
