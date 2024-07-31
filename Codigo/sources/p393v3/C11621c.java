package p393v3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p129h3.C7624h;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9141d;
import p302q3.C10238f;
import p373u3.C11308c;

/* renamed from: v3.c */
/* loaded from: classes.dex */
public final class C11621c implements InterfaceC11623e<Drawable, byte[]> {

    /* renamed from: a */
    private final InterfaceC9141d f30223a;

    /* renamed from: b */
    private final InterfaceC11623e<Bitmap, byte[]> f30224b;

    /* renamed from: c */
    private final InterfaceC11623e<C11308c, byte[]> f30225c;

    public C11621c(InterfaceC9141d interfaceC9141d, InterfaceC11623e<Bitmap, byte[]> interfaceC11623e, InterfaceC11623e<C11308c, byte[]> interfaceC11623e2) {
        this.f30223a = interfaceC9141d;
        this.f30224b = interfaceC11623e;
        this.f30225c = interfaceC11623e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static InterfaceC8975v<C11308c> m36415b(InterfaceC8975v<Drawable> interfaceC8975v) {
        return interfaceC8975v;
    }

    @Override // p393v3.InterfaceC11623e
    /* renamed from: a */
    public InterfaceC8975v<byte[]> mo36414a(InterfaceC8975v<Drawable> interfaceC8975v, C7624h c7624h) {
        Drawable drawable = interfaceC8975v.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f30224b.mo36414a(C10238f.m30609b(((BitmapDrawable) drawable).getBitmap(), this.f30223a), c7624h);
        }
        if (drawable instanceof C11308c) {
            return this.f30225c.mo36414a(m36415b(interfaceC8975v), c7624h);
        }
        return null;
    }
}
