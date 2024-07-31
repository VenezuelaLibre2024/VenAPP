package oc;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: c */
    private static final e1 f22377c = new e1();

    /* renamed from: a */
    private final m0 f22378a;

    /* renamed from: b */
    private final v f22379b;

    private e1() {
        this(m0.j(), v.b());
    }

    private e1(m0 m0Var, v vVar) {
        this.f22378a = m0Var;
        this.f22379b = vVar;
    }

    public static e1 f() {
        return f22377c;
    }

    public final void a(Context context) {
        this.f22378a.a(context);
    }

    public final void b(FirebaseAuth firebaseAuth) {
        this.f22378a.h(firebaseAuth);
    }

    public final boolean c(Activity activity, TaskCompletionSource<com.google.firebase.auth.i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f22379b.i(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean d(Activity activity, TaskCompletionSource<com.google.firebase.auth.i> taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        return this.f22379b.j(activity, taskCompletionSource, firebaseAuth, a0Var);
    }

    public final Task<String> e() {
        return this.f22378a.i();
    }
}
