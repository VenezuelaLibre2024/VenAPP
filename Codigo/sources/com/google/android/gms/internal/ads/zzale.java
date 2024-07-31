package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzale {
    private final zzfp zza = new zzfp();
    private final int[] zzb = new int[RecognitionOptions.QR_CODE];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzale zzaleVar, zzfp zzfpVar, int i10) {
        int zzo;
        if (i10 < 4) {
            return;
        }
        zzfpVar.zzL(3);
        int i11 = i10 - 4;
        if ((zzfpVar.zzm() & RecognitionOptions.ITF) != 0) {
            if (i11 < 7 || (zzo = zzfpVar.zzo()) < 4) {
                return;
            }
            zzaleVar.zzh = zzfpVar.zzq();
            zzaleVar.zzi = zzfpVar.zzq();
            zzaleVar.zza.zzH(zzo - 4);
            i11 -= 7;
        }
        zzfp zzfpVar2 = zzaleVar.zza;
        int zzd = zzfpVar2.zzd();
        int zze = zzfpVar2.zze();
        if (zzd >= zze || i11 <= 0) {
            return;
        }
        int min = Math.min(i11, zze - zzd);
        zzfpVar.zzG(zzfpVar2.zzM(), zzd, min);
        zzaleVar.zza.zzK(zzd + min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzale zzaleVar, zzfp zzfpVar, int i10) {
        if (i10 < 19) {
            return;
        }
        zzaleVar.zzd = zzfpVar.zzq();
        zzaleVar.zze = zzfpVar.zzq();
        zzfpVar.zzL(11);
        zzaleVar.zzf = zzfpVar.zzq();
        zzaleVar.zzg = zzfpVar.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzale zzaleVar, zzfp zzfpVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzfpVar.zzL(2);
        int i11 = 0;
        Arrays.fill(zzaleVar.zzb, 0);
        int i12 = i10 / 5;
        int i13 = 0;
        while (i13 < i12) {
            int zzm = zzfpVar.zzm();
            int zzm2 = zzfpVar.zzm();
            int zzm3 = zzfpVar.zzm();
            int zzm4 = zzfpVar.zzm();
            int zzm5 = zzfpVar.zzm();
            double d10 = zzm2;
            int[] iArr = zzaleVar.zzb;
            double d11 = zzm3 - 128;
            int max = Math.max(i11, Math.min((int) ((1.402d * d11) + d10), 255)) << 16;
            double d12 = zzm4 - 128;
            iArr[zzm] = Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)) | (zzm5 << 24) | max | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8);
            i13++;
            i11 = 0;
        }
        zzaleVar.zzc = true;
    }

    public final zzec zza() {
        int i10;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzfp zzfpVar = this.zza;
        if (zzfpVar.zze() == 0 || zzfpVar.zzd() != zzfpVar.zze() || !this.zzc) {
            return null;
        }
        zzfpVar.zzK(0);
        int i11 = this.zzh * this.zzi;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int zzm = this.zza.zzm();
            if (zzm != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.zzb[zzm];
            } else {
                int zzm2 = this.zza.zzm();
                if (zzm2 != 0) {
                    int i13 = zzm2 & 63;
                    if ((zzm2 & 64) != 0) {
                        i13 = (i13 << 8) | this.zza.zzm();
                    }
                    i10 = i13 + i12;
                    Arrays.fill(iArr, i12, i10, (zzm2 & RecognitionOptions.ITF) == 0 ? 0 : this.zzb[this.zza.zzm()]);
                }
            }
            i12 = i10;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzea zzeaVar = new zzea();
        zzeaVar.zzc(createBitmap);
        zzeaVar.zzh(this.zzf / this.zzd);
        zzeaVar.zzi(0);
        zzeaVar.zze(this.zzg / this.zze, 0);
        zzeaVar.zzf(0);
        zzeaVar.zzk(this.zzh / this.zzd);
        zzeaVar.zzd(this.zzi / this.zze);
        return zzeaVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}
