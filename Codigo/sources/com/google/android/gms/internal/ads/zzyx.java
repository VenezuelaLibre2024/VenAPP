package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzyx {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyq[] zzd = new zzyq[100];

    public zzyx(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzyq zzb() {
        zzyq zzyqVar;
        this.zzb++;
        int i10 = this.zzc;
        if (i10 > 0) {
            zzyq[] zzyqVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzc = i11;
            zzyqVar = zzyqVarArr[i11];
            zzyqVar.getClass();
            zzyqVarArr[i11] = null;
        } else {
            zzyqVar = new zzyq(new byte[65536], 0);
            int i12 = this.zzb;
            zzyq[] zzyqVarArr2 = this.zzd;
            int length = zzyqVarArr2.length;
            if (i12 > length) {
                this.zzd = (zzyq[]) Arrays.copyOf(zzyqVarArr2, length + length);
                return zzyqVar;
            }
        }
        return zzyqVar;
    }

    public final synchronized void zzc(zzyq zzyqVar) {
        zzyq[] zzyqVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzyqVarArr[i10] = zzyqVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzyr zzyrVar) {
        while (zzyrVar != null) {
            zzyq[] zzyqVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzyqVarArr[i10] = zzyrVar.zzc();
            this.zzb--;
            zzyrVar = zzyrVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        int i11 = zzfy.zza;
        int max = Math.max(0, ((i10 + 65535) / 65536) - this.zzb);
        int i12 = this.zzc;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.zzd, max, i12, (Object) null);
        this.zzc = max;
    }
}
