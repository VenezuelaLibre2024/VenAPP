package p272oc;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC6076i;

/* renamed from: oc.e1 */
/* loaded from: classes.dex */
public final class C9847e1 {

    /* renamed from: c */
    private static final C9847e1 f24310c = new C9847e1();

    /* renamed from: a */
    private final C9870m0 f24311a;

    /* renamed from: b */
    private final C9896v f24312b;

    private C9847e1() {
        this(C9870m0.m29561j(), C9896v.m29600b());
    }

    private C9847e1(C9870m0 c9870m0, C9896v c9896v) {
        this.f24311a = c9870m0;
        this.f24312b = c9896v;
    }

    /* renamed from: f */
    public static C9847e1 m29528f() {
        return f24310c;
    }

    /* renamed from: a */
    public final void m29529a(Context context) {
        this.f24311a.m29562a(context);
    }

    /* renamed from: b */
    public final void m29530b(FirebaseAuth firebaseAuth) {
        this.f24311a.m29563h(firebaseAuth);
    }

    /* renamed from: c */
    public final boolean m29531c(Activity activity, TaskCompletionSource<InterfaceC6076i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f24312b.m29608i(activity, taskCompletionSource, firebaseAuth);
    }

    /* renamed from: d */
    public final boolean m29532d(Activity activity, TaskCompletionSource<InterfaceC6076i> taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC6045a0 abstractC6045a0) {
        return this.f24312b.m29609j(activity, taskCompletionSource, firebaseAuth, abstractC6045a0);
    }

    /* renamed from: e */
    public final Task<String> m29533e() {
        return this.f24311a.m29564i();
    }
}
