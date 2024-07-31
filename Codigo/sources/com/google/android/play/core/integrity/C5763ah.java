package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.C5820c0;

/* renamed from: com.google.android.play.core.integrity.ah */
/* loaded from: classes2.dex */
final class C5763ah extends IntegrityTokenResponse {

    /* renamed from: a */
    private final String f12131a;

    /* renamed from: b */
    private final C5809u f12132b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5763ah(String str, C5820c0 c5820c0, PendingIntent pendingIntent) {
        this.f12131a = str;
        this.f12132b = new C5809u(c5820c0, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f12131a;
    }
}
