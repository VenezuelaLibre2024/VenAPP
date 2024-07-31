package na;

import android.content.Context;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b */
    private static final e f21924b = new e();

    /* renamed from: a */
    private d f21925a = null;

    public static d a(Context context) {
        return f21924b.b(context);
    }

    public final synchronized d b(Context context) {
        if (this.f21925a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f21925a = new d(context);
        }
        return this.f21925a;
    }
}
