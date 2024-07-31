package l4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.o;
import i4.e0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20919a = new b();

    /* loaded from: classes.dex */
    public static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private m4.a f20920a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<View> f20921b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<View> f20922c;

        /* renamed from: d, reason: collision with root package name */
        private View.OnClickListener f20923d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20924e;

        public a(m4.a mapping, View rootView, View hostView) {
            n.e(mapping, "mapping");
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            this.f20920a = mapping;
            this.f20921b = new WeakReference<>(hostView);
            this.f20922c = new WeakReference<>(rootView);
            this.f20923d = m4.f.g(hostView);
            this.f20924e = true;
        }

        public final boolean a() {
            return this.f20924e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    if (a5.a.d(this)) {
                        return;
                    }
                    try {
                        n.e(view, "view");
                        View.OnClickListener onClickListener = this.f20923d;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        View view2 = this.f20922c.get();
                        View view3 = this.f20921b.get();
                        if (view2 == null || view3 == null) {
                            return;
                        }
                        b bVar = b.f20919a;
                        b.d(this.f20920a, view2, view3);
                    } catch (Throwable th2) {
                        a5.a.b(th2, this);
                    }
                } catch (Throwable th3) {
                    a5.a.b(th3, this);
                }
            } catch (Throwable th4) {
                a5.a.b(th4, this);
            }
        }
    }

    /* renamed from: l4.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0328b implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private m4.a f20925a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<AdapterView<?>> f20926b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<View> f20927c;

        /* renamed from: d, reason: collision with root package name */
        private AdapterView.OnItemClickListener f20928d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20929e;

        public C0328b(m4.a mapping, View rootView, AdapterView<?> hostView) {
            n.e(mapping, "mapping");
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            this.f20925a = mapping;
            this.f20926b = new WeakReference<>(hostView);
            this.f20927c = new WeakReference<>(rootView);
            this.f20928d = hostView.getOnItemClickListener();
            this.f20929e = true;
        }

        public final boolean a() {
            return this.f20929e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            n.e(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f20928d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.f20927c.get();
            AdapterView<?> adapterView2 = this.f20926b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            b bVar = b.f20919a;
            b.d(this.f20925a, view2, adapterView2);
        }
    }

    private b() {
    }

    public static final a b(m4.a mapping, View rootView, View hostView) {
        if (a5.a.d(b.class)) {
            return null;
        }
        try {
            n.e(mapping, "mapping");
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
            return null;
        }
    }

    public static final C0328b c(m4.a mapping, View rootView, AdapterView<?> hostView) {
        if (a5.a.d(b.class)) {
            return null;
        }
        try {
            n.e(mapping, "mapping");
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            return new C0328b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
            return null;
        }
    }

    public static final void d(m4.a mapping, View rootView, View hostView) {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            n.e(mapping, "mapping");
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            final String b10 = mapping.b();
            final Bundle b11 = g.f20942f.b(mapping, rootView, hostView);
            f20919a.f(b11);
            e0.t().execute(new Runnable() { // from class: l4.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.e(b10, b11);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String eventName, Bundle parameters) {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            n.e(eventName, "$eventName");
            n.e(parameters, "$parameters");
            o.f7660b.f(e0.l()).b(eventName, parameters);
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    public final void f(Bundle parameters) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", q4.g.g(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
