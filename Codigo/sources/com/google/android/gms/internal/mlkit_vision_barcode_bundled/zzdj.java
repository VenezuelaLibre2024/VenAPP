package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzdj extends zzcr {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzdj.class.getName());
    private static final boolean zzd = zzhi.zzx();
    zzdk zza;

    private zzdj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdj(zzdi zzdiVar) {
    }

    public static zzdj zzA(byte[] bArr, int i10, int i11) {
        return new zzdg(bArr, 0, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzt(int i10, zzfo zzfoVar, zzgh zzghVar) {
        int zzB = ((zzck) zzfoVar).zzB(zzghVar);
        int zzy = zzy(i10 << 3);
        return zzy + zzy + zzB;
    }

    public static int zzu(int i10) {
        if (i10 >= 0) {
            return zzy(i10);
        }
        return 10;
    }

    public static int zzv(zzfo zzfoVar) {
        int zzE = zzfoVar.zzE();
        return zzy(zzE) + zzE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(zzfo zzfoVar, zzgh zzghVar) {
        int zzB = ((zzck) zzfoVar).zzB(zzghVar);
        return zzy(zzB) + zzB;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = zzhn.zze(str);
        } catch (zzhm unused) {
            length = str.getBytes(zzem.zzb).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzz(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzC(String str, zzhm zzhmVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhmVar);
        byte[] bytes = str.getBytes(zzem.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzdh(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zzdb zzdbVar);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, String str);

    public abstract void zzo(int i10, int i11);

    public abstract void zzp(int i10, int i11);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10, long j10);

    public abstract void zzs(long j10);
}
