package com.google.android.gms.internal.p498firebaseauthapi;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class zzbi implements zzcd {
    private final OutputStream zza;

    private zzbi(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzcd zza(OutputStream outputStream) {
        return new zzbi(outputStream);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzcd
    public final void zza(zzua zzuaVar) {
        try {
            zzuaVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzcd
    public final void zza(zzvg zzvgVar) {
        try {
            zzvgVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
