package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.b2 */
/* loaded from: classes.dex */
final class C5118b2 extends AbstractC5174r0 {

    /* renamed from: a */
    final /* synthetic */ Dialog f10439a;

    /* renamed from: b */
    final /* synthetic */ RunnableC5122c2 f10440b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5118b2(RunnableC5122c2 runnableC5122c2, Dialog dialog) {
        this.f10440b = runnableC5122c2;
        this.f10439a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5174r0
    /* renamed from: a */
    public final void mo13009a() {
        this.f10440b.f10450b.m13026d();
        if (this.f10439a.isShowing()) {
            this.f10439a.dismiss();
        }
    }
}
