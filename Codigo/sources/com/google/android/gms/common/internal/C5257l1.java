package com.google.android.gms.common.internal;

import android.os.Bundle;
import ca.C1894b;

/* renamed from: com.google.android.gms.common.internal.l1 */
/* loaded from: classes.dex */
public final class C5257l1 extends AbstractC5289w0 {

    /* renamed from: g */
    final /* synthetic */ AbstractC5228c f10716g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5257l1(AbstractC5228c abstractC5228c, int i10, Bundle bundle) {
        super(abstractC5228c, i10, null);
        this.f10716g = abstractC5228c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5289w0
    /* renamed from: f */
    protected final void mo13293f(C1894b c1894b) {
        if (this.f10716g.enableLocalFallback() && AbstractC5228c.zzo(this.f10716g)) {
            AbstractC5228c.zzk(this.f10716g, 16);
        } else {
            this.f10716g.zzc.mo13155c(c1894b);
            this.f10716g.onConnectionFailed(c1894b);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC5289w0
    /* renamed from: g */
    protected final boolean mo13294g() {
        this.f10716g.zzc.mo13155c(C1894b.f7890e);
        return true;
    }
}
