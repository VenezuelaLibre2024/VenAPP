package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
final class j0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.f f9593a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(com.google.android.gms.common.api.internal.f fVar) {
        this.f9593a = fVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        this.f9593a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i10) {
        this.f9593a.onConnectionSuspended(i10);
    }
}
