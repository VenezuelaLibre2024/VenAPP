package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC0243b;
import p111g.C7386j;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0218a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f857a;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f857a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f857a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7386j.f17074t);
            this.f857a = obtainStyledAttributes.getInt(C7386j.f17079u, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f857a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f857a = 0;
            this.f857a = aVar.f857a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m899a();

        /* renamed from: b */
        public abstract View m900b();

        /* renamed from: c */
        public abstract Drawable m901c();

        /* renamed from: d */
        public abstract CharSequence m902d();

        /* renamed from: e */
        public abstract void m903e();
    }

    /* renamed from: f */
    public boolean mo878f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo879g();

    /* renamed from: h */
    public abstract void mo880h(boolean z10);

    /* renamed from: i */
    public abstract int mo881i();

    /* renamed from: j */
    public abstract Context mo882j();

    /* renamed from: k */
    public abstract void mo883k();

    /* renamed from: l */
    public boolean mo884l() {
        return false;
    }

    /* renamed from: m */
    public abstract boolean mo885m();

    /* renamed from: n */
    public void mo886n(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo887o() {
    }

    /* renamed from: p */
    public abstract boolean mo888p(int i10, KeyEvent keyEvent);

    /* renamed from: q */
    public boolean mo889q(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: r */
    public boolean mo890r() {
        return false;
    }

    /* renamed from: s */
    public abstract void mo891s(Drawable drawable);

    /* renamed from: t */
    public abstract void mo892t(boolean z10);

    /* renamed from: u */
    public abstract void mo893u(boolean z10);

    /* renamed from: v */
    public abstract void mo894v(boolean z10);

    /* renamed from: w */
    public abstract void mo895w(CharSequence charSequence);

    /* renamed from: x */
    public abstract void mo896x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo897y();

    /* renamed from: z */
    public AbstractC0243b mo898z(AbstractC0243b.a aVar) {
        return null;
    }
}
