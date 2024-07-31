package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcec;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ w3 f8748a;

    public u3(w3 w3Var) {
        this.f8748a = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var;
        h0 h0Var2;
        x3 x3Var = this.f8748a.f8786a;
        h0Var = x3Var.f8793a;
        if (h0Var != null) {
            try {
                h0Var2 = x3Var.f8793a;
                h0Var2.zze(1);
            } catch (RemoteException e10) {
                zzcec.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
