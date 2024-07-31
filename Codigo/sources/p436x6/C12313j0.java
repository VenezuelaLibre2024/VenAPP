package p436x6;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.AbstractC5911y;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p351s8.C10810a0;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11081p;
import p363t8.C11137a;
import p363t8.C11172r0;
import p436x6.InterfaceC12297b0;

/* renamed from: x6.j0 */
/* loaded from: classes.dex */
public final class C12313j0 implements InterfaceC12317l0 {

    /* renamed from: a */
    private final InterfaceC10827j.a f33039a;

    /* renamed from: b */
    private final String f33040b;

    /* renamed from: c */
    private final boolean f33041c;

    /* renamed from: d */
    private final Map<String, String> f33042d;

    public C12313j0(String str, boolean z10, InterfaceC10827j.a aVar) {
        C11137a.m34599a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f33039a = aVar;
        this.f33040b = str;
        this.f33041c = z10;
        this.f33042d = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:11|12|13|(2:15|16)(2:17|18)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = m39830d(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r8 = r8 + 1;
        r9 = r9.m33025a().m33039j(r1).m33030a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        p363t8.C11172r0.m34936n(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        throw r8;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m39829c(p351s8.InterfaceC10827j.a r8, java.lang.String r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            s8.l0 r0 = new s8.l0
            s8.j r8 = r8.mo33002a()
            r0.<init>(r8)
            s8.n$b r8 = new s8.n$b
            r8.<init>()
            s8.n$b r8 = r8.m33039j(r9)
            s8.n$b r8 = r8.m33034e(r11)
            r9 = 2
            s8.n$b r8 = r8.m33033d(r9)
            s8.n$b r8 = r8.m33032c(r10)
            r9 = 1
            s8.n$b r8 = r8.m33031b(r9)
            s8.n r2 = r8.m33030a()
            r8 = 0
            r9 = r2
        L2a:
            s8.l r10 = new s8.l     // Catch: java.lang.Exception -> L57
            r10.<init>(r0, r9)     // Catch: java.lang.Exception -> L57
            byte[] r8 = p363t8.C11172r0.m34899V0(r10)     // Catch: java.lang.Throwable -> L37 p351s8.C10810a0 -> L39
            p363t8.C11172r0.m34936n(r10)     // Catch: java.lang.Exception -> L57
            return r8
        L37:
            r8 = move-exception
            goto L53
        L39:
            r11 = move-exception
            java.lang.String r1 = m39830d(r11, r8)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L52
            int r8 = r8 + 1
            s8.n$b r9 = r9.m33025a()     // Catch: java.lang.Throwable -> L37
            s8.n$b r9 = r9.m33039j(r1)     // Catch: java.lang.Throwable -> L37
            s8.n r9 = r9.m33030a()     // Catch: java.lang.Throwable -> L37
            p363t8.C11172r0.m34936n(r10)     // Catch: java.lang.Exception -> L57
            goto L2a
        L52:
            throw r11     // Catch: java.lang.Throwable -> L37
        L53:
            p363t8.C11172r0.m34936n(r10)     // Catch: java.lang.Exception -> L57
            throw r8     // Catch: java.lang.Exception -> L57
        L57:
            r8 = move-exception
            r7 = r8
            x6.m0 r8 = new x6.m0
            android.net.Uri r9 = r0.m33016r()
            java.lang.Object r9 = p363t8.C11137a.m34603e(r9)
            r3 = r9
            android.net.Uri r3 = (android.net.Uri) r3
            java.util.Map r4 = r0.mo159e()
            long r5 = r0.m33015h()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p436x6.C12313j0.m39829c(s8.j$a, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* renamed from: d */
    private static String m39830d(C10810a0 c10810a0, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = c10810a0.f27306d;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = c10810a0.f27308f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // p436x6.InterfaceC12317l0
    /* renamed from: a */
    public byte[] mo39831a(UUID uuid, InterfaceC12297b0.d dVar) {
        return m39829c(this.f33039a, dVar.m39724b() + "&signedRequest=" + C11172r0.m34862D(dVar.m39723a()), null, Collections.emptyMap());
    }

    @Override // p436x6.InterfaceC12317l0
    /* renamed from: b */
    public byte[] mo39832b(UUID uuid, InterfaceC12297b0.a aVar) {
        String m39720b = aVar.m39720b();
        if (this.f33041c || TextUtils.isEmpty(m39720b)) {
            m39720b = this.f33040b;
        }
        if (TextUtils.isEmpty(m39720b)) {
            throw new C12319m0(new C10835n.b().m33038i(Uri.EMPTY).m33030a(), Uri.EMPTY, AbstractC5911y.m15111k(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = C11081p.f28575e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C11081p.f28573c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f33042d) {
            hashMap.putAll(this.f33042d);
        }
        return m39829c(this.f33039a, m39720b, aVar.m39719a(), hashMap);
    }

    /* renamed from: e */
    public void m39833e(String str, String str2) {
        C11137a.m34603e(str);
        C11137a.m34603e(str2);
        synchronized (this.f33042d) {
            this.f33042d.put(str, str2);
        }
    }
}
