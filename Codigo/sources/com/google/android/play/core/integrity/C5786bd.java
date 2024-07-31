package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.bd */
/* loaded from: classes2.dex */
public final class C5786bd {

    /* renamed from: a */
    private final C5779ax f12172a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5786bd(C5779ax c5779ax) {
        this.f12172a = c5779ax;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Task m14642a(long j10, long j11, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f12172a.m14636c(standardIntegrityTokenRequest.mo14610a(), j10, j11);
    }
}
