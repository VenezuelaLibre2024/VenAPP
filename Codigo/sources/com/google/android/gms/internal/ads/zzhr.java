package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhr extends zzhp {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhr(int i10, String str, IOException iOException, Map map, zzhb zzhbVar, byte[] bArr) {
        super("Response code: " + i10, iOException, zzhbVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzd = i10;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
