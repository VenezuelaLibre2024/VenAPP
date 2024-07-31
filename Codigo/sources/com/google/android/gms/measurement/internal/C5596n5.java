package com.google.android.gms.measurement.internal;

import androidx.collection.C0736f;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* loaded from: classes2.dex */
public final class C5596n5 extends C0736f<String, zzb> {

    /* renamed from: a */
    private final /* synthetic */ C5531i5 f11623a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5596n5(C5531i5 c5531i5, int i10) {
        super(20);
        this.f11623a = c5531i5;
    }

    @Override // androidx.collection.C0736f
    protected final /* synthetic */ zzb create(String str) {
        String str2 = str;
        C5276s.m13320f(str2);
        return C5531i5.m13936u(this.f11623a, str2);
    }
}
