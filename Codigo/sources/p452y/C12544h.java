package p452y;

import android.graphics.Bitmap;
import androidx.camera.core.impl.utils.C0679h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import p112g0.AbstractC7392c0;
import p112g0.InterfaceC7390b0;

/* renamed from: y.h */
/* loaded from: classes.dex */
class C12544h implements InterfaceC7390b0<a, AbstractC7392c0<byte[]>> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.h$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static a m41192c(AbstractC7392c0<Bitmap> abstractC7392c0, int i10) {
            return new C12530a(abstractC7392c0, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo41135a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC7392c0<Bitmap> mo41136b();
    }

    @Override // p112g0.InterfaceC7390b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC7392c0<byte[]> apply(a aVar) {
        AbstractC7392c0<Bitmap> mo41136b = aVar.mo41136b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo41136b.mo22306c().compress(Bitmap.CompressFormat.JPEG, aVar.mo41135a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C0679h mo22307d = mo41136b.mo22307d();
        Objects.requireNonNull(mo22307d);
        return AbstractC7392c0.m22315m(byteArray, mo22307d, RecognitionOptions.QR_CODE, mo41136b.mo22311h(), mo41136b.mo22305b(), mo41136b.mo22309f(), mo41136b.mo22310g(), mo41136b.mo22304a());
    }
}
