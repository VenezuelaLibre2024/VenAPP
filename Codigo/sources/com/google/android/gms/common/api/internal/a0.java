package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f9315a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f9316b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(b0 b0Var, TaskCompletionSource taskCompletionSource) {
        this.f9316b = b0Var;
        this.f9315a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f9316b.f9327b;
        map.remove(this.f9315a);
    }
}
