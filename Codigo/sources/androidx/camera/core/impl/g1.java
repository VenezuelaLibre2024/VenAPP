package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface g1 {

    /* loaded from: classes.dex */
    public interface a {
        void a(g1 g1Var);
    }

    androidx.camera.core.o b();

    int c();

    void close();

    void d();

    int e();

    void f(a aVar, Executor executor);

    androidx.camera.core.o g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
