package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzfye extends zzgar {
    final /* synthetic */ zzfyg zza;

    public zzfye(zzfyg zzfygVar) {
        this.zza = zzfygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfyz.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfyf(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgar, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfyg zzfygVar = this.zza;
        zzfyt.zzo(zzfygVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    final Map zza() {
        return this.zza;
    }
}
