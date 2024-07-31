package p213l4;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p232m4.C9540a;
import p232m4.C9545f;

/* renamed from: l4.h */
/* loaded from: classes.dex */
public final class C9392h {

    /* renamed from: a */
    public static final C9392h f22780a = new C9392h();

    /* renamed from: l4.h$a */
    /* loaded from: classes.dex */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a */
        private final C9540a f22781a;

        /* renamed from: b */
        private final WeakReference<View> f22782b;

        /* renamed from: c */
        private final WeakReference<View> f22783c;

        /* renamed from: d */
        private final View.OnTouchListener f22784d;

        /* renamed from: e */
        private boolean f22785e;

        public a(C9540a mapping, View rootView, View hostView) {
            C9322n.m27781e(mapping, "mapping");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            this.f22781a = mapping;
            this.f22782b = new WeakReference<>(hostView);
            this.f22783c = new WeakReference<>(rootView);
            this.f22784d = C9545f.m28421h(hostView);
            this.f22785e = true;
        }

        /* renamed from: a */
        public final boolean m27968a() {
            return this.f22785e;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(motionEvent, "motionEvent");
            View view2 = this.f22783c.get();
            View view3 = this.f22782b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                C9386b c9386b = C9386b.f22741a;
                C9386b.m27924d(this.f22781a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f22784d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private C9392h() {
    }

    /* renamed from: a */
    public static final a m27967a(C9540a mapping, View rootView, View hostView) {
        if (C0033a.m107d(C9392h.class)) {
            return null;
        }
        try {
            C9322n.m27781e(mapping, "mapping");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9392h.class);
            return null;
        }
    }
}
