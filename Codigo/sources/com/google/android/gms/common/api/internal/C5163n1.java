package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.n1 */
/* loaded from: classes.dex */
public final class C5163n1 extends AbstractC5188w {

    /* renamed from: d */
    final /* synthetic */ AbstractC5188w.a f10548d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5163n1(AbstractC5188w.a aVar, C1898d[] c1898dArr, boolean z10, int i10) {
        super(c1898dArr, z10, i10);
        this.f10548d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC5188w
    /* renamed from: b */
    public final void mo13144b(C5101a.b bVar, TaskCompletionSource taskCompletionSource) {
        InterfaceC5173r interfaceC5173r;
        interfaceC5173r = this.f10548d.f10596a;
        interfaceC5173r.accept(bVar, taskCompletionSource);
    }
}
