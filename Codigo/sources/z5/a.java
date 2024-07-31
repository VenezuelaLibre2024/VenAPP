package z5;

import android.app.Application;
import android.content.Context;
import dk.r;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public class a extends y5.a {

    /* renamed from: c */
    public static final C0542a f32322c = new C0542a(null);

    /* renamed from: z5.a$a */
    /* loaded from: classes.dex */
    public static final class C0542a {
        private C0542a() {
        }

        public /* synthetic */ C0542a(g gVar) {
            this();
        }
    }

    @Override // y5.a
    public v5.c a(Application context, int i10, boolean z10) {
        n.e(context, "context");
        return j(context, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE") ? v5.c.Authorized : v5.c.Denied;
    }

    @Override // y5.a
    public boolean f(Context context) {
        n.e(context, "context");
        return true;
    }

    @Override // y5.a
    public void m(y5.c permissionsUtils, Context context, int i10, boolean z10) {
        List<String> n10;
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        n10 = r.n("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        if (!g(context, "android.permission.READ_EXTERNAL_STORAGE") || !g(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            n(permissionsUtils, n10);
            return;
        }
        y5.b e10 = permissionsUtils.e();
        if (e10 != null) {
            e10.a(n10);
        }
    }
}
