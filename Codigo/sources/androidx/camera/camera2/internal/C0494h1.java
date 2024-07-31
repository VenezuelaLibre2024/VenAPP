package androidx.camera.camera2.internal;

import androidx.camera.core.impl.InterfaceC0697x0;
import java.util.HashMap;
import java.util.Map;
import p407w.C12029o0;

/* renamed from: androidx.camera.camera2.internal.h1 */
/* loaded from: classes.dex */
public class C0494h1 implements InterfaceC0697x0 {

    /* renamed from: a */
    private final boolean f2306a;

    /* renamed from: b */
    private final String f2307b;

    /* renamed from: c */
    private final int f2308c;

    /* renamed from: d */
    private final Map<Integer, Object> f2309d = new HashMap();

    public C0494h1(String str) {
        boolean z10;
        int i10;
        this.f2307b = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            C12029o0.m38648k("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f2306a = z10;
        this.f2308c = i10;
    }
}
