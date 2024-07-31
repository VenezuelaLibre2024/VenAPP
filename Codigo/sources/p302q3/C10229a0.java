package p302q3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9141d;
import p346s3.C10792j;

/* renamed from: q3.a0 */
/* loaded from: classes.dex */
public class C10229a0 implements InterfaceC7626j<Uri, Bitmap> {

    /* renamed from: a */
    private final C10792j f25376a;

    /* renamed from: b */
    private final InterfaceC9141d f25377b;

    public C10229a0(C10792j c10792j, InterfaceC9141d interfaceC9141d) {
        this.f25376a = c10792j;
        this.f25377b = interfaceC9141d;
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Bitmap> mo23152b(Uri uri, int i10, int i11, C7624h c7624h) {
        InterfaceC8975v<Drawable> mo23152b = this.f25376a.mo23152b(uri, i10, i11, c7624h);
        if (mo23152b == null) {
            return null;
        }
        return C10252r.m30690a(this.f25377b, mo23152b.get(), i10, i11);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(Uri uri, C7624h c7624h) {
        return "android.resource".equals(uri.getScheme());
    }
}
