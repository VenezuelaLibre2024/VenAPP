package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: com.google.android.gms.ads.internal.client.y3 */
/* loaded from: classes.dex */
final class RunnableC4940y3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BinderC4946z3 f9900a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4940y3(BinderC4946z3 binderC4946z3) {
        this.f9900a = binderC4946z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4833h0 interfaceC4833h0;
        InterfaceC4833h0 interfaceC4833h02;
        BinderC4946z3 binderC4946z3 = this.f9900a;
        interfaceC4833h0 = binderC4946z3.f9917a;
        if (interfaceC4833h0 != null) {
            try {
                interfaceC4833h02 = binderC4946z3.f9917a;
                interfaceC4833h02.zze(1);
            } catch (RemoteException e10) {
                zzcec.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
