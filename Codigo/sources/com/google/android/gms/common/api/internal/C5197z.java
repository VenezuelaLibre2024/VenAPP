package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.z */
/* loaded from: classes.dex */
public final class C5197z implements AbstractC5109i.a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f10616a;

    /* renamed from: b */
    final /* synthetic */ C5116b0 f10617b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5197z(C5116b0 c5116b0, BasePendingResult basePendingResult) {
        this.f10617b = c5116b0;
        this.f10616a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i.a
    /* renamed from: a */
    public final void mo12994a(Status status) {
        Map map;
        map = this.f10617b.f10434a;
        map.remove(this.f10616a);
    }
}
