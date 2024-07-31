package p248n5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C9322n;
import p173j5.C8987b;
import p195k5.C9168a;
import p233m5.InterfaceC9546a;
import p288p5.C10060a;

/* renamed from: n5.a */
/* loaded from: classes.dex */
public final class C9662a implements InterfaceC9546a {

    /* renamed from: a */
    private final int f23733a;

    /* renamed from: b */
    private final String f23734b;

    /* renamed from: c */
    private final Bitmap.CompressFormat f23735c;

    public C9662a(int i10) {
        this.f23733a = i10;
        int type = getType();
        this.f23734b = type != 1 ? type != 3 ? "jpeg" : "webp" : "png";
        int type2 = getType();
        this.f23735c = type2 != 1 ? type2 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    /* renamed from: c */
    private final byte[] m28963c(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i14;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float width = decodeByteArray.getWidth();
        float height = decodeByteArray.getHeight();
        C10060a.m30005a("src width = " + width);
        C10060a.m30005a("src height = " + height);
        C9322n.m27778b(decodeByteArray);
        float m27078a = C9168a.m27078a(decodeByteArray, i10, i11);
        C10060a.m30005a("scale = " + m27078a);
        float f10 = width / m27078a;
        float f11 = height / m27078a;
        C10060a.m30005a("dst width = " + f10);
        C10060a.m30005a("dst height = " + f11);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, (int) f10, (int) f11, true);
        C9322n.m27780d(createScaledBitmap, "createScaledBitmap(...)");
        C9168a.m27083f(createScaledBitmap, i13).compress(this.f23735c, i12, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C9322n.m27780d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // p233m5.InterfaceC9546a
    /* renamed from: a */
    public void mo28433a(Context context, byte[] byteArray, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(byteArray, "byteArray");
        C9322n.m27781e(outputStream, "outputStream");
        byte[] m28963c = m28963c(byteArray, i10, i11, i12, i13, i14);
        if (!z10 || this.f23735c != Bitmap.CompressFormat.JPEG) {
            outputStream.write(m28963c);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(m28963c);
        outputStream.write(new C8987b(byteArray).m26380c(context, byteArrayOutputStream).toByteArray());
    }

    @Override // p233m5.InterfaceC9546a
    /* renamed from: b */
    public void mo28434b(Context context, String path, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(path, "path");
        C9322n.m27781e(outputStream, "outputStream");
        if (i15 <= 0) {
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = i14;
            Bitmap decodeFile = BitmapFactory.decodeFile(path, options);
            C9322n.m27778b(decodeFile);
            byte[] m27080c = C9168a.m27080c(decodeFile, i10, i11, i12, i13, getType());
            if (z10) {
                try {
                    if (this.f23735c == Bitmap.CompressFormat.JPEG) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m27080c);
                        outputStream.write(new C8987b(path).m26380c(context, byteArrayOutputStream).toByteArray());
                    }
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    mo28434b(context, path, outputStream, i10, i11, i12, i13, z10, i14 * 2, i15 - 1);
                    return;
                }
            }
            outputStream.write(m27080c);
        } catch (OutOfMemoryError unused2) {
        }
    }

    @Override // p233m5.InterfaceC9546a
    public int getType() {
        return this.f23733a;
    }
}
