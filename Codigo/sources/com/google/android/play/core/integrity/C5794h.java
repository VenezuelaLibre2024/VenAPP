package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.h */
/* loaded from: classes2.dex */
final class C5794h extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a */
    private final long f12180a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5794h(long j10, C5793g c5793g) {
        this.f12180a = j10;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* renamed from: a */
    public final long mo14609a() {
        return this.f12180a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) && this.f12180a == ((StandardIntegrityManager.PrepareIntegrityTokenRequest) obj).mo14609a();
    }

    public final int hashCode() {
        long j10 = this.f12180a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f12180a + "}";
    }
}
