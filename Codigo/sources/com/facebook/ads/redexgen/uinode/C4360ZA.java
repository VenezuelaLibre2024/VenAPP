package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ZA */
/* loaded from: assets/audience_network.dex */
public final class C4360ZA implements InterfaceC23571y {
    public static byte[] A03;
    public C25905m A00;
    public C4337Yn A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public C4360ZA(C25905m c25905m, C4337Yn c4337Yn, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c25905m;
        this.A01 = c4337Yn;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23571y
    public final void ABR(C3403Jb c3403Jb) {
        AbstractC3446KK.A00(new C4363ZD(this, c3403Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23571y
    public final void ACP(List<C4491bK> list) {
        C26416c manager = new C26416c(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C4491bK c4491bK : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c4491bK.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c4491bK.A0E().A0G() != null) {
                    manager.A0b(new C26396a(c4491bK.A0E().A0G().getUrl(), c4491bK.A0E().A0G().getHeight(), c4491bK.A0E().A0G().getWidth(), c4491bK.A0G(), A02(0, 6, 2)));
                }
                if (c4491bK.A0E().A0F() != null) {
                    manager.A0b(new C26396a(c4491bK.A0E().A0F().getUrl(), c4491bK.A0E().A0F().getHeight(), c4491bK.A0E().A0F().getWidth(), c4491bK.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c4491bK.A0E().A0d())) {
                    manager.A0a(new C26376Y(c4491bK.A0E().A0d(), c4491bK.A0G(), A02(0, 6, 2), c4491bK.A0E().A0A()));
                }
            }
        }
        manager.A0W(new C4361ZB(this, list), new C26346V(firstRequestId, A02(0, 6, 2)));
    }
}
