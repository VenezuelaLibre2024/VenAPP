package p304q5;

import android.content.Context;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.C9322n;

/* renamed from: q5.a */
/* loaded from: classes.dex */
public final class C10276a {

    /* renamed from: a */
    public static final C10276a f25522a = new C10276a();

    private C10276a() {
    }

    /* renamed from: a */
    public final File m30793a(Context context) {
        C9322n.m27781e(context, "context");
        String uuid = UUID.randomUUID().toString();
        C9322n.m27780d(uuid, "toString(...)");
        return new File(context.getCacheDir(), uuid);
    }
}
