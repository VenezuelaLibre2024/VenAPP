package p195k5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C9322n;
import p131h5.C7630a;

/* renamed from: k5.a */
/* loaded from: classes.dex */
public final class C9168a {
    /* renamed from: a */
    public static final float m27078a(Bitmap bitmap, int i10, int i11) {
        C9322n.m27781e(bitmap, "<this>");
        float width = bitmap.getWidth() / i10;
        float height = bitmap.getHeight() / i11;
        m27082e("width scale = " + width);
        m27082e("height scale = " + height);
        return Math.max(1.0f, Math.min(width, height));
    }

    /* renamed from: b */
    public static final void m27079b(Bitmap bitmap, int i10, int i11, int i12, int i13, OutputStream outputStream, int i14) {
        C9322n.m27781e(bitmap, "<this>");
        C9322n.m27781e(outputStream, "outputStream");
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        m27082e("src width = " + width);
        m27082e("src height = " + height);
        float m27078a = m27078a(bitmap, i10, i11);
        m27082e("scale = " + m27078a);
        float f10 = width / m27078a;
        float f11 = height / m27078a;
        m27082e("dst width = " + f10);
        m27082e("dst height = " + f11);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f10, (int) f11, true);
        C9322n.m27780d(createScaledBitmap, "createScaledBitmap(...)");
        m27083f(createScaledBitmap, i13).compress(m27081d(i14), i12, outputStream);
    }

    /* renamed from: c */
    public static final byte[] m27080c(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        C9322n.m27781e(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m27079b(bitmap, i10, i11, i12, i13, byteArrayOutputStream, i14);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C9322n.m27780d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* renamed from: d */
    public static final Bitmap.CompressFormat m27081d(int i10) {
        return i10 != 1 ? i10 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    /* renamed from: e */
    private static final void m27082e(Object obj) {
        if (C7630a.f18015c.m23158a()) {
            if (obj == null) {
                obj = "null";
            }
            System.out.println(obj);
        }
    }

    /* renamed from: f */
    public static final Bitmap m27083f(Bitmap bitmap, int i10) {
        C9322n.m27781e(bitmap, "<this>");
        if (i10 % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        C9322n.m27778b(createBitmap);
        return createBitmap;
    }
}
