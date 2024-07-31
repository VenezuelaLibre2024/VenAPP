package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
final class zzvf implements zzup, zzuo {
    private final zzup[] zza;
    private zzuo zze;
    private zzws zzf;
    private final zzuc zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzwj zzh = new zzub(new zzwj[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzup[] zzg = new zzup[0];

    public zzvf(zzuc zzucVar, long[] jArr, zzup... zzupVarArr) {
        this.zzi = zzucVar;
        this.zza = zzupVarArr;
        for (int i10 = 0; i10 < zzupVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zzwp(zzupVarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j10, zzmj zzmjVar) {
        zzup[] zzupVarArr = this.zzg;
        return (zzupVarArr.length > 0 ? zzupVarArr[0] : this.zza[0]).zza(j10, zzmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (zzup zzupVar : this.zzg) {
            long zzd = zzupVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (zzup zzupVar2 : this.zzg) {
                        if (zzupVar2 == zzupVar) {
                            break;
                        }
                        if (zzupVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = zzd;
                } else if (zzd != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && zzupVar.zze(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j10) {
        long zze = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zzup[] zzupVarArr = this.zzg;
            if (i10 >= zzupVarArr.length) {
                return zze;
            }
            if (zzupVarArr[i10].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyi[] zzyiVarArr, boolean[] zArr, zzwh[] zzwhVarArr, boolean[] zArr2, long j10) {
        int length;
        int length2 = zzyiVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzyiVarArr.length;
            if (i11 >= length) {
                break;
            }
            zzwh zzwhVar = zzwhVarArr[i11];
            Integer num = zzwhVar != null ? (Integer) this.zzb.get(zzwhVar) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            zzyi zzyiVar = zzyiVarArr[i11];
            if (zzyiVar != null) {
                String str = zzyiVar.zze().zzc;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.zzb.clear();
        zzwh[] zzwhVarArr2 = new zzwh[length];
        zzwh[] zzwhVarArr3 = new zzwh[length];
        zzyi[] zzyiVarArr2 = new zzyi[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.zza.length) {
            for (int i13 = i10; i13 < zzyiVarArr.length; i13++) {
                zzwhVarArr3[i13] = iArr[i13] == i12 ? zzwhVarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    zzyi zzyiVar2 = zzyiVarArr[i13];
                    zzyiVar2.getClass();
                    zzcz zzczVar = (zzcz) this.zzd.get(zzyiVar2.zze());
                    zzczVar.getClass();
                    zzyiVarArr2[i13] = new zzve(zzyiVar2, zzczVar);
                } else {
                    zzyiVarArr2[i13] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzyi[] zzyiVarArr3 = zzyiVarArr2;
            zzwh[] zzwhVarArr4 = zzwhVarArr3;
            long zzf = this.zza[i12].zzf(zzyiVarArr2, zArr, zzwhVarArr3, zArr2, j11);
            if (i12 == 0) {
                j11 = zzf;
            } else if (zzf != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < zzyiVarArr.length; i14++) {
                if (iArr2[i14] == i12) {
                    zzwh zzwhVar2 = zzwhVarArr4[i14];
                    zzwhVar2.getClass();
                    zzwhVarArr2[i14] = zzwhVar2;
                    this.zzb.put(zzwhVar2, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr[i14] == i12) {
                    zzek.zzf(zzwhVarArr4[i14] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i12]);
            }
            i12++;
            arrayList = arrayList2;
            zzyiVarArr2 = zzyiVarArr3;
            zzwhVarArr3 = zzwhVarArr4;
            i10 = 0;
        }
        int i15 = i10;
        System.arraycopy(zzwhVarArr2, i15, zzwhVarArr, i15, length);
        zzup[] zzupVarArr = (zzup[]) arrayList.toArray(new zzup[i15]);
        this.zzg = zzupVarArr;
        this.zzh = new zzub(zzupVarArr);
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final /* bridge */ /* synthetic */ void zzg(zzwj zzwjVar) {
        zzuo zzuoVar = this.zze;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzws zzh() {
        zzws zzwsVar = this.zzf;
        zzwsVar.getClass();
        return zzwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        this.zzc.remove(zzupVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (zzup zzupVar2 : this.zza) {
            i10 += zzupVar2.zzh().zzc;
        }
        zzcz[] zzczVarArr = new zzcz[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i11 >= zzupVarArr.length) {
                this.zzf = new zzws(zzczVarArr);
                zzuo zzuoVar = this.zze;
                zzuoVar.getClass();
                zzuoVar.zzi(this);
                return;
            }
            zzws zzh = zzupVarArr[i11].zzh();
            int i13 = zzh.zzc;
            int i14 = 0;
            while (i14 < i13) {
                zzcz zzb = zzh.zzb(i14);
                zzcz zzc = zzb.zzc(i11 + ":" + zzb.zzc);
                this.zzd.put(zzc, zzb);
                zzczVarArr[i12] = zzc;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j10, boolean z10) {
        for (zzup zzupVar : this.zzg) {
            zzupVar.zzj(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() {
        int i10 = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i10 >= zzupVarArr.length) {
                return;
            }
            zzupVarArr[i10].zzk();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j10) {
        this.zze = zzuoVar;
        Collections.addAll(this.zzc, this.zza);
        int i10 = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i10 >= zzupVarArr.length) {
                return;
            }
            zzupVarArr[i10].zzl(this, j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zzup zzn(int i10) {
        zzup zzupVar = this.zza[i10];
        return zzupVar instanceof zzwp ? ((zzwp) zzupVar).zzn() : zzupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzo(zzlg zzlgVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzlgVar);
        }
        int size = this.zzc.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzup) this.zzc.get(i10)).zzo(zzlgVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
