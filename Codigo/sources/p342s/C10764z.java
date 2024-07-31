package p342s;

import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p051d0.InterfaceC6813h;

/* renamed from: s.z */
/* loaded from: classes.dex */
public final class C10764z implements InterfaceC6813h {

    /* renamed from: a */
    private static final Set<String> f27193a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32747a(C0427d0 c0427d0) {
        return f27193a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
