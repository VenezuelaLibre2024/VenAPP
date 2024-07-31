package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* loaded from: classes.dex */
public final class C5112a0 implements OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f10423a;

    /* renamed from: b */
    final /* synthetic */ C5116b0 f10424b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5112a0(C5116b0 c5116b0, TaskCompletionSource taskCompletionSource) {
        this.f10424b = c5116b0;
        this.f10423a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f10424b.f10435b;
        map.remove(this.f10423a);
    }
}
