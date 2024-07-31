package oc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.d2;

/* loaded from: classes.dex */
final class m implements Continuation<com.google.firebase.auth.i, Task<com.google.firebase.auth.i>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ j f22408a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(j jVar) {
        this.f22408a = jVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<com.google.firebase.auth.i> then(Task<com.google.firebase.auth.i> task) {
        d2 d2Var;
        d2 d2Var2;
        d2 d2Var3;
        d2Var = this.f22408a.f22398d;
        if (d2Var == null) {
            return task;
        }
        if (task.isSuccessful()) {
            com.google.firebase.auth.i result = task.getResult();
            d dVar = (d) result.j0();
            u1 u1Var = (u1) result.W0();
            d2Var3 = this.f22408a.f22398d;
            return Tasks.forResult(new w1(dVar, u1Var, d2Var3));
        }
        Exception exception = task.getException();
        if (exception instanceof com.google.firebase.auth.x) {
            d2Var2 = this.f22408a.f22398d;
            ((com.google.firebase.auth.x) exception).d(d2Var2);
        }
        return Tasks.forException(exception);
    }
}
