package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgae extends zzfzt {
    Object[] zzd;
    private int zze;

    public zzgae() {
        super(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgae(int i10) {
        super(i10);
        this.zzd = new Object[zzgaf.zzh(i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzu
    public final /* bridge */ /* synthetic */ zzfzu zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgae zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzgaf.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfzs.zza(hashCode);
                while (true) {
                    int i10 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i10 + 1;
                    } else {
                        objArr2[i10] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzgae zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzgaf zzh() {
        zzgaf zzv;
        boolean zzw;
        int i10 = this.zzb;
        if (i10 == 0) {
            return zzgbq.zza;
        }
        if (i10 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        if (this.zzd == null || zzgaf.zzh(i10) != this.zzd.length) {
            zzv = zzgaf.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i11 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzgaf.zzw(i11, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i11);
            }
            zzv = new zzgbq(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }
}
