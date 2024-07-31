package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzhao extends zzhas {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhao() {
        super(null);
    }

    public /* synthetic */ zzhao(zzhan zzhanVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j10, int i10) {
        zzhal zzhalVar;
        List list = (List) zzhcz.zzh(obj, j10);
        if (list.isEmpty()) {
            List zzhalVar2 = list instanceof zzham ? new zzhal(i10) : ((list instanceof zzhbm) && (list instanceof zzhad)) ? ((zzhad) list).zzd(i10) : new ArrayList(i10);
            zzhcz.zzv(obj, j10, zzhalVar2);
            return zzhalVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            zzhalVar = arrayList;
        } else {
            if (!(list instanceof zzhcu)) {
                if (!(list instanceof zzhbm) || !(list instanceof zzhad)) {
                    return list;
                }
                zzhad zzhadVar = (zzhad) list;
                if (zzhadVar.zzc()) {
                    return list;
                }
                zzhad zzd = zzhadVar.zzd(list.size() + i10);
                zzhcz.zzv(obj, j10, zzd);
                return zzd;
            }
            zzhal zzhalVar3 = new zzhal(list.size() + i10);
            zzhalVar3.addAll(zzhalVar3.size(), (zzhcu) list);
            zzhalVar = zzhalVar3;
        }
        zzhcz.zzv(obj, j10, zzhalVar);
        return zzhalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzhcz.zzh(obj, j10);
        if (list instanceof zzham) {
            unmodifiableList = ((zzham) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzhbm) && (list instanceof zzhad)) {
                zzhad zzhadVar = (zzhad) list;
                if (zzhadVar.zzc()) {
                    zzhadVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhcz.zzv(obj, j10, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzhcz.zzh(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzhcz.zzv(obj, j10, list);
    }
}
