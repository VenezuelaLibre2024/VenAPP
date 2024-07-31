package u4;

import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.h0;
import com.facebook.internal.n0;
import i4.e0;
import i4.i0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import r4.f;
import u4.j;
import xk.p;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final a f27101e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Set<Integer> f27102f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f27103a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<View> f27104b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<View> f27105c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27106d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            if (e.f(str)) {
                new h0(e0.l()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(String str, final String str2) {
            final String d10 = b.d(str);
            if (d10 == null) {
                return false;
            }
            if (n.a(d10, "other")) {
                return true;
            }
            n0 n0Var = n0.f7780a;
            n0.C0(new Runnable() { // from class: u4.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.g(d10, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(String queriedEvent, String buttonText) {
            n.e(queriedEvent, "$queriedEvent");
            n.e(buttonText, "$buttonText");
            j.f27101e.e(queriedEvent, buttonText, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                int length = fArr.length;
                int i10 = 0;
                while (i10 < length) {
                    float f10 = fArr[i10];
                    i10++;
                    sb2.append(f10);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                i0.c cVar = i0.f17005n;
                a0 a0Var = a0.f20743a;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{e0.m()}, 1));
                n.d(format, "java.lang.String.format(locale, format, *args)");
                i0 A = cVar.A(null, format, null, null);
                A.H(bundle);
                A.k();
            } catch (JSONException unused) {
            }
        }

        public final void d(View hostView, View rootView, String activityName) {
            n.e(hostView, "hostView");
            n.e(rootView, "rootView");
            n.e(activityName, "activityName");
            int hashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(hashCode))) {
                return;
            }
            m4.f fVar = m4.f.f21389a;
            m4.f.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(hashCode));
        }
    }

    private j(View view, View view2, String str) {
        String A;
        this.f27103a = m4.f.g(view);
        this.f27104b = new WeakReference<>(view2);
        this.f27105c = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        A = p.A(lowerCase, "activity", "", false, 4, null);
        this.f27106d = A;
    }

    public /* synthetic */ j(View view, View view2, String str, kotlin.jvm.internal.g gVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (a5.a.d(j.class)) {
            return null;
        }
        try {
            return f27102f;
        } catch (Throwable th2) {
            a5.a.b(th2, j.class);
            return null;
        }
    }

    private final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n0 n0Var = n0.f7780a;
            n0.C0(new Runnable() { // from class: u4.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JSONObject viewData, String buttonText, j this$0, String pathID) {
        if (a5.a.d(j.class)) {
            return;
        }
        try {
            n.e(viewData, "$viewData");
            n.e(buttonText, "$buttonText");
            n.e(this$0, "this$0");
            n.e(pathID, "$pathID");
            try {
                n0 n0Var = n0.f7780a;
                String v10 = n0.v(e0.l());
                if (v10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = v10.toLowerCase();
                n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] a10 = u4.a.a(viewData, lowerCase);
                String c10 = u4.a.c(buttonText, this$0.f27106d, lowerCase);
                if (a10 == null) {
                    return;
                }
                r4.f fVar = r4.f.f24717a;
                String[] q10 = r4.f.q(f.a.MTML_APP_EVENT_PREDICTION, new float[][]{a10}, new String[]{c10});
                if (q10 == null) {
                    return;
                }
                String str = q10[0];
                b.a(pathID, str);
                if (n.a(str, "other")) {
                    return;
                }
                f27101e.e(str, buttonText, a10);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, j.class);
        }
    }

    private final void e() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            View view = this.f27104b.get();
            View view2 = this.f27105c.get();
            if (view != null && view2 != null) {
                try {
                    String d10 = c.d(view2);
                    String b10 = b.b(view2, d10);
                    if (b10 == null || f27101e.f(b10, d10)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f27106d);
                    c(b10, d10, jSONObject);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
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
                    View.OnClickListener onClickListener = this.f27103a;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    e();
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
