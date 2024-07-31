package ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class t extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f17655a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f17656b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ha.a f17657c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f17658d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(v vVar, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, ha.a aVar) {
        this.f17658d = vVar;
        this.f17655a = atomicReference;
        this.f17656b = taskCompletionSource;
        this.f17657c = aVar;
    }

    @Override // ia.b, ia.h
    public final void d2(Status status, ha.g gVar) {
        if (gVar != null) {
            this.f17655a.set(gVar);
        }
        x.c(status, null, this.f17656b);
        if (!status.y1() || (gVar != null && gVar.v1())) {
            this.f17658d.doUnregisterEventListener(com.google.android.gms.common.api.internal.l.c(this.f17657c, ha.a.class.getSimpleName()), 27306);
        }
    }
}
