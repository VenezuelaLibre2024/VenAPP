package p272oc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.C6139x;
import com.google.firebase.auth.InterfaceC6076i;

/* renamed from: oc.m */
/* loaded from: classes.dex */
final class C9869m implements Continuation<InterfaceC6076i, Task<InterfaceC6076i>> {

    /* renamed from: a */
    private final /* synthetic */ C9860j f24341a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9869m(C9860j c9860j) {
        this.f24341a = c9860j;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<InterfaceC6076i> then(Task<InterfaceC6076i> task) {
        C6059d2 c6059d2;
        C6059d2 c6059d22;
        C6059d2 c6059d23;
        c6059d2 = this.f24341a.f24331d;
        if (c6059d2 == null) {
            return task;
        }
        if (task.isSuccessful()) {
            InterfaceC6076i result = task.getResult();
            C9842d c9842d = (C9842d) result.mo16537j0();
            C9895u1 c9895u1 = (C9895u1) result.mo16535W0();
            c6059d23 = this.f24341a.f24331d;
            return Tasks.forResult(new C9901w1(c9842d, c9895u1, c6059d23));
        }
        Exception exception = task.getException();
        if (exception instanceof C6139x) {
            c6059d22 = this.f24341a.f24331d;
            ((C6139x) exception).m16622d(c6059d22);
        }
        return Tasks.forException(exception);
    }
}
