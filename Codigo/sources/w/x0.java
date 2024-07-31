package w;

import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface x0 extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {
        public static a c(int i10, x0 x0Var) {
            return new f(i10, x0Var);
        }

        public abstract int a();

        public abstract x0 b();
    }

    Surface A0(Executor executor, androidx.core.util.a<a> aVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    Size p();

    void y0(float[] fArr, float[] fArr2);
}
