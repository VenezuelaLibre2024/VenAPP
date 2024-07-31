package p172j4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p232m4.C9545f;
import p450xk.C12514f;
import p450xk.C12525q;

/* renamed from: j4.c */
/* loaded from: classes.dex */
public final class C8982c {

    /* renamed from: a */
    public static final C8982c f21521a = new C8982c();

    private C8982c() {
    }

    /* renamed from: a */
    public static final List<String> m26349a(View view) {
        if (C0033a.m107d(C8982c.class)) {
            return null;
        }
        try {
            C9322n.m27781e(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup m28423j = C9545f.m28423j(view);
            if (m28423j != null) {
                for (View view2 : C9545f.m28415b(m28423j)) {
                    if (view != view2) {
                        arrayList.addAll(f21521a.m26351c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8982c.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final List<String> m26350b(View view) {
        if (C0033a.m107d(C8982c.class)) {
            return null;
        }
        try {
            C9322n.m27781e(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(C9545f.m28422i(view));
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
                    C9322n.m27780d(resourceName, "resourceName");
                    Object[] array = new C12514f("/").m40971c(resourceName, 0).toArray(new String[0]);
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
                    C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8982c.class);
            return null;
        }
    }

    /* renamed from: c */
    private final List<String> m26351c(View view) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator<View> it = C9545f.m28415b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m26351c(it.next()));
                }
                return arrayList;
            }
            String obj = ((TextView) view).getText().toString();
            if ((obj.length() > 0) && obj.length() < 100) {
                String lowerCase = obj.toLowerCase();
                C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    private final boolean m26352d(String str, List<String> list) {
        boolean m41059J;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                m41059J = C12525q.m41059J(str, it.next(), false, 2, null);
                if (m41059J) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m26353e(List<String> indicators, List<String> keys) {
        if (C0033a.m107d(C8982c.class)) {
            return false;
        }
        try {
            C9322n.m27781e(indicators, "indicators");
            C9322n.m27781e(keys, "keys");
            Iterator<String> it = indicators.iterator();
            while (it.hasNext()) {
                if (f21521a.m26352d(it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8982c.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m26354f(String text, String rule) {
        if (C0033a.m107d(C8982c.class)) {
            return false;
        }
        try {
            C9322n.m27781e(text, "text");
            C9322n.m27781e(rule, "rule");
            return new C12514f(rule).m40969a(text);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8982c.class);
            return false;
        }
    }
}
