package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class zzhp extends zzgx {
    public final zzhb zzb;
    public final int zzc;

    public zzhp(zzhb zzhbVar, int i10, int i11) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzhbVar;
        this.zzc = 1;
    }

    public zzhp(IOException iOException, zzhb zzhbVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = zzhbVar;
        this.zzc = i11;
    }

    public zzhp(String str, zzhb zzhbVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = zzhbVar;
        this.zzc = i11;
    }

    public zzhp(String str, IOException iOException, zzhb zzhbVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = zzhbVar;
        this.zzc = i11;
    }

    public static zzhp zza(IOException iOException, zzhb zzhbVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzfwk.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new zzho(iOException, zzhbVar) : new zzhp(iOException, zzhbVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i10;
    }
}
