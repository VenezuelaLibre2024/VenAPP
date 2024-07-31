package androidx.camera.camera2.internal;

import androidx.camera.core.impl.l2;

/* loaded from: classes.dex */
public class l3 {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2109a;

        static {
            int[] iArr = new int[l2.b.values().length];
            f2109a = iArr;
            try {
                iArr[l2.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2109a[l2.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2109a[l2.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2109a[l2.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2109a[l2.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(l2.b bVar, int i10) {
        int i11 = a.f2109a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 || i11 == 3) ? 3 : 1 : i10 == 2 ? 5 : 2;
    }

    public static int b(l2.b bVar, int i10) {
        int i11 = a.f2109a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 || i11 == 3) ? 3 : 1 : i10 == 2 ? 5 : 1;
    }
}
