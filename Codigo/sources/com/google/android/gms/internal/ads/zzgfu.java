package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class zzgfu {
    private final OutputStream zza;

    private zzgfu(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgfu zzb(OutputStream outputStream) {
        return new zzgfu(outputStream);
    }

    public final void zza(zzgvg zzgvgVar) {
        try {
            zzgvgVar.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
