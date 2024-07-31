package x6;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import t8.r0;
import u6.m3;
import x6.b0;
import x6.m;

/* loaded from: classes.dex */
public final class i0 implements b0 {

    /* renamed from: d */
    public static final b0.c f30521d = new b0.c() { // from class: x6.d0
        @Override // x6.b0.c
        public final b0 a(UUID uuid) {
            b0 A;
            A = i0.A(uuid);
            return A;
        }
    };

    /* renamed from: a */
    private final UUID f30522a;

    /* renamed from: b */
    private final MediaDrm f30523b;

    /* renamed from: c */
    private int f30524c;

    /* loaded from: classes.dex */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, m3 m3Var) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId a10 = m3Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a10.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            ((MediaDrm.PlaybackComponent) t8.a.e(playbackComponent)).setLogSessionId(a10);
        }
    }

    private i0(UUID uuid) {
        t8.a.e(uuid);
        t8.a.b(!t6.p.f26345b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f30522a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f30523b = mediaDrm;
        this.f30524c = 1;
        if (t6.p.f26347d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    public static /* synthetic */ b0 A(UUID uuid) {
        try {
            return C(uuid);
        } catch (n0 unused) {
            t8.s.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new z();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(r0.f26747d);
    }

    public static i0 C(UUID uuid) {
        try {
            return new i0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new n0(1, e10);
        } catch (Exception e11) {
            throw new n0(2, e11);
        }
    }

    private static byte[] p(byte[] bArr) {
        t8.e0 e0Var = new t8.e0(bArr);
        int u10 = e0Var.u();
        short w10 = e0Var.w();
        short w11 = e0Var.w();
        if (w10 != 1 || w11 != 1) {
            t8.s.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short w12 = e0Var.w();
        Charset charset = eb.e.f14598e;
        String F = e0Var.F(w12, charset);
        if (F.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = F.indexOf("</DATA>");
        if (indexOf == -1) {
            t8.s.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = F.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + F.substring(indexOf);
        int i10 = u10 + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i10);
        allocate.putShort(w10);
        allocate.putShort(w11);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    private static String q(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? "" : (r0.f26744a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return t6.p.f26346c.equals(uuid) ? x6.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = t6.p.f26348e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = g7.l.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = p(r4)
            byte[] r4 = g7.l.a(r0, r4)
        L18:
            int r1 = t8.r0.f26744a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = t6.p.f26347d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = t8.r0.f26746c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = t8.r0.f26747d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = g7.l.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.i0.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (r0.f26744a < 26 && t6.p.f26346c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return (r0.f26744a >= 27 || !t6.p.f26346c.equals(uuid)) ? uuid : t6.p.f26345b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static m.b y(UUID uuid, List<m.b> list) {
        boolean z10;
        if (t6.p.f26347d.equals(uuid)) {
            if (r0.f26744a >= 28 && list.size() > 1) {
                m.b bVar = list.get(0);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    m.b bVar2 = list.get(i11);
                    byte[] bArr = (byte[]) t8.a.e(bVar2.f30545e);
                    if (!r0.c(bVar2.f30544d, bVar.f30544d) || !r0.c(bVar2.f30543c, bVar.f30543c) || !g7.l.c(bArr)) {
                        z10 = false;
                        break;
                    }
                    i10 += bArr.length;
                }
                z10 = true;
                if (z10) {
                    byte[] bArr2 = new byte[i10];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr3 = (byte[]) t8.a.e(list.get(i13).f30545e);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i12, length);
                        i12 += length;
                    }
                    return bVar.b(bArr2);
                }
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                m.b bVar3 = list.get(i14);
                int g10 = g7.l.g((byte[]) t8.a.e(bVar3.f30545e));
                int i15 = r0.f26744a;
                if (i15 < 23 && g10 == 0) {
                    return bVar3;
                }
                if (i15 >= 23 && g10 == 1) {
                    return bVar3;
                }
            }
        }
        return list.get(0);
    }

    public /* synthetic */ void z(b0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    @Override // x6.b0
    public Map<String, String> a(byte[] bArr) {
        return this.f30523b.queryKeyStatus(bArr);
    }

    @Override // x6.b0
    public b0.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f30523b.getProvisionRequest();
        return new b0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // x6.b0
    public byte[] c() {
        return this.f30523b.openSession();
    }

    @Override // x6.b0
    public void d(byte[] bArr, byte[] bArr2) {
        this.f30523b.restoreKeys(bArr, bArr2);
    }

    @Override // x6.b0
    public void e(byte[] bArr) {
        this.f30523b.provideProvisionResponse(bArr);
    }

    @Override // x6.b0
    public int f() {
        return 2;
    }

    @Override // x6.b0
    public void g(byte[] bArr, m3 m3Var) {
        if (r0.f26744a >= 31) {
            try {
                a.b(this.f30523b, bArr, m3Var);
            } catch (UnsupportedOperationException unused) {
                t8.s.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // x6.b0
    public void h(b0.b bVar) {
        this.f30523b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: x6.e0

            /* renamed from: b */
            public final /* synthetic */ b0.b f30445b;

            public /* synthetic */ e0(b0.b bVar2) {
                r2 = bVar2;
            }

            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                i0.this.z(r2, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // x6.b0
    public boolean j(byte[] bArr, String str) {
        if (r0.f26744a >= 31) {
            return a.a(this.f30523b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f30522a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // x6.b0
    public void k(byte[] bArr) {
        this.f30523b.closeSession(bArr);
    }

    @Override // x6.b0
    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (t6.p.f26346c.equals(this.f30522a)) {
            bArr2 = x6.a.b(bArr2);
        }
        return this.f30523b.provideKeyResponse(bArr, bArr2);
    }

    @Override // x6.b0
    public b0.a m(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap) {
        m.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = y(this.f30522a, list);
            bArr2 = s(this.f30522a, (byte[]) t8.a.e(bVar.f30545e));
            str = t(this.f30522a, bVar.f30544d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f30523b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f30522a, keyRequest.getData());
        String q10 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q10) && bVar != null && !TextUtils.isEmpty(bVar.f30543c)) {
            q10 = bVar.f30543c;
        }
        return new b0.a(r10, q10, r0.f26744a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // x6.b0
    public synchronized void release() {
        int i10 = this.f30524c - 1;
        this.f30524c = i10;
        if (i10 == 0) {
            this.f30523b.release();
        }
    }

    @Override // x6.b0
    /* renamed from: v */
    public c0 i(byte[] bArr) {
        return new c0(u(this.f30522a), bArr, r0.f26744a < 21 && t6.p.f26347d.equals(this.f30522a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f30523b.getPropertyString(str);
    }
}
