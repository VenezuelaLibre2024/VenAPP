package p452y;

import androidx.camera.core.C0711p;
import androidx.camera.core.C0715t;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.utils.C0679h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Objects;
import p112g0.AbstractC7392c0;
import p112g0.InterfaceC7390b0;

/* renamed from: y.u */
/* loaded from: classes.dex */
public class C12570u implements InterfaceC7390b0<AbstractC7392c0<byte[]>, AbstractC7392c0<InterfaceC0710o>> {
    @Override // p112g0.InterfaceC7390b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC7392c0<InterfaceC0710o> apply(AbstractC7392c0<byte[]> abstractC7392c0) {
        C0715t c0715t = new C0715t(C0711p.m3485a(abstractC7392c0.mo22311h().getWidth(), abstractC7392c0.mo22311h().getHeight(), RecognitionOptions.QR_CODE, 2));
        InterfaceC0710o m2869e = ImageProcessingUtil.m2869e(c0715t, abstractC7392c0.mo22306c());
        c0715t.m3534l();
        Objects.requireNonNull(m2869e);
        C0679h mo22307d = abstractC7392c0.mo22307d();
        Objects.requireNonNull(mo22307d);
        return AbstractC7392c0.m22313k(m2869e, mo22307d, abstractC7392c0.mo22305b(), abstractC7392c0.mo22309f(), abstractC7392c0.mo22310g(), abstractC7392c0.mo22304a());
    }
}
