package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgz {
    private Uri zza;
    private Map zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzgz zza(int i10) {
        this.zzd = 6;
        return this;
    }

    public final zzgz zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgz zzc(long j10) {
        this.zzc = j10;
        return this;
    }

    public final zzgz zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhb zze() {
        if (this.zza != null) {
            return new zzhb(this.zza, this.zzb, this.zzc, this.zzd);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
