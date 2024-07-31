package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public class C0760b {

    /* renamed from: a */
    private boolean f3488a;

    /* renamed from: b */
    String f3489b;

    /* renamed from: c */
    private b f3490c;

    /* renamed from: d */
    private int f3491d;

    /* renamed from: e */
    private float f3492e;

    /* renamed from: f */
    private String f3493f;

    /* renamed from: g */
    boolean f3494g;

    /* renamed from: h */
    private int f3495h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3496a;

        static {
            int[] iArr = new int[b.values().length];
            f3496a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3496a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3496a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3496a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3496a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3496a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3496a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3496a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C0760b(C0760b c0760b, Object obj) {
        this.f3488a = false;
        this.f3489b = c0760b.f3489b;
        this.f3490c = c0760b.f3490c;
        m3840f(obj);
    }

    public C0760b(String str, b bVar, Object obj, boolean z10) {
        this.f3489b = str;
        this.f3490c = bVar;
        this.f3488a = z10;
        m3840f(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0760b> m3835a(HashMap<String, C0760b> hashMap, View view) {
        HashMap<String, C0760b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0760b c0760b = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new C0760b(c0760b, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new C0760b(c0760b, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: d */
    public static void m3836d(Context context, XmlPullParser xmlPullParser, HashMap<String, C0760b> hashMap) {
        b bVar;
        int resourceId;
        Object string;
        float f10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0769k.f4105y4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == C0769k.f4114z4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0769k.f3753J4) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == C0769k.f3678A4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == C0769k.f3696C4) {
                    bVar = b.COLOR_TYPE;
                } else if (index == C0769k.f3687B4) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C0769k.f3729G4) {
                        bVar = b.DIMENSION_TYPE;
                        f10 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C0769k.f3705D4) {
                        bVar = b.DIMENSION_TYPE;
                        f10 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C0769k.f3713E4) {
                        bVar = b.FLOAT_TYPE;
                        f10 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == C0769k.f3721F4) {
                            bVar = b.INT_TYPE;
                            resourceId = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == C0769k.f3745I4) {
                            bVar = b.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                            Object obj2 = string;
                            bVar2 = bVar;
                            obj = obj2;
                        } else if (index == C0769k.f3737H4) {
                            bVar = b.REFERENCE_TYPE;
                            resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        Object obj22 = string;
                        bVar2 = bVar;
                        obj = obj22;
                    }
                    string = Float.valueOf(f10);
                    Object obj222 = string;
                    bVar2 = bVar;
                    obj = obj222;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj2222 = string;
                bVar2 = bVar;
                obj = obj2222;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C0760b(str, bVar2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0047. Please report as an issue. */
    /* renamed from: e */
    public static void m3837e(View view, HashMap<String, C0760b> hashMap) {
        StringBuilder sb2;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0760b c0760b = hashMap.get(str);
            String str2 = c0760b.f3488a ? str : "set" + str;
            try {
                switch (a.f3496a[c0760b.f3490c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0760b.f3491d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0760b.f3494g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0760b.f3493f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0760b.f3495h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0760b.f3495h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0760b.f3491d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0760b.f3492e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0760b.f3492e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                Log.e("TransitionLayout", sb2.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cls.getName());
                sb3.append(" must have a method ");
                sb3.append(str2);
                Log.e("TransitionLayout", sb3.toString());
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                Log.e("TransitionLayout", sb2.toString());
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public String m3838b() {
        return this.f3489b;
    }

    /* renamed from: c */
    public b m3839c() {
        return this.f3490c;
    }

    /* renamed from: f */
    public void m3840f(Object obj) {
        switch (a.f3496a[this.f3490c.ordinal()]) {
            case 1:
            case 6:
                this.f3491d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f3494g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f3493f = (String) obj;
                return;
            case 4:
            case 5:
                this.f3495h = ((Integer) obj).intValue();
                return;
            case 7:
            case 8:
                this.f3492e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
