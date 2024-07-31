package ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class s extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f17654a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(v vVar, TaskCompletionSource taskCompletionSource) {
        this.f17654a = taskCompletionSource;
    }

    @Override // ia.b, ia.h
    public final void d2(Status status, ha.g gVar) {
        x.c(status, gVar, this.f17654a);
    }
}
