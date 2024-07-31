package q3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i implements h3.j<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final e f23440a = new e();

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, h3.h hVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f23440a.b(createSource, i10, i11, hVar);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, h3.h hVar) {
        return true;
    }
}
