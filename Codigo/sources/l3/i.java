package l3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f20898a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20899b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f20900c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20901d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f20902i;

        /* renamed from: a, reason: collision with root package name */
        final Context f20903a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f20904b;

        /* renamed from: c, reason: collision with root package name */
        c f20905c;

        /* renamed from: e, reason: collision with root package name */
        float f20907e;

        /* renamed from: d, reason: collision with root package name */
        float f20906d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f20908f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f20909g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f20910h = 4194304;

        static {
            f20902i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f20907e = f20902i;
            this.f20903a = context;
            this.f20904b = (ActivityManager) context.getSystemService("activity");
            this.f20905c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f20904b)) {
                return;
            }
            this.f20907e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f20911a;

        b(DisplayMetrics displayMetrics) {
            this.f20911a = displayMetrics;
        }

        @Override // l3.i.c
        public int a() {
            return this.f20911a.heightPixels;
        }

        @Override // l3.i.c
        public int b() {
            return this.f20911a.widthPixels;
        }
    }

    /* loaded from: classes.dex */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f20900c = aVar.f20903a;
        int i10 = e(aVar.f20904b) ? aVar.f20910h / 2 : aVar.f20910h;
        this.f20901d = i10;
        int c10 = c(aVar.f20904b, aVar.f20908f, aVar.f20909g);
        float b10 = aVar.f20905c.b() * aVar.f20905c.a() * 4;
        int round = Math.round(aVar.f20907e * b10);
        int round2 = Math.round(b10 * aVar.f20906d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f20899b = round2;
            this.f20898a = round;
        } else {
            float f10 = i11;
            float f11 = aVar.f20907e;
            float f12 = aVar.f20906d;
            float f13 = f10 / (f11 + f12);
            this.f20899b = Math.round(f12 * f13);
            this.f20898a = Math.round(f13 * aVar.f20907e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f20899b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f20898a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > c10);
            sb2.append(", max size: ");
            sb2.append(f(c10));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f20904b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f20904b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * RecognitionOptions.UPC_E * RecognitionOptions.UPC_E;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f20900c, i10);
    }

    public int a() {
        return this.f20901d;
    }

    public int b() {
        return this.f20898a;
    }

    public int d() {
        return this.f20899b;
    }
}
