package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.C5170q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.d1 */
/* loaded from: classes.dex */
public final class C5125d1 extends AbstractC5167p {

    /* renamed from: e */
    final /* synthetic */ C5170q.a f10453e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5125d1(C5170q.a aVar, C5151k c5151k, C1898d[] c1898dArr, boolean z10, int i10) {
        super(c5151k, c1898dArr, z10, i10);
        this.f10453e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC5167p
    /* renamed from: d */
    public final void mo13024d(C5101a.b bVar, TaskCompletionSource<Void> taskCompletionSource) {
        InterfaceC5173r interfaceC5173r;
        interfaceC5173r = this.f10453e.f10567a;
        interfaceC5173r.accept(bVar, taskCompletionSource);
    }
}
