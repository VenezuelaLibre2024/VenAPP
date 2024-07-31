package m4;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f21386a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final String f21387b = e.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f21388c;

    private e() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class<?> b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        n.d(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (f21388c == null) {
                f21388c = f21386a.b();
            }
            Class<?> cls = f21388c;
            if (cls == null) {
                n.p("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls2 = f21388c;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                n.p("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(f21387b, "Failed to send message to Unity", e10);
        }
    }
}
