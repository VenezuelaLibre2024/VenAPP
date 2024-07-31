package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.v1 */
/* loaded from: classes.dex */
public final class C5187v1 extends AbstractC5175r1 {

    /* renamed from: c */
    public final C5117b1 f10592c;

    public C5187v1(C5117b1 c5117b1, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f10592c = c5117b1;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo13189d(C5116b0 c5116b0, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5183u0
    /* renamed from: f */
    public final boolean mo13187f(C5156l0 c5156l0) {
        return this.f10592c.f10436a.m13149f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5183u0
    /* renamed from: g */
    public final C1898d[] mo13188g(C5156l0 c5156l0) {
        return this.f10592c.f10436a.m13147c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5175r1
    /* renamed from: h */
    public final void mo13169h(C5156l0 c5156l0) {
        this.f10592c.f10436a.mo13024d(c5156l0.m13130s(), this.f10576b);
        C5151k.a m13146b = this.f10592c.f10436a.m13146b();
        if (m13146b != null) {
            c5156l0.m13131u().put(m13146b, this.f10592c);
        }
    }
}
