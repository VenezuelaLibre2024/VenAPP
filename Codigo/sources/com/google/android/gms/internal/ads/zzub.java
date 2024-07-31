package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzub implements zzwj {
    protected final zzwj[] zza;

    public zzub(zzwj[] zzwjVarArr) {
        this.zza = zzwjVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final long zzb() {
        long j10 = Long.MAX_VALUE;
        for (zzwj zzwjVar : this.zza) {
            long zzb = zzwjVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final long zzc() {
        long j10 = Long.MAX_VALUE;
        for (zzwj zzwjVar : this.zza) {
            long zzc = zzwjVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzc);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final void zzm(long j10) {
        for (zzwj zzwjVar : this.zza) {
            zzwjVar.zzm(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final boolean zzo(zzlg zzlgVar) {
        boolean z10;
        boolean z11 = false;
        do {
            long zzc = zzc();
            long j10 = Long.MIN_VALUE;
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            zzwj[] zzwjVarArr = this.zza;
            int length = zzwjVarArr.length;
            int i10 = 0;
            z10 = false;
            while (i10 < length) {
                zzwj zzwjVar = zzwjVarArr[i10];
                long zzc2 = zzwjVar.zzc();
                boolean z12 = zzc2 != j10 && zzc2 <= zzlgVar.zza;
                if (zzc2 == zzc || z12) {
                    z10 |= zzwjVar.zzo(zzlgVar);
                }
                i10++;
                j10 = Long.MIN_VALUE;
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final boolean zzp() {
        for (zzwj zzwjVar : this.zza) {
            if (zzwjVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
