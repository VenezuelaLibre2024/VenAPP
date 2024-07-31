package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4933a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f4934b = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.e(activity, "activity");
            x.f4983b.c(activity);
        }
    }

    private h() {
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        if (f4934b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
