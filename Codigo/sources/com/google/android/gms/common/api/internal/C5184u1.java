package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.common.api.internal.u1 */
/* loaded from: classes.dex */
public final class C5184u1 extends AbstractC5196y1 {

    /* renamed from: b */
    protected final AbstractC5123d f10589b;

    public C5184u1(int i10, AbstractC5123d abstractC5123d) {
        super(i10);
        this.f10589b = (AbstractC5123d) C5276s.m13325k(abstractC5123d, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: a */
    public final void mo13166a(Status status) {
        try {
            this.f10589b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: b */
    public final void mo13167b(Exception exc) {
        try {
            this.f10589b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: c */
    public final void mo13168c(C5156l0 c5156l0) {
        try {
            this.f10589b.run(c5156l0.m13130s());
        } catch (RuntimeException e10) {
            mo13167b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: d */
    public final void mo13189d(C5116b0 c5116b0, boolean z10) {
        c5116b0.m13004c(this.f10589b, z10);
    }
}
