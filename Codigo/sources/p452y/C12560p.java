package p452y;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.utils.C0679h;
import androidx.camera.core.impl.utils.C0689r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import p092f0.C7262b;
import p112g0.AbstractC7392c0;
import p112g0.InterfaceC7390b0;
import p407w.C12008g0;

/* renamed from: y.p */
/* loaded from: classes.dex */
final class C12560p implements InterfaceC7390b0<a, AbstractC7392c0<byte[]>> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.p$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static a m41249c(AbstractC7392c0<InterfaceC0710o> abstractC7392c0, int i10) {
            return new C12536d(abstractC7392c0, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo41148a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC7392c0<InterfaceC0710o> mo41149b();
    }

    /* renamed from: b */
    private static C0679h m41245b(byte[] bArr) {
        try {
            return C0679h.m3274h(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new C12008g0(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    /* renamed from: c */
    private AbstractC7392c0<byte[]> m41246c(a aVar) {
        AbstractC7392c0<InterfaceC0710o> mo41149b = aVar.mo41149b();
        byte[] m21732c = C7262b.m21732c(mo41149b.mo22306c());
        C0679h mo22307d = mo41149b.mo22307d();
        Objects.requireNonNull(mo22307d);
        return AbstractC7392c0.m22315m(m21732c, mo22307d, RecognitionOptions.QR_CODE, mo41149b.mo22311h(), mo41149b.mo22305b(), mo41149b.mo22309f(), mo41149b.mo22310g(), mo41149b.mo22304a());
    }

    /* renamed from: d */
    private AbstractC7392c0<byte[]> m41247d(a aVar) {
        AbstractC7392c0<InterfaceC0710o> mo41149b = aVar.mo41149b();
        InterfaceC0710o mo22306c = mo41149b.mo22306c();
        Rect mo22305b = mo41149b.mo22305b();
        try {
            byte[] m21733d = C7262b.m21733d(mo22306c, mo22305b, aVar.mo41148a(), mo41149b.mo22309f());
            return AbstractC7392c0.m22315m(m21733d, m41245b(m21733d), RecognitionOptions.QR_CODE, new Size(mo22305b.width(), mo22305b.height()), new Rect(0, 0, mo22305b.width(), mo22305b.height()), mo41149b.mo22309f(), C0689r.m3358p(mo41149b.mo22310g(), mo22305b), mo41149b.mo22304a());
        } catch (C7262b.a e10) {
            throw new C12008g0(1, "Failed to encode the image to JPEG.", e10);
        }
    }

    @Override // p112g0.InterfaceC7390b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC7392c0<byte[]> apply(a aVar) {
        AbstractC7392c0<byte[]> m41247d;
        try {
            int mo22308e = aVar.mo41149b().mo22308e();
            if (mo22308e == 35) {
                m41247d = m41247d(aVar);
            } else {
                if (mo22308e != 256) {
                    throw new IllegalArgumentException("Unexpected format: " + mo22308e);
                }
                m41247d = m41246c(aVar);
            }
            return m41247d;
        } finally {
            aVar.mo41149b().mo22306c().close();
        }
    }
}
