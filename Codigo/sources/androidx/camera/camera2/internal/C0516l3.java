package androidx.camera.camera2.internal;

import androidx.camera.core.impl.InterfaceC0644l2;

/* renamed from: androidx.camera.camera2.internal.l3 */
/* loaded from: classes.dex */
public class C0516l3 {

    /* renamed from: androidx.camera.camera2.internal.l3$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2429a;

        static {
            int[] iArr = new int[InterfaceC0644l2.b.values().length];
            f2429a = iArr;
            try {
                iArr[InterfaceC0644l2.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2429a[InterfaceC0644l2.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2429a[InterfaceC0644l2.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2429a[InterfaceC0644l2.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2429a[InterfaceC0644l2.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static int m2551a(InterfaceC0644l2.b bVar, int i10) {
        int i11 = a.f2429a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 || i11 == 3) ? 3 : 1 : i10 == 2 ? 5 : 2;
    }

    /* renamed from: b */
    public static int m2552b(InterfaceC0644l2.b bVar, int i10) {
        int i11 = a.f2429a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 || i11 == 3) ? 3 : 1 : i10 == 2 ? 5 : 1;
    }
}
