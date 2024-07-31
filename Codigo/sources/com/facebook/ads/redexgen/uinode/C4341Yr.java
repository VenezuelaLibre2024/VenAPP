package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yr */
/* loaded from: assets/audience_network.dex */
public class C4341Yr implements InterfaceC22570L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C4336Ym A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, 11, 9};
    }

    static {
        A01();
    }

    public C4341Yr(C4336Ym c4336Ym) {
        this.A00 = c4336Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22570L
    public final void A9U(Throwable th2) {
        this.A00.A07().A9a(A00(0, 5, 0), AbstractC27248A.A1e, new C27258B(th2));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22570L
    public final void A9f(Throwable th2) {
        this.A00.A07().A9a(A00(0, 5, 0), AbstractC27248A.A1g, new C27258B(th2));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22570L
    public final void AEP(String str, int i10, String str2, Long l10, Long l11, C224206 c224206) {
        C26446f.A05(this.A00, c224206.A06, c224206.A08, c224206.A09, c224206.A07, c224206.A03, i10, str2, l10, l11, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22570L
    public final void AEQ(String str, boolean z10, C224206 c224206) {
        C26446f.A04(this.A00, new C26436e(c224206.A06, c224206.A08, c224206.A07, c224206.A03, str), z10);
    }
}
