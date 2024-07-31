package p407w;

import android.graphics.Matrix;
import androidx.camera.core.impl.C0620f2;
import androidx.camera.core.impl.utils.C0681j;

/* renamed from: w.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC12025m0 implements InterfaceC12011h0 {
    /* renamed from: e */
    public static InterfaceC12011h0 m38636e(C0620f2 c0620f2, long j10, int i10, Matrix matrix) {
        return new C11998d(c0620f2, j10, i10, matrix);
    }

    @Override // p407w.InterfaceC12011h0
    /* renamed from: a */
    public void mo8851a(C0681j.b bVar) {
        bVar.m3322m(mo8854d());
    }

    @Override // p407w.InterfaceC12011h0
    /* renamed from: b */
    public abstract C0620f2 mo8852b();

    @Override // p407w.InterfaceC12011h0
    /* renamed from: c */
    public abstract long mo8853c();

    @Override // p407w.InterfaceC12011h0
    /* renamed from: d */
    public abstract int mo8854d();

    /* renamed from: f */
    public abstract Matrix mo38574f();
}
