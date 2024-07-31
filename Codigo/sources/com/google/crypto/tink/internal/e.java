package com.google.crypto.tink.internal;

import vb.i0;
import vb.y;

/* loaded from: classes2.dex */
public final class e extends jb.g {

    /* renamed from: a, reason: collision with root package name */
    private final o f11286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11287a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11288b;

        static {
            int[] iArr = new int[y.c.values().length];
            f11288b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11288b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i0.values().length];
            f11287a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11287a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11287a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11287a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(o oVar, jb.y yVar) {
        a(oVar, yVar);
        this.f11286a = oVar;
    }

    private static void a(o oVar, jb.y yVar) {
        int i10 = a.f11288b[oVar.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            jb.y.b(yVar);
        }
    }
}
