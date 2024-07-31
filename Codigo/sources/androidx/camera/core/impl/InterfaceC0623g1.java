package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.InterfaceC0710o;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.g1 */
/* loaded from: classes.dex */
public interface InterfaceC0623g1 {

    /* renamed from: androidx.camera.core.impl.g1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo2863a(InterfaceC0623g1 interfaceC0623g1);
    }

    /* renamed from: b */
    InterfaceC0710o mo2894b();

    /* renamed from: c */
    int mo2895c();

    void close();

    /* renamed from: d */
    void mo2896d();

    /* renamed from: e */
    int mo2897e();

    /* renamed from: f */
    void mo2898f(a aVar, Executor executor);

    /* renamed from: g */
    InterfaceC0710o mo2899g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
