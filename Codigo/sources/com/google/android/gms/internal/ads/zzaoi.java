package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaoi {
    public final int zza;
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzaoi(int i10, String str, List list, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = bArr;
    }
}
