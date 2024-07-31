package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzxu extends zzdg {
    public static final zzxu zzF;

    @Deprecated
    public static final zzxu zzG;

    @Deprecated
    public static final zzn zzH;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private static final String zzam;
    private static final String zzan;
    private static final String zzao;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    private final SparseArray zzap;
    private final SparseBooleanArray zzaq;

    static {
        zzxu zzxuVar = new zzxu(new zzxs());
        zzF = zzxuVar;
        zzG = zzxuVar;
        zzW = Integer.toString(AdError.NETWORK_ERROR_CODE, 36);
        zzX = Integer.toString(AdError.NO_FILL_ERROR_CODE, 36);
        zzY = Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
        zzZ = Integer.toString(1003, 36);
        zzaa = Integer.toString(1004, 36);
        zzab = Integer.toString(1005, 36);
        zzac = Integer.toString(1006, 36);
        zzad = Integer.toString(1007, 36);
        zzae = Integer.toString(1008, 36);
        zzaf = Integer.toString(1009, 36);
        zzag = Integer.toString(1010, 36);
        zzah = Integer.toString(1011, 36);
        zzai = Integer.toString(1012, 36);
        zzaj = Integer.toString(1013, 36);
        zzak = Integer.toString(1014, 36);
        zzal = Integer.toString(1015, 36);
        zzam = Integer.toString(1016, 36);
        zzan = Integer.toString(1017, 36);
        zzao = Integer.toString(1018, 36);
        zzH = zzxq.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzxu(zzxs zzxsVar) {
        super(zzxsVar);
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z10 = zzxsVar.zza;
        this.zzI = z10;
        this.zzJ = false;
        z11 = zzxsVar.zzb;
        this.zzK = z11;
        this.zzL = false;
        z12 = zzxsVar.zzc;
        this.zzM = z12;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = false;
        z13 = zzxsVar.zzd;
        this.zzR = z13;
        z14 = zzxsVar.zze;
        this.zzS = z14;
        z15 = zzxsVar.zzf;
        this.zzT = z15;
        this.zzU = false;
        z16 = zzxsVar.zzg;
        this.zzV = z16;
        sparseArray = zzxsVar.zzh;
        this.zzap = sparseArray;
        sparseBooleanArray = zzxsVar.zzi;
        this.zzaq = sparseBooleanArray;
    }

    public /* synthetic */ zzxu(zzxs zzxsVar, zzxt zzxtVar) {
        this(zzxsVar);
    }

    public static zzxu zzd(Context context) {
        return new zzxu(new zzxs(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxu.class == obj.getClass()) {
            zzxu zzxuVar = (zzxu) obj;
            if (super.equals(zzxuVar) && this.zzI == zzxuVar.zzI && this.zzK == zzxuVar.zzK && this.zzM == zzxuVar.zzM && this.zzR == zzxuVar.zzR && this.zzS == zzxuVar.zzS && this.zzT == zzxuVar.zzT && this.zzV == zzxuVar.zzV) {
                SparseBooleanArray sparseBooleanArray = this.zzaq;
                SparseBooleanArray sparseBooleanArray2 = zzxuVar.zzaq;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.zzap;
                            SparseArray sparseArray2 = zzxuVar.zzap;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzws zzwsVar = (zzws) entry.getKey();
                                                if (map2.containsKey(zzwsVar) && zzfy.zzF(entry.getValue(), map2.get(zzwsVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 28629151) + (this.zzR ? 1 : 0)) * 31) + (this.zzS ? 1 : 0)) * 31) + (this.zzT ? 1 : 0)) * 961) + (this.zzV ? 1 : 0)) * 31;
    }

    public final zzxs zzc() {
        return new zzxs(this, null);
    }

    @Deprecated
    public final zzxw zze(int i10, zzws zzwsVar) {
        Map map = (Map) this.zzap.get(i10);
        if (map != null) {
            return (zzxw) map.get(zzwsVar);
        }
        return null;
    }

    public final boolean zzf(int i10) {
        return this.zzaq.get(i10);
    }

    @Deprecated
    public final boolean zzg(int i10, zzws zzwsVar) {
        Map map = (Map) this.zzap.get(i10);
        return map != null && map.containsKey(zzwsVar);
    }
}
