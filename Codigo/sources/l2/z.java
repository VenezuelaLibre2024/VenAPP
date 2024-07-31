package l2;

import android.os.PowerManager;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f20881a = new z();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<PowerManager.WakeLock, String> f20882b = new WeakHashMap<>();

    private z() {
    }

    public final WeakHashMap<PowerManager.WakeLock, String> a() {
        return f20882b;
    }
}
