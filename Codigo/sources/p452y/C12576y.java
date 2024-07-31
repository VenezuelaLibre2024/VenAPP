package p452y;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.camera.core.impl.utils.C0679h;
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0984h;
import java.io.IOException;
import p018b0.C1594b;
import p112g0.AbstractC7392c0;
import p112g0.InterfaceC7390b0;
import p407w.C12008g0;
import p452y.C12539e0;

/* renamed from: y.y */
/* loaded from: classes.dex */
final class C12576y implements InterfaceC7390b0<C12539e0.b, AbstractC7392c0<InterfaceC0710o>> {
    /* renamed from: b */
    private static AbstractC7392c0<InterfaceC0710o> m41320b(C12541f0 c12541f0, C0679h c0679h, InterfaceC0710o interfaceC0710o) {
        return AbstractC7392c0.m22313k(interfaceC0710o, c0679h, c12541f0.m41177b(), c12541f0.m41180e(), c12541f0.m41181f(), m41322d(interfaceC0710o));
    }

    /* renamed from: c */
    private static AbstractC7392c0<InterfaceC0710o> m41321c(C12541f0 c12541f0, C0679h c0679h, InterfaceC0710o interfaceC0710o) {
        Size size = new Size(interfaceC0710o.getWidth(), interfaceC0710o.getHeight());
        int m41180e = c12541f0.m41180e() - c0679h.m3283n();
        Size m41323e = m41323e(m41180e, size);
        Matrix m3344b = C0689r.m3344b(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, m41323e.getWidth(), m41323e.getHeight()), m41180e);
        return AbstractC7392c0.m22314l(interfaceC0710o, c0679h, m41323e, m41324f(c12541f0.m41177b(), m3344b), c0679h.m3283n(), m41325g(c12541f0.m41181f(), m3344b), m41322d(interfaceC0710o));
    }

    /* renamed from: d */
    private static InterfaceC0663s m41322d(InterfaceC0710o interfaceC0710o) {
        return ((C1594b) interfaceC0710o.mo2883e1()).m8855e();
    }

    /* renamed from: e */
    private static Size m41323e(int i10, Size size) {
        return C0689r.m3348f(C0689r.m3359q(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: f */
    private static Rect m41324f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: g */
    private static Matrix m41325g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // p112g0.InterfaceC7390b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC7392c0<InterfaceC0710o> apply(C12539e0.b bVar) {
        C0679h m3273g;
        InterfaceC0710o mo41174a = bVar.mo41174a();
        C12541f0 mo41175b = bVar.mo41175b();
        if (mo41174a.getFormat() == 256) {
            try {
                m3273g = C0679h.m3273g(mo41174a);
                mo41174a.mo2885u0()[0].mo2886c().rewind();
            } catch (IOException e10) {
                throw new C12008g0(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            m3273g = null;
        }
        if (!C12564r.f34071g.m20857b(mo41174a)) {
            return m41320b(mo41175b, m3273g, mo41174a);
        }
        C0984h.m4834l(m3273g, "JPEG image must have exif.");
        return m41321c(mo41175b, m3273g, mo41174a);
    }
}
