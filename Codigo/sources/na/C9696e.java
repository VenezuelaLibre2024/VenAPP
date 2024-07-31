package na;

import android.content.Context;

/* renamed from: na.e */
/* loaded from: classes.dex */
public class C9696e {

    /* renamed from: b */
    private static final C9696e f23857b = new C9696e();

    /* renamed from: a */
    private C9695d f23858a = null;

    /* renamed from: a */
    public static C9695d m29080a(Context context) {
        return f23857b.m29081b(context);
    }

    /* renamed from: b */
    public final synchronized C9695d m29081b(Context context) {
        if (this.f23858a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f23858a = new C9695d(context);
        }
        return this.f23858a;
    }
}
