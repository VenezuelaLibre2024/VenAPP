package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzxs extends zzdf {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzxs() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    public zzxs(Context context) {
        super.zze(context);
        Point zzu = zzfy.zzu(context);
        zzf(zzu.x, zzu.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzxs(zzxu zzxuVar, zzxr zzxrVar) {
        super(zzxuVar);
        this.zza = zzxuVar.zzI;
        this.zzb = zzxuVar.zzK;
        this.zzc = zzxuVar.zzM;
        this.zzd = zzxuVar.zzR;
        this.zze = zzxuVar.zzS;
        this.zzf = zzxuVar.zzT;
        this.zzg = zzxuVar.zzV;
        SparseArray zza = zzxu.zza(zzxuVar);
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < zza.size(); i10++) {
            sparseArray.put(zza.keyAt(i10), new HashMap((Map) zza.valueAt(i10)));
        }
        this.zzh = sparseArray;
        this.zzi = zzxu.zzb(zzxuVar).clone();
    }

    private final void zzx() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final /* synthetic */ zzdf zzf(int i10, int i11, boolean z10) {
        super.zzf(i10, i11, true);
        return this;
    }

    public final zzxs zzp(int i10, boolean z10) {
        if (this.zzi.get(i10) != z10) {
            if (z10) {
                this.zzi.put(i10, true);
            } else {
                this.zzi.delete(i10);
            }
        }
        return this;
    }
}
