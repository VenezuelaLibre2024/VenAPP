package j4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xk.q;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19742a = new c();

    private c() {
    }

    public static final List<String> a(View view) {
        if (a5.a.d(c.class)) {
            return null;
        }
        try {
            n.e(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup j10 = m4.f.j(view);
            if (j10 != null) {
                for (View view2 : m4.f.b(j10)) {
                    if (view != view2) {
                        arrayList.addAll(f19742a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
            return null;
        }
    }

    public static final List<String> b(View view) {
        if (a5.a.d(c.class)) {
            return null;
        }
        try {
            n.e(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(m4.f.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    n.d(resourceName, "resourceName");
                    Object[] array = new xk.f("/").c(resourceName, 0).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if ((str.length() > 0) && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
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
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator<View> it = m4.f.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c(it.next()));
                }
                return arrayList;
            }
            String obj = ((TextView) view).getText().toString();
            if ((obj.length() > 0) && obj.length() < 100) {
                String lowerCase = obj.toLowerCase();
                n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final boolean d(String str, List<String> list) {
        boolean J;
        if (a5.a.d(this)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                J = q.J(str, it.next(), false, 2, null);
                if (J) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    public static final boolean e(List<String> indicators, List<String> keys) {
        if (a5.a.d(c.class)) {
            return false;
        }
        try {
            n.e(indicators, "indicators");
            n.e(keys, "keys");
            Iterator<String> it = indicators.iterator();
            while (it.hasNext()) {
                if (f19742a.d(it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
            return false;
        }
    }

    public static final boolean f(String text, String rule) {
        if (a5.a.d(c.class)) {
            return false;
        }
        try {
            n.e(text, "text");
            n.e(rule, "rule");
            return new xk.f(rule).a(text);
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
            return false;
        }
    }
}
