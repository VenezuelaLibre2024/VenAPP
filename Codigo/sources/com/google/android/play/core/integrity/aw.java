package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.d0;

/* loaded from: classes2.dex */
abstract class aw extends d0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ax f10941f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f10941f = axVar;
    }

    @Override // com.google.android.play.integrity.internal.d0
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.e) {
            super.a(ax.g(this.f10941f) ? new StandardIntegrityException(-2, exc) : new StandardIntegrityException(-9, exc));
        } else {
            super.a(exc);
        }
    }
}
