package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.k */
/* loaded from: classes2.dex */
final class C5797k extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a */
    private final String f12182a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5797k(String str, C5796j c5796j) {
        this.f12182a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    /* renamed from: a */
    public final String mo14610a() {
        return this.f12182a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        String str = this.f12182a;
        String mo14610a = ((StandardIntegrityManager.StandardIntegrityTokenRequest) obj).mo14610a();
        return str == null ? mo14610a == null : str.equals(mo14610a);
    }

    public final int hashCode() {
        String str = this.f12182a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f12182a + "}";
    }
}
