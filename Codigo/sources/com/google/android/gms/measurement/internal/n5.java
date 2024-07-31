package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n5 extends androidx.collection.f<String, zzb> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i5 f10436a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(i5 i5Var, int i10) {
        super(20);
        this.f10436a = i5Var;
    }

    @Override // androidx.collection.f
    protected final /* synthetic */ zzb create(String str) {
        String str2 = str;
        com.google.android.gms.common.internal.s.f(str2);
        return i5.u(this.f10436a, str2);
    }
}
