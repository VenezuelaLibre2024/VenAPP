package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzjr extends zzjs {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: private */
    public zzjr() {
        super();
    }

    public /* synthetic */ zzjr(zzju zzjuVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j10, int i10) {
        List<L> zza2;
        zzjq zzjqVar;
        List<L> zzc = zzc(obj, j10);
        if (!zzc.isEmpty()) {
            if (zza.isAssignableFrom(zzc.getClass())) {
                ArrayList arrayList = new ArrayList(zzc.size() + i10);
                arrayList.addAll(zzc);
                zzjqVar = arrayList;
            } else if (zzc instanceof zzmb) {
                zzjq zzjqVar2 = new zzjq(zzc.size() + i10);
                zzjqVar2.addAll((zzmb) zzc);
                zzjqVar = zzjqVar2;
            } else {
                if (!(zzc instanceof zzkv) || !(zzc instanceof zzjf)) {
                    return zzc;
                }
                zzjf zzjfVar = (zzjf) zzc;
                if (zzjfVar.zzc()) {
                    return zzc;
                }
                zza2 = zzjfVar.zza(zzc.size() + i10);
            }
            zzmg.zza(obj, j10, zzjqVar);
            return zzjqVar;
        }
        zza2 = zzc instanceof zzjp ? new zzjq(i10) : ((zzc instanceof zzkv) && (zzc instanceof zzjf)) ? ((zzjf) zzc).zza(i10) : new ArrayList<>(i10);
        zzmg.zza(obj, j10, zza2);
        return zza2;
    }

    private static <E> List<E> zzc(Object obj, long j10) {
        return (List) zzmg.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <L> List<L> zza(Object obj, long j10) {
        return zza(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <E> void zza(Object obj, Object obj2, long j10) {
        List zzc = zzc(obj2, j10);
        List zza2 = zza(obj, j10, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzmg.zza(obj, j10, zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzmg.zze(obj, j10);
        if (list instanceof zzjp) {
            unmodifiableList = ((zzjp) list).h_();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzkv) && (list instanceof zzjf)) {
                zzjf zzjfVar = (zzjf) list;
                if (zzjfVar.zzc()) {
                    zzjfVar.i_();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzmg.zza(obj, j10, unmodifiableList);
    }
}
