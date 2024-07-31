package ih;

import android.os.Looper;

/* loaded from: classes3.dex */
public class r {
    public static void a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
