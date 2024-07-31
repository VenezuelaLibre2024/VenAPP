package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
final class y3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z3 f8813a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y3(z3 z3Var) {
        this.f8813a = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var;
        h0 h0Var2;
        z3 z3Var = this.f8813a;
        h0Var = z3Var.f8830a;
        if (h0Var != null) {
            try {
                h0Var2 = z3Var.f8830a;
                h0Var2.zze(1);
            } catch (RemoteException e10) {
                zzcec.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
