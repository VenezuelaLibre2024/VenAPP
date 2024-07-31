package z5;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d extends y5.a {

    /* renamed from: c */
    public static final a f32325c = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // y5.a
    public v5.c a(Application context, int i10, boolean z10) {
        n.e(context, "context");
        return p(context, i10) ? v5.c.Authorized : v5.c.Denied;
    }

    @Override // y5.a
    public boolean f(Context context) {
        n.e(context, "context");
        return g(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // y5.a
    public void m(y5.c permissionsUtils, Context context, int i10, boolean z10) {
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        x5.g gVar = x5.g.f30426a;
        boolean d10 = gVar.d(i10);
        boolean c10 = gVar.c(i10);
        boolean b10 = gVar.b(i10);
        ArrayList arrayList = new ArrayList();
        if (d10) {
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        }
        if (c10) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
        }
        if (b10) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
        }
        if (z10) {
            arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (!j(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            n(permissionsUtils, arrayList);
            return;
        }
        y5.b e10 = permissionsUtils.e();
        if (e10 != null) {
            e10.a(arrayList);
        }
    }

    public boolean p(Context context, int i10) {
        n.e(context, "context");
        x5.g gVar = x5.g.f30426a;
        boolean d10 = gVar.d(i10);
        boolean c10 = gVar.c(i10);
        boolean b10 = gVar.b(i10);
        boolean g10 = d10 ? g(context, "android.permission.READ_MEDIA_VIDEO") : true;
        if (c10) {
            g10 = g10 && g(context, "android.permission.READ_MEDIA_IMAGES");
        }
        if (b10) {
            return g10 && g(context, "android.permission.READ_MEDIA_AUDIO");
        }
        return g10;
    }
}
