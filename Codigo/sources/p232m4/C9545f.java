package p232m4;

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
import com.facebook.internal.C4634n0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;

/* renamed from: m4.f */
/* loaded from: classes.dex */
public final class C9545f {

    /* renamed from: a */
    public static final C9545f f23243a = new C9545f();

    /* renamed from: b */
    private static final String f23244b = C9545f.class.getCanonicalName();

    /* renamed from: c */
    private static WeakReference<View> f23245c = new WeakReference<>(null);

    /* renamed from: d */
    private static Method f23246d;

    private C9545f() {
    }

    /* renamed from: a */
    public static final View m28414a(View view) {
        if (C0033a.m107d(C9545f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f23243a.m28429q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                C0033a.m105b(th2, C9545f.class);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final List<View> m28415b(View view) {
        int childCount;
        if (C0033a.m107d(C9545f.class)) {
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
            C0033a.m105b(th2, C9545f.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final int m28416c(View view) {
        if (C0033a.m107d(C9545f.class)) {
            return 0;
        }
        try {
            C9322n.m27781e(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (m28428o(view)) {
                i10 |= RecognitionOptions.UPC_A;
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i10 | 65536 : view instanceof RadioGroup ? i10 | 16384 : ((view instanceof ViewGroup) && f23243a.m28432p(view, f23245c.get())) ? i10 | 64 : i10;
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
            C0033a.m105b(th2, C9545f.class);
            return 0;
        }
    }

    /* renamed from: d */
    public static final JSONObject m28417d(View view) {
        if (C0033a.m107d(C9545f.class)) {
            return null;
        }
        try {
            C9322n.m27781e(view, "view");
            if (C9322n.m27777a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f23245c = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m28431s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> m28415b = m28415b(view);
                int size = m28415b.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(m28417d(m28415b.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e(f23244b, "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9545f.class);
            return null;
        }
    }

    /* renamed from: e */
    private final JSONObject m28418e(View view) {
        if (C0033a.m107d(this)) {
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
                Log.e(f23244b, "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: f */
    private final Class<?> m28419f(String str) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: g */
    public static final View.OnClickListener m28420g(View view) {
        Field declaredField;
        if (C0033a.m107d(C9545f.class)) {
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
            C0033a.m105b(th2, C9545f.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final View.OnTouchListener m28421h(View view) {
        String str;
        Field declaredField;
        try {
            if (C0033a.m107d(C9545f.class)) {
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
                    C4634n0 c4634n0 = C4634n0.f8760a;
                    str = f23244b;
                    C4634n0.m11312j0(str, e);
                    return null;
                } catch (NoSuchFieldException e11) {
                    e = e11;
                    C4634n0 c4634n02 = C4634n0.f8760a;
                    str = f23244b;
                    C4634n0.m11312j0(str, e);
                    return null;
                }
            } catch (IllegalAccessException e12) {
                e = e12;
                C4634n0 c4634n03 = C4634n0.f8760a;
                str = f23244b;
                C4634n0.m11312j0(str, e);
                return null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9545f.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:6:0x000a, B:8:0x000e, B:9:0x0010, B:12:0x0022, B:19:0x0015, B:21:0x0019), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m28422i(android.view.View r3) {
        /*
            java.lang.Class<m4.f> r0 = p232m4.C9545f.class
            boolean r1 = p007a5.C0033a.m107d(r0)
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
            p007a5.C0033a.m105b(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p232m4.C9545f.m28422i(android.view.View):java.lang.String");
    }

    /* renamed from: j */
    public static final ViewGroup m28423j(View view) {
        if (C0033a.m107d(C9545f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9545f.class);
            return null;
        }
    }

    /* renamed from: k */
    public static final String m28424k(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (C0033a.m107d(C9545f.class)) {
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
                    C9308a0 c9308a0 = C9308a0.f22565a;
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    C9322n.m27780d(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    C9322n.m27780d(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    C9308a0 c9308a02 = C9308a0.f22565a;
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
                C9322n.m27780d(valueOf, "java.lang.String.format(format, *args)");
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9545f.class);
            return null;
        }
    }

    /* renamed from: l */
    private final View m28425l(float[] fArr, View view) {
        String str;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            m28427n();
            Method method = f23246d;
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
                    C4634n0 c4634n0 = C4634n0.f8760a;
                    str = f23244b;
                    C4634n0.m11312j0(str, e);
                    return null;
                } catch (InvocationTargetException e11) {
                    e = e11;
                    C4634n0 c4634n02 = C4634n0.f8760a;
                    str = f23244b;
                    C4634n0.m11312j0(str, e);
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: m */
    private final float[] m28426m(View view) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r2[0], r2[1]};
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: n */
    private final void m28427n() {
        String str;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (f23246d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f23246d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                e = e10;
                C4634n0 c4634n0 = C4634n0.f8760a;
                str = f23244b;
                C4634n0.m11312j0(str, e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                C4634n0 c4634n02 = C4634n0.f8760a;
                str = f23244b;
                C4634n0.m11312j0(str, e);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: o */
    private static final boolean m28428o(View view) {
        if (C0033a.m107d(C9545f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            C9545f c9545f = f23243a;
            Class<?> m28419f = c9545f.m28419f("android.support.v4.view.NestedScrollingChild");
            if (m28419f != null && m28419f.isInstance(parent)) {
                return true;
            }
            Class<?> m28419f2 = c9545f.m28419f("androidx.core.view.NestedScrollingChild");
            if (m28419f2 != null) {
                return m28419f2.isInstance(parent);
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9545f.class);
            return false;
        }
    }

    /* renamed from: q */
    private final boolean m28429q(View view) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return C9322n.m27777a(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: r */
    public static final void m28430r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (C0033a.m107d(C9545f.class)) {
            return;
        }
        try {
            C9322n.m27781e(view, "view");
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
            C0033a.m105b(th2, C9545f.class);
        }
    }

    /* renamed from: s */
    public static final void m28431s(View view, JSONObject json) {
        if (C0033a.m107d(C9545f.class)) {
            return;
        }
        try {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(json, "json");
            try {
                String m28424k = m28424k(view);
                String m28422i = m28422i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", m28416c(view));
                json.put(FacebookMediationAdapter.KEY_ID, view.getId());
                if (C9543d.m28409g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", C4634n0.m11313k(C4634n0.m11273G0(m28424k), ""));
                }
                json.put("hint", C4634n0.m11313k(C4634n0.m11273G0(m28422i), ""));
                if (tag != null) {
                    json.put("tag", C4634n0.m11313k(C4634n0.m11273G0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", C4634n0.m11313k(C4634n0.m11273G0(contentDescription.toString()), ""));
                }
                json.put("dimension", f23243a.m28418e(view));
            } catch (JSONException e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(f23244b, e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9545f.class);
        }
    }

    /* renamed from: p */
    public final boolean m28432p(View view, View view2) {
        View m28425l;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            C9322n.m27781e(view, "view");
            if (!C9322n.m27777a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (m28425l = m28425l(m28426m(view), view2)) == null) {
                return false;
            }
            return m28425l.getId() == view.getId();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }
}
