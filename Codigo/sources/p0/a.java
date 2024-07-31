package p0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {

    /* renamed from: p0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0375a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22742a;

        static {
            int[] iArr = new int[b.EnumC0033b.values().length];
            f22742a = iArr;
            try {
                iArr[b.EnumC0033b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22742a[b.EnumC0033b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22742a[b.EnumC0033b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22742a[b.EnumC0033b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22742a[b.EnumC0033b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22742a[b.EnumC0033b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22742a[b.EnumC0033b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.b bVar, View view, float[] fArr) {
        StringBuilder sb2;
        String str;
        Class<?> cls = view.getClass();
        String str2 = "set" + bVar.b();
        try {
            boolean z10 = true;
            switch (C0375a.f22742a[bVar.c().ordinal()]) {
                case 1:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str2, Drawable.class);
                    int a10 = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(a10);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + bVar.b());
                case 6:
                    Method method2 = cls.getMethod(str2, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    objArr[0] = Boolean.valueOf(z10);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            e = e10;
            sb2 = new StringBuilder();
            str = "cannot access method ";
            sb2.append(str);
            sb2.append(str2);
            sb2.append(" on View \"");
            sb2.append(androidx.constraintlayout.motion.widget.a.b(view));
            sb2.append("\"");
            Log.e("CustomSupport", sb2.toString());
            e.printStackTrace();
        } catch (NoSuchMethodException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "no method ";
            sb2.append(str);
            sb2.append(str2);
            sb2.append(" on View \"");
            sb2.append(androidx.constraintlayout.motion.widget.a.b(view));
            sb2.append("\"");
            Log.e("CustomSupport", sb2.toString());
            e.printStackTrace();
        } catch (InvocationTargetException e12) {
            e = e12;
            e.printStackTrace();
        }
    }
}
