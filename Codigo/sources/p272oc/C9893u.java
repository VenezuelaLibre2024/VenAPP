package p272oc;

import com.google.android.gms.tasks.OnFailureListener;
import ga.C7533a;
import p485zb.C12875o;

/* renamed from: oc.u */
/* loaded from: classes.dex */
final class C9893u implements OnFailureListener {

    /* renamed from: a */
    private final /* synthetic */ RunnableC9884r f24391a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9893u(RunnableC9884r runnableC9884r) {
        this.f24391a = runnableC9884r;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C7533a c7533a;
        if (exc instanceof C12875o) {
            c7533a = C9887s.f24377h;
            c7533a.m22875g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f24391a.f24373b.m29592d();
        }
    }
}
