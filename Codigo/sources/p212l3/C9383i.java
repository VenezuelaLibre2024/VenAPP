package p212l3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: l3.i */
/* loaded from: classes.dex */
public final class C9383i {

    /* renamed from: a */
    private final int f22720a;

    /* renamed from: b */
    private final int f22721b;

    /* renamed from: c */
    private final Context f22722c;

    /* renamed from: d */
    private final int f22723d;

    /* renamed from: l3.i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i */
        static final int f22724i;

        /* renamed from: a */
        final Context f22725a;

        /* renamed from: b */
        ActivityManager f22726b;

        /* renamed from: c */
        c f22727c;

        /* renamed from: e */
        float f22729e;

        /* renamed from: d */
        float f22728d = 2.0f;

        /* renamed from: f */
        float f22730f = 0.4f;

        /* renamed from: g */
        float f22731g = 0.33f;

        /* renamed from: h */
        int f22732h = 4194304;

        static {
            f22724i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f22729e = f22724i;
            this.f22725a = context;
            this.f22726b = (ActivityManager) context.getSystemService("activity");
            this.f22727c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C9383i.m27910e(this.f22726b)) {
                return;
            }
            this.f22729e = 0.0f;
        }

        /* renamed from: a */
        public C9383i m27915a() {
            return new C9383i(this);
        }
    }

    /* renamed from: l3.i$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final DisplayMetrics f22733a;

        b(DisplayMetrics displayMetrics) {
            this.f22733a = displayMetrics;
        }

        @Override // p212l3.C9383i.c
        /* renamed from: a */
        public int mo27916a() {
            return this.f22733a.heightPixels;
        }

        @Override // p212l3.C9383i.c
        /* renamed from: b */
        public int mo27917b() {
            return this.f22733a.widthPixels;
        }
    }

    /* renamed from: l3.i$c */
    /* loaded from: classes.dex */
    interface c {
        /* renamed from: a */
        int mo27916a();

        /* renamed from: b */
        int mo27917b();
    }

    C9383i(a aVar) {
        this.f22722c = aVar.f22725a;
        int i10 = m27910e(aVar.f22726b) ? aVar.f22732h / 2 : aVar.f22732h;
        this.f22723d = i10;
        int m27909c = m27909c(aVar.f22726b, aVar.f22730f, aVar.f22731g);
        float mo27917b = aVar.f22727c.mo27917b() * aVar.f22727c.mo27916a() * 4;
        int round = Math.round(aVar.f22729e * mo27917b);
        int round2 = Math.round(mo27917b * aVar.f22728d);
        int i11 = m27909c - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f22721b = round2;
            this.f22720a = round;
        } else {
            float f10 = i11;
            float f11 = aVar.f22729e;
            float f12 = aVar.f22728d;
            float f13 = f10 / (f11 + f12);
            this.f22721b = Math.round(f12 * f13);
            this.f22720a = Math.round(f13 * aVar.f22729e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(m27911f(this.f22721b));
            sb2.append(", pool size: ");
            sb2.append(m27911f(this.f22720a));
            sb2.append(", byte array size: ");
            sb2.append(m27911f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > m27909c);
            sb2.append(", max size: ");
            sb2.append(m27911f(m27909c));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f22726b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(m27910e(aVar.f22726b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    /* renamed from: c */
    private static int m27909c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * RecognitionOptions.UPC_E * RecognitionOptions.UPC_E;
        if (m27910e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    /* renamed from: e */
    static boolean m27910e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: f */
    private String m27911f(int i10) {
        return Formatter.formatFileSize(this.f22722c, i10);
    }

    /* renamed from: a */
    public int m27912a() {
        return this.f22723d;
    }

    /* renamed from: b */
    public int m27913b() {
        return this.f22720a;
    }

    /* renamed from: d */
    public int m27914d() {
        return this.f22721b;
    }
}
