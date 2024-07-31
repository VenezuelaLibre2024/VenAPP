package p112g0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.camera.core.impl.utils.C0679h;
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0984h;

/* renamed from: g0.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC7392c0<T> {
    /* renamed from: j */
    public static AbstractC7392c0<Bitmap> m22312j(Bitmap bitmap, C0679h c0679h, Rect rect, int i10, Matrix matrix, InterfaceC0663s interfaceC0663s) {
        return new C7391c(bitmap, c0679h, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, interfaceC0663s);
    }

    /* renamed from: k */
    public static AbstractC7392c0<InterfaceC0710o> m22313k(InterfaceC0710o interfaceC0710o, C0679h c0679h, Rect rect, int i10, Matrix matrix, InterfaceC0663s interfaceC0663s) {
        return m22314l(interfaceC0710o, c0679h, new Size(interfaceC0710o.getWidth(), interfaceC0710o.getHeight()), rect, i10, matrix, interfaceC0663s);
    }

    /* renamed from: l */
    public static AbstractC7392c0<InterfaceC0710o> m22314l(InterfaceC0710o interfaceC0710o, C0679h c0679h, Size size, Rect rect, int i10, Matrix matrix, InterfaceC0663s interfaceC0663s) {
        if (interfaceC0710o.getFormat() == 256) {
            C0984h.m4834l(c0679h, "JPEG image must have Exif.");
        }
        return new C7391c(interfaceC0710o, c0679h, interfaceC0710o.getFormat(), size, rect, i10, matrix, interfaceC0663s);
    }

    /* renamed from: m */
    public static AbstractC7392c0<byte[]> m22315m(byte[] bArr, C0679h c0679h, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC0663s interfaceC0663s) {
        return new C7391c(bArr, c0679h, i10, size, rect, i11, matrix, interfaceC0663s);
    }

    /* renamed from: a */
    public abstract InterfaceC0663s mo22304a();

    /* renamed from: b */
    public abstract Rect mo22305b();

    /* renamed from: c */
    public abstract T mo22306c();

    /* renamed from: d */
    public abstract C0679h mo22307d();

    /* renamed from: e */
    public abstract int mo22308e();

    /* renamed from: f */
    public abstract int mo22309f();

    /* renamed from: g */
    public abstract Matrix mo22310g();

    /* renamed from: h */
    public abstract Size mo22311h();

    /* renamed from: i */
    public boolean m22316i() {
        return C0689r.m3347e(mo22305b(), mo22311h());
    }
}
