package p342s;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0665s1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p407w.C12029o0;

/* renamed from: s.n */
/* loaded from: classes.dex */
public class C10752n implements InterfaceC0665s1 {
    /* renamed from: b */
    private List<Size> m32702b(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<Size> m32703c(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<Size> m32704d(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: e */
    private List<Size> m32705e(String str, int i10, Class<?> cls) {
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

    /* renamed from: f */
    private List<Size> m32706f(String str, int i10, Class<?> cls) {
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

    /* renamed from: g */
    private static boolean m32707g() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: h */
    private static boolean m32708h() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: i */
    private static boolean m32709i() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: j */
    private static boolean m32710j() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "J7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: k */
    private static boolean m32711k() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static boolean m32712l() {
        return m32708h() || m32709i() || m32707g() || m32711k() || m32710j();
    }

    /* renamed from: a */
    public List<Size> m32713a(String str, int i10) {
        if (m32708h()) {
            return m32703c(str, i10);
        }
        if (m32709i()) {
            return m32704d(str, i10);
        }
        if (m32707g()) {
            return m32702b(str, i10, null);
        }
        if (m32711k()) {
            return m32706f(str, i10, null);
        }
        if (m32710j()) {
            return m32705e(str, i10, null);
        }
        C12029o0.m38648k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
