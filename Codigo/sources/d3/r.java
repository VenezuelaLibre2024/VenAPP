package d3;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorService f13750a;

    public static ExecutorService a(Context context) {
        if (f13750a == null) {
            f13750a = Executors.newFixedThreadPool(d.b(context));
        }
        return f13750a;
    }
}
