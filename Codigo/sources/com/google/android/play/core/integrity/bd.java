package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final ax f10957a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bd(ax axVar) {
        this.f10957a = axVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task a(long j10, long j11, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f10957a.c(standardIntegrityTokenRequest.a(), j10, j11);
    }
}
