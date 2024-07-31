package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5820c0;

/* renamed from: com.google.android.play.core.integrity.av */
/* loaded from: classes2.dex */
final class BinderC5777av extends BinderC5775at {

    /* renamed from: c */
    private final C5820c0 f12155c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5777av(C5779ax c5779ax, TaskCompletionSource taskCompletionSource) {
        super(c5779ax, taskCompletionSource);
        this.f12155c = new C5820c0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC5775at, com.google.android.play.integrity.internal.InterfaceC5849w
    /* renamed from: e */
    public final void mo14630e(Bundle bundle) {
        super.mo14630e(bundle);
        this.f12155c.m14658c("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f12152a.trySetException(new StandardIntegrityException(i10, null));
        } else {
            this.f12152a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
