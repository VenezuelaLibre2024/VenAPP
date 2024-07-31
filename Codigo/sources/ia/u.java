package ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class u extends h.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f17659a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar, TaskCompletionSource taskCompletionSource) {
        this.f17659a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void onResult(Status status) {
        x.c(status, Boolean.TRUE, this.f17659a);
    }
}
