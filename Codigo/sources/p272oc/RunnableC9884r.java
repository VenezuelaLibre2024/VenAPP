package p272oc;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C6053c0;
import com.google.firebase.auth.FirebaseAuth;
import ga.C7533a;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.r */
/* loaded from: classes.dex */
public final class RunnableC9884r implements Runnable {

    /* renamed from: a */
    private final String f24372a;

    /* renamed from: b */
    final /* synthetic */ C9887s f24373b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC9884r(C9887s c9887s, String str) {
        this.f24373b = c9887s;
        this.f24372a = C5276s.m13320f(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7533a c7533a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C12867g.m42618p(this.f24372a));
        if (firebaseAuth.m16398j() != null) {
            Task<C6053c0> mo16385a = firebaseAuth.mo16385a(true);
            c7533a = C9887s.f24377h;
            c7533a.m22875g("Token refreshing started", new Object[0]);
            mo16385a.addOnFailureListener(new C9893u(this));
        }
    }
}
