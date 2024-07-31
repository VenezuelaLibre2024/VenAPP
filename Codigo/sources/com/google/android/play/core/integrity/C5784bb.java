package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.integrity.internal.C5820c0;

/* renamed from: com.google.android.play.core.integrity.bb */
/* loaded from: classes2.dex */
final class C5784bb extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a */
    private final String f12167a;

    /* renamed from: b */
    private final C5809u f12168b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5784bb(String str, C5820c0 c5820c0, PendingIntent pendingIntent) {
        this.f12167a = str;
        this.f12168b = new C5809u(c5820c0, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f12167a;
    }
}
