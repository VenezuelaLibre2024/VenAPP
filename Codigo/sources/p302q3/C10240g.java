package p302q3;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;

/* renamed from: q3.g */
/* loaded from: classes.dex */
public class C10240g implements InterfaceC7626j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C10251q f25396a;

    public C10240g(C10251q c10251q) {
        this.f25396a = c10251q;
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Bitmap> mo23152b(ByteBuffer byteBuffer, int i10, int i11, C7624h c7624h) {
        return this.f25396a.m30686f(byteBuffer, i10, i11, c7624h);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(ByteBuffer byteBuffer, C7624h c7624h) {
        return this.f25396a.m30689q(byteBuffer);
    }
}
