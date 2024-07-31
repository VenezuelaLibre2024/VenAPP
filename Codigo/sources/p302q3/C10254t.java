package p302q3;

import androidx.exifinterface.media.C1239a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p036c4.C1860a;
import p193k3.InterfaceC9139b;

/* renamed from: q3.t */
/* loaded from: classes.dex */
public final class C10254t implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo10739a(ByteBuffer byteBuffer, InterfaceC9139b interfaceC9139b) {
        return mo10742d(C1860a.m9923g(byteBuffer), interfaceC9139b);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo10740b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo10741c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo10742d(InputStream inputStream, InterfaceC9139b interfaceC9139b) {
        int m6783h = new C1239a(inputStream).m6783h("Orientation", 1);
        if (m6783h == 0) {
            return -1;
        }
        return m6783h;
    }
}
