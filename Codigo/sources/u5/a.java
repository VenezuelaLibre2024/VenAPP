package u5;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import mk.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final C0445a f27107a = new C0445a(null);

    /* renamed from: u5.a$a */
    /* loaded from: classes.dex */
    public static final class C0445a {
        private C0445a() {
        }

        public /* synthetic */ C0445a(g gVar) {
            this();
        }
    }

    private final File b(Context context, v5.a aVar, boolean z10) {
        return new File(context.getCacheDir(), "pm_" + aVar.e() + (z10 ? "_o" : "") + '_' + aVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r7 = dk.m.r(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.n.e(r7, r0)
            java.io.File r7 = r7.getCacheDir()
            if (r7 == 0) goto L40
            java.io.File[] r7 = r7.listFiles()
            if (r7 == 0) goto L40
            java.util.List r7 = dk.i.r(r7)
            if (r7 != 0) goto L18
            goto L40
        L18:
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r7.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.n.d(r1, r2)
            r2 = 2
            r3 = 0
            java.lang.String r4 = "pm_"
            r5 = 0
            boolean r1 = xk.g.E(r1, r4, r5, r2, r3)
            if (r1 == 0) goto L1c
            r0.delete()
            goto L1c
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.a.a(android.content.Context):void");
    }

    public final File c(Context context, v5.a assetEntity, boolean z10) {
        n.e(context, "context");
        n.e(assetEntity, "assetEntity");
        long e10 = assetEntity.e();
        File b10 = b(context, assetEntity, z10);
        if (b10.exists()) {
            return b10;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri r10 = x5.a.f30399b.r(e10, assetEntity.m(), z10);
        if (n.a(r10, Uri.EMPTY)) {
            return null;
        }
        try {
            b6.a.d("Caching " + e10 + " [origin: " + z10 + "] into " + b10.getAbsolutePath());
            InputStream openInputStream = contentResolver.openInputStream(r10);
            FileOutputStream fileOutputStream = new FileOutputStream(b10);
            if (openInputStream != null) {
                try {
                    try {
                        mk.a.b(openInputStream, fileOutputStream, 0, 2, null);
                        b.a(openInputStream, null);
                    } finally {
                    }
                } finally {
                }
            }
            b.a(fileOutputStream, null);
            return b10;
        } catch (Exception e11) {
            b6.a.c("Caching " + e10 + " [origin: " + z10 + "] error", e11);
            return null;
        }
    }
}
