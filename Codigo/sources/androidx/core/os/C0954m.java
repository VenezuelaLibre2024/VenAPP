package androidx.core.os;

import android.content.Context;
import android.os.UserManager;

/* renamed from: androidx.core.os.m */
/* loaded from: classes.dex */
public class C0954m {

    /* renamed from: androidx.core.os.m$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m4738a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m4737a(Context context) {
        return a.m4738a(context);
    }
}
