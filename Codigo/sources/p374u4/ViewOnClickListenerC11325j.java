package p374u4;

import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.C4578h0;
import com.facebook.internal.C4634n0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p232m4.C9545f;
import p325r4.C10618f;
import p374u4.ViewOnClickListenerC11325j;
import p450xk.C12524p;

/* renamed from: u4.j */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC11325j implements View.OnClickListener {

    /* renamed from: e */
    public static final a f29403e = new a(null);

    /* renamed from: f */
    private static final Set<Integer> f29404f = new HashSet();

    /* renamed from: a */
    private final View.OnClickListener f29405a;

    /* renamed from: b */
    private final WeakReference<View> f29406b;

    /* renamed from: c */
    private final WeakReference<View> f29407c;

    /* renamed from: d */
    private final String f29408d;

    /* renamed from: u4.j$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m35408e(String str, String str2, float[] fArr) {
            if (C11320e.m35387f(str)) {
                new C4578h0(C7799e0.m23860l()).m10997e(str, str2);
            } else if (C11320e.m35386e(str)) {
                m35411h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final boolean m35409f(String str, final String str2) {
            final String m35376d = C11317b.m35376d(str);
            if (m35376d == null) {
                return false;
            }
            if (C9322n.m27777a(m35376d, "other")) {
                return true;
            }
            C4634n0 c4634n0 = C4634n0.f8760a;
            C4634n0.m11266C0(new Runnable() { // from class: u4.i
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC11325j.a.m35410g(m35376d, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m35410g(String queriedEvent, String buttonText) {
            C9322n.m27781e(queriedEvent, "$queriedEvent");
            C9322n.m27781e(buttonText, "$buttonText");
            ViewOnClickListenerC11325j.f29403e.m35408e(queriedEvent, buttonText, new float[0]);
        }

        /* renamed from: h */
        private final void m35411h(String str, String str2, float[] fArr) {
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
                C7807i0.c cVar = C7807i0.f18658n;
                C9308a0 c9308a0 = C9308a0.f22565a;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C7799e0.m23861m()}, 1));
                C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
                C7807i0 m23987A = cVar.m23987A(null, format, null, null);
                m23987A.m23947H(bundle);
                m23987A.m23949k();
            } catch (JSONException unused) {
            }
        }

        /* renamed from: d */
        public final void m35412d(View hostView, View rootView, String activityName) {
            C9322n.m27781e(hostView, "hostView");
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(activityName, "activityName");
            int hashCode = hostView.hashCode();
            if (ViewOnClickListenerC11325j.m35401b().contains(Integer.valueOf(hashCode))) {
                return;
            }
            C9545f c9545f = C9545f.f23243a;
            C9545f.m28430r(hostView, new ViewOnClickListenerC11325j(hostView, rootView, activityName, null));
            ViewOnClickListenerC11325j.m35401b().add(Integer.valueOf(hashCode));
        }
    }

    private ViewOnClickListenerC11325j(View view, View view2, String str) {
        String m41027A;
        this.f29405a = C9545f.m28420g(view);
        this.f29406b = new WeakReference<>(view2);
        this.f29407c = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
        m41027A = C12524p.m41027A(lowerCase, "activity", "", false, 4, null);
        this.f29408d = m41027A;
    }

    public /* synthetic */ ViewOnClickListenerC11325j(View view, View view2, String str, C9315g c9315g) {
        this(view, view2, str);
    }

    /* renamed from: b */
    public static final /* synthetic */ Set m35401b() {
        if (C0033a.m107d(ViewOnClickListenerC11325j.class)) {
            return null;
        }
        try {
            return f29404f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewOnClickListenerC11325j.class);
            return null;
        }
    }

    /* renamed from: c */
    private final void m35402c(final String str, final String str2, final JSONObject jSONObject) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4634n0 c4634n0 = C4634n0.f8760a;
            C4634n0.m11266C0(new Runnable() { // from class: u4.h
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC11325j.m35403d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m35403d(JSONObject viewData, String buttonText, ViewOnClickListenerC11325j this$0, String pathID) {
        if (C0033a.m107d(ViewOnClickListenerC11325j.class)) {
            return;
        }
        try {
            C9322n.m27781e(viewData, "$viewData");
            C9322n.m27781e(buttonText, "$buttonText");
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(pathID, "$pathID");
            try {
                C4634n0 c4634n0 = C4634n0.f8760a;
                String m11335v = C4634n0.m11335v(C7799e0.m23860l());
                if (m11335v == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = m11335v.toLowerCase();
                C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] m35359a = C11316a.m35359a(viewData, lowerCase);
                String m35361c = C11316a.m35361c(buttonText, this$0.f29408d, lowerCase);
                if (m35359a == null) {
                    return;
                }
                C10618f c10618f = C10618f.f26831a;
                String[] m32337q = C10618f.m32337q(C10618f.a.MTML_APP_EVENT_PREDICTION, new float[][]{m35359a}, new String[]{m35361c});
                if (m32337q == null) {
                    return;
                }
                String str = m32337q[0];
                C11317b.m35373a(pathID, str);
                if (C9322n.m27777a(str, "other")) {
                    return;
                }
                f29403e.m35408e(str, buttonText, m35359a);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewOnClickListenerC11325j.class);
        }
    }

    /* renamed from: e */
    private final void m35404e() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            View view = this.f29406b.get();
            View view2 = this.f29407c.get();
            if (view != null && view2 != null) {
                try {
                    String m35380d = C11318c.m35380d(view2);
                    String m35374b = C11317b.m35374b(view2, m35380d);
                    if (m35374b == null || f29403e.m35409f(m35374b, m35380d)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", C11318c.m35378b(view, view2));
                    jSONObject.put("screenname", this.f29408d);
                    m35402c(m35374b, m35380d, jSONObject);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
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
                    View.OnClickListener onClickListener = this.f29405a;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    m35404e();
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
