package o5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import e1.e;
import java.io.File;
import java.io.OutputStream;
import kotlin.jvm.internal.n;
import mk.i;

/* loaded from: classes.dex */
public final class a implements m5.a {
    private final void c(String str, int i10, int i11, int i12, int i13, int i14, String str2) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str, f(i14));
        n.b(decodeFile);
        e(decodeFile, i10, i11, i13, str2, i12);
    }

    private final void d(byte[] bArr, int i10, int i11, int i12, int i13, int i14, String str) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, f(i14));
        n.b(decodeByteArray);
        e(decodeByteArray, i10, i11, i13, str, i12);
    }

    private final void e(Bitmap bitmap, int i10, int i11, int i12, String str, int i13) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        p5.a.a("src width = " + width);
        p5.a.a("src height = " + height);
        float a10 = k5.a.a(bitmap, i10, i11);
        p5.a.a("scale = " + a10);
        float f10 = width / a10;
        float f11 = height / a10;
        p5.a.a("dst width = " + f10);
        p5.a.a("dst height = " + f11);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f10, (int) f11, true);
        n.d(createScaledBitmap, "createScaledBitmap(...)");
        Bitmap f12 = k5.a.f(createScaledBitmap, i12);
        e a11 = new e.b(str, f12.getWidth(), f12.getHeight(), 2).c(i13).b(1).a();
        a11.j();
        a11.a(f12);
        a11.l(5000L);
        a11.close();
    }

    private final BitmapFactory.Options f(int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i10;
        return options;
    }

    @Override // m5.a
    public void a(Context context, byte[] byteArray, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14) {
        byte[] a10;
        n.e(context, "context");
        n.e(byteArray, "byteArray");
        n.e(outputStream, "outputStream");
        File a11 = q5.a.f23554a.a(context);
        String absolutePath = a11.getAbsolutePath();
        n.d(absolutePath, "getAbsolutePath(...)");
        d(byteArray, i10, i11, i12, i13, i14, absolutePath);
        a10 = i.a(a11);
        outputStream.write(a10);
    }

    @Override // m5.a
    public void b(Context context, String path, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        byte[] a10;
        n.e(context, "context");
        n.e(path, "path");
        n.e(outputStream, "outputStream");
        File a11 = q5.a.f23554a.a(context);
        String absolutePath = a11.getAbsolutePath();
        n.d(absolutePath, "getAbsolutePath(...)");
        c(path, i10, i11, i12, i13, i14, absolutePath);
        a10 = i.a(a11);
        outputStream.write(a10);
    }

    @Override // m5.a
    public int getType() {
        return 2;
    }
}
