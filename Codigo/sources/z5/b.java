package z5;

import android.app.Application;
import android.content.Context;
import dk.r;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b extends z5.a {

    /* renamed from: d */
    public static final a f32323d = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // z5.a, y5.a
    public v5.c a(Application context, int i10, boolean z10) {
        n.e(context, "context");
        return j(context, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE") ? v5.c.Authorized : v5.c.Denied;
    }

    @Override // z5.a, y5.a
    public boolean f(Context context) {
        n.e(context, "context");
        return g(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // z5.a, y5.a
    public void m(y5.c permissionsUtils, Context context, int i10, boolean z10) {
        List<String> n10;
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        n10 = r.n("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        if (z10) {
            n10.add("android.permission.ACCESS_MEDIA_LOCATION");
        }
        String[] strArr = (String[]) n10.toArray(new String[0]);
        if (!j(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            n(permissionsUtils, n10);
            return;
        }
        y5.b e10 = permissionsUtils.e();
        if (e10 != null) {
            e10.a(n10);
        }
    }
}
