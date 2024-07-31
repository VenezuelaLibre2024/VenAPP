package com.google.android.gms.internal.p498firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzbj implements zzca {
    private final InputStream zza;

    private zzbj(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzca zza(byte[] bArr) {
        return new zzbj(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzca
    public final zzua zza() {
        try {
            return zzua.zza(this.zza, zzaio.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzca
    public final zzvg zzb() {
        try {
            return zzvg.zza(this.zza, zzaio.zza());
        } finally {
            this.zza.close();
        }
    }
}
