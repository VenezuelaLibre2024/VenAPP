package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzgft {
    private final InputStream zza;

    private zzgft(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgft zzb(byte[] bArr) {
        return new zzgft(new ByteArrayInputStream(bArr));
    }

    public final zzgvg zza() {
        try {
            return zzgvg.zzg(this.zza, zzgzf.zza());
        } finally {
            this.zza.close();
        }
    }
}
