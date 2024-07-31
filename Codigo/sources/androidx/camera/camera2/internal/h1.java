package androidx.camera.camera2.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h1 implements androidx.camera.core.impl.x0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2003a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2004b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2005c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Object> f2006d = new HashMap();

    public h1(String str) {
        boolean z10;
        int i10;
        this.f2004b = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            w.o0.k("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f2003a = z10;
        this.f2005c = i10;
    }
}
