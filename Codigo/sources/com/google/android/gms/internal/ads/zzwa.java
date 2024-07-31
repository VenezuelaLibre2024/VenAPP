package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzwa {
    private final zzfp zza = new zzfp(32);
    private zzvz zzb;
    private zzvz zzc;
    private zzvz zzd;
    private long zze;
    private final zzyx zzf;

    public zzwa(zzyx zzyxVar) {
        this.zzf = zzyxVar;
        zzvz zzvzVar = new zzvz(0L, 65536);
        this.zzb = zzvzVar;
        this.zzc = zzvzVar;
        this.zzd = zzvzVar;
    }

    private final int zzi(int i10) {
        zzvz zzvzVar = this.zzd;
        if (zzvzVar.zzc == null) {
            zzyq zzb = this.zzf.zzb();
            zzvz zzvzVar2 = new zzvz(this.zzd.zzb, 65536);
            zzvzVar.zzc = zzb;
            zzvzVar.zzd = zzvzVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvz zzj(zzvz zzvzVar, long j10) {
        while (j10 >= zzvzVar.zzb) {
            zzvzVar = zzvzVar.zzd;
        }
        return zzvzVar;
    }

    private static zzvz zzk(zzvz zzvzVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzvz zzj = zzj(zzvzVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j10));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvz zzl(zzvz zzvzVar, long j10, byte[] bArr, int i10) {
        zzvz zzj = zzj(zzvzVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j10));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvz zzm(zzvz zzvzVar, zzih zzihVar, zzwc zzwcVar, zzfp zzfpVar) {
        zzvz zzvzVar2;
        if (zzihVar.zzk()) {
            long j10 = zzwcVar.zzb;
            int i10 = 1;
            zzfpVar.zzH(1);
            zzvz zzl = zzl(zzvzVar, j10, zzfpVar.zzM(), 1);
            long j11 = j10 + 1;
            byte b10 = zzfpVar.zzM()[0];
            int i11 = b10 & 128;
            int i12 = b10 & Byte.MAX_VALUE;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i11 != 0;
            zzvzVar2 = zzl(zzl, j11, zzieVar.zza, i12);
            long j12 = j11 + i12;
            if (z10) {
                zzfpVar.zzH(2);
                zzvzVar2 = zzl(zzvzVar2, j12, zzfpVar.zzM(), 2);
                j12 += 2;
                i10 = zzfpVar.zzq();
            }
            int i13 = i10;
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < i13) {
                iArr = new int[i13];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < i13) {
                iArr3 = new int[i13];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i14 = i13 * 6;
                zzfpVar.zzH(i14);
                zzvzVar2 = zzl(zzvzVar2, j12, zzfpVar.zzM(), i14);
                j12 += i14;
                zzfpVar.zzK(0);
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr2[i15] = zzfpVar.zzq();
                    iArr4[i15] = zzfpVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwcVar.zza - ((int) (j12 - zzwcVar.zzb));
            }
            zzadz zzadzVar = zzwcVar.zzc;
            int i16 = zzfy.zza;
            zzieVar.zzc(i13, iArr2, iArr4, zzadzVar.zzb, zzieVar.zza, zzadzVar.zza, zzadzVar.zzc, zzadzVar.zzd);
            long j13 = zzwcVar.zzb;
            int i17 = (int) (j12 - j13);
            zzwcVar.zzb = j13 + i17;
            zzwcVar.zza -= i17;
        } else {
            zzvzVar2 = zzvzVar;
        }
        if (!zzihVar.zze()) {
            zzihVar.zzi(zzwcVar.zza);
            return zzk(zzvzVar2, zzwcVar.zzb, zzihVar.zzc, zzwcVar.zza);
        }
        zzfpVar.zzH(4);
        zzvz zzl2 = zzl(zzvzVar2, zzwcVar.zzb, zzfpVar.zzM(), 4);
        int zzp = zzfpVar.zzp();
        zzwcVar.zzb += 4;
        zzwcVar.zza -= 4;
        zzihVar.zzi(zzp);
        zzvz zzk = zzk(zzl2, zzwcVar.zzb, zzihVar.zzc, zzp);
        zzwcVar.zzb += zzp;
        int i18 = zzwcVar.zza - zzp;
        zzwcVar.zza = i18;
        ByteBuffer byteBuffer = zzihVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            zzihVar.zzf = ByteBuffer.allocate(i18);
        } else {
            zzihVar.zzf.clear();
        }
        return zzk(zzk, zzwcVar.zzb, zzihVar.zzf, zzwcVar.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + i10;
        this.zze = j10;
        zzvz zzvzVar = this.zzd;
        if (j10 == zzvzVar.zzb) {
            this.zzd = zzvzVar.zzd;
        }
    }

    public final int zza(zzu zzuVar, int i10, boolean z10) {
        int zzi = zzi(i10);
        zzvz zzvzVar = this.zzd;
        int zza = zzuVar.zza(zzvzVar.zzc.zza, zzvzVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzvz zzvzVar;
        if (j10 != -1) {
            while (true) {
                zzvzVar = this.zzb;
                if (j10 < zzvzVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvzVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvzVar.zza) {
                this.zzc = zzvzVar;
            }
        }
    }

    public final void zzd(zzih zzihVar, zzwc zzwcVar) {
        zzm(this.zzc, zzihVar, zzwcVar, this.zza);
    }

    public final void zze(zzih zzihVar, zzwc zzwcVar) {
        this.zzc = zzm(this.zzc, zzihVar, zzwcVar, this.zza);
    }

    public final void zzf() {
        zzvz zzvzVar = this.zzb;
        if (zzvzVar.zzc != null) {
            this.zzf.zzd(zzvzVar);
            zzvzVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvz zzvzVar2 = this.zzb;
        this.zzc = zzvzVar2;
        this.zzd = zzvzVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfp zzfpVar, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzvz zzvzVar = this.zzd;
            zzfpVar.zzG(zzvzVar.zzc.zza, zzvzVar.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}
