package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.integrity.internal.c0;

/* loaded from: classes2.dex */
final class bb extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a, reason: collision with root package name */
    private final String f10952a;

    /* renamed from: b, reason: collision with root package name */
    private final u f10953b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bb(String str, c0 c0Var, PendingIntent pendingIntent) {
        this.f10952a = str;
        this.f10953b = new u(c0Var, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f10952a;
    }
}
