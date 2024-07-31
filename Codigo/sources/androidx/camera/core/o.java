package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import w.h0;

/* loaded from: classes.dex */
public interface o extends AutoCloseable {

    /* loaded from: classes.dex */
    public interface a {
        ByteBuffer c();

        int d();

        int e();
    }

    void Z(Rect rect);

    @Override // java.lang.AutoCloseable
    void close();

    h0 e1();

    int getFormat();

    int getHeight();

    int getWidth();

    Image k1();

    a[] u0();
}
