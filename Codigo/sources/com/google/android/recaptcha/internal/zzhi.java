package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzhi extends zzhm {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhi() {
        super(null);
    }

    public /* synthetic */ zzhi(zzhh zzhhVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j10, int i10) {
        zzhf zzhfVar;
        List list = (List) zzjp.zzf(obj, j10);
        if (list.isEmpty()) {
            List zzhfVar2 = list instanceof zzhg ? new zzhf(i10) : ((list instanceof zzig) && (list instanceof zzgv)) ? ((zzgv) list).zzd(i10) : new ArrayList(i10);
            zzjp.zzs(obj, j10, zzhfVar2);
            return zzhfVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            zzhfVar = arrayList;
        } else {
            if (!(list instanceof zzjk)) {
                if (!(list instanceof zzig) || !(list instanceof zzgv)) {
                    return list;
                }
                zzgv zzgvVar = (zzgv) list;
                if (zzgvVar.zzc()) {
                    return list;
                }
                zzgv zzd = zzgvVar.zzd(list.size() + i10);
                zzjp.zzs(obj, j10, zzd);
                return zzd;
            }
            zzhf zzhfVar3 = new zzhf(list.size() + i10);
            zzhfVar3.addAll(zzhfVar3.size(), (zzjk) list);
            zzhfVar = zzhfVar3;
        }
        zzjp.zzs(obj, j10, zzhfVar);
        return zzhfVar;
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzjp.zzf(obj, j10);
        if (list instanceof zzhg) {
            unmodifiableList = ((zzhg) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzig) && (list instanceof zzgv)) {
                zzgv zzgvVar = (zzgv) list;
                if (zzgvVar.zzc()) {
                    zzgvVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzjp.zzs(obj, j10, unmodifiableList);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzjp.zzf(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzjp.zzs(obj, j10, list);
    }
}
