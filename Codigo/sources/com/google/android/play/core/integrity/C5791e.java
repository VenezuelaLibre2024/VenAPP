package com.google.android.play.core.integrity;

import android.net.Network;

/* renamed from: com.google.android.play.core.integrity.e */
/* loaded from: classes2.dex */
final class C5791e extends IntegrityTokenRequest {

    /* renamed from: a */
    private final String f12176a;

    /* renamed from: b */
    private final Long f12177b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5791e(String str, Long l10, Network network, C5790d c5790d) {
        this.f12176a = str;
        this.f12177b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    /* renamed from: a */
    public final Network mo14608a() {
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f12177b;
    }

    public final boolean equals(Object obj) {
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f12176a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f12177b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                integrityTokenRequest.mo14608a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f12176a.hashCode() ^ 1000003;
        Long l10 = this.f12177b;
        return ((hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode())) * 1000003;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f12176a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f12176a + ", cloudProjectNumber=" + this.f12177b + ", network=null}";
    }
}
