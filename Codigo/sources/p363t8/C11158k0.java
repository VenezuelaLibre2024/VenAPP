package p363t8;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: t8.k0 */
/* loaded from: classes.dex */
public class C11158k0 implements InterfaceC11143d {
    @Override // p363t8.InterfaceC11143d
    /* renamed from: a */
    public long mo34621a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p363t8.InterfaceC11143d
    /* renamed from: b */
    public long mo34622b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p363t8.InterfaceC11143d
    /* renamed from: c */
    public InterfaceC11165o mo34623c(Looper looper, Handler.Callback callback) {
        return new C11160l0(new Handler(looper, callback));
    }

    @Override // p363t8.InterfaceC11143d
    /* renamed from: d */
    public void mo34624d() {
    }
}
