package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import p407w.InterfaceC12011h0;

/* renamed from: androidx.camera.core.o */
/* loaded from: classes.dex */
public interface InterfaceC0710o extends AutoCloseable {

    /* renamed from: androidx.camera.core.o$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: c */
        ByteBuffer mo2886c();

        /* renamed from: d */
        int mo2887d();

        /* renamed from: e */
        int mo2888e();
    }

    /* renamed from: Z */
    void mo2882Z(Rect rect);

    @Override // java.lang.AutoCloseable
    void close();

    /* renamed from: e1 */
    InterfaceC12011h0 mo2883e1();

    int getFormat();

    int getHeight();

    int getWidth();

    /* renamed from: k1 */
    Image mo2884k1();

    /* renamed from: u0 */
    a[] mo2885u0();
}
