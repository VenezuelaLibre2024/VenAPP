package x6;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import s8.j;
import s8.n;
import t8.r0;
import x6.b0;

/* loaded from: classes.dex */
public final class j0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    private final j.a f30527a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30528b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30529c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f30530d;

    public j0(String str, boolean z10, j.a aVar) {
        t8.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f30527a = aVar;
        this.f30528b = str;
        this.f30529c = z10;
        this.f30530d = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:11|12|13|(2:15|16)(2:17|18)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = d(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r8 = r8 + 1;
        r9 = r9.a().j(r1).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        t8.r0.n(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] c(s8.j.a r8, java.lang.String r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            s8.l0 r0 = new s8.l0
            s8.j r8 = r8.a()
            r0.<init>(r8)
            s8.n$b r8 = new s8.n$b
            r8.<init>()
            s8.n$b r8 = r8.j(r9)
            s8.n$b r8 = r8.e(r11)
            r9 = 2
            s8.n$b r8 = r8.d(r9)
            s8.n$b r8 = r8.c(r10)
            r9 = 1
            s8.n$b r8 = r8.b(r9)
            s8.n r2 = r8.a()
            r8 = 0
            r9 = r2
        L2a:
            s8.l r10 = new s8.l     // Catch: java.lang.Exception -> L57
            r10.<init>(r0, r9)     // Catch: java.lang.Exception -> L57
            byte[] r8 = t8.r0.V0(r10)     // Catch: java.lang.Throwable -> L37 s8.a0 -> L39
            t8.r0.n(r10)     // Catch: java.lang.Exception -> L57
            return r8
        L37:
            r8 = move-exception
            goto L53
        L39:
            r11 = move-exception
            java.lang.String r1 = d(r11, r8)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L52
            int r8 = r8 + 1
            s8.n$b r9 = r9.a()     // Catch: java.lang.Throwable -> L37
            s8.n$b r9 = r9.j(r1)     // Catch: java.lang.Throwable -> L37
            s8.n r9 = r9.a()     // Catch: java.lang.Throwable -> L37
            t8.r0.n(r10)     // Catch: java.lang.Exception -> L57
            goto L2a
        L52:
            throw r11     // Catch: java.lang.Throwable -> L37
        L53:
            t8.r0.n(r10)     // Catch: java.lang.Exception -> L57
            throw r8     // Catch: java.lang.Exception -> L57
        L57:
            r8 = move-exception
            r7 = r8
            x6.m0 r8 = new x6.m0
            android.net.Uri r9 = r0.r()
            java.lang.Object r9 = t8.a.e(r9)
            r3 = r9
            android.net.Uri r3 = (android.net.Uri) r3
            java.util.Map r4 = r0.e()
            long r5 = r0.h()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.j0.c(s8.j$a, java.lang.String, byte[], java.util.Map):byte[]");
    }

    private static String d(s8.a0 a0Var, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = a0Var.f25187d;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = a0Var.f25189f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // x6.l0
    public byte[] a(UUID uuid, b0.d dVar) {
        return c(this.f30527a, dVar.b() + "&signedRequest=" + r0.D(dVar.a()), null, Collections.emptyMap());
    }

    @Override // x6.l0
    public byte[] b(UUID uuid, b0.a aVar) {
        String b10 = aVar.b();
        if (this.f30529c || TextUtils.isEmpty(b10)) {
            b10 = this.f30528b;
        }
        if (TextUtils.isEmpty(b10)) {
            throw new m0(new n.b().i(Uri.EMPTY).a(), Uri.EMPTY, com.google.common.collect.y.k(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = t6.p.f26348e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : t6.p.f26346c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f30530d) {
            hashMap.putAll(this.f30530d);
        }
        return c(this.f30527a, b10, aVar.a(), hashMap);
    }

    public void e(String str, String str2) {
        t8.a.e(str);
        t8.a.e(str2);
        synchronized (this.f30530d) {
            this.f30530d.put(str, str2);
        }
    }
}
