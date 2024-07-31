package pl;

import android.app.Application;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Application f23301a;

    /* renamed from: b, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f23302b;

    public g(Application application, Application.ActivityLifecycleCallbacks callback) {
        n.e(application, "application");
        n.e(callback, "callback");
        this.f23301a = application;
        this.f23302b = callback;
    }

    public final void a() {
        this.f23301a.unregisterActivityLifecycleCallbacks(this.f23302b);
    }
}
