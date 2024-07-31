package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaog implements zzacu {

    @Deprecated
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaod
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzaog(1, 1, zzakp.zza, new zzfw(0L), new zzamv(0), 112800)};
        }
    };
    private final List zzb;
    private final zzfp zzc;
    private final SparseIntArray zzd;
    private final zzaoj zze;
    private final zzakp zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaoc zzj;
    private zzaob zzk;
    private zzacx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzaog() {
        throw null;
    }

    public zzaog(int i10, int i11, zzakp zzakpVar, zzfw zzfwVar, zzaoj zzaojVar, int i12) {
        this.zze = zzaojVar;
        this.zzf = zzakpVar;
        this.zzb = Collections.singletonList(zzfwVar);
        this.zzc = new zzfp(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaoc(112800);
        this.zzl = zzacx.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(sparseArray2.keyAt(i13), (zzaol) sparseArray2.valueAt(i13));
        }
        this.zzg.put(0, new zzany(new zzaoe(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a9, code lost:
    
        if (r1 == false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacv r19, com.google.android.gms.internal.ads.zzadr r20) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaog.zzb(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzadr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzl = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        zzaob zzaobVar;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfw zzfwVar = (zzfw) this.zzb.get(i10);
            if (zzfwVar.zzf() != -9223372036854775807L) {
                long zzd = zzfwVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j11) {
                        }
                    }
                }
            }
            zzfwVar.zzi(j11);
        }
        if (j11 != 0 && (zzaobVar = this.zzk) != null) {
            zzaobVar.zzd(j11);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzg.size(); i11++) {
            ((zzaol) this.zzg.valueAt(i11)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(com.google.android.gms.internal.ads.zzacv r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfp r0 = r6.zzc
            byte[] r0 = r0.zzM()
            com.google.android.gms.internal.ads.zzack r7 = (com.google.android.gms.internal.ads.zzack) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaog.zze(com.google.android.gms.internal.ads.zzacv):boolean");
    }
}
