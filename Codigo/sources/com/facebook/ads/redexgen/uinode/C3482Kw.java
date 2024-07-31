package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kw */
/* loaded from: assets/audience_network.dex */
public final class C3482Kw extends ImageView implements InterfaceC3819QN {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    public C3930SA A00;
    public final Paint A01;
    public final C4337Yn A02;
    public final C3377JA A03;
    public final AbstractC3579MV A04;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (AbstractC3499LD.A02 * 4.0f);
    }

    public C3482Kw(C4337Yn c4337Yn, C3377JA c3377ja) {
        super(c4337Yn);
        this.A04 = new AbstractC3579MV() { // from class: com.facebook.ads.redexgen.X.7S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3580MW c3580mw) {
                C3482Kw.this.A09();
            }
        };
        this.A03 = c3377ja;
        this.A02 = c4337Yn;
        Paint paint = new Paint();
        this.A01 = paint;
        paint.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A07;
        setPadding(i10, i10, i10, i10);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new ViewOnClickListenerC3833Qb(this));
    }

    private void A04() {
        setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        C3930SA c3930sa = this.A00;
        if (c3930sa != null) {
            float volume = c3930sa.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void A9R(C3930SA c3930sa) {
        this.A00 = c3930sa;
        if (c3930sa != null) {
            c3930sa.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void AGl(C3930SA c3930sa) {
        C3930SA c3930sa2 = this.A00;
        if (c3930sa2 != null) {
            c3930sa2.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y10 = getWidth() / 2;
        int x10 = getHeight() / 2;
        canvas.drawCircle(y10, x10, Math.min(y10, x10), this.A01);
        super.onDraw(canvas);
    }
}
