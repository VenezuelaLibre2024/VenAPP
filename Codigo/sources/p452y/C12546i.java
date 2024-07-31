package p452y;

import android.graphics.Bitmap;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.utils.C0679h;
import java.util.Objects;
import p092f0.C7262b;
import p112g0.AbstractC7392c0;
import p112g0.C7431w;
import p112g0.C7437z;
import p112g0.InterfaceC7390b0;

/* renamed from: y.i */
/* loaded from: classes.dex */
public class C12546i implements InterfaceC7390b0<AbstractC7392c0<Bitmap>, AbstractC7392c0<Bitmap>> {

    /* renamed from: a */
    private final C7437z f34023a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12546i(C7437z c7437z) {
        this.f34023a = c7437z;
    }

    @Override // p112g0.InterfaceC7390b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC7392c0<Bitmap> apply(AbstractC7392c0<Bitmap> abstractC7392c0) {
        InterfaceC0710o m38630a = this.f34023a.m22436e(new C7431w(new C12549j0(abstractC7392c0), 1)).m38630a();
        Objects.requireNonNull(m38630a);
        Bitmap m21730a = C7262b.m21730a(m38630a.mo2885u0(), m38630a.getWidth(), m38630a.getHeight());
        C0679h mo22307d = abstractC7392c0.mo22307d();
        Objects.requireNonNull(mo22307d);
        return AbstractC7392c0.m22312j(m21730a, mo22307d, abstractC7392c0.mo22305b(), abstractC7392c0.mo22309f(), abstractC7392c0.mo22310g(), abstractC7392c0.mo22304a());
    }
}
