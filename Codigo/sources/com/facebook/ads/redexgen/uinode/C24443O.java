package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.3O */
/* loaded from: assets/audience_network.dex */
public final class C24443O<E> extends AbstractC26526o implements InterfaceC3216GV<E, CharSequence> {
    public static byte[] A01;
    public static String[] A02 = {"7n1nul8w2EAb09s1AdqamdfeGaXd5gmH", "GpiebuOGsEEpf3DqUf1vnefMt5fmLinC", "3DtaQpmEzd1vh6Dd0xbolmU65YZw1ev5", "PMz", "vDQxIfOJeMhAe5Bpktym5ncbe5w1slwK", "y6FPsneRxMisShL3HlOfhNVNBNHqoJdE", "9VnujNnVPcpXZRfqqPawBWWI7m", "6ZE8cL4JQOiVQwXvGO4YLo0pGNYShbf4"};
    public final /* synthetic */ AbstractC3245H0<E> A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24443O(AbstractC3245H0<? extends E> abstractC3245H0) {
        super(1);
        this.A00 = abstractC3245H0;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-66, 10, -2, -1, 9, -74, -39, 5, 2, 2, -5, -7, 10, -1, 5, 4, -65};
    }

    static {
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3216GV
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final CharSequence A8v(E e10) {
        String A012 = e10 == this.A00 ? A01(0, 17, 114) : String.valueOf(e10);
        String[] strArr = A02;
        if (strArr[4].charAt(4) == strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        A02[6] = "J9NkCD6vznRVQZjZ9Dx0ZPV";
        return A012;
    }
}