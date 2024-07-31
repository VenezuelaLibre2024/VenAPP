package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5S */
/* loaded from: assets/audience_network.dex */
public class C25705S {
    public static byte[] A04;
    public final Intent A00;
    public final C25735V A01;
    public final C4337Yn A02;
    public final InterfaceC3369J2 A03;

    static {
        A0T();
    }

    public static String A0S(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0T() {
        A04 = new byte[]{Byte.MAX_VALUE, 99, 29, 24, 35, 24, 29, 8, 29, 35, 30, 9, 18, 24, 16, 25, 88, 90, 87, 87, 94, 73, 111, 66, 75, 94, 80, 91, 82, 90, 93, 86, 87, 114, 87, 119, 82, 71, 82, 113, 70, 93, 87, 95, 86, 0, 15, 10, 18, 3, 20, 3, 2, 57, 5, 10, 15, 5, 13, 57, 2, 3, 10, 7, 31, 57, 11, 21, 52, 59, 46, 51, 44, 63, 27, 62, 30, 59, 46, 59, 24, 47, 52, 62, 54, 63, 22, 1, 19, 5, 22, 0, 1, 0, 50, 13, 0, 1, 11, 37, 0, 32, 5, 16, 5, 38, 17, 10, 0, 8, 1, 79, 80, 93, 92, 86, 102, 77, 80, 84, 92, 102, 73, 86, 85, 85, 80, 87, 94, 102, 80, 87, 77, 92, 75, 79, 88, 85};
    }

    public C25705S(C25735V c25735v, Intent intent, InterfaceC3369J2 interfaceC3369J2, C4337Yn c4337Yn) {
        this.A01 = c25735v;
        this.A00 = intent;
        this.A03 = interfaceC3369J2;
        this.A02 = c4337Yn;
    }

    public /* synthetic */ C25705S(C25735V c25735v, Intent intent, InterfaceC3369J2 interfaceC3369J2, C4337Yn c4337Yn, C25695R c25695r) {
        this(c25735v, intent, interfaceC3369J2, c4337Yn);
    }

    private C3153FU A00() {
        return (C3153FU) this.A00.getSerializableExtra(A0S(2, 14, 51));
    }

    public InterfaceC3561MD A02() {
        if (C3348Ih.A2N(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0S(45, 23, 41));
            C25735V c25735v = this.A01;
            C4337Yn c4337Yn = this.A02;
            InterfaceC3369J2 interfaceC3369J2 = this.A03;
            C4382ZW c4382zw = new C4382ZW(c25735v, null);
            Intent intent = this.A00;
            String clickDelayMs = A0S(16, 10, 116);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0S(0, 2, 29);
            }
            return new ViewOnClickListenerC2940Bi(c25735v, c4337Yn, interfaceC3369J2, c4382zw, stringExtra2, Integer.parseInt(stringExtra));
        }
        C25735V c25735v2 = this.A01;
        return new C4072UT(c25735v2, this.A02, this.A03, new C4382ZW(c25735v2, null));
    }

    public C4057UD A0G() {
        return new C4057UD(this.A02, this.A03, new C4382ZW(this.A01, null), A00(), null, new C4053U9());
    }

    public C4057UD A0H() {
        C3151FS c3151fs = (C3151FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        return new C4057UD(this.A02, this.A03, new C3099Ea(this.A01, null), c3151fs, c3151fs.A0T(), new C4052U8());
    }

    public C4054UA A0I(RelativeLayout relativeLayout) {
        C4054UA c4054ua = new C4054UA(this.A02, new C4381ZV(this), this.A03, new C4382ZW(this.A01, null));
        c4054ua.A05(relativeLayout);
        c4054ua.A04(this.A00.getIntExtra(A0S(111, 27, 118), 200));
        AbstractC3536Lo.A0M(relativeLayout, -16777216);
        return c4054ua;
    }

    public C2901B3 A0J() {
        return new C2901B3(this.A02, this.A03, new C4382ZW(this.A01, null), A00(), new C4053U9(), 1);
    }

    public C2901B3 A0K() {
        return new C2901B3(this.A02, this.A03, new C4382ZW(this.A01, null), (C3151FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new C4052U8(), 0);
    }

    public C4000TI A0L() {
        C3745PB A02;
        AbstractC4476b5 abstractC4476b5 = (AbstractC4476b5) this.A00.getSerializableExtra(A0S(68, 18, 21));
        if (abstractC4476b5 == null || (A02 = AbstractC3746PC.A02(abstractC4476b5.A0S())) == null) {
            return null;
        }
        return new C4000TI(this.A02, new C4382ZW(this.A01, null), A02, abstractC4476b5.A12());
    }

    public C3970So A0M(EnumC3438KB enumC3438KB) {
        InterfaceC3593Mj c4052u8;
        InterfaceC3560MC c3099Ea;
        C4474b3 c4474b3 = (C4474b3) this.A00.getSerializableExtra(A0S(26, 19, 124));
        if (enumC3438KB == EnumC3438KB.A04) {
            c4052u8 = new C4053U9();
            c3099Ea = new C4382ZW(this.A01, null);
        } else {
            c4052u8 = new C4052U8();
            c3099Ea = new C3099Ea(this.A01, null);
        }
        return new C3970So(this.A02, c4052u8, this.A03, c4474b3, new C26416c(this.A02), c3099Ea);
    }

    public C28099Y A0N() {
        return new C28099Y(this.A02, new C4053U9(), this.A03, A00(), new C26416c(this.A02), new C4382ZW(this.A01, null));
    }

    public C28019Q A0O() {
        return new C28019Q(this.A02, new C4053U9(), this.A03, A00(), new C26416c(this.A02), new C4382ZW(this.A01, null));
    }

    public C28019Q A0P() {
        return new C28019Q(this.A02, new C4052U8(), this.A03, (C3151FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new C26416c(this.A02), new C3099Ea(this.A01, null));
    }

    public C28009P A0Q() {
        String str;
        C3153FU A00 = A00();
        str = this.A01.A0C;
        A00.A0Z(str);
        return new C28009P(this.A02, this.A03, new C26416c(this.A02), new C4382ZW(this.A01, null), A00);
    }

    public C28009P A0R() {
        String str;
        C3151FS c3151fs = (C3151FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        str = this.A01.A0C;
        c3151fs.A0Z(str);
        return new C28009P(this.A02, this.A03, new C26416c(this.A02), new C4382ZW(this.A01, null), c3151fs);
    }

    public final C4056UC A0U() {
        return new C4056UC(this.A02, this.A01);
    }
}
