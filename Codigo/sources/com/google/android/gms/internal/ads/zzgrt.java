package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgrt implements zzggp {
    private final zzggp zza;
    private final zzgvz zzb;
    private final byte[] zzc;

    private zzgrt(zzggp zzggpVar, zzgvz zzgvzVar, byte[] bArr) {
        this.zza = zzggpVar;
        this.zzb = zzgvzVar;
        this.zzc = bArr;
    }

    public static zzggp zza(zzgno zzgnoVar) {
        ByteBuffer put;
        byte[] array;
        zzgox zza = zzgnoVar.zza(zzggb.zza());
        zzguq zza2 = zzgut.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzggp zzggpVar = (zzggp) zzghb.zzc((zzgut) zza2.zzal(), zzggp.class);
        zzgvz zzc = zza.zzc();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = new byte[0];
                    return new zzgrt(zzggpVar, zzc, array);
                }
                if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        array = put.putInt(zzgnoVar.zzb().intValue()).array();
        return new zzgrt(zzggpVar, zzc, array);
    }
}
