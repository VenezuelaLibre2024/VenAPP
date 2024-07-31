package l4;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f20958a = new h();

    /* loaded from: classes.dex */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        private final m4.a f20959a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f20960b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<View> f20961c;

        /* renamed from: d, reason: collision with root package name */
        private final View.OnTouchListener f20962d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20963e;

        public a(m4.a mapping, View rootView, View hostView) {
            n.e(mapping, "mapping");
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            this.f20959a = mapping;
            this.f20960b = new WeakReference<>(hostView);
            this.f20961c = new WeakReference<>(rootView);
            this.f20962d = m4.f.h(hostView);
            this.f20963e = true;
        }

        public final boolean a() {
            return this.f20963e;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            n.e(view, "view");
            n.e(motionEvent, "motionEvent");
            View view2 = this.f20961c.get();
            View view3 = this.f20960b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b bVar = b.f20919a;
                b.d(this.f20959a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f20962d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private h() {
    }

    public static final a a(m4.a mapping, View rootView, View hostView) {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            n.e(mapping, "mapping");
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }
}
