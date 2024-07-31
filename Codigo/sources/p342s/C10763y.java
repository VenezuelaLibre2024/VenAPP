package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.y */
/* loaded from: classes.dex */
public class C10763y implements InterfaceC0665s1 {

    /* renamed from: a */
    static final List<String> f27192a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: a */
    private static boolean m32740a() {
        return m32745f() || m32744e();
    }

    /* renamed from: b */
    private static boolean m32741b() {
        return m32742c() && m32740a();
    }

    /* renamed from: c */
    private static boolean m32742c() {
        return f27192a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* renamed from: d */
    private static boolean m32743d() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && m32745f();
    }

    /* renamed from: e */
    private static boolean m32744e() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    /* renamed from: f */
    private static boolean m32745f() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m32746g() {
        return m32743d() || m32741b();
    }
}
