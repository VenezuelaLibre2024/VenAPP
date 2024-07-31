package p302q3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p129h3.C7624h;
import p129h3.EnumC7619c;
import p129h3.InterfaceC7627k;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9141d;

/* renamed from: q3.b */
/* loaded from: classes.dex */
public class C10230b implements InterfaceC7627k<BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC9141d f25378a;

    /* renamed from: b */
    private final InterfaceC7627k<Bitmap> f25379b;

    public C10230b(InterfaceC9141d interfaceC9141d, InterfaceC7627k<Bitmap> interfaceC7627k) {
        this.f25378a = interfaceC9141d;
        this.f25379b = interfaceC7627k;
    }

    @Override // p129h3.InterfaceC7627k
    /* renamed from: a */
    public EnumC7619c mo23153a(C7624h c7624h) {
        return this.f25379b.mo23153a(c7624h);
    }

    @Override // p129h3.InterfaceC7620d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo23137b(InterfaceC8975v<BitmapDrawable> interfaceC8975v, File file, C7624h c7624h) {
        return this.f25379b.mo23137b(new C10238f(interfaceC8975v.get().getBitmap(), this.f25378a), file, c7624h);
    }
}
