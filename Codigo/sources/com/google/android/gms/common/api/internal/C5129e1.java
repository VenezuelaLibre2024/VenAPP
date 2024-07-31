package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.common.api.internal.C5170q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.e1 */
/* loaded from: classes.dex */
public final class C5129e1 extends AbstractC5194y {

    /* renamed from: b */
    final /* synthetic */ C5170q.a f10459b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5129e1(C5170q.a aVar, C5151k.a aVar2) {
        super(aVar2);
        this.f10459b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC5194y
    /* renamed from: b */
    public final void mo13031b(C5101a.b bVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        InterfaceC5173r interfaceC5173r;
        interfaceC5173r = this.f10459b.f10568b;
        interfaceC5173r.accept(bVar, taskCompletionSource);
    }
}
