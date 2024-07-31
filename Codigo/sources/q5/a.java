package q5;

import android.content.Context;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23554a = new a();

    private a() {
    }

    public final File a(Context context) {
        n.e(context, "context");
        String uuid = UUID.randomUUID().toString();
        n.d(uuid, "toString(...)");
        return new File(context.getCacheDir(), uuid);
    }
}
