package pl;

import android.app.Activity;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* renamed from: pl.f */
/* loaded from: classes3.dex */
public final class C10209f {

    /* renamed from: a */
    public static final C10209f f25237a = new C10209f();

    /* renamed from: b */
    private static Activity f25238b;

    /* renamed from: c */
    private static ActivityPluginBinding f25239c;

    private C10209f() {
    }

    /* renamed from: a */
    public final Activity m30549a() {
        return f25238b;
    }

    /* renamed from: b */
    public final ActivityPluginBinding m30550b() {
        return f25239c;
    }

    /* renamed from: c */
    public final void m30551c(Activity activity) {
        f25238b = activity;
    }

    /* renamed from: d */
    public final void m30552d(ActivityPluginBinding activityPluginBinding) {
        f25239c = activityPluginBinding;
    }
}
