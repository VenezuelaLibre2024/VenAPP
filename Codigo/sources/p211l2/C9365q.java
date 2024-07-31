package p211l2;

import android.content.ComponentName;
import android.content.Context;
import p094f2.AbstractC7277j;

/* renamed from: l2.q */
/* loaded from: classes.dex */
public class C9365q {

    /* renamed from: a */
    private static final String f22684a = AbstractC7277j.m21769i("PackageManagerHelper");

    /* renamed from: a */
    public static void m27878a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            String str = f22684a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            m21767e.mo21770a(str, sb2.toString());
        } catch (Exception e10) {
            AbstractC7277j m21767e2 = AbstractC7277j.m21767e();
            String str2 = f22684a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            m21767e2.mo21771b(str2, sb3.toString(), e10);
        }
    }
}
