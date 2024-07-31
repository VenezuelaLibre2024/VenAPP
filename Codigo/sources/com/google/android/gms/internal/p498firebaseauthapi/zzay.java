package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.AbstractMap;

/* loaded from: classes2.dex */
final class zzay extends zzap {
    private final /* synthetic */ zzaz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(zzaz zzazVar) {
        this.zza = zzazVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzd;
        zzy.zza(i10, i11);
        objArr = this.zza.zzb;
        int i12 = i10 * 2;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.zza.zzd;
        return i10;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }
}
