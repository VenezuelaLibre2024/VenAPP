package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements OnCanceledListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f12739a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f12739a.cancel();
    }
}
