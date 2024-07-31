package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z implements i.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f9502a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f9503b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(b0 b0Var, BasePendingResult basePendingResult) {
        this.f9503b = b0Var;
        this.f9502a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.i.a
    public final void a(Status status) {
        Map map;
        map = this.f9503b.f9326a;
        map.remove(this.f9502a);
    }
}
