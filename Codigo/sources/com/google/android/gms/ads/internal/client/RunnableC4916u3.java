package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: com.google.android.gms.ads.internal.client.u3 */
/* loaded from: classes.dex */
final class RunnableC4916u3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BinderC4928w3 f9825a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4916u3(BinderC4928w3 binderC4928w3) {
        this.f9825a = binderC4928w3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4934x3 binderC4934x3 = this.f9825a.f9873a;
        if (BinderC4934x3.m12479f2(binderC4934x3) != null) {
            try {
                BinderC4934x3.m12479f2(binderC4934x3).zze(1);
            } catch (RemoteException e10) {
                zzcec.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
