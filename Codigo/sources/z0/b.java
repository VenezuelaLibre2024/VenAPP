package z0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {
    public static final File a(Context context, String name) {
        n.e(context, "<this>");
        n.e(name, "name");
        return w0.a.a(context, n.k(name, ".preferences_pb"));
    }
}
