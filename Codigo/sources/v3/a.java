package v3;

import android.graphics.Bitmap;
import h3.h;
import j3.v;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f27896a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27897b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f27896a = compressFormat;
        this.f27897b = i10;
    }

    @Override // v3.e
    public v<byte[]> a(v<Bitmap> vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f27896a, this.f27897b, byteArrayOutputStream);
        vVar.q();
        return new r3.b(byteArrayOutputStream.toByteArray());
    }
}
