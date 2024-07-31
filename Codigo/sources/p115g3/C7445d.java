package p115g3;

import android.util.Log;
import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: g3.d */
/* loaded from: classes.dex */
public class C7445d {

    /* renamed from: b */
    private ByteBuffer f17324b;

    /* renamed from: c */
    private C7444c f17325c;

    /* renamed from: a */
    private final byte[] f17323a = new byte[RecognitionOptions.QR_CODE];

    /* renamed from: d */
    private int f17326d = 0;

    /* renamed from: b */
    private boolean m22464b() {
        return this.f17325c.f17311b != 0;
    }

    /* renamed from: d */
    private int m22465d() {
        try {
            return this.f17324b.get() & 255;
        } catch (Exception unused) {
            this.f17325c.f17311b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m22466e() {
        this.f17325c.f17313d.f17299a = m22475n();
        this.f17325c.f17313d.f17300b = m22475n();
        this.f17325c.f17313d.f17301c = m22475n();
        this.f17325c.f17313d.f17302d = m22475n();
        int m22465d = m22465d();
        boolean z10 = (m22465d & RecognitionOptions.ITF) != 0;
        int pow = (int) Math.pow(2.0d, (m22465d & 7) + 1);
        C7443b c7443b = this.f17325c.f17313d;
        c7443b.f17303e = (m22465d & 64) != 0;
        if (z10) {
            c7443b.f17309k = m22468g(pow);
        } else {
            c7443b.f17309k = null;
        }
        this.f17325c.f17313d.f17308j = this.f17324b.position();
        m22478r();
        if (m22464b()) {
            return;
        }
        C7444c c7444c = this.f17325c;
        c7444c.f17312c++;
        c7444c.f17314e.add(c7444c.f17313d);
    }

    /* renamed from: f */
    private void m22467f() {
        int m22465d = m22465d();
        this.f17326d = m22465d;
        if (m22465d <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f17326d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f17324b.get(this.f17323a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f17326d, e10);
                }
                this.f17325c.f17311b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    private int[] m22468g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f17324b.get(bArr);
            iArr = new int[RecognitionOptions.QR_CODE];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f17325c.f17311b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m22469h() {
        m22470i(C5101a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: i */
    private void m22470i(int i10) {
        boolean z10 = false;
        while (!z10 && !m22464b() && this.f17325c.f17312c <= i10) {
            int m22465d = m22465d();
            if (m22465d == 33) {
                int m22465d2 = m22465d();
                if (m22465d2 != 1) {
                    if (m22465d2 == 249) {
                        this.f17325c.f17313d = new C7443b();
                        m22471j();
                    } else if (m22465d2 != 254 && m22465d2 == 255) {
                        m22467f();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i11 = 0; i11 < 11; i11++) {
                            sb2.append((char) this.f17323a[i11]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            m22474m();
                        }
                    }
                }
                m22477q();
            } else if (m22465d == 44) {
                C7444c c7444c = this.f17325c;
                if (c7444c.f17313d == null) {
                    c7444c.f17313d = new C7443b();
                }
                m22466e();
            } else if (m22465d != 59) {
                this.f17325c.f17311b = 1;
            } else {
                z10 = true;
            }
        }
    }

    /* renamed from: j */
    private void m22471j() {
        m22465d();
        int m22465d = m22465d();
        C7443b c7443b = this.f17325c.f17313d;
        int i10 = (m22465d & 28) >> 2;
        c7443b.f17305g = i10;
        if (i10 == 0) {
            c7443b.f17305g = 1;
        }
        c7443b.f17304f = (m22465d & 1) != 0;
        int m22475n = m22475n();
        if (m22475n < 2) {
            m22475n = 10;
        }
        C7443b c7443b2 = this.f17325c.f17313d;
        c7443b2.f17307i = m22475n * 10;
        c7443b2.f17306h = m22465d();
        m22465d();
    }

    /* renamed from: k */
    private void m22472k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) m22465d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f17325c.f17311b = 1;
            return;
        }
        m22473l();
        if (!this.f17325c.f17317h || m22464b()) {
            return;
        }
        C7444c c7444c = this.f17325c;
        c7444c.f17310a = m22468g(c7444c.f17318i);
        C7444c c7444c2 = this.f17325c;
        c7444c2.f17321l = c7444c2.f17310a[c7444c2.f17319j];
    }

    /* renamed from: l */
    private void m22473l() {
        this.f17325c.f17315f = m22475n();
        this.f17325c.f17316g = m22475n();
        int m22465d = m22465d();
        C7444c c7444c = this.f17325c;
        c7444c.f17317h = (m22465d & RecognitionOptions.ITF) != 0;
        c7444c.f17318i = (int) Math.pow(2.0d, (m22465d & 7) + 1);
        this.f17325c.f17319j = m22465d();
        this.f17325c.f17320k = m22465d();
    }

    /* renamed from: m */
    private void m22474m() {
        do {
            m22467f();
            byte[] bArr = this.f17323a;
            if (bArr[0] == 1) {
                this.f17325c.f17322m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f17326d <= 0) {
                return;
            }
        } while (!m22464b());
    }

    /* renamed from: n */
    private int m22475n() {
        return this.f17324b.getShort();
    }

    /* renamed from: o */
    private void m22476o() {
        this.f17324b = null;
        Arrays.fill(this.f17323a, (byte) 0);
        this.f17325c = new C7444c();
        this.f17326d = 0;
    }

    /* renamed from: q */
    private void m22477q() {
        int m22465d;
        do {
            m22465d = m22465d();
            this.f17324b.position(Math.min(this.f17324b.position() + m22465d, this.f17324b.limit()));
        } while (m22465d > 0);
    }

    /* renamed from: r */
    private void m22478r() {
        m22465d();
        m22477q();
    }

    /* renamed from: a */
    public void m22479a() {
        this.f17324b = null;
        this.f17325c = null;
    }

    /* renamed from: c */
    public C7444c m22480c() {
        if (this.f17324b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m22464b()) {
            return this.f17325c;
        }
        m22472k();
        if (!m22464b()) {
            m22469h();
            C7444c c7444c = this.f17325c;
            if (c7444c.f17312c < 0) {
                c7444c.f17311b = 1;
            }
        }
        return this.f17325c;
    }

    /* renamed from: p */
    public C7445d m22481p(ByteBuffer byteBuffer) {
        m22476o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17324b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f17324b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
