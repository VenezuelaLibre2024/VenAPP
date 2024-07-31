package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.x1 */
/* loaded from: classes.dex */
public final class C5193x1 extends AbstractC5175r1 {

    /* renamed from: c */
    public final C5151k.a f10612c;

    public C5193x1(C5151k.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f10612c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo13189d(C5116b0 c5116b0, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5183u0
    /* renamed from: f */
    public final boolean mo13187f(C5156l0 c5156l0) {
        C5117b1 c5117b1 = (C5117b1) c5156l0.m13131u().get(this.f10612c);
        return c5117b1 != null && c5117b1.f10436a.m13149f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5183u0
    /* renamed from: g */
    public final C1898d[] mo13188g(C5156l0 c5156l0) {
        C5117b1 c5117b1 = (C5117b1) c5156l0.m13131u().get(this.f10612c);
        if (c5117b1 == null) {
            return null;
        }
        return c5117b1.f10436a.m13147c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5175r1
    /* renamed from: h */
    public final void mo13169h(C5156l0 c5156l0) {
        C5117b1 c5117b1 = (C5117b1) c5156l0.m13131u().remove(this.f10612c);
        if (c5117b1 == null) {
            this.f10576b.trySetResult(Boolean.FALSE);
        } else {
            c5117b1.f10437b.mo13031b(c5156l0.m13130s(), this.f10576b);
            c5117b1.f10436a.m13145a();
        }
    }
}
