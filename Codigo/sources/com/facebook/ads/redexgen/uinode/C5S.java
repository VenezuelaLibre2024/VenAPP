package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5S */
/* loaded from: assets/audience_network.dex */
public class C5S {
    public static byte[] A04;
    public final Intent A00;
    public final C5V A01;
    public final C1399Yn A02;
    public final J2 A03;

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

    public C5S(C5V c5v, Intent intent, J2 j22, C1399Yn c1399Yn) {
        this.A01 = c5v;
        this.A00 = intent;
        this.A03 = j22;
        this.A02 = c1399Yn;
    }

    public /* synthetic */ C5S(C5V c5v, Intent intent, J2 j22, C1399Yn c1399Yn, C5R c5r) {
        this(c5v, intent, j22, c1399Yn);
    }

    private FU A00() {
        return (FU) this.A00.getSerializableExtra(A0S(2, 14, 51));
    }

    public MD A02() {
        if (C0988Ih.A2N(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0S(45, 23, 41));
            C5V c5v = this.A01;
            C1399Yn c1399Yn = this.A02;
            J2 j22 = this.A03;
            ZW zw = new ZW(c5v, null);
            Intent intent = this.A00;
            String clickDelayMs = A0S(16, 10, 116);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0S(0, 2, 29);
            }
            return new ViewOnClickListenerC0827Bi(c5v, c1399Yn, j22, zw, stringExtra2, Integer.parseInt(stringExtra));
        }
        C5V c5v2 = this.A01;
        return new UT(c5v2, this.A02, this.A03, new ZW(c5v2, null));
    }

    public static /* synthetic */ MD A03(C5S c5s) {
        return c5s.A0Q();
    }

    public static /* synthetic */ MD A04(C5S c5s) {
        return c5s.A0G();
    }

    public static /* synthetic */ MD A05(C5S c5s) {
        return c5s.A0L();
    }

    public static /* synthetic */ MD A06(C5S c5s) {
        return c5s.A0J();
    }

    public static /* synthetic */ MD A07(C5S c5s) {
        return c5s.A0K();
    }

    public static /* synthetic */ MD A08(C5S c5s) {
        return c5s.A0R();
    }

    public static /* synthetic */ MD A09(C5S c5s) {
        return c5s.A0P();
    }

    public static /* synthetic */ MD A0A(C5S c5s) {
        return c5s.A0H();
    }

    public static /* synthetic */ MD A0B(C5S c5s) {
        return c5s.A02();
    }

    public static /* synthetic */ MD A0C(C5S c5s) {
        return c5s.A0O();
    }

    public static /* synthetic */ MD A0D(C5S c5s) {
        return c5s.A0N();
    }

    public static /* synthetic */ MD A0E(C5S c5s, RelativeLayout relativeLayout) {
        return c5s.A0I(relativeLayout);
    }

    public static /* synthetic */ MD A0F(C5S c5s, KB kb2) {
        return c5s.A0M(kb2);
    }

    public UD A0G() {
        return new UD(this.A02, this.A03, new ZW(this.A01, null), A00(), null, new U9());
    }

    public UD A0H() {
        FS fs = (FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        return new UD(this.A02, this.A03, new C0881Ea(this.A01, null), fs, fs.A0T(), new U8());
    }

    public UA A0I(RelativeLayout relativeLayout) {
        UA ua2 = new UA(this.A02, new ZV(this), this.A03, new ZW(this.A01, null));
        ua2.A05(relativeLayout);
        ua2.A04(this.A00.getIntExtra(A0S(111, 27, 118), 200));
        AbstractC1066Lo.A0M(relativeLayout, -16777216);
        return ua2;
    }

    public B3 A0J() {
        return new B3(this.A02, this.A03, new ZW(this.A01, null), A00(), new U9(), 1);
    }

    public B3 A0K() {
        return new B3(this.A02, this.A03, new ZW(this.A01, null), (FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new U8(), 0);
    }

    public TI A0L() {
        PB A02;
        AbstractC1502b5 abstractC1502b5 = (AbstractC1502b5) this.A00.getSerializableExtra(A0S(68, 18, 21));
        if (abstractC1502b5 == null || (A02 = PC.A02(abstractC1502b5.A0S())) == null) {
            return null;
        }
        return new TI(this.A02, new ZW(this.A01, null), A02, abstractC1502b5.A12());
    }

    public C1248So A0M(KB kb2) {
        InterfaceC1087Mj u82;
        MC c0881Ea;
        C1500b3 c1500b3 = (C1500b3) this.A00.getSerializableExtra(A0S(26, 19, 124));
        if (kb2 == KB.A04) {
            u82 = new U9();
            c0881Ea = new ZW(this.A01, null);
        } else {
            u82 = new U8();
            c0881Ea = new C0881Ea(this.A01, null);
        }
        return new C1248So(this.A02, u82, this.A03, c1500b3, new C07046c(this.A02), c0881Ea);
    }

    public C9Y A0N() {
        return new C9Y(this.A02, new U9(), this.A03, A00(), new C07046c(this.A02), new ZW(this.A01, null));
    }

    public C9Q A0O() {
        return new C9Q(this.A02, new U9(), this.A03, A00(), new C07046c(this.A02), new ZW(this.A01, null));
    }

    public C9Q A0P() {
        return new C9Q(this.A02, new U8(), this.A03, (FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new C07046c(this.A02), new C0881Ea(this.A01, null));
    }

    public C9P A0Q() {
        String str;
        FU A00 = A00();
        str = this.A01.A0C;
        A00.A0Z(str);
        return new C9P(this.A02, this.A03, new C07046c(this.A02), new ZW(this.A01, null), A00);
    }

    public C9P A0R() {
        String str;
        FS fs = (FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        str = this.A01.A0C;
        fs.A0Z(str);
        return new C9P(this.A02, this.A03, new C07046c(this.A02), new ZW(this.A01, null), fs);
    }

    public final UC A0U() {
        return new UC(this.A02, this.A01);
    }
}
