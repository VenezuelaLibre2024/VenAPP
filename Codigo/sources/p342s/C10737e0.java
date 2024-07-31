package p342s;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: s.e0 */
/* loaded from: classes.dex */
public class C10737e0 implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final Map<String, Size> f27172a;

    static {
        HashMap hashMap = new HashMap();
        f27172a = hashMap;
        hashMap.put("REDMI NOTE 8", new Size(1080, 2340));
        hashMap.put("REDMI NOTE 7", new Size(1080, 2340));
        hashMap.put("SM-A207M", new Size(720, 1560));
        hashMap.put("REDMI NOTE 7S", new Size(1080, 2340));
        hashMap.put("SM-A127F", new Size(720, 1600));
        hashMap.put("SM-A536E", new Size(1080, 2400));
        hashMap.put("220233L2I", new Size(720, 1600));
        hashMap.put("V2149", new Size(720, 1600));
        hashMap.put("VIVO 1920", new Size(1080, 2340));
        hashMap.put("CPH2223", new Size(1080, 2400));
        hashMap.put("V2029", new Size(720, 1600));
        hashMap.put("CPH1901", new Size(720, 1520));
        hashMap.put("REDMI Y3", new Size(720, 1520));
        hashMap.put("SM-A045M", new Size(720, 1600));
        hashMap.put("SM-A146U", new Size(1080, 2408));
        hashMap.put("CPH1909", new Size(720, 1520));
        hashMap.put("NOKIA 4.2", new Size(720, 1520));
        hashMap.put("SM-G960U1", new Size(1440, 2960));
        hashMap.put("SM-A137F", new Size(1080, 2408));
        hashMap.put("VIVO 1816", new Size(720, 1520));
        hashMap.put("INFINIX X6817", new Size(720, 1612));
        hashMap.put("SM-A037F", new Size(720, 1600));
        hashMap.put("NOKIA 2.4", new Size(720, 1600));
        hashMap.put("SM-A125M", new Size(720, 1600));
        hashMap.put("INFINIX X670", new Size(1080, 2400));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m32681b() {
        return f27172a.containsKey(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: a */
    public Size m32682a() {
        return f27172a.get(Build.MODEL.toUpperCase(Locale.US));
    }
}