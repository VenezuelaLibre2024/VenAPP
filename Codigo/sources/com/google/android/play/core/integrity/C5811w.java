package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.play.core.integrity.w */
/* loaded from: classes2.dex */
final class C5811w implements IntegrityManager {

    /* renamed from: a */
    private final C5759ad f12203a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5811w(C5759ad c5759ad) {
        this.f12203a = c5759ad;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f12203a.m14621b(integrityTokenRequest);
    }
}
