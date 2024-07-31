package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class w implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final ad f10988a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(ad adVar) {
        this.f10988a = adVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f10988a.b(integrityTokenRequest);
    }
}
