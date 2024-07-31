package p151i3;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C2128a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p193k3.InterfaceC9139b;

/* renamed from: i3.e */
/* loaded from: classes.dex */
class C7786e {

    /* renamed from: f */
    private static final C7782a f18545f = new C7782a();

    /* renamed from: a */
    private final C7782a f18546a;

    /* renamed from: b */
    private final InterfaceC7785d f18547b;

    /* renamed from: c */
    private final InterfaceC9139b f18548c;

    /* renamed from: d */
    private final ContentResolver f18549d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f18550e;

    C7786e(List<ImageHeaderParser> list, C7782a c7782a, InterfaceC7785d interfaceC7785d, InterfaceC9139b interfaceC9139b, ContentResolver contentResolver) {
        this.f18546a = c7782a;
        this.f18547b = interfaceC7785d;
        this.f18548c = interfaceC9139b;
        this.f18549d = contentResolver;
        this.f18550e = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7786e(List<ImageHeaderParser> list, InterfaceC7785d interfaceC7785d, InterfaceC9139b interfaceC9139b, ContentResolver contentResolver) {
        this(list, f18545f, interfaceC7785d, interfaceC9139b, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:26:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m23753b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            i3.d r2 = r6.f18547b     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            android.database.Cursor r2 = r2.mo23752a(r7)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            if (r3 == 0) goto L1c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            r2.close()
            return r7
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            if (r2 == 0) goto L21
            r2.close()
        L21:
            return r1
        L22:
            r7 = move-exception
            goto L49
        L24:
            r3 = move-exception
            r2 = r1
        L26:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r2 == 0) goto L46
            r2.close()
        L46:
            return r1
        L47:
            r7 = move-exception
            r1 = r2
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p151i3.C7786e.m23753b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m23754c(File file) {
        return this.f18546a.m23740a(file) && 0 < this.f18546a.m23742c(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m23755a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f18549d.openInputStream(uri);
                int m10744b = C2128a.m10744b(this.f18550e, inputStream, this.f18548c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m10744b;
            } catch (IOException | NullPointerException e10) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e10);
                }
                if (inputStream == null) {
                    return -1;
                }
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused2) {
                    return -1;
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: d */
    public InputStream m23756d(Uri uri) {
        String m23753b = m23753b(uri);
        if (TextUtils.isEmpty(m23753b)) {
            return null;
        }
        File m23741b = this.f18546a.m23741b(m23753b);
        if (!m23754c(m23741b)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m23741b);
        try {
            return this.f18549d.openInputStream(fromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e10));
        }
    }
}
