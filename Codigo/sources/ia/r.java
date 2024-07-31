package ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class r extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f17653a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(v vVar, TaskCompletionSource taskCompletionSource) {
        this.f17653a = taskCompletionSource;
    }

    @Override // ia.b, ia.h
    public final void J1(Status status, ha.b bVar) {
        x.c(status, bVar, this.f17653a);
    }
}
