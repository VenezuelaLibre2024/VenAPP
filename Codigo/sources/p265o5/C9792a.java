package p265o5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.OutputStream;
import kotlin.jvm.internal.C9322n;
import mk.C9609i;
import p072e1.C7095e;
import p195k5.C9168a;
import p233m5.InterfaceC9546a;
import p288p5.C10060a;
import p304q5.C10276a;

/* renamed from: o5.a */
/* loaded from: classes.dex */
public final class C9792a implements InterfaceC9546a {
    /* renamed from: c */
    private final void m29424c(String str, int i10, int i11, int i12, int i13, int i14, String str2) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str, m29427f(i14));
        C9322n.m27778b(decodeFile);
        m29426e(decodeFile, i10, i11, i13, str2, i12);
    }

    /* renamed from: d */
    private final void m29425d(byte[] bArr, int i10, int i11, int i12, int i13, int i14, String str) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, m29427f(i14));
        C9322n.m27778b(decodeByteArray);
        m29426e(decodeByteArray, i10, i11, i13, str, i12);
    }

    /* renamed from: e */
    private final void m29426e(Bitmap bitmap, int i10, int i11, int i12, String str, int i13) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        C10060a.m30005a("src width = " + width);
        C10060a.m30005a("src height = " + height);
        float m27078a = C9168a.m27078a(bitmap, i10, i11);
        C10060a.m30005a("scale = " + m27078a);
        float f10 = width / m27078a;
        float f11 = height / m27078a;
        C10060a.m30005a("dst width = " + f10);
        C10060a.m30005a("dst height = " + f11);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f10, (int) f11, true);
        C9322n.m27780d(createScaledBitmap, "createScaledBitmap(...)");
        Bitmap m27083f = C9168a.m27083f(createScaledBitmap, i12);
        C7095e m20910a = new C7095e.b(str, m27083f.getWidth(), m27083f.getHeight(), 2).m20912c(i13).m20911b(1).m20910a();
        m20910a.m20908j();
        m20910a.m20905a(m27083f);
        m20910a.m20909l(5000L);
        m20910a.close();
    }

    /* renamed from: f */
    private final BitmapFactory.Options m29427f(int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i10;
        return options;
    }

    @Override // p233m5.InterfaceC9546a
    /* renamed from: a */
    public void mo28433a(Context context, byte[] byteArray, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14) {
        byte[] m28601a;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(byteArray, "byteArray");
        C9322n.m27781e(outputStream, "outputStream");
        File m30793a = C10276a.f25522a.m30793a(context);
        String absolutePath = m30793a.getAbsolutePath();
        C9322n.m27780d(absolutePath, "getAbsolutePath(...)");
        m29425d(byteArray, i10, i11, i12, i13, i14, absolutePath);
        m28601a = C9609i.m28601a(m30793a);
        outputStream.write(m28601a);
    }

    @Override // p233m5.InterfaceC9546a
    /* renamed from: b */
    public void mo28434b(Context context, String path, OutputStream outputStream, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        byte[] m28601a;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(path, "path");
        C9322n.m27781e(outputStream, "outputStream");
        File m30793a = C10276a.f25522a.m30793a(context);
        String absolutePath = m30793a.getAbsolutePath();
        C9322n.m27780d(absolutePath, "getAbsolutePath(...)");
        m29424c(path, i10, i11, i12, i13, i14, absolutePath);
        m28601a = C9609i.m28601a(m30793a);
        outputStream.write(m28601a);
    }

    @Override // p233m5.InterfaceC9546a
    public int getType() {
        return 2;
    }
}
