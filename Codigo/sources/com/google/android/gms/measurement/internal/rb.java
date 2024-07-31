package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzob;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class rb {

    /* renamed from: a, reason: collision with root package name */
    private String f10607a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10608b;

    /* renamed from: c, reason: collision with root package name */
    private zzfi.zzl f10609c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f10610d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f10611e;

    /* renamed from: f, reason: collision with root package name */
    private Map<Integer, Long> f10612f;

    /* renamed from: g, reason: collision with root package name */
    private Map<Integer, List<Long>> f10613g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ pb f10614h;

    private rb(pb pbVar, String str) {
        this.f10614h = pbVar;
        this.f10607a = str;
        this.f10608b = true;
        this.f10610d = new BitSet();
        this.f10611e = new BitSet();
        this.f10612f = new androidx.collection.a();
        this.f10613g = new androidx.collection.a();
    }

    private rb(pb pbVar, String str, zzfi.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f10614h = pbVar;
        this.f10607a = str;
        this.f10610d = bitSet;
        this.f10611e = bitSet2;
        this.f10612f = map;
        this.f10613g = new androidx.collection.a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f10613g.put(num, arrayList);
            }
        }
        this.f10608b = false;
        this.f10609c = zzlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(rb rbVar) {
        return rbVar.f10610d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzfi$zzc$zza, com.google.android.gms.internal.measurement.zzix$zzb] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.measurement.zzfi$zzl$zza] */
    public final zzfi.zzc a(int i10) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? zzb = zzfi.zzc.zzb();
        zzb.zza(i10);
        zzb.zza(this.f10608b);
        zzfi.zzl zzlVar = this.f10609c;
        if (zzlVar != null) {
            zzb.zza(zzlVar);
        }
        ?? zzd = zzfi.zzl.zze().zzb(db.H(this.f10610d)).zzd(db.H(this.f10611e));
        if (this.f10612f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f10612f.size());
            Iterator<Integer> it = this.f10612f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                Long l10 = this.f10612f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    arrayList.add((zzfi.zzd) ((zzix) zzfi.zzd.zzc().zza(intValue).zza(l10.longValue()).zzab()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.f10613g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f10613g.size());
            for (Integer num : this.f10613g.keySet()) {
                zzfi.zzm.zza zza = zzfi.zzm.zzc().zza(num.intValue());
                List<Long> list = this.f10613g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    zza.zza(list);
                }
                arrayList2.add((zzfi.zzm) ((zzix) zza.zzab()));
            }
        }
        zzd.zzc(arrayList2);
        zzb.zza(zzd);
        return (zzfi.zzc) ((zzix) zzb.zzab());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(c cVar) {
        int a10 = cVar.a();
        Boolean bool = cVar.f10014c;
        if (bool != null) {
            this.f10611e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = cVar.f10015d;
        if (bool2 != null) {
            this.f10610d.set(a10, bool2.booleanValue());
        }
        if (cVar.f10016e != null) {
            Long l10 = this.f10612f.get(Integer.valueOf(a10));
            long longValue = cVar.f10016e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f10612f.put(Integer.valueOf(a10), Long.valueOf(longValue));
            }
        }
        if (cVar.f10017f != null) {
            List<Long> list = this.f10613g.get(Integer.valueOf(a10));
            if (list == null) {
                list = new ArrayList<>();
                this.f10613g.put(Integer.valueOf(a10), list);
            }
            if (cVar.j()) {
                list.clear();
            }
            if (zzob.zza() && this.f10614h.a().y(this.f10607a, e0.f10108j0) && cVar.i()) {
                list.clear();
            }
            if (!zzob.zza() || !this.f10614h.a().y(this.f10607a, e0.f10108j0)) {
                list.add(Long.valueOf(cVar.f10017f.longValue() / 1000));
                return;
            }
            long longValue2 = cVar.f10017f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }
}
