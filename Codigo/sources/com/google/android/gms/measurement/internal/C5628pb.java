package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.pb */
/* loaded from: classes2.dex */
public final class C5628pb extends AbstractC5692ua {

    /* renamed from: d */
    private String f11712d;

    /* renamed from: e */
    private Set<Integer> f11713e;

    /* renamed from: f */
    private Map<Integer, C5654rb> f11714f;

    /* renamed from: g */
    private Long f11715g;

    /* renamed from: h */
    private Long f11716h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5628pb(C5705va c5705va) {
        super(c5705va);
    }

    /* renamed from: t */
    private final C5654rb m14228t(Integer num) {
        if (this.f11714f.containsKey(num)) {
            return this.f11714f.get(num);
        }
        C5654rb c5654rb = new C5654rb(this, this.f11712d);
        this.f11714f.put(num, c5654rb);
        return c5654rb;
    }

    /* renamed from: v */
    private final boolean m14229v(int i10, int i11) {
        C5654rb c5654rb = this.f11714f.get(Integer.valueOf(i10));
        if (c5654rb == null) {
            return false;
        }
        return C5654rb.m14334b(c5654rb).get(i11);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5692ua
    /* renamed from: s */
    protected final boolean mo13770s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fd A[SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfi.zzc> m14230u(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.zzfi.zze> r54, java.util.List<com.google.android.gms.internal.measurement.zzfi.zzn> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5628pb.m14230u(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
