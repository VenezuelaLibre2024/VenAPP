package com.google.android.gms.measurement.internal;

import androidx.collection.C0731a;
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
/* renamed from: com.google.android.gms.measurement.internal.rb */
/* loaded from: classes2.dex */
public final class C5654rb {

    /* renamed from: a */
    private String f11805a;

    /* renamed from: b */
    private boolean f11806b;

    /* renamed from: c */
    private zzfi.zzl f11807c;

    /* renamed from: d */
    private BitSet f11808d;

    /* renamed from: e */
    private BitSet f11809e;

    /* renamed from: f */
    private Map<Integer, Long> f11810f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f11811g;

    /* renamed from: h */
    private final /* synthetic */ C5628pb f11812h;

    private C5654rb(C5628pb c5628pb, String str) {
        this.f11812h = c5628pb;
        this.f11805a = str;
        this.f11806b = true;
        this.f11808d = new BitSet();
        this.f11809e = new BitSet();
        this.f11810f = new C0731a();
        this.f11811g = new C0731a();
    }

    private C5654rb(C5628pb c5628pb, String str, zzfi.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f11812h = c5628pb;
        this.f11805a = str;
        this.f11808d = bitSet;
        this.f11809e = bitSet2;
        this.f11810f = map;
        this.f11811g = new C0731a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f11811g.put(num, arrayList);
            }
        }
        this.f11806b = false;
        this.f11807c = zzlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m14334b(C5654rb c5654rb) {
        return c5654rb.f11808d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzfi$zzc$zza, com.google.android.gms.internal.measurement.zzix$zzb] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.measurement.zzfi$zzl$zza] */
    /* renamed from: a */
    public final zzfi.zzc m14335a(int i10) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? zzb = zzfi.zzc.zzb();
        zzb.zza(i10);
        zzb.zza(this.f11806b);
        zzfi.zzl zzlVar = this.f11807c;
        if (zzlVar != null) {
            zzb.zza(zzlVar);
        }
        ?? zzd = zzfi.zzl.zze().zzb(C5472db.m13732H(this.f11808d)).zzd(C5472db.m13732H(this.f11809e));
        if (this.f11810f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f11810f.size());
            Iterator<Integer> it = this.f11810f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                Long l10 = this.f11810f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    arrayList.add((zzfi.zzd) ((zzix) zzfi.zzd.zzc().zza(intValue).zza(l10.longValue()).zzab()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.f11811g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f11811g.size());
            for (Integer num : this.f11811g.keySet()) {
                zzfi.zzm.zza zza = zzfi.zzm.zzc().zza(num.intValue());
                List<Long> list = this.f11811g.get(num);
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
    /* renamed from: c */
    public final void m14336c(AbstractC5447c abstractC5447c) {
        int mo13635a = abstractC5447c.mo13635a();
        Boolean bool = abstractC5447c.f11134c;
        if (bool != null) {
            this.f11809e.set(mo13635a, bool.booleanValue());
        }
        Boolean bool2 = abstractC5447c.f11135d;
        if (bool2 != null) {
            this.f11808d.set(mo13635a, bool2.booleanValue());
        }
        if (abstractC5447c.f11136e != null) {
            Long l10 = this.f11810f.get(Integer.valueOf(mo13635a));
            long longValue = abstractC5447c.f11136e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f11810f.put(Integer.valueOf(mo13635a), Long.valueOf(longValue));
            }
        }
        if (abstractC5447c.f11137f != null) {
            List<Long> list = this.f11811g.get(Integer.valueOf(mo13635a));
            if (list == null) {
                list = new ArrayList<>();
                this.f11811g.put(Integer.valueOf(mo13635a), list);
            }
            if (abstractC5447c.mo13637j()) {
                list.clear();
            }
            if (zzob.zza() && this.f11812h.mo13672a().m13911y(this.f11805a, C5474e0.f11280j0) && abstractC5447c.mo13636i()) {
                list.clear();
            }
            if (!zzob.zza() || !this.f11812h.mo13672a().m13911y(this.f11805a, C5474e0.f11280j0)) {
                list.add(Long.valueOf(abstractC5447c.f11137f.longValue() / 1000));
                return;
            }
            long longValue2 = abstractC5447c.f11137f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }
}
