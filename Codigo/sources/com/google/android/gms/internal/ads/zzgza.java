package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzgza extends zzgya {
    private static final Logger zza = Logger.getLogger(zzgza.class.getName());
    private static final boolean zzb = zzhcz.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgzb zze;

    private zzgza() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgza(zzgyz zzgyzVar) {
    }

    public static int zzA(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static zzgza zzB(byte[] bArr, int i10, int i11) {
        return new zzgyw(bArr, 0, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzw(int i10, zzhbe zzhbeVar, zzhby zzhbyVar) {
        int zzz = zzz(i10 << 3);
        return zzz + zzz + ((zzgxt) zzhbeVar).zzat(zzhbyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(zzhbe zzhbeVar, zzhby zzhbyVar) {
        int zzat = ((zzgxt) zzhbeVar).zzat(zzhbyVar);
        return zzz(zzat) + zzat;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzhde.zze(str);
        } catch (zzhdd unused) {
            length = str.getBytes(zzhae.zzb).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzC() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzD(String str, zzhdd zzhddVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhddVar);
        byte[] bytes = str.getBytes(zzhae.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgyx(e10);
        }
    }

    public abstract void zzH();

    public abstract void zzI(byte b10);

    public abstract void zzJ(int i10, boolean z10);

    public abstract void zzK(int i10, zzgyl zzgylVar);

    @Override // com.google.android.gms.internal.ads.zzgya
    public abstract void zza(byte[] bArr, int i10, int i11);

    public abstract int zzb();

    public abstract void zzh(int i10, int i11);

    public abstract void zzi(int i10);

    public abstract void zzj(int i10, long j10);

    public abstract void zzk(long j10);

    public abstract void zzl(int i10, int i11);

    public abstract void zzm(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(int i10, zzhbe zzhbeVar, zzhby zzhbyVar);

    public abstract void zzo(int i10, String str);

    public abstract void zzq(int i10, int i11);

    public abstract void zzr(int i10, int i11);

    public abstract void zzs(int i10);

    public abstract void zzt(int i10, long j10);

    public abstract void zzu(long j10);
}
