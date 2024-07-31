package pl;

import android.app.Activity;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23298a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static Activity f23299b;

    /* renamed from: c, reason: collision with root package name */
    private static ActivityPluginBinding f23300c;

    private f() {
    }

    public final Activity a() {
        return f23299b;
    }

    public final ActivityPluginBinding b() {
        return f23300c;
    }

    public final void c(Activity activity) {
        f23299b = activity;
    }

    public final void d(ActivityPluginBinding activityPluginBinding) {
        f23300c = activityPluginBinding;
    }
}
