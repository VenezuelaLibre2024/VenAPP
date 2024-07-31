package p436x6;

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
import p082eb.C7149e;
import p119g7.C7476l;
import p361t6.C11081p;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p376u6.C11391m3;
import p436x6.C12318m;
import p436x6.InterfaceC12297b0;

/* renamed from: x6.i0 */
/* loaded from: classes.dex */
public final class C12311i0 implements InterfaceC12297b0 {

    /* renamed from: d */
    public static final InterfaceC12297b0.c f33033d = new InterfaceC12297b0.c() { // from class: x6.d0
        @Override // p436x6.InterfaceC12297b0.c
        /* renamed from: a */
        public final InterfaceC12297b0 mo39722a(UUID uuid) {
            InterfaceC12297b0 m39811A;
            m39811A = C12311i0.m39811A(uuid);
            return m39811A;
        }
    };

    /* renamed from: a */
    private final UUID f33034a;

    /* renamed from: b */
    private final MediaDrm f33035b;

    /* renamed from: c */
    private int f33036c;

    /* renamed from: x6.i0$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        public static boolean m39827a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        /* renamed from: b */
        public static void m39828b(MediaDrm mediaDrm, byte[] bArr, C11391m3 c11391m3) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId m35573a = c11391m3.m35573a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = m35573a.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            ((MediaDrm.PlaybackComponent) C11137a.m34603e(playbackComponent)).setLogSessionId(m35573a);
        }
    }

    private C12311i0(UUID uuid) {
        C11137a.m34603e(uuid);
        C11137a.m34600b(!C11081p.f28572b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f33034a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m39821u(uuid));
        this.f33035b = mediaDrm;
        this.f33036c = 1;
        if (C11081p.f28574d.equals(uuid) && m39812B()) {
            m39822w(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ InterfaceC12297b0 m39811A(UUID uuid) {
        try {
            return m39813C(uuid);
        } catch (C12321n0 unused) {
            C11173s.m34964c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C12334z();
        }
    }

    /* renamed from: B */
    private static boolean m39812B() {
        return "ASUS_Z00AD".equals(C11172r0.f29043d);
    }

    /* renamed from: C */
    public static C12311i0 m39813C(UUID uuid) {
        try {
            return new C12311i0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new C12321n0(1, e10);
        } catch (Exception e11) {
            throw new C12321n0(2, e11);
        }
    }

    /* renamed from: p */
    private static byte[] m39816p(byte[] bArr) {
        C11146e0 c11146e0 = new C11146e0(bArr);
        int m34696u = c11146e0.m34696u();
        short m34698w = c11146e0.m34698w();
        short m34698w2 = c11146e0.m34698w();
        if (m34698w != 1 || m34698w2 != 1) {
            C11173s.m34967f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short m34698w3 = c11146e0.m34698w();
        Charset charset = C7149e.f16021e;
        String m34662F = c11146e0.m34662F(m34698w3, charset);
        if (m34662F.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = m34662F.indexOf("</DATA>");
        if (indexOf == -1) {
            C11173s.m34970i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = m34662F.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + m34662F.substring(indexOf);
        int i10 = m34696u + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i10);
        allocate.putShort(m34698w);
        allocate.putShort(m34698w2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    /* renamed from: q */
    private static String m39817q(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? "" : (C11172r0.f29040a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    /* renamed from: r */
    private static byte[] m39818r(UUID uuid, byte[] bArr) {
        return C11081p.f28573c.equals(uuid) ? C12294a.m39694a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m39819s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p361t6.C11081p.f28575e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = p119g7.C7476l.m22731e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = m39816p(r4)
            byte[] r4 = p119g7.C7476l.m22727a(r0, r4)
        L18:
            int r1 = p363t8.C11172r0.f29040a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = p361t6.C11081p.f28574d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = p363t8.C11172r0.f29042c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = p363t8.C11172r0.f29043d
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
            byte[] r3 = p119g7.C7476l.m22731e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p436x6.C12311i0.m39819s(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: t */
    private static String m39820t(UUID uuid, String str) {
        return (C11172r0.f29040a < 26 && C11081p.f28573c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    /* renamed from: u */
    private static UUID m39821u(UUID uuid) {
        return (C11172r0.f29040a >= 27 || !C11081p.f28573c.equals(uuid)) ? uuid : C11081p.f28572b;
    }

    /* renamed from: w */
    private static void m39822w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: y */
    private static C12318m.b m39823y(UUID uuid, List<C12318m.b> list) {
        boolean z10;
        if (C11081p.f28574d.equals(uuid)) {
            if (C11172r0.f29040a >= 28 && list.size() > 1) {
                C12318m.b bVar = list.get(0);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C12318m.b bVar2 = list.get(i11);
                    byte[] bArr = (byte[]) C11137a.m34603e(bVar2.f33057e);
                    if (!C11172r0.m34914c(bVar2.f33056d, bVar.f33056d) || !C11172r0.m34914c(bVar2.f33055c, bVar.f33055c) || !C7476l.m22729c(bArr)) {
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
                        byte[] bArr3 = (byte[]) C11137a.m34603e(list.get(i13).f33057e);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i12, length);
                        i12 += length;
                    }
                    return bVar.m39845b(bArr2);
                }
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                C12318m.b bVar3 = list.get(i14);
                int m22733g = C7476l.m22733g((byte[]) C11137a.m34603e(bVar3.f33057e));
                int i15 = C11172r0.f29040a;
                if (i15 < 23 && m22733g == 0) {
                    return bVar3;
                }
                if (i15 >= 23 && m22733g == 1) {
                    return bVar3;
                }
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m39824z(InterfaceC12297b0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.mo39721a(this, bArr, i10, i11, bArr2);
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: a */
    public Map<String, String> mo39706a(byte[] bArr) {
        return this.f33035b.queryKeyStatus(bArr);
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: b */
    public InterfaceC12297b0.d mo39707b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f33035b.getProvisionRequest();
        return new InterfaceC12297b0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: c */
    public byte[] mo39708c() {
        return this.f33035b.openSession();
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: d */
    public void mo39709d(byte[] bArr, byte[] bArr2) {
        this.f33035b.restoreKeys(bArr, bArr2);
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: e */
    public void mo39710e(byte[] bArr) {
        this.f33035b.provideProvisionResponse(bArr);
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: f */
    public int mo39711f() {
        return 2;
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: g */
    public void mo39712g(byte[] bArr, C11391m3 c11391m3) {
        if (C11172r0.f29040a >= 31) {
            try {
                a.m39828b(this.f33035b, bArr, c11391m3);
            } catch (UnsupportedOperationException unused) {
                C11173s.m34970i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: h */
    public void mo39713h(final InterfaceC12297b0.b bVar) {
        this.f33035b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: x6.e0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                C12311i0.this.m39824z(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: j */
    public boolean mo39715j(byte[] bArr, String str) {
        if (C11172r0.f29040a >= 31) {
            return a.m39827a(this.f33035b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f33034a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: k */
    public void mo39716k(byte[] bArr) {
        this.f33035b.closeSession(bArr);
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: l */
    public byte[] mo39717l(byte[] bArr, byte[] bArr2) {
        if (C11081p.f28573c.equals(this.f33034a)) {
            bArr2 = C12294a.m39695b(bArr2);
        }
        return this.f33035b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: m */
    public InterfaceC12297b0.a mo39718m(byte[] bArr, List<C12318m.b> list, int i10, HashMap<String, String> hashMap) {
        C12318m.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = m39823y(this.f33034a, list);
            bArr2 = m39819s(this.f33034a, (byte[]) C11137a.m34603e(bVar.f33057e));
            str = m39820t(this.f33034a, bVar.f33056d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f33035b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] m39818r = m39818r(this.f33034a, keyRequest.getData());
        String m39817q = m39817q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(m39817q) && bVar != null && !TextUtils.isEmpty(bVar.f33055c)) {
            m39817q = bVar.f33055c;
        }
        return new InterfaceC12297b0.a(m39818r, m39817q, C11172r0.f29040a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // p436x6.InterfaceC12297b0
    public synchronized void release() {
        int i10 = this.f33036c - 1;
        this.f33036c = i10;
        if (i10 == 0) {
            this.f33035b.release();
        }
    }

    @Override // p436x6.InterfaceC12297b0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C12299c0 mo39714i(byte[] bArr) {
        return new C12299c0(m39821u(this.f33034a), bArr, C11172r0.f29040a < 21 && C11081p.f28574d.equals(this.f33034a) && "L3".equals(m39826x("securityLevel")));
    }

    /* renamed from: x */
    public String m39826x(String str) {
        return this.f33035b.getPropertyString(str);
    }
}
