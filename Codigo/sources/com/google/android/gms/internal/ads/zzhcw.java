package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzhcw extends zzhcy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhcw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final byte zza(long j10) {
        return Memory.peekByte((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final double zzb(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final float zzc(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final void zzd(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray((int) j10, bArr, (int) j11, (int) j12);
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final void zze(Object obj, long j10, boolean z10) {
        if (zzhcz.zzb) {
            zzhcz.zzG(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzhcz.zzH(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final void zzf(Object obj, long j10, byte b10) {
        if (zzhcz.zzb) {
            zzhcz.zzG(obj, j10, b10);
        } else {
            zzhcz.zzH(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final void zzh(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    public final boolean zzi(Object obj, long j10) {
        return zzhcz.zzb ? zzhcz.zzw(obj, j10) : zzhcz.zzx(obj, j10);
    }
}
