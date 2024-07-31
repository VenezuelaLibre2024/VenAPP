package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c0;

/* loaded from: classes2.dex */
final class av extends at {

    /* renamed from: c, reason: collision with root package name */
    private final c0 f10940c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public av(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f10940c = new c0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, com.google.android.play.integrity.internal.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f10940c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f10937a.trySetException(new StandardIntegrityException(i10, null));
        } else {
            this.f10937a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
