package com.google.android.play.core.integrity;

import android.net.Network;

/* loaded from: classes2.dex */
final class e extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f10961a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f10962b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ e(String str, Long l10, Network network, d dVar) {
        this.f10961a = str;
        this.f10962b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Network a() {
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f10962b;
    }

    public final boolean equals(Object obj) {
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f10961a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f10962b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                integrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10961a.hashCode() ^ 1000003;
        Long l10 = this.f10962b;
        return ((hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode())) * 1000003;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f10961a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f10961a + ", cloudProjectNumber=" + this.f10962b + ", network=null}";
    }
}
