package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1334Vx implements InterfaceC0950Gu {
    public static byte[] A00;
    public static final InterfaceC0949Gt A01;
    public static final C1334Vx A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, 26, 26, 14, 87, 4, 24, 2, 5, 20, 18};
    }

    static {
        A01();
        A02 = new C1334Vx();
        A01 = new C1335Vy();
    }

    public C1334Vx() {
    }

    public /* synthetic */ C1334Vx(C1335Vy c1335Vy) {
        this();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final Uri A8E() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final long ADl(C0954Gy c0954Gy) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}
