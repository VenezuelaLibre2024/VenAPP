package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5273r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.o0 */
/* loaded from: classes.dex */
public final class C5265o0 implements AbstractC5109i.a {

    /* renamed from: a */
    final /* synthetic */ AbstractC5109i f10724a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f10725b;

    /* renamed from: c */
    final /* synthetic */ C5273r.a f10726c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC5274r0 f10727d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5265o0(AbstractC5109i abstractC5109i, TaskCompletionSource taskCompletionSource, C5273r.a aVar, InterfaceC5274r0 interfaceC5274r0) {
        this.f10724a = abstractC5109i;
        this.f10725b = taskCompletionSource;
        this.f10726c = aVar;
        this.f10727d = interfaceC5274r0;
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i.a
    /* renamed from: a */
    public final void mo12994a(Status status) {
        if (!status.m12972y1()) {
            this.f10725b.setException(C5224b.m13226a(status));
        } else {
            this.f10725b.setResult(this.f10726c.mo12957a(this.f10724a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
