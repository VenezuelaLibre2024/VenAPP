package pl;

import android.app.Application;
import kotlin.jvm.internal.C9322n;

/* renamed from: pl.g */
/* loaded from: classes3.dex */
public final class C10210g {

    /* renamed from: a */
    private final Application f25240a;

    /* renamed from: b */
    private final Application.ActivityLifecycleCallbacks f25241b;

    public C10210g(Application application, Application.ActivityLifecycleCallbacks callback) {
        C9322n.m27781e(application, "application");
        C9322n.m27781e(callback, "callback");
        this.f25240a = application;
        this.f25241b = callback;
    }

    /* renamed from: a */
    public final void m30553a() {
        this.f25240a.unregisterActivityLifecycleCallbacks(this.f25241b);
    }
}
