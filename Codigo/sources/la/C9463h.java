package la;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* renamed from: la.h */
/* loaded from: classes.dex */
public final class C9463h {

    /* renamed from: a */
    private static final String[] f23000a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public static boolean m28141a(Context context, Throwable th2) {
        try {
            C5276s.m13324j(context);
            C5276s.m13324j(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
