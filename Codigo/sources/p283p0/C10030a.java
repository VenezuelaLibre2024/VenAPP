package p283p0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0744a;
import androidx.constraintlayout.widget.C0760b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: p0.a */
/* loaded from: classes.dex */
public class C10030a {

    /* renamed from: p0.a$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24675a;

        static {
            int[] iArr = new int[C0760b.b.values().length];
            f24675a = iArr;
            try {
                iArr[C0760b.b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24675a[C0760b.b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24675a[C0760b.b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24675a[C0760b.b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24675a[C0760b.b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24675a[C0760b.b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24675a[C0760b.b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    private static int m29937a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    /* renamed from: b */
    public static void m29938b(C0760b c0760b, View view, float[] fArr) {
        StringBuilder sb2;
        String str;
        Class<?> cls = view.getClass();
        String str2 = "set" + c0760b.m3838b();
        try {
            boolean z10 = true;
            switch (a.f24675a[c0760b.m3839c().ordinal()]) {
                case 1:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str2, Drawable.class);
                    int m29937a = (m29937a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m29937a((int) (fArr[3] * 255.0f)) << 24) | (m29937a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m29937a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(m29937a);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((m29937a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m29937a((int) (fArr[3] * 255.0f)) << 24) | (m29937a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m29937a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + c0760b.m3838b());
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
            sb2.append(C0744a.m3764b(view));
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
            sb2.append(C0744a.m3764b(view));
            sb2.append("\"");
            Log.e("CustomSupport", sb2.toString());
            e.printStackTrace();
        } catch (InvocationTargetException e12) {
            e = e12;
            e.printStackTrace();
        }
    }
}
