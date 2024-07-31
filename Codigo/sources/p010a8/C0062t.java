package p010a8;

import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p291p8.C10119i;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* renamed from: a8.t */
/* loaded from: classes.dex */
public final class C0062t implements InterfaceC12621k {

    /* renamed from: g */
    private static final Pattern f292g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    private static final Pattern f293h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    private final String f294a;

    /* renamed from: b */
    private final C11164n0 f295b;

    /* renamed from: d */
    private InterfaceC12623m f297d;

    /* renamed from: f */
    private int f299f;

    /* renamed from: c */
    private final C11146e0 f296c = new C11146e0();

    /* renamed from: e */
    private byte[] f298e = new byte[RecognitionOptions.UPC_E];

    public C0062t(String str, C11164n0 c11164n0) {
        this.f294a = str;
        this.f295b = c11164n0;
    }

    /* renamed from: c */
    private InterfaceC12609b0 m345c(long j10) {
        InterfaceC12609b0 mo308d = this.f297d.mo308d(0, 3);
        mo308d.mo332c(new C11108u1.b().m34552g0("text/vtt").m34543X(this.f294a).m34556k0(j10).m34526G());
        this.f297d.mo324q();
        return mo308d;
    }

    /* renamed from: d */
    private void m346d() {
        C11146e0 c11146e0 = new C11146e0(this.f298e);
        C10119i.m30240e(c11146e0);
        long j10 = 0;
        long j11 = 0;
        for (String m34694s = c11146e0.m34694s(); !TextUtils.isEmpty(m34694s); m34694s = c11146e0.m34694s()) {
            if (m34694s.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f292g.matcher(m34694s);
                if (!matcher.find()) {
                    throw C11005b3.m33715a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + m34694s, null);
                }
                Matcher matcher2 = f293h.matcher(m34694s);
                if (!matcher2.find()) {
                    throw C11005b3.m33715a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + m34694s, null);
                }
                j11 = C10119i.m30239d((String) C11137a.m34603e(matcher.group(1)));
                j10 = C11164n0.m34821f(Long.parseLong((String) C11137a.m34603e(matcher2.group(1))));
            }
        }
        Matcher m30236a = C10119i.m30236a(c11146e0);
        if (m30236a == null) {
            m345c(0L);
            return;
        }
        long m30239d = C10119i.m30239d((String) C11137a.m34603e(m30236a.group(1)));
        long m34825b = this.f295b.m34825b(C11164n0.m34823j((j10 + m30239d) - j11));
        InterfaceC12609b0 m345c = m345c(m34825b - m30239d);
        this.f296c.m34675S(this.f298e, this.f299f);
        m345c.m41511a(this.f296c, this.f299f);
        m345c.mo331b(m34825b, 1, this.f299f, 0, null);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f297d = interfaceC12623m;
        interfaceC12623m.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41533d(this.f298e, 0, 6, false);
        this.f296c.m34675S(this.f298e, 6);
        if (C10119i.m30237b(this.f296c)) {
            return true;
        }
        interfaceC12622l.mo41533d(this.f298e, 6, 3, false);
        this.f296c.m34675S(this.f298e, 9);
        return C10119i.m30237b(this.f296c);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        C11137a.m34603e(this.f297d);
        int length = (int) interfaceC12622l.getLength();
        int i10 = this.f299f;
        byte[] bArr = this.f298e;
        if (i10 == bArr.length) {
            this.f298e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f298e;
        int i11 = this.f299f;
        int read = interfaceC12622l.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f299f + read;
            this.f299f = i12;
            if (length == -1 || i12 != length) {
                return 0;
            }
        }
        m346d();
        return -1;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
