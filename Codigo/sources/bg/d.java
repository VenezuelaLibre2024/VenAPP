package bg;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.s;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a */
    private static final j f6492a = new j("MLKitImageUtils", "");

    /* renamed from: b */
    private static final d f6493b = new d();

    private d() {
    }

    public static d b() {
        return f6493b;
    }

    public com.google.android.gms.dynamic.b a(ag.a aVar) {
        Object obj;
        int f10 = aVar.f();
        if (f10 != -1) {
            if (f10 != 17) {
                if (f10 == 35) {
                    obj = aVar.h();
                } else if (f10 != 842094169) {
                    throw new qf.a("Unsupported image format: " + aVar.f(), 3);
                }
            }
            obj = (ByteBuffer) s.j(aVar.d());
        } else {
            obj = (Bitmap) s.j(aVar.c());
        }
        return com.google.android.gms.dynamic.d.h2(obj);
    }

    public int c(ag.a aVar) {
        if (aVar.f() == -1) {
            return ((Bitmap) s.j(aVar.c())).getAllocationByteCount();
        }
        if (aVar.f() == 17 || aVar.f() == 842094169) {
            return ((ByteBuffer) s.j(aVar.d())).limit();
        }
        if (aVar.f() != 35) {
            return 0;
        }
        return (((Image.Plane[]) s.j(aVar.i()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix d(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[Catch: FileNotFoundException -> 0x00c4, TryCatch #1 {FileNotFoundException -> 0x00c4, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:9:0x006d, B:10:0x0082, B:13:0x00ad, B:15:0x00b7, B:20:0x0087, B:22:0x008b, B:23:0x008e, B:24:0x0092, B:25:0x0096, B:26:0x009a, B:27:0x009e, B:28:0x00a5, B:37:0x0067, B:42:0x0055, B:59:0x00bc, B:60:0x00c3), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e(android.content.ContentResolver r11, android.net.Uri r12) {
        /*
            r10 = this;
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "MLKitImageUtils"
            android.graphics.Bitmap r9 = android.provider.MediaStore.Images.Media.getBitmap(r11, r12)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r9 == 0) goto Lbc
            java.lang.String r2 = "content"
            java.lang.String r3 = r12.getScheme()     // Catch: java.io.FileNotFoundException -> Lc4
            boolean r2 = r2.equals(r3)     // Catch: java.io.FileNotFoundException -> Lc4
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L25
            java.lang.String r2 = "file"
            java.lang.String r5 = r12.getScheme()     // Catch: java.io.FileNotFoundException -> Lc4
            boolean r2 = r2.equals(r5)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r2 != 0) goto L25
            goto L6d
        L25:
            r2 = 1
            java.io.InputStream r11 = r11.openInputStream(r12)     // Catch: java.io.IOException -> L53
            if (r11 == 0) goto L4a
            androidx.exifinterface.media.a r5 = new androidx.exifinterface.media.a     // Catch: java.lang.Throwable -> L32
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L32
            goto L4b
        L32:
            r5 = move-exception
            r11.close()     // Catch: java.lang.Throwable -> L37
            goto L49
        L37:
            r11 = move-exception
            java.lang.String r6 = "addSuppressed"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L49
            r7[r4] = r0     // Catch: java.lang.Exception -> L49
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> L49
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L49
            r6[r4] = r11     // Catch: java.lang.Exception -> L49
            r0.invoke(r5, r6)     // Catch: java.lang.Exception -> L49
        L49:
            throw r5     // Catch: java.io.IOException -> L53
        L4a:
            r5 = r3
        L4b:
            if (r11 == 0) goto L64
            r11.close()     // Catch: java.io.IOException -> L51
            goto L64
        L51:
            r11 = move-exception
            goto L55
        L53:
            r11 = move-exception
            r5 = r3
        L55:
            com.google.android.gms.common.internal.j r0 = bg.d.f6492a     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r6 = java.lang.String.valueOf(r12)     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r7 = "failed to open file to read rotation meta data: "
            java.lang.String r6 = r7.concat(r6)     // Catch: java.io.FileNotFoundException -> Lc4
            r0.d(r1, r6, r11)     // Catch: java.io.FileNotFoundException -> Lc4
        L64:
            if (r5 != 0) goto L67
            goto L6d
        L67:
            java.lang.String r11 = "Orientation"
            int r4 = r5.h(r11, r2)     // Catch: java.io.FileNotFoundException -> Lc4
        L6d:
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> Lc4
            r11.<init>()     // Catch: java.io.FileNotFoundException -> Lc4
            int r5 = r9.getWidth()     // Catch: java.io.FileNotFoundException -> Lc4
            int r6 = r9.getHeight()     // Catch: java.io.FileNotFoundException -> Lc4
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            switch(r4) {
                case 2: goto La5;
                case 3: goto L9e;
                case 4: goto L9a;
                case 5: goto L96;
                case 6: goto L92;
                case 7: goto L8b;
                case 8: goto L87;
                default: goto L85;
            }     // Catch: java.io.FileNotFoundException -> Lc4
        L85:
            r7 = r3
            goto Lab
        L87:
            r11.postRotate(r0)     // Catch: java.io.FileNotFoundException -> Lc4
            goto La3
        L8b:
            r11.postRotate(r0)     // Catch: java.io.FileNotFoundException -> Lc4
        L8e:
            r11.postScale(r7, r8)     // Catch: java.io.FileNotFoundException -> Lc4
            goto La3
        L92:
            r11.postRotate(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            goto La3
        L96:
            r11.postRotate(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            goto L8e
        L9a:
            r11.postScale(r8, r7)     // Catch: java.io.FileNotFoundException -> Lc4
            goto La3
        L9e:
            r0 = 1127481344(0x43340000, float:180.0)
            r11.postRotate(r0)     // Catch: java.io.FileNotFoundException -> Lc4
        La3:
            r7 = r11
            goto Lab
        La5:
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> Lc4
            r11.<init>()     // Catch: java.io.FileNotFoundException -> Lc4
            goto L8e
        Lab:
            if (r7 == 0) goto Lbb
            r3 = 0
            r4 = 0
            r8 = 1
            r2 = r9
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r9 == r11) goto Lbb
            r9.recycle()     // Catch: java.io.FileNotFoundException -> Lc4
            r9 = r11
        Lbb:
            return r9
        Lbc:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r0 = "The image Uri could not be resolved."
            r11.<init>(r0)     // Catch: java.io.FileNotFoundException -> Lc4
            throw r11     // Catch: java.io.FileNotFoundException -> Lc4
        Lc4:
            r11 = move-exception
            com.google.android.gms.common.internal.j r0 = bg.d.f6492a
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r2 = "Could not open file: "
            java.lang.String r12 = r2.concat(r12)
            r0.d(r1, r12, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.d.e(android.content.ContentResolver, android.net.Uri):android.graphics.Bitmap");
    }
}
