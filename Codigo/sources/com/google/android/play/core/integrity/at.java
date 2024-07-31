package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
class at extends com.google.android.play.integrity.internal.v {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f10937a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f10938b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public at(ax axVar, TaskCompletionSource taskCompletionSource) {
        this.f10938b = axVar;
        this.f10937a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b(Bundle bundle) {
        this.f10938b.f10942a.v(this.f10937a);
    }

    @Override // com.google.android.play.integrity.internal.w
    public void c(Bundle bundle) {
        this.f10938b.f10942a.v(this.f10937a);
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void d(Bundle bundle) {
        this.f10938b.f10942a.v(this.f10937a);
    }

    @Override // com.google.android.play.integrity.internal.w
    public void e(Bundle bundle) {
        this.f10938b.f10942a.v(this.f10937a);
    }
}
