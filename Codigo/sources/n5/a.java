package n5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import j5.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a implements m5.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f21800a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21801b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.CompressFormat f21802c;

    public a(int i10) {
        this.f21800a = i10;
        int type = getType();
        this.f21801b = type != 1 ? type != 3 ? "jpeg" : "webp" : "png";
        int type2 = getType();
        this.f21802c = type2 != 1 ? type2 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    private final byte[] c(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i14;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float width = decodeByteArray.getWidth();
        float height = decodeByteArray.getHeight();
        p5.a.a("src width = " + width);
        p5.a.a("src height = " + height);
        n.b(decodeByteArray);
        float a10 = k5.a.a(decodeByteArray, i10, i11);
        p5.a.a("scale = " + a10);
        float f10 = width / a10;
        float f11 = height / a10;
        p5.a.a("dst width = " + f10);
        p5.a.a("dst height = " + f11);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, (int) f10, (int) f11, true);
        n.d(createScaledBitmap, "createScaledBitmap(...)");
        k5.a.f(createScaledBitmap, i13).compress(this.f21802c, i12, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        n.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // m5.a
    public void a(Context context, byte[] byteArray, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14) {
        n.e(context, "context");
        n.e(byteArray, "byteArray");
        n.e(outputStream, "outputStream");
        byte[] c10 = c(byteArray, i10, i11, i12, i13, i14);
        if (!z10 || this.f21802c != Bitmap.CompressFormat.JPEG) {
            outputStream.write(c10);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(c10);
        outputStream.write(new b(byteArray).c(context, byteArrayOutputStream).toByteArray());
    }

    @Override // m5.a
    public void b(Context context, String path, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        n.e(context, "context");
        n.e(path, "path");
        n.e(outputStream, "outputStream");
        if (i15 <= 0) {
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = i14;
            Bitmap decodeFile = BitmapFactory.decodeFile(path, options);
            n.b(decodeFile);
            byte[] c10 = k5.a.c(decodeFile, i10, i11, i12, i13, getType());
            if (z10) {
                try {
                    if (this.f21802c == Bitmap.CompressFormat.JPEG) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(c10);
                        outputStream.write(new b(path).c(context, byteArrayOutputStream).toByteArray());
                    }
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    b(context, path, outputStream, i10, i11, i12, i13, z10, i14 * 2, i15 - 1);
                    return;
                }
            }
            outputStream.write(c10);
        } catch (OutOfMemoryError unused2) {
        }
    }

    @Override // m5.a
    public int getType() {
        return this.f21800a;
    }
}
