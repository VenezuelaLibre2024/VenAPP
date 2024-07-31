package p375u5;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import mk.C9601a;
import mk.C9602b;
import p024b6.C1662a;
import p395v5.C11627a;
import p435x5.C12285a;

/* renamed from: u5.a */
/* loaded from: classes.dex */
public final class C11326a {

    /* renamed from: a */
    public static final a f29409a = new a(null);

    /* renamed from: u5.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: b */
    private final File m35413b(Context context, C11627a c11627a, boolean z10) {
        return new File(context.getCacheDir(), "pm_" + c11627a.m36432e() + (z10 ? "_o" : "") + '_' + c11627a.m36429b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r7 = dk.C7021m.m20490r(r7);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35414a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C9322n.m27781e(r7, r0)
            java.io.File r7 = r7.getCacheDir()
            if (r7 == 0) goto L40
            java.io.File[] r7 = r7.listFiles()
            if (r7 == 0) goto L40
            java.util.List r7 = dk.C7013i.m20405r(r7)
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
            kotlin.jvm.internal.C9322n.m27780d(r1, r2)
            r2 = 2
            r3 = 0
            java.lang.String r4 = "pm_"
            r5 = 0
            boolean r1 = p450xk.C12515g.m40978E(r1, r4, r5, r2, r3)
            if (r1 == 0) goto L1c
            r0.delete()
            goto L1c
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p375u5.C11326a.m35414a(android.content.Context):void");
    }

    /* renamed from: c */
    public final File m35415c(Context context, C11627a assetEntity, boolean z10) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(assetEntity, "assetEntity");
        long m36432e = assetEntity.m36432e();
        File m35413b = m35413b(context, assetEntity, z10);
        if (m35413b.exists()) {
            return m35413b;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri mo39603r = C12285a.f32911b.mo39603r(m36432e, assetEntity.m36440m(), z10);
        if (C9322n.m27777a(mo39603r, Uri.EMPTY)) {
            return null;
        }
        try {
            C1662a.m9135d("Caching " + m36432e + " [origin: " + z10 + "] into " + m35413b.getAbsolutePath());
            InputStream openInputStream = contentResolver.openInputStream(mo39603r);
            FileOutputStream fileOutputStream = new FileOutputStream(m35413b);
            if (openInputStream != null) {
                try {
                    try {
                        C9601a.m28591b(openInputStream, fileOutputStream, 0, 2, null);
                        C9602b.m28593a(openInputStream, null);
                    } finally {
                    }
                } finally {
                }
            }
            C9602b.m28593a(fileOutputStream, null);
            return m35413b;
        } catch (Exception e10) {
            C1662a.m9134c("Caching " + m36432e + " [origin: " + z10 + "] error", e10);
            return null;
        }
    }
}
