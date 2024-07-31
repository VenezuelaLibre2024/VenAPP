package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public final class C1304h {

    /* renamed from: a */
    public static final C1304h f5687a = new C1304h();

    /* renamed from: b */
    private static final AtomicBoolean f5688b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: classes.dex */
    public static final class a extends C1294c {
        @Override // androidx.lifecycle.C1294c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C9322n.m27781e(activity, "activity");
            FragmentC1326x.f5737b.m7402c(activity);
        }
    }

    private C1304h() {
    }

    /* renamed from: a */
    public static final void m7336a(Context context) {
        C9322n.m27781e(context, "context");
        if (f5688b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C9322n.m27779c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
