package q3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class w implements h3.j<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final e f23492a = new e();

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(InputStream inputStream, int i10, int i11, h3.h hVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(c4.a.b(inputStream));
        return this.f23492a.b(createSource, i10, i11, hVar);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, h3.h hVar) {
        return true;
    }
}
