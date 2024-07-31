package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.c0;

/* loaded from: classes2.dex */
final class ah extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f10916a;

    /* renamed from: b, reason: collision with root package name */
    private final u f10917b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(String str, c0 c0Var, PendingIntent pendingIntent) {
        this.f10916a = str;
        this.f10917b = new u(c0Var, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f10916a;
    }
}
