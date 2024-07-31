package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzazs implements Comparator {
    public zzazs(zzazu zzazuVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazy zzazyVar = (zzazy) obj;
        zzazy zzazyVar2 = (zzazy) obj2;
        int i10 = zzazyVar.zzc - zzazyVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzazyVar.zza, zzazyVar2.zza);
    }
}
