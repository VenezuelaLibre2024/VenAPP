package oc;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final String f22439a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f22440b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar, String str) {
        this.f22440b = sVar;
        this.f22439a = com.google.android.gms.common.internal.s.f(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ga.a aVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zb.g.p(this.f22439a));
        if (firebaseAuth.j() != null) {
            Task<com.google.firebase.auth.c0> a10 = firebaseAuth.a(true);
            aVar = s.f22444h;
            aVar.g("Token refreshing started", new Object[0]);
            a10.addOnFailureListener(new u(this));
        }
    }
}
