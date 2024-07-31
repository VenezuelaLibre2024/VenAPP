package p302q3;

import android.graphics.Bitmap;
import p129h3.C7623g;
import p129h3.C7624h;
import p129h3.EnumC7619c;
import p129h3.InterfaceC7627k;
import p193k3.InterfaceC9139b;

/* renamed from: q3.c */
/* loaded from: classes.dex */
public class C10232c implements InterfaceC7627k<Bitmap> {

    /* renamed from: b */
    public static final C7623g<Integer> f25384b = C7623g.m23142f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C7623g<Bitmap.CompressFormat> f25385c = C7623g.m23141e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    private final InterfaceC9139b f25386a;

    public C10232c(InterfaceC9139b interfaceC9139b) {
        this.f25386a = interfaceC9139b;
    }

    /* renamed from: d */
    private Bitmap.CompressFormat m30592d(Bitmap bitmap, C7624h c7624h) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c7624h.m23147c(f25385c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p129h3.InterfaceC7627k
    /* renamed from: a */
    public EnumC7619c mo23153a(C7624h c7624h) {
        return EnumC7619c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #2 {all -> 0x00c2, blocks: (B:3:0x0021, B:15:0x004b, B:18:0x006c, B:20:0x0072, B:46:0x00be, B:44:0x00c1, B:38:0x0067), top: B:2:0x0021 }] */
    @Override // p129h3.InterfaceC7620d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo23137b(p171j3.InterfaceC8975v<android.graphics.Bitmap> r8, java.io.File r9, p129h3.C7624h r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.m30592d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p055d4.C6843b.m19777d(r4, r2, r3, r1)
            long r2 = p036c4.C1866g.m9934b()     // Catch: java.lang.Throwable -> Lc2
            h3.g<java.lang.Integer> r4 = p302q3.C10232c.f25384b     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r4 = r10.m23147c(r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc2
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc2
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            k3.b r9 = r7.f25386a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            if (r9 == 0) goto L44
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            k3.b r5 = r7.f25386a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r5 = r9
            goto L45
        L44:
            r5 = r6
        L45:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r5.close()     // Catch: java.io.IOException -> L4e java.lang.Throwable -> Lc2
        L4e:
            r9 = 1
            goto L6b
        L50:
            r8 = move-exception
            r5 = r6
            goto Lbc
        L53:
            r9 = move-exception
            r5 = r6
            goto L59
        L56:
            r8 = move-exception
            goto Lbc
        L58:
            r9 = move-exception
        L59:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L65
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r9)     // Catch: java.lang.Throwable -> L56
        L65:
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.io.IOException -> L6a java.lang.Throwable -> Lc2
        L6a:
            r9 = 0
        L6b:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> Lc2
            if (r4 == 0) goto Lb8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r4.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "Compressed with type: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = " of size "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            int r1 = p036c4.C1871l.m9959h(r8)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = " in "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            double r1 = p036c4.C1866g.m9933a(r2)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = ", options format: "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            h3.g<android.graphics.Bitmap$CompressFormat> r1 = p302q3.C10232c.f25385c     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = r10.m23147c(r1)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r10)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = ", hasAlpha: "
            r4.append(r10)     // Catch: java.lang.Throwable -> Lc2
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> Lc2
            r4.append(r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> Lc2
            android.util.Log.v(r0, r8)     // Catch: java.lang.Throwable -> Lc2
        Lb8:
            p055d4.C6843b.m19778e()
            return r9
        Lbc:
            if (r5 == 0) goto Lc1
            r5.close()     // Catch: java.io.IOException -> Lc1 java.lang.Throwable -> Lc2
        Lc1:
            throw r8     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r8 = move-exception
            p055d4.C6843b.m19778e()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p302q3.C10232c.mo23137b(j3.v, java.io.File, h3.h):boolean");
    }
}
