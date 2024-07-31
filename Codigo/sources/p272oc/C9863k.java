package p272oc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AbstractC6092l0;
import com.google.firebase.auth.C6053c0;

/* renamed from: oc.k */
/* loaded from: classes.dex */
final class C9863k implements Continuation<C6053c0, Task<AbstractC6092l0>> {

    /* renamed from: a */
    private final /* synthetic */ C9854h f24335a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9863k(C9854h c9854h) {
        this.f24335a = c9854h;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<AbstractC6092l0> then(Task<C6053c0> task) {
        C9842d c9842d;
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        String m16477g = task.getResult().m16477g();
        c9842d = this.f24335a.f24325a;
        return Tasks.forResult(C9875o.m29565v1(m16477g, c9842d));
    }
}
