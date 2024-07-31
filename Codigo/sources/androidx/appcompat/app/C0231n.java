package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C0245d;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0323d;
import androidx.appcompat.widget.C0329f;
import androidx.appcompat.widget.C0332g;
import androidx.appcompat.widget.C0339i0;
import androidx.appcompat.widget.C0340i1;
import androidx.appcompat.widget.C0344k;
import androidx.appcompat.widget.C0351m0;
import androidx.appcompat.widget.C0356o;
import androidx.appcompat.widget.C0362q;
import androidx.appcompat.widget.C0371t;
import androidx.appcompat.widget.C0374u;
import androidx.appcompat.widget.C0380w;
import androidx.appcompat.widget.C0386y;
import androidx.collection.C0738h;
import androidx.core.view.C1116x0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p111g.C7386j;

/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes.dex */
public class C0231n {

    /* renamed from: b */
    private static final Class<?>[] f978b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f979c = {R.attr.onClick};

    /* renamed from: d */
    private static final int[] f980d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    private static final int[] f981e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    private static final int[] f982f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    private static final String[] f983g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    private static final C0738h<String, Constructor<? extends View>> f984h = new C0738h<>();

    /* renamed from: a */
    private final Object[] f985a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.n$a */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a */
        private final View f986a;

        /* renamed from: b */
        private final String f987b;

        /* renamed from: c */
        private Method f988c;

        /* renamed from: d */
        private Context f989d;

        public a(View view, String str) {
            this.f986a = view;
            this.f987b = str;
        }

        /* renamed from: a */
        private void m1099a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f987b, View.class)) != null) {
                        this.f988c = method;
                        this.f989d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f986a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f986a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f987b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f986a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f988c == null) {
                m1099a(this.f986a.getContext());
            }
            try {
                this.f988c.invoke(this.f989d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    /* renamed from: a */
    private void m1077a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f980d);
        if (obtainStyledAttributes.hasValue(0)) {
            C1116x0.m5259X(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f981e);
        if (obtainStyledAttributes2.hasValue(0)) {
            C1116x0.m5260Y(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f982f);
        if (obtainStyledAttributes3.hasValue(0)) {
            C1116x0.m5279i0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    /* renamed from: b */
    private void m1078b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C1116x0.m5238C(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f979c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private View m1079s(Context context, String str, String str2) {
        String str3;
        C0738h<String, Constructor<? extends View>> c0738h = f984h;
        Constructor<? extends View> constructor = c0738h.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f978b);
            c0738h.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f985a);
    }

    /* renamed from: t */
    private View m1080t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Constants.CLASS);
        }
        try {
            Object[] objArr = this.f985a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m1079s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f983g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View m1079s = m1079s(context, str, strArr[i10]);
                if (m1079s != null) {
                    return m1079s;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f985a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: u */
    private static Context m1081u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7386j.f17073s3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(C7386j.f17078t3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C7386j.f17083u3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0245d) && ((C0245d) context).m1185c() == resourceId) ? context : new C0245d(context, resourceId) : context;
    }

    /* renamed from: v */
    private void m1082v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: c */
    protected C0323d m1083c(Context context, AttributeSet attributeSet) {
        return new C0323d(context, attributeSet);
    }

    /* renamed from: d */
    protected AppCompatButton m1084d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: e */
    protected C0329f m1085e(Context context, AttributeSet attributeSet) {
        return new C0329f(context, attributeSet);
    }

    /* renamed from: f */
    protected C0332g m1086f(Context context, AttributeSet attributeSet) {
        return new C0332g(context, attributeSet);
    }

    /* renamed from: g */
    protected C0344k m1087g(Context context, AttributeSet attributeSet) {
        return new C0344k(context, attributeSet);
    }

    /* renamed from: h */
    protected C0356o m1088h(Context context, AttributeSet attributeSet) {
        return new C0356o(context, attributeSet);
    }

    /* renamed from: i */
    protected AppCompatImageView m1089i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: j */
    protected C0362q m1090j(Context context, AttributeSet attributeSet) {
        return new C0362q(context, attributeSet);
    }

    /* renamed from: k */
    protected C0371t m1091k(Context context, AttributeSet attributeSet) {
        return new C0371t(context, attributeSet);
    }

    /* renamed from: l */
    protected C0374u m1092l(Context context, AttributeSet attributeSet) {
        return new C0374u(context, attributeSet);
    }

    /* renamed from: m */
    protected C0380w m1093m(Context context, AttributeSet attributeSet) {
        return new C0380w(context, attributeSet);
    }

    /* renamed from: n */
    protected C0386y m1094n(Context context, AttributeSet attributeSet) {
        return new C0386y(context, attributeSet);
    }

    /* renamed from: o */
    protected C0339i0 m1095o(Context context, AttributeSet attributeSet) {
        return new C0339i0(context, attributeSet);
    }

    /* renamed from: p */
    protected C0351m0 m1096p(Context context, AttributeSet attributeSet) {
        return new C0351m0(context, attributeSet);
    }

    /* renamed from: q */
    protected View m1097q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View m1098r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View m1092l;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = m1081u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = C0340i1.m1779b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m1092l = m1092l(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 1:
                m1092l = m1086f(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 2:
                m1092l = m1090j(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 3:
                m1092l = m1095o(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 4:
                m1092l = m1088h(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 5:
                m1092l = m1093m(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 6:
                m1092l = m1094n(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 7:
                m1092l = m1091k(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case '\b':
                m1092l = m1096p(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case '\t':
                m1092l = m1089i(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case '\n':
                m1092l = m1083c(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case 11:
                m1092l = m1085e(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case '\f':
                m1092l = m1087g(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            case '\r':
                m1092l = m1084d(context2, attributeSet);
                m1082v(m1092l, str);
                break;
            default:
                m1092l = m1097q(context2, str, attributeSet);
                break;
        }
        if (m1092l == null && context != context2) {
            m1092l = m1080t(context2, str, attributeSet);
        }
        if (m1092l != null) {
            m1078b(m1092l, attributeSet);
            m1077a(context2, m1092l, attributeSet);
        }
        return m1092l;
    }
}
