package t8;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class k0 implements d {
    @Override // t8.d
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // t8.d
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // t8.d
    public o c(Looper looper, Handler.Callback callback) {
        return new l0(new Handler(looper, callback));
    }

    @Override // t8.d
    public void d() {
    }
}
