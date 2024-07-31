package p363t8;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: t8.b */
/* loaded from: classes.dex */
public final class C11139b {

    /* renamed from: a */
    private static Method f28938a;

    /* renamed from: b */
    private static Method f28939b;

    /* renamed from: a */
    public static IBinder m34610a(Bundle bundle, String str) {
        return C11172r0.f29040a >= 18 ? bundle.getBinder(str) : m34611b(bundle, str);
    }

    /* renamed from: b */
    private static IBinder m34611b(Bundle bundle, String str) {
        String str2;
        Method method = f28938a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f28938a = method2;
                method2.setAccessible(true);
                method = f28938a;
            } catch (NoSuchMethodException e10) {
                e = e10;
                str2 = "Failed to retrieve getIBinder method";
                C11173s.m34968g("BundleUtil", str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            e = e11;
            str2 = "Failed to invoke getIBinder via reflection";
            C11173s.m34968g("BundleUtil", str2, e);
            return null;
        }
    }

    /* renamed from: c */
    public static void m34612c(Bundle bundle, String str, IBinder iBinder) {
        if (C11172r0.f29040a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            m34613d(bundle, str, iBinder);
        }
    }

    /* renamed from: d */
    private static void m34613d(Bundle bundle, String str, IBinder iBinder) {
        Method method = f28939b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f28939b = method2;
                method2.setAccessible(true);
                method = f28939b;
            } catch (NoSuchMethodException e10) {
                C11173s.m34968g("BundleUtil", "Failed to retrieve putIBinder method", e10);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            C11173s.m34968g("BundleUtil", "Failed to invoke putIBinder via reflection", e11);
        }
    }
}
