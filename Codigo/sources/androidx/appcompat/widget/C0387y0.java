package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0259f;
import androidx.appcompat.view.menu.C0260g;
import androidx.appcompat.view.menu.C0262i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.y0 */
/* loaded from: classes.dex */
public class C0387y0 extends C0375u0 implements InterfaceC0384x0 {

    /* renamed from: U */
    private static Method f2026U;

    /* renamed from: T */
    private InterfaceC0384x0 f2027T;

    /* renamed from: androidx.appcompat.widget.y0$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m2078a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        static void m2079b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static void m2080a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$c */
    /* loaded from: classes.dex */
    public static class c extends C0363q0 {

        /* renamed from: A */
        private InterfaceC0384x0 f2028A;

        /* renamed from: B */
        private MenuItem f2029B;

        /* renamed from: y */
        final int f2030y;

        /* renamed from: z */
        final int f2031z;

        /* renamed from: androidx.appcompat.widget.y0$c$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static int m2081a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.m2081a(context.getResources().getConfiguration())) {
                this.f2030y = 21;
                this.f2031z = 22;
            } else {
                this.f2030y = 22;
                this.f2031z = 21;
            }
        }

        @Override // androidx.appcompat.widget.C0363q0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1934d(int i10, int i11, int i12, int i13, int i14) {
            return super.mo1934d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.C0363q0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1935e(MotionEvent motionEvent, int i10) {
            return super.mo1935e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.C0363q0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0363q0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0363q0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0363q0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0363q0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C0259f c0259f;
            int i10;
            int pointToPosition;
            int i11;
            if (this.f2028A != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    c0259f = (C0259f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0259f = (C0259f) adapter;
                    i10 = 0;
                }
                C0262i item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = pointToPosition - i10) < 0 || i11 >= c0259f.getCount()) ? null : c0259f.getItem(i11);
                MenuItem menuItem = this.f2029B;
                if (menuItem != item) {
                    C0260g m1289b = c0259f.m1289b();
                    if (menuItem != null) {
                        this.f2028A.mo1282c(m1289b, menuItem);
                    }
                    this.f2029B = item;
                    if (item != null) {
                        this.f2028A.mo1281b(m1289b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f2030y) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f2031z) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0259f) adapter).m1289b().m1330e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.C0363q0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0384x0 interfaceC0384x0) {
            this.f2028A = interfaceC0384x0;
        }

        @Override // androidx.appcompat.widget.C0363q0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2026U = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0387y0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    /* renamed from: M */
    public void m2074M(Object obj) {
        a.m2078a(this.f1944Q, (Transition) obj);
    }

    /* renamed from: N */
    public void m2075N(Object obj) {
        a.m2079b(this.f1944Q, (Transition) obj);
    }

    /* renamed from: O */
    public void m2076O(InterfaceC0384x0 interfaceC0384x0) {
        this.f2027T = interfaceC0384x0;
    }

    /* renamed from: P */
    public void m2077P(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            b.m2080a(this.f1944Q, z10);
            return;
        }
        Method method = f2026U;
        if (method != null) {
            try {
                method.invoke(this.f1944Q, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0384x0
    /* renamed from: b */
    public void mo1281b(C0260g c0260g, MenuItem menuItem) {
        InterfaceC0384x0 interfaceC0384x0 = this.f2027T;
        if (interfaceC0384x0 != null) {
            interfaceC0384x0.mo1281b(c0260g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0384x0
    /* renamed from: c */
    public void mo1282c(C0260g c0260g, MenuItem menuItem) {
        InterfaceC0384x0 interfaceC0384x0 = this.f2027T;
        if (interfaceC0384x0 != null) {
            interfaceC0384x0.mo1282c(c0260g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0375u0
    /* renamed from: f */
    C0363q0 mo1999f(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
