package s;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.s1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import w.o0;

/* loaded from: classes.dex */
public class n implements s1 {
    private List<Size> b(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    private List<Size> c(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> d(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> e(String str, int i10, Class<?> cls) {
        Size size;
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                size = new Size(1920, 1080);
            } else if (i10 == 35) {
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                size = new Size(1920, 1080);
            }
            arrayList.add(size);
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
            size = new Size(1920, 1080);
            arrayList.add(size);
        }
        return arrayList;
    }

    private List<Size> f(String str, int i10, Class<?> cls) {
        Size size;
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                size = new Size(1920, 1080);
            } else if (i10 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                size = new Size(1920, 1080);
            }
            arrayList.add(size);
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
            arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
            size = new Size(1920, 1080);
            arrayList.add(size);
        }
        return arrayList;
    }

    private static boolean g() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean h() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean i() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean j() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "J7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean k() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l() {
        return h() || i() || g() || k() || j();
    }

    public List<Size> a(String str, int i10) {
        if (h()) {
            return c(str, i10);
        }
        if (i()) {
            return d(str, i10);
        }
        if (g()) {
            return b(str, i10, null);
        }
        if (k()) {
            return f(str, i10, null);
        }
        if (j()) {
            return e(str, i10, null);
        }
        o0.k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
