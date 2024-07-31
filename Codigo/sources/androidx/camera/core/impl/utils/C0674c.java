package androidx.camera.core.impl.utils;

import p407w.C12029o0;

/* renamed from: androidx.camera.core.impl.utils.c */
/* loaded from: classes.dex */
public final class C0674c {
    /* renamed from: a */
    public static int m3258a(int i10, int i11, boolean z10) {
        int i12 = (z10 ? (i11 - i10) + 360 : i11 + i10) % 360;
        if (C12029o0.m38643f("CameraOrientationUtil")) {
            C12029o0.m38638a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)));
        }
        return i12;
    }

    /* renamed from: b */
    public static int m3259b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i10);
    }
}
