package m4;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.internal.n0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21389a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final String f21390b = f.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference<View> f21391c = new WeakReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    private static Method f21392d;

    private f() {
    }

    public static final View a(View view) {
        if (a5.a.d(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f21389a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                a5.a.b(th2, f.class);
            }
        }
        return null;
    }

    public static final List<View> b(View view) {
        int childCount;
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                    if (i11 >= childCount) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    public static final int c(View view) {
        if (a5.a.d(f.class)) {
            return 0;
        }
        try {
            n.e(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (o(view)) {
                i10 |= RecognitionOptions.UPC_A;
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i10 | 65536 : view instanceof RadioGroup ? i10 | 16384 : ((view instanceof ViewGroup) && f21389a.p(view, f21391c.get())) ? i10 | 64 : i10;
                }
                return i10 | RecognitionOptions.AZTEC;
            }
            int i11 = i10 | RecognitionOptions.UPC_E | 1;
            if (view instanceof Button) {
                i11 |= 4;
                if (view instanceof Switch) {
                    i11 |= 8192;
                } else if (view instanceof CheckBox) {
                    i11 |= RecognitionOptions.TEZ_CODE;
                }
            }
            return view instanceof EditText ? i11 | RecognitionOptions.PDF417 : i11;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            n.e(view, "view");
            if (n.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f21391c = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> b10 = b(view);
                int size = b10.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(d(b10.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e(f21390b, "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    private final JSONObject e(View view) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e10) {
                Log.e(f21390b, "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final Class<?> f(String str) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Field declaredField;
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        String str;
        Field declaredField;
        try {
            if (a5.a.d(f.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        return (View.OnTouchListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    n0 n0Var = n0.f7780a;
                    str = f21390b;
                    n0.j0(str, e);
                    return null;
                } catch (NoSuchFieldException e11) {
                    e = e11;
                    n0 n0Var2 = n0.f7780a;
                    str = f21390b;
                    n0.j0(str, e);
                    return null;
                }
            } catch (IllegalAccessException e12) {
                e = e12;
                n0 n0Var3 = n0.f7780a;
                str = f21390b;
                n0.j0(str, e);
                return null;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:6:0x000a, B:8:0x000e, B:9:0x0010, B:12:0x0022, B:19:0x0015, B:21:0x0019), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String i(android.view.View r3) {
        /*
            java.lang.Class<m4.f> r0 = m4.f.class
            boolean r1 = a5.a.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r3 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L15
            android.widget.EditText r3 = (android.widget.EditText) r3     // Catch: java.lang.Throwable -> L2b
        L10:
            java.lang.CharSequence r3 = r3.getHint()     // Catch: java.lang.Throwable -> L2b
            goto L1d
        L15:
            boolean r1 = r3 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L1c
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> L2b
            goto L10
        L1c:
            r3 = r2
        L1d:
            java.lang.String r1 = ""
            if (r3 != 0) goto L22
            goto L2a
        L22:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            return r1
        L2b:
            r3 = move-exception
            a5.a.b(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.f.i(android.view.View):java.lang.String");
    }

    public static final ViewGroup j(View view) {
        if (a5.a.d(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    public static final String k(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i10 = 0;
                if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    a0 a0Var = a0.f20743a;
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    n.d(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    n.d(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    a0 a0Var2 = a0.f20743a;
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i10);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            }
                            if (i11 >= childCount) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
                n.d(valueOf, "java.lang.String.format(format, *args)");
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        String str;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = f21392d;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Object invoke = method.invoke(null, fArr, view);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View view2 = (View) invoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        if (parent != null) {
                            return (View) parent;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } catch (IllegalAccessException e10) {
                    e = e10;
                    n0 n0Var = n0.f7780a;
                    str = f21390b;
                    n0.j0(str, e);
                    return null;
                } catch (InvocationTargetException e11) {
                    e = e11;
                    n0 n0Var2 = n0.f7780a;
                    str = f21390b;
                    n0.j0(str, e);
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final float[] m(View view) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r2[0], r2[1]};
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final void n() {
        String str;
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (f21392d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f21392d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                e = e10;
                n0 n0Var = n0.f7780a;
                str = f21390b;
                n0.j0(str, e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                n0 n0Var2 = n0.f7780a;
                str = f21390b;
                n0.j0(str, e);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private static final boolean o(View view) {
        if (a5.a.d(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = f21389a;
            Class<?> f10 = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (f10 != null && f10.isInstance(parent)) {
                return true;
            }
            Class<?> f11 = fVar.f("androidx.core.view.NestedScrollingChild");
            if (f11 != null) {
                return f11.isInstance(parent);
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return false;
        }
    }

    private final boolean q(View view) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return n.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            n.e(view, "view");
            Object obj = null;
            try {
                try {
                    field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                    field = null;
                }
                try {
                    field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    field2 = null;
                    if (field != null) {
                    }
                    view.setOnClickListener(onClickListener);
                    return;
                }
                if (field != null || field2 == null) {
                    view.setOnClickListener(onClickListener);
                    return;
                }
                field.setAccessible(true);
                field2.setAccessible(true);
                try {
                    field.setAccessible(true);
                    obj = field.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(onClickListener);
                } else {
                    field2.set(obj, onClickListener);
                }
            } catch (Exception unused4) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    public static final void s(View view, JSONObject json) {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            n.e(view, "view");
            n.e(json, "json");
            try {
                String k10 = k(view);
                String i10 = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", c(view));
                json.put(FacebookMediationAdapter.KEY_ID, view.getId());
                if (d.g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", n0.k(n0.G0(k10), ""));
                }
                json.put("hint", n0.k(n0.G0(i10), ""));
                if (tag != null) {
                    json.put("tag", n0.k(n0.G0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", n0.k(n0.G0(contentDescription.toString()), ""));
                }
                json.put("dimension", f21389a.e(view));
            } catch (JSONException e10) {
                n0 n0Var = n0.f7780a;
                n0.j0(f21390b, e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    public final boolean p(View view, View view2) {
        View l10;
        if (a5.a.d(this)) {
            return false;
        }
        try {
            n.e(view, "view");
            if (!n.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (l10 = l(m(view), view2)) == null) {
                return false;
            }
            return l10.getId() == view.getId();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }
}
