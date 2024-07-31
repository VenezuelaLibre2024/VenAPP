package p452y;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import androidx.camera.core.impl.utils.C0679h;
import androidx.camera.core.impl.utils.C0689r;
import java.io.IOException;
import java.util.Objects;
import p112g0.AbstractC7392c0;
import p112g0.InterfaceC7390b0;
import p407w.C12008g0;

/* renamed from: y.s */
/* loaded from: classes.dex */
final class C12566s implements InterfaceC7390b0<AbstractC7392c0<byte[]>, AbstractC7392c0<Bitmap>> {
    /* renamed from: b */
    private Bitmap m41276b(byte[] bArr, Rect rect) {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new C12008g0(1, "Failed to decode JPEG.", e10);
        }
    }

    @Override // p112g0.InterfaceC7390b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC7392c0<Bitmap> apply(AbstractC7392c0<byte[]> abstractC7392c0) {
        Rect mo22305b = abstractC7392c0.mo22305b();
        Bitmap m41276b = m41276b(abstractC7392c0.mo22306c(), mo22305b);
        C0679h mo22307d = abstractC7392c0.mo22307d();
        Objects.requireNonNull(mo22307d);
        return AbstractC7392c0.m22312j(m41276b, mo22307d, new Rect(0, 0, m41276b.getWidth(), m41276b.getHeight()), abstractC7392c0.mo22309f(), C0689r.m3358p(abstractC7392c0.mo22310g(), mo22305b), abstractC7392c0.mo22304a());
    }
}
