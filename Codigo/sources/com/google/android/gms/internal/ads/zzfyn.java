package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class zzfyn extends zzfyg implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfyt zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyn(zzfyt zzfytVar, SortedMap sortedMap) {
        super(zzfytVar, sortedMap);
        this.zze = zzfytVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfyn(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfyn(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfyn(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) ((zzfyg) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public SortedSet zzg() {
        return new zzfyo(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfyg, com.google.android.gms.internal.ads.zzgau, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzg = zzg();
        this.zzd = zzg;
        return zzg;
    }
}
