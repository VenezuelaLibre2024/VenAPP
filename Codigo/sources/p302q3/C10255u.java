package p302q3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q3.u */
/* loaded from: classes.dex */
public final class C10255u {

    /* renamed from: g */
    public static final boolean f25440g;

    /* renamed from: h */
    public static final boolean f25441h;

    /* renamed from: i */
    private static final File f25442i;

    /* renamed from: j */
    private static volatile C10255u f25443j;

    /* renamed from: k */
    private static volatile int f25444k;

    /* renamed from: b */
    private final int f25446b;

    /* renamed from: c */
    private final int f25447c;

    /* renamed from: d */
    private int f25448d;

    /* renamed from: e */
    private boolean f25449e = true;

    /* renamed from: f */
    private final AtomicBoolean f25450f = new AtomicBoolean(false);

    /* renamed from: a */
    private final boolean f25445a = m30698f();

    static {
        int i10 = Build.VERSION.SDK_INT;
        f25440g = i10 < 29;
        f25441h = i10 >= 26;
        f25442i = new File("/proc/self/fd");
        f25444k = -1;
    }

    C10255u() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f25446b = 20000;
            this.f25447c = 0;
        } else {
            this.f25446b = 700;
            this.f25447c = RecognitionOptions.ITF;
        }
    }

    /* renamed from: a */
    private boolean m30694a() {
        return f25440g && !this.f25450f.get();
    }

    /* renamed from: b */
    public static C10255u m30695b() {
        if (f25443j == null) {
            synchronized (C10255u.class) {
                if (f25443j == null) {
                    f25443j = new C10255u();
                }
            }
        }
        return f25443j;
    }

    /* renamed from: c */
    private int m30696c() {
        return f25444k != -1 ? f25444k : this.f25446b;
    }

    /* renamed from: d */
    private synchronized boolean m30697d() {
        boolean z10 = true;
        int i10 = this.f25448d + 1;
        this.f25448d = i10;
        if (i10 >= 50) {
            this.f25448d = 0;
            int length = f25442i.list().length;
            long m30696c = m30696c();
            if (length >= m30696c) {
                z10 = false;
            }
            this.f25449e = z10;
            if (!z10 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + m30696c);
            }
        }
        return this.f25449e;
    }

    /* renamed from: f */
    private static boolean m30698f() {
        return (m30699g() || m30700h()) ? false : true;
    }

    /* renamed from: g */
    private static boolean m30699g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m30700h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    /* renamed from: e */
    public boolean m30701e(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f25445a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f25441h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (m30694a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i12 = this.f25447c;
        if (i10 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i11 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        if (m30697d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m30702i(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        Bitmap.Config config;
        boolean m30701e = m30701e(i10, i11, z10, z11);
        if (m30701e) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return m30701e;
    }
}
