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

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3084a;

    /* renamed from: b, reason: collision with root package name */
    String f3085b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC0033b f3086c;

    /* renamed from: d, reason: collision with root package name */
    private int f3087d;

    /* renamed from: e, reason: collision with root package name */
    private float f3088e;

    /* renamed from: f, reason: collision with root package name */
    private String f3089f;

    /* renamed from: g, reason: collision with root package name */
    boolean f3090g;

    /* renamed from: h, reason: collision with root package name */
    private int f3091h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3092a;

        static {
            int[] iArr = new int[EnumC0033b.values().length];
            f3092a = iArr;
            try {
                iArr[EnumC0033b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3092a[EnumC0033b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3092a[EnumC0033b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3092a[EnumC0033b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3092a[EnumC0033b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3092a[EnumC0033b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3092a[EnumC0033b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3092a[EnumC0033b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0033b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(b bVar, Object obj) {
        this.f3084a = false;
        this.f3085b = bVar.f3085b;
        this.f3086c = bVar.f3086c;
        f(obj);
    }

    public b(String str, EnumC0033b enumC0033b, Object obj, boolean z10) {
        this.f3085b = str;
        this.f3086c = enumC0033b;
        this.f3084a = z10;
        f(obj);
    }

    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, b> hashMap) {
        EnumC0033b enumC0033b;
        int resourceId;
        Object string;
        float f10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f3454y4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0033b enumC0033b2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == k.f3463z4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == k.J4) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == k.A4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0033b2 = EnumC0033b.BOOLEAN_TYPE;
            } else {
                if (index == k.C4) {
                    enumC0033b = EnumC0033b.COLOR_TYPE;
                } else if (index == k.B4) {
                    enumC0033b = EnumC0033b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == k.G4) {
                        enumC0033b = EnumC0033b.DIMENSION_TYPE;
                        f10 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == k.D4) {
                        enumC0033b = EnumC0033b.DIMENSION_TYPE;
                        f10 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == k.E4) {
                        enumC0033b = EnumC0033b.FLOAT_TYPE;
                        f10 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == k.F4) {
                            enumC0033b = EnumC0033b.INT_TYPE;
                            resourceId = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == k.I4) {
                            enumC0033b = EnumC0033b.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                            Object obj2 = string;
                            enumC0033b2 = enumC0033b;
                            obj = obj2;
                        } else if (index == k.H4) {
                            enumC0033b = EnumC0033b.REFERENCE_TYPE;
                            resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        Object obj22 = string;
                        enumC0033b2 = enumC0033b;
                        obj = obj22;
                    }
                    string = Float.valueOf(f10);
                    Object obj222 = string;
                    enumC0033b2 = enumC0033b;
                    obj = obj222;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj2222 = string;
                enumC0033b2 = enumC0033b;
                obj = obj2222;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, enumC0033b2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0047. Please report as an issue. */
    public static void e(View view, HashMap<String, b> hashMap) {
        StringBuilder sb2;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            String str2 = bVar.f3084a ? str : "set" + str;
            try {
                switch (a.f3092a[bVar.f3086c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f3087d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f3090g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f3089f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f3091h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f3091h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f3087d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f3088e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f3088e));
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

    public String b() {
        return this.f3085b;
    }

    public EnumC0033b c() {
        return this.f3086c;
    }

    public void f(Object obj) {
        switch (a.f3092a[this.f3086c.ordinal()]) {
            case 1:
            case 6:
                this.f3087d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f3090g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f3089f = (String) obj;
                return;
            case 4:
            case 5:
                this.f3091h = ((Integer) obj).intValue();
                return;
            case 7:
            case 8:
                this.f3088e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
