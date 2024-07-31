package p302q3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import p036c4.C1860a;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;

/* renamed from: q3.w */
/* loaded from: classes.dex */
public final class C10257w implements InterfaceC7626j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C10236e f25460a = new C10236e();

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Bitmap> mo23152b(InputStream inputStream, int i10, int i11, C7624h c7624h) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(C1860a.m9918b(inputStream));
        return this.f25460a.mo23152b(createSource, i10, i11, c7624h);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(InputStream inputStream, C7624h c7624h) {
        return true;
    }
}
