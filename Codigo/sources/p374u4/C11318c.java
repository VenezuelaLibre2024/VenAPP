package p374u4;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import dk.C7031r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p232m4.C9545f;

/* renamed from: u4.c */
/* loaded from: classes.dex */
public final class C11318c {

    /* renamed from: a */
    public static final C11318c f29385a = new C11318c();

    /* renamed from: b */
    private static final List<Class<? extends View>> f29386b;

    static {
        List<Class<? extends View>> m20584l;
        m20584l = C7031r.m20584l(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);
        f29386b = m20584l;
    }

    private C11318c() {
    }

    /* renamed from: a */
    public static final List<View> m35377a(View view) {
        if (C0033a.m107d(C11318c.class)) {
            return null;
        }
        try {
            C9322n.m27781e(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = f29386b.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator<View> it2 = C9545f.m28415b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(m35377a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11318c.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONObject m35378b(View view, View clickedView) {
        if (C0033a.m107d(C11318c.class)) {
            return null;
        }
        try {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m35381e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = C9545f.m28415b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m35378b(it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11318c.class);
            return null;
        }
    }

    /* renamed from: c */
    private final List<String> m35379c(View view) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C9545f.m28415b(view)) {
                String m28424k = C9545f.m28424k(view2);
                if (m28424k.length() > 0) {
                    arrayList.add(m28424k);
                }
                arrayList.addAll(m35379c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m35380d(View hostView) {
        if (C0033a.m107d(C11318c.class)) {
            return null;
        }
        try {
            C9322n.m27781e(hostView, "hostView");
            String m28424k = C9545f.m28424k(hostView);
            if (m28424k.length() > 0) {
                return m28424k;
            }
            String join = TextUtils.join(" ", f29385a.m35379c(hostView));
            C9322n.m27780d(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11318c.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final void m35381e(View view, JSONObject json) {
        if (C0033a.m107d(C11318c.class)) {
            return;
        }
        try {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(json, "json");
            try {
                String m28424k = C9545f.m28424k(view);
                String m28422i = C9545f.m28422i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", C9545f.m28416c(view));
                boolean z10 = true;
                if (m28424k.length() > 0) {
                    json.put("text", m28424k);
                }
                if (m28422i.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    json.put("hint", m28422i);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11318c.class);
        }
    }
}
