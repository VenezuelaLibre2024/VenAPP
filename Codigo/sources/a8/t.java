package a8;

import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t6.b3;
import t6.u1;
import t8.e0;
import t8.n0;
import y6.b0;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class t implements y6.k {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f241g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f242h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final String f243a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f244b;

    /* renamed from: d, reason: collision with root package name */
    private y6.m f246d;

    /* renamed from: f, reason: collision with root package name */
    private int f248f;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f245c = new e0();

    /* renamed from: e, reason: collision with root package name */
    private byte[] f247e = new byte[RecognitionOptions.UPC_E];

    public t(String str, n0 n0Var) {
        this.f243a = str;
        this.f244b = n0Var;
    }

    private b0 c(long j10) {
        b0 d10 = this.f246d.d(0, 3);
        d10.c(new u1.b().g0("text/vtt").X(this.f243a).k0(j10).G());
        this.f246d.q();
        return d10;
    }

    private void d() {
        e0 e0Var = new e0(this.f247e);
        p8.i.e(e0Var);
        long j10 = 0;
        long j11 = 0;
        for (String s10 = e0Var.s(); !TextUtils.isEmpty(s10); s10 = e0Var.s()) {
            if (s10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f241g.matcher(s10);
                if (!matcher.find()) {
                    throw b3.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + s10, null);
                }
                Matcher matcher2 = f242h.matcher(s10);
                if (!matcher2.find()) {
                    throw b3.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + s10, null);
                }
                j11 = p8.i.d((String) t8.a.e(matcher.group(1)));
                j10 = n0.f(Long.parseLong((String) t8.a.e(matcher2.group(1))));
            }
        }
        Matcher a10 = p8.i.a(e0Var);
        if (a10 == null) {
            c(0L);
            return;
        }
        long d10 = p8.i.d((String) t8.a.e(a10.group(1)));
        long b10 = this.f244b.b(n0.j((j10 + d10) - j11));
        b0 c10 = c(b10 - d10);
        this.f245c.S(this.f247e, this.f248f);
        c10.a(this.f245c, this.f248f);
        c10.b(b10, 1, this.f248f, 0, null);
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f246d = mVar;
        mVar.p(new z.b(-9223372036854775807L));
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        lVar.d(this.f247e, 0, 6, false);
        this.f245c.S(this.f247e, 6);
        if (p8.i.b(this.f245c)) {
            return true;
        }
        lVar.d(this.f247e, 6, 3, false);
        this.f245c.S(this.f247e, 9);
        return p8.i.b(this.f245c);
    }

    @Override // y6.k
    public int f(y6.l lVar, y yVar) {
        t8.a.e(this.f246d);
        int length = (int) lVar.getLength();
        int i10 = this.f248f;
        byte[] bArr = this.f247e;
        if (i10 == bArr.length) {
            this.f247e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f247e;
        int i11 = this.f248f;
        int read = lVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f248f + read;
            this.f248f = i12;
            if (length == -1 || i12 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // y6.k
    public void release() {
    }
}
