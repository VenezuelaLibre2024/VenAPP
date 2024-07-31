package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzajv extends zzajs {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzajv() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j10, int i10) {
        List<L> zza2;
        zzajq zzajqVar;
        List<L> zzc = zzc(obj, j10);
        if (!zzc.isEmpty()) {
            if (zza.isAssignableFrom(zzc.getClass())) {
                ArrayList arrayList = new ArrayList(zzc.size() + i10);
                arrayList.addAll(zzc);
                zzajqVar = arrayList;
            } else if (zzc instanceof zzamf) {
                zzajq zzajqVar2 = new zzajq(zzc.size() + i10);
                zzajqVar2.addAll((zzamf) zzc);
                zzajqVar = zzajqVar2;
            } else {
                if (!(zzc instanceof zzakz) || !(zzc instanceof zzajj)) {
                    return zzc;
                }
                zzajj zzajjVar = (zzajj) zzc;
                if (zzajjVar.zzc()) {
                    return zzc;
                }
                zza2 = zzajjVar.zza(zzc.size() + i10);
            }
            zzamk.zza(obj, j10, zzajqVar);
            return zzajqVar;
        }
        zza2 = zzc instanceof zzajt ? new zzajq(i10) : ((zzc instanceof zzakz) && (zzc instanceof zzajj)) ? ((zzajj) zzc).zza(i10) : new ArrayList<>(i10);
        zzamk.zza(obj, j10, zza2);
        return zza2;
    }

    private static <E> List<E> zzc(Object obj, long j10) {
        return (List) zzamk.zze(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajs
    public final <L> List<L> zza(Object obj, long j10) {
        return zza(obj, j10, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajs
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
        zzamk.zza(obj, j10, zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajs
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzamk.zze(obj, j10);
        if (list instanceof zzajt) {
            unmodifiableList = ((zzajt) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzakz) && (list instanceof zzajj)) {
                zzajj zzajjVar = (zzajj) list;
                if (zzajjVar.zzc()) {
                    zzajjVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzamk.zza(obj, j10, unmodifiableList);
    }
}
