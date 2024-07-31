package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Tl */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC4029Tl extends AbstractC3667Nv implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C4337Yn A05;
    public C3495L9 A06;
    public C4031Tn A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final C3663Nr A0B;
    public final Map<String, String> A0C;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A0E[2].length() != 4) {
                throw new RuntimeException();
            }
            A0E[3] = "DG";
            copyOfRange[i13] = (byte) (i14 ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{3, 12, 9, 3, 11, 63, 19, 15, 21, 18, 3, 5, 8, 12, 67, 3, 11, 29, 29, 11, 0, 9, 11, 28, Byte.MAX_VALUE, 121, 111, 120, 105, 102, 99, 105, 97};
    }

    static {
        A07();
        A0F = (int) (AbstractC3499LD.A02 * 24.0f);
    }

    public ViewOnClickListenerC4029Tl(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, C23221P c23221p, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, C3872RE c3872re, C3528Lg c3528Lg) {
        this(c4337Yn, abstractC4476b5.A0L(), c23221p, abstractC4476b5.A0x().A0F().A06(), interfaceC3369J2, interfaceC3560MC, c3872re, c3528Lg, abstractC4476b5.A0y());
        this.A0B.A04(abstractC4476b5);
    }

    public ViewOnClickListenerC4029Tl(C4337Yn c4337Yn, String str, C23221P c23221p, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, C3872RE c3872re, C3528Lg c3528Lg, C23271U c23271u) {
        this(c4337Yn, str, c23221p, false, interfaceC3369J2, interfaceC3560MC, c3872re, c3528Lg, c23271u);
    }

    public ViewOnClickListenerC4029Tl(C4337Yn c4337Yn, String str, C23221P c23221p, boolean z10, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, C3872RE c3872re, C3528Lg c3528Lg, C23271U c23271u) {
        super(c4337Yn, c23221p);
        this.A0C = new HashMap();
        this.A05 = c4337Yn;
        this.A0A = z10;
        this.A0B = new C3663Nr(c4337Yn, str, c3872re, c3528Lg, interfaceC3369J2, c23271u, interfaceC3560MC);
        setOnClickListener(this);
        AbstractC3536Lo.A0G(AdError.NO_FILL_ERROR_CODE, this);
    }

    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A05() {
        String str;
        if (this.A0A && (str = this.A09) != null) {
            this.A02 = A03(AbstractC3545Lx.A03(this.A05, str.contains(A04(12, 12, 61)) ? EnumC3544Lw.MESSENGER : EnumC3544Lw.WHATSAPP));
            this.A03 = new Paint();
            int i10 = A0F;
            setPadding(i10, 0, i10, 0);
        }
    }

    private void A06() {
        C3495L9 c3495l9 = this.A06;
        if (c3495l9 != null) {
            c3495l9.A06();
        }
        C4031Tn c4031Tn = this.A07;
        if (c4031Tn != null) {
            c4031Tn.A04();
        }
    }

    public static boolean A08(AbstractC4476b5 abstractC4476b5) {
        return ((long) abstractC4476b5.A0u()) > 0 && abstractC4476b5.A0s() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 51), str);
        this.A0B.A07(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC4476b5 abstractC4476b5, AbstractC3559MB abstractC3559MB) {
        if (this.A06 != null || !A08(abstractC4476b5) || abstractC4476b5.A11().A01() == null || abstractC4476b5.A11().A00() == null) {
            return false;
        }
        this.A07 = new C4031Tn(abstractC4476b5.A0s(), abstractC4476b5.A0u(), abstractC4476b5.A0t(), abstractC4476b5.A11().A01(), abstractC4476b5.A11().A00(), abstractC3559MB, this);
        C3495L9 c3495l9 = new C3495L9(abstractC4476b5.A0u(), this.A07);
        this.A06 = c3495l9;
        c3495l9.A07();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 89));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            int width = this.A02.getWidth();
            this.A01 = width;
            this.A00 = 12;
            int shift = (width + 12) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width2 = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f10 = width2 - textWidth;
            float textWidth2 = this.A00;
            int i10 = (int) (f10 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i10, top, i10 + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            A06();
        }
    }

    public void setCreativeAsCtaLoggingHelper(C3688OG c3688og) {
        this.A0B.A06(c3688og);
    }

    public void setCta(C23231Q c23231q, String str, Map<String, String> extraData) {
        setCta(c23231q, str, extraData, null);
    }

    public void setCta(C23231Q c23231q, String str, Map<String, String> extraData, InterfaceC3662Nq interfaceC3662Nq) {
        this.A08 = str;
        this.A09 = c23231q.A05();
        this.A0C.putAll(extraData);
        this.A0B.A05(interfaceC3662Nq);
        String A04 = c23231q.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z10) {
        this.A0B.A08(z10);
    }
}
