package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzafe extends zzafg {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafe() {
        super(new zzact());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfp zzfpVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfpVar.zzt()));
    }

    private static Object zzh(zzfp zzfpVar, int i10) {
        if (i10 == 0) {
            return zzg(zzfpVar);
        }
        if (i10 == 1) {
            return Boolean.valueOf(zzfpVar.zzm() == 1);
        }
        if (i10 == 2) {
            return zzi(zzfpVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return zzj(zzfpVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzfpVar).doubleValue());
                zzfpVar.zzL(2);
                return date;
            }
            int zzp = zzfpVar.zzp();
            ArrayList arrayList = new ArrayList(zzp);
            for (int i11 = 0; i11 < zzp; i11++) {
                Object zzh = zzh(zzfpVar, zzfpVar.zzm());
                if (zzh != null) {
                    arrayList.add(zzh);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String zzi = zzi(zzfpVar);
            int zzm = zzfpVar.zzm();
            if (zzm == 9) {
                return hashMap;
            }
            Object zzh2 = zzh(zzfpVar, zzm);
            if (zzh2 != null) {
                hashMap.put(zzi, zzh2);
            }
        }
    }

    private static String zzi(zzfp zzfpVar) {
        int zzq = zzfpVar.zzq();
        int zzd = zzfpVar.zzd();
        zzfpVar.zzL(zzq);
        return new String(zzfpVar.zzM(), zzd, zzq);
    }

    private static HashMap zzj(zzfp zzfpVar) {
        int zzp = zzfpVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i10 = 0; i10 < zzp; i10++) {
            String zzi = zzi(zzfpVar);
            Object zzh = zzh(zzfpVar, zzfpVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzfp zzfpVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzfp zzfpVar, long j10) {
        if (zzfpVar.zzm() == 2 && "onMetaData".equals(zzi(zzfpVar)) && zzfpVar.zzb() != 0 && zzfpVar.zzm() == 8) {
            HashMap zzj = zzj(zzfpVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i10] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
