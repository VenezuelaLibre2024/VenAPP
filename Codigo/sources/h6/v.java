package h6;

import android.content.Context;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class v implements Closeable {

    /* loaded from: classes.dex */
    public interface a {
        a a(Context context);

        v build();
    }

    abstract p6.d a();

    public abstract u b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
