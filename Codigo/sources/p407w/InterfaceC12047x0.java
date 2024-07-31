package p407w;

import android.util.Size;
import android.view.Surface;
import androidx.core.util.InterfaceC0977a;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: w.x0 */
/* loaded from: classes.dex */
public interface InterfaceC12047x0 extends Closeable {

    /* renamed from: w.x0$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: c */
        public static a m38698c(int i10, InterfaceC12047x0 interfaceC12047x0) {
            return new C12004f(i10, interfaceC12047x0);
        }

        /* renamed from: a */
        public abstract int mo38582a();

        /* renamed from: b */
        public abstract InterfaceC12047x0 mo38583b();
    }

    /* renamed from: A0 */
    Surface mo22367A0(Executor executor, InterfaceC0977a<a> interfaceC0977a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    /* renamed from: p */
    Size mo22370p();

    /* renamed from: y0 */
    void mo22371y0(float[] fArr, float[] fArr2);
}
