package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.k1 */
/* loaded from: classes.dex */
class C0346k1 extends C0319b1 {

    /* renamed from: b */
    private final WeakReference<Context> f1817b;

    public C0346k1(Context context, Resources resources) {
        super(resources);
        this.f1817b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable m1613a = m1613a(i10);
        Context context = this.f1817b.get();
        if (m1613a != null && context != null) {
            C0316a1.m1583g().m1599w(context, i10, m1613a);
        }
        return m1613a;
    }
}
