package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class aq extends d0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f10927a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f10928b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ax axVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f10928b = axVar;
        this.f10927a = context;
    }

    @Override // com.google.android.play.integrity.internal.d0
    protected final void b() {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.f10928b.f10945d;
        taskCompletionSource.trySetResult(Boolean.valueOf(com.google.android.play.integrity.internal.h.a(this.f10927a)));
    }
}
