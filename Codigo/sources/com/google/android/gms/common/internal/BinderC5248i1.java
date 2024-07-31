package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i1 */
/* loaded from: classes.dex */
public final class BinderC5248i1 extends AbstractBinderC5295y0 {

    /* renamed from: a */
    private AbstractC5228c f10704a;

    /* renamed from: b */
    private final int f10705b;

    public BinderC5248i1(AbstractC5228c abstractC5228c, int i10) {
        this.f10704a = abstractC5228c;
        this.f10705b = i10;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5258m
    /* renamed from: O */
    public final void mo13280O(int i10, IBinder iBinder, Bundle bundle) {
        C5276s.m13325k(this.f10704a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f10704a.onPostInitHandler(i10, iBinder, bundle, this.f10705b);
        this.f10704a = null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5258m
    /* renamed from: S0 */
    public final void mo13281S0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5258m
    /* renamed from: W1 */
    public final void mo13282W1(int i10, IBinder iBinder, C5260m1 c5260m1) {
        AbstractC5228c abstractC5228c = this.f10704a;
        C5276s.m13325k(abstractC5228c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C5276s.m13324j(c5260m1);
        AbstractC5228c.zzj(abstractC5228c, c5260m1);
        mo13280O(i10, iBinder, c5260m1.f10717a);
    }
}
