package q3;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g implements h3.j<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final q f23428a;

    public g(q qVar) {
        this.f23428a = qVar;
    }

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, h3.h hVar) {
        return this.f23428a.f(byteBuffer, i10, i11, hVar);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, h3.h hVar) {
        return this.f23428a.q(byteBuffer);
    }
}
