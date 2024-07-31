package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import ca.C1894b;

/* renamed from: com.google.android.gms.common.internal.w0 */
/* loaded from: classes.dex */
abstract class AbstractC5289w0 extends AbstractC5245h1 {

    /* renamed from: d */
    public final int f10784d;

    /* renamed from: e */
    public final Bundle f10785e;

    /* renamed from: f */
    final /* synthetic */ AbstractC5228c f10786f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5289w0(AbstractC5228c abstractC5228c, int i10, Bundle bundle) {
        super(abstractC5228c, Boolean.TRUE);
        this.f10786f = abstractC5228c;
        this.f10784d = i10;
        this.f10785e = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5245h1
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo13265a(Object obj) {
        C1894b c1894b;
        if (this.f10784d != 0) {
            this.f10786f.zzp(1, null);
            Bundle bundle = this.f10785e;
            c1894b = new C1894b(this.f10784d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC5228c.KEY_PENDING_INTENT) : null);
        } else {
            if (mo13294g()) {
                return;
            }
            this.f10786f.zzp(1, null);
            c1894b = new C1894b(8, null);
        }
        mo13293f(c1894b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5245h1
    /* renamed from: b */
    public final void mo13266b() {
    }

    /* renamed from: f */
    protected abstract void mo13293f(C1894b c1894b);

    /* renamed from: g */
    protected abstract boolean mo13294g();
}
