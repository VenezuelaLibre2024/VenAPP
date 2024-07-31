package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0018a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f758a;

        public C0018a(int i10, int i11) {
            super(i10, i11);
            this.f758a = 8388627;
        }

        public C0018a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f758a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15496t);
            this.f758a = obtainStyledAttributes.getInt(g.j.f15501u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0018a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f758a = 0;
        }

        public C0018a(C0018a c0018a) {
            super((ViewGroup.MarginLayoutParams) c0018a);
            this.f758a = 0;
            this.f758a = c0018a.f758a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract boolean m();

    public void n(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
    }

    public abstract boolean p(int i10, KeyEvent keyEvent);

    public boolean q(KeyEvent keyEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public abstract void y();

    public androidx.appcompat.view.b z(b.a aVar) {
        return null;
    }
}
