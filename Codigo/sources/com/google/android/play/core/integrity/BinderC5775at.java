package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC5848v;

/* renamed from: com.google.android.play.core.integrity.at */
/* loaded from: classes2.dex */
class BinderC5775at extends AbstractBinderC5848v {

    /* renamed from: a */
    final TaskCompletionSource f12152a;

    /* renamed from: b */
    final /* synthetic */ C5779ax f12153b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5775at(C5779ax c5779ax, TaskCompletionSource taskCompletionSource) {
        this.f12153b = c5779ax;
        this.f12152a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5849w
    /* renamed from: b */
    public final void mo14627b(Bundle bundle) {
        this.f12153b.f12157a.m14683v(this.f12152a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5849w
    /* renamed from: c */
    public void mo14628c(Bundle bundle) {
        this.f12153b.f12157a.m14683v(this.f12152a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5849w
    /* renamed from: d */
    public final void mo14629d(Bundle bundle) {
        this.f12153b.f12157a.m14683v(this.f12152a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5849w
    /* renamed from: e */
    public void mo14630e(Bundle bundle) {
        this.f12153b.f12157a.m14683v(this.f12152a);
    }
}
