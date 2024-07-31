package p232m4;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9322n;

/* renamed from: m4.e */
/* loaded from: classes.dex */
public final class C9544e {

    /* renamed from: a */
    public static final C9544e f23240a = new C9544e();

    /* renamed from: b */
    private static final String f23241b = C9544e.class.getCanonicalName();

    /* renamed from: c */
    private static Class<?> f23242c;

    private C9544e() {
    }

    /* renamed from: a */
    public static final void m28410a() {
        m28413d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: b */
    private final Class<?> m28411b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        C9322n.m27780d(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    /* renamed from: c */
    public static final void m28412c(String str) {
        m28413d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: d */
    public static final void m28413d(String str, String str2, String str3) {
        try {
            if (f23242c == null) {
                f23242c = f23240a.m28411b();
            }
            Class<?> cls = f23242c;
            if (cls == null) {
                C9322n.m27792p("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls2 = f23242c;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                C9322n.m27792p("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(f23241b, "Failed to send message to Unity", e10);
        }
    }
}
