package oc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
final class k implements Continuation<com.google.firebase.auth.c0, Task<com.google.firebase.auth.l0>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f22402a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(h hVar) {
        this.f22402a = hVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<com.google.firebase.auth.l0> then(Task<com.google.firebase.auth.c0> task) {
        d dVar;
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        String g10 = task.getResult().g();
        dVar = this.f22402a.f22392a;
        return Tasks.forResult(o.v1(g10, dVar));
    }
}
