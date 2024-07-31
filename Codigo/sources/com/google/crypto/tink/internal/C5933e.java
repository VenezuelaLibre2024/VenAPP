package com.google.crypto.tink.internal;

import p179jb.AbstractC9015g;
import p179jb.C9033y;
import p400vb.C11821y;
import p400vb.EnumC11802i0;

/* renamed from: com.google.crypto.tink.internal.e */
/* loaded from: classes2.dex */
public final class C5933e extends AbstractC9015g {

    /* renamed from: a */
    private final C5943o f12501a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.internal.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12502a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12503b;

        static {
            int[] iArr = new int[C11821y.c.values().length];
            f12503b = iArr;
            try {
                iArr[C11821y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12503b[C11821y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC11802i0.values().length];
            f12502a = iArr2;
            try {
                iArr2[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12502a[EnumC11802i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12502a[EnumC11802i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12502a[EnumC11802i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C5933e(C5943o c5943o, C9033y c9033y) {
        m15218a(c5943o, c9033y);
        this.f12501a = c5943o;
    }

    /* renamed from: a */
    private static void m15218a(C5943o c5943o, C9033y c9033y) {
        int i10 = a.f12503b[c5943o.m15267d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C9033y.m26540b(c9033y);
        }
    }
}
