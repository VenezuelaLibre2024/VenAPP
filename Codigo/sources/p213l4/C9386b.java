package p213l4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.C4589o;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;
import p232m4.C9540a;
import p232m4.C9545f;
import p303q4.C10267g;

/* renamed from: l4.b */
/* loaded from: classes.dex */
public final class C9386b {

    /* renamed from: a */
    public static final C9386b f22741a = new C9386b();

    /* renamed from: l4.b$a */
    /* loaded from: classes.dex */
    public static final class a implements View.OnClickListener {

        /* renamed from: a */
        private C9540a f22742a;

        /* renamed from: b */
        private WeakReference<View> f22743b;

        /* renamed from: c */
        private WeakReference<View> f22744c;

        /* renamed from: d */
        private View.OnClickListener f22745d;

        /* renamed from: e */
        private boolean f22746e;

        public a(C9540a mapping, View rootView, View hostView) {
            C9322n.m27781e(mapping, "mapping");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            this.f22742a = mapping;
            this.f22743b = new WeakReference<>(hostView);
            this.f22744c = new WeakReference<>(rootView);
            this.f22745d = C9545f.m28420g(hostView);
            this.f22746e = true;
        }

        /* renamed from: a */
        public final boolean m27927a() {
            return this.f22746e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    if (C0033a.m107d(this)) {
                        return;
                    }
                    try {
                        C9322n.m27781e(view, "view");
                        View.OnClickListener onClickListener = this.f22745d;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        View view2 = this.f22744c.get();
                        View view3 = this.f22743b.get();
                        if (view2 == null || view3 == null) {
                            return;
                        }
                        C9386b c9386b = C9386b.f22741a;
                        C9386b.m27924d(this.f22742a, view2, view3);
                    } catch (Throwable th2) {
                        C0033a.m105b(th2, this);
                    }
                } catch (Throwable th3) {
                    C0033a.m105b(th3, this);
                }
            } catch (Throwable th4) {
                C0033a.m105b(th4, this);
            }
        }
    }

    /* renamed from: l4.b$b */
    /* loaded from: classes.dex */
    public static final class b implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        private C9540a f22747a;

        /* renamed from: b */
        private WeakReference<AdapterView<?>> f22748b;

        /* renamed from: c */
        private WeakReference<View> f22749c;

        /* renamed from: d */
        private AdapterView.OnItemClickListener f22750d;

        /* renamed from: e */
        private boolean f22751e;

        public b(C9540a mapping, View rootView, AdapterView<?> hostView) {
            C9322n.m27781e(mapping, "mapping");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            this.f22747a = mapping;
            this.f22748b = new WeakReference<>(hostView);
            this.f22749c = new WeakReference<>(rootView);
            this.f22750d = hostView.getOnItemClickListener();
            this.f22751e = true;
        }

        /* renamed from: a */
        public final boolean m27928a() {
            return this.f22751e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C9322n.m27781e(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f22750d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.f22749c.get();
            AdapterView<?> adapterView2 = this.f22748b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            C9386b c9386b = C9386b.f22741a;
            C9386b.m27924d(this.f22747a, view2, adapterView2);
        }
    }

    private C9386b() {
    }

    /* renamed from: b */
    public static final a m27922b(C9540a mapping, View rootView, View hostView) {
        if (C0033a.m107d(C9386b.class)) {
            return null;
        }
        try {
            C9322n.m27781e(mapping, "mapping");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9386b.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final b m27923c(C9540a mapping, View rootView, AdapterView<?> hostView) {
        if (C0033a.m107d(C9386b.class)) {
            return null;
        }
        try {
            C9322n.m27781e(mapping, "mapping");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            return new b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9386b.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m27924d(C9540a mapping, View rootView, View hostView) {
        if (C0033a.m107d(C9386b.class)) {
            return;
        }
        try {
            C9322n.m27781e(mapping, "mapping");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            final String m28382b = mapping.m28382b();
            final Bundle m27955b = C9391g.f22764f.m27955b(mapping, rootView, hostView);
            f22741a.m27926f(m27955b);
            C7799e0.m23868t().execute(new Runnable() { // from class: l4.a
                @Override // java.lang.Runnable
                public final void run() {
                    C9386b.m27925e(m28382b, m27955b);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9386b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m27925e(String eventName, Bundle parameters) {
        if (C0033a.m107d(C9386b.class)) {
            return;
        }
        try {
            C9322n.m27781e(eventName, "$eventName");
            C9322n.m27781e(parameters, "$parameters");
            C4589o.f8635b.m11055f(C7799e0.m23860l()).m11049b(eventName, parameters);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9386b.class);
        }
    }

    /* renamed from: f */
    public final void m27926f(Bundle parameters) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", C10267g.m30750g(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
