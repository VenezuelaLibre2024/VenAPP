package g3;

import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f15742b;

    /* renamed from: c, reason: collision with root package name */
    private c f15743c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f15741a = new byte[RecognitionOptions.QR_CODE];

    /* renamed from: d, reason: collision with root package name */
    private int f15744d = 0;

    private boolean b() {
        return this.f15743c.f15729b != 0;
    }

    private int d() {
        try {
            return this.f15742b.get() & 255;
        } catch (Exception unused) {
            this.f15743c.f15729b = 1;
            return 0;
        }
    }

    private void e() {
        this.f15743c.f15731d.f15717a = n();
        this.f15743c.f15731d.f15718b = n();
        this.f15743c.f15731d.f15719c = n();
        this.f15743c.f15731d.f15720d = n();
        int d10 = d();
        boolean z10 = (d10 & RecognitionOptions.ITF) != 0;
        int pow = (int) Math.pow(2.0d, (d10 & 7) + 1);
        b bVar = this.f15743c.f15731d;
        bVar.f15721e = (d10 & 64) != 0;
        if (z10) {
            bVar.f15727k = g(pow);
        } else {
            bVar.f15727k = null;
        }
        this.f15743c.f15731d.f15726j = this.f15742b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f15743c;
        cVar.f15730c++;
        cVar.f15732e.add(cVar.f15731d);
    }

    private void f() {
        int d10 = d();
        this.f15744d = d10;
        if (d10 <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f15744d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f15742b.get(this.f15741a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f15744d, e10);
                }
                this.f15743c.f15729b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f15742b.get(bArr);
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
            this.f15743c.f15729b = 1;
        }
        return iArr;
    }

    private void h() {
        i(a.e.API_PRIORITY_OTHER);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f15743c.f15730c <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 != 1) {
                    if (d11 == 249) {
                        this.f15743c.f15731d = new b();
                        j();
                    } else if (d11 != 254 && d11 == 255) {
                        f();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i11 = 0; i11 < 11; i11++) {
                            sb2.append((char) this.f15741a[i11]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            m();
                        }
                    }
                }
                q();
            } else if (d10 == 44) {
                c cVar = this.f15743c;
                if (cVar.f15731d == null) {
                    cVar.f15731d = new b();
                }
                e();
            } else if (d10 != 59) {
                this.f15743c.f15729b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int d10 = d();
        b bVar = this.f15743c.f15731d;
        int i10 = (d10 & 28) >> 2;
        bVar.f15723g = i10;
        if (i10 == 0) {
            bVar.f15723g = 1;
        }
        bVar.f15722f = (d10 & 1) != 0;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        b bVar2 = this.f15743c.f15731d;
        bVar2.f15725i = n10 * 10;
        bVar2.f15724h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f15743c.f15729b = 1;
            return;
        }
        l();
        if (!this.f15743c.f15735h || b()) {
            return;
        }
        c cVar = this.f15743c;
        cVar.f15728a = g(cVar.f15736i);
        c cVar2 = this.f15743c;
        cVar2.f15739l = cVar2.f15728a[cVar2.f15737j];
    }

    private void l() {
        this.f15743c.f15733f = n();
        this.f15743c.f15734g = n();
        int d10 = d();
        c cVar = this.f15743c;
        cVar.f15735h = (d10 & RecognitionOptions.ITF) != 0;
        cVar.f15736i = (int) Math.pow(2.0d, (d10 & 7) + 1);
        this.f15743c.f15737j = d();
        this.f15743c.f15738k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f15741a;
            if (bArr[0] == 1) {
                this.f15743c.f15740m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f15744d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f15742b.getShort();
    }

    private void o() {
        this.f15742b = null;
        Arrays.fill(this.f15741a, (byte) 0);
        this.f15743c = new c();
        this.f15744d = 0;
    }

    private void q() {
        int d10;
        do {
            d10 = d();
            this.f15742b.position(Math.min(this.f15742b.position() + d10, this.f15742b.limit()));
        } while (d10 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f15742b = null;
        this.f15743c = null;
    }

    public c c() {
        if (this.f15742b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f15743c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f15743c;
            if (cVar.f15730c < 0) {
                cVar.f15729b = 1;
            }
        }
        return this.f15743c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f15742b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f15742b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
