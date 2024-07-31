package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.a;
import com.google.android.gms.auth.account.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;

/* loaded from: classes2.dex */
public final class zzal implements b {
    private static final Status zza = new Status(13);

    public final i<Object> addWorkAccount(f fVar, String str) {
        return fVar.b(new zzae(this, a.f9169a, fVar, str));
    }

    public final i<n> removeWorkAccount(f fVar, Account account) {
        return fVar.b(new zzag(this, a.f9169a, fVar, account));
    }

    public final void setWorkAuthenticatorEnabled(f fVar, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(fVar, z10);
    }

    public final i<n> setWorkAuthenticatorEnabledWithResult(f fVar, boolean z10) {
        return fVar.b(new zzac(this, a.f9169a, fVar, z10));
    }
}
