package l2;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20862a = f2.j.i("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            f2.j e10 = f2.j.e();
            String str = f20862a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            e10.a(str, sb2.toString());
        } catch (Exception e11) {
            f2.j e12 = f2.j.e();
            String str2 = f20862a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            e12.b(str2, sb3.toString(), e11);
        }
    }
}
