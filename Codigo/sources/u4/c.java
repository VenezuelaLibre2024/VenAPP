package u4;

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
import dk.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f27083a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final List<Class<? extends View>> f27084b;

    static {
        List<Class<? extends View>> l10;
        l10 = r.l(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);
        f27084b = l10;
    }

    private c() {
    }

    public static final List<View> a(View view) {
        if (a5.a.d(c.class)) {
            return null;
        }
        try {
            n.e(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = f27084b.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator<View> it2 = m4.f.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (a5.a.d(c.class)) {
            return null;
        }
        try {
            n.e(view, "view");
            n.e(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = m4.f.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
            return null;
        }
    }

    private final List<String> c(View view) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : m4.f.b(view)) {
                String k10 = m4.f.k(view2);
                if (k10.length() > 0) {
                    arrayList.add(k10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (a5.a.d(c.class)) {
            return null;
        }
        try {
            n.e(hostView, "hostView");
            String k10 = m4.f.k(hostView);
            if (k10.length() > 0) {
                return k10;
            }
            String join = TextUtils.join(" ", f27083a.c(hostView));
            n.d(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (a5.a.d(c.class)) {
            return;
        }
        try {
            n.e(view, "view");
            n.e(json, "json");
            try {
                String k10 = m4.f.k(view);
                String i10 = m4.f.i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", m4.f.c(view));
                boolean z10 = true;
                if (k10.length() > 0) {
                    json.put("text", k10);
                }
                if (i10.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    json.put("hint", i10);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
        }
    }
}
