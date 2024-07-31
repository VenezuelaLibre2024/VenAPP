package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class zzaf {
    private final zzkw zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze = null;

    public zzaf(zzkw zzkwVar, String str, String str2, String str3, String str4) {
        this.zza = zzkwVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzafVar = (zzaf) obj;
        return zzafVar.zza == this.zza && n.a(zzafVar.zzb, this.zzb) && n.a(zzafVar.zzc, this.zzc) && n.a(zzafVar.zzd, this.zzd) && n.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, null});
    }

    public final zzkw zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
