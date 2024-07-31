package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface IntegrityManager {
    Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest);
}
