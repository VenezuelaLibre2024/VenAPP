package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Lx */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3545Lx {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC3544Lw enumC3544Lw) {
        byte[] decode = Base64.decode(enumC3544Lw.A00(AbstractC3499LD.A02), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap A02(EnumC3544Lw enumC3544Lw) {
        byte[] decode = Base64.decode(enumC3544Lw.A00(AbstractC3499LD.A02), 0);
        return A00(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static Drawable A03(C4337Yn c4337Yn, EnumC3544Lw enumC3544Lw) {
        return new BitmapDrawable(c4337Yn.getResources(), A01(enumC3544Lw));
    }
}