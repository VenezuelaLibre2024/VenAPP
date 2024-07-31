package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzmd extends zzii {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcx[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzmd(java.util.Collection r7, com.google.android.gms.internal.ads.zzwk r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzcx[] r0 = new com.google.android.gms.internal.ads.zzcx[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzlm r4 = (com.google.android.gms.internal.ads.zzlm) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzcx r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzlm r3 = (com.google.android.gms.internal.ads.zzlm) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmd.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzwk):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzmd(zzcx[] zzcxVarArr, Object[] objArr, zzwk zzwkVar) {
        super(false, zzwkVar);
        int i10 = 0;
        this.zzh = zzcxVarArr;
        int length = zzcxVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < zzcxVarArr.length) {
            zzcx zzcxVar = zzcxVarArr[i10];
            this.zzh[i13] = zzcxVar;
            this.zzg[i13] = i11;
            this.zzf[i13] = i12;
            i11 += zzcxVar.zzc();
            i12 += this.zzh[i13].zzb();
            this.zzj.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.zzd = i11;
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzq(int i10) {
        return zzfy.zzb(this.zzf, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzr(int i10) {
        return zzfy.zzb(this.zzg, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzs(int i10) {
        return this.zzf[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzt(int i10) {
        return this.zzg[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final zzcx zzu(int i10) {
        return this.zzh[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final Object zzv(int i10) {
        return this.zzi[i10];
    }

    public final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzmd zzx(zzwk zzwkVar) {
        zzcx[] zzcxVarArr = new zzcx[this.zzh.length];
        int i10 = 0;
        while (true) {
            zzcx[] zzcxVarArr2 = this.zzh;
            if (i10 >= zzcxVarArr2.length) {
                return new zzmd(zzcxVarArr, this.zzi, zzwkVar);
            }
            zzcxVarArr[i10] = new zzmc(this, zzcxVarArr2[i10]);
            i10++;
        }
    }
}
