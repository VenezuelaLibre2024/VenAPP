package com.google.android.gms.internal.p496authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class zbe implements InterfaceC5204n {
    private final Status zba;
    private final Credential zbb;

    public zbe(Status status, Credential credential) {
        this.zba = status;
        this.zbb = credential;
    }

    public final Credential getCredential() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.InterfaceC5204n
    public final Status getStatus() {
        return this.zba;
    }
}
