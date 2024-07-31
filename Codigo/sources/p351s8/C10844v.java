package p351s8;

import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import p351s8.C10818e0;
import p351s8.InterfaceC10816d0;
import p361t6.C11005b3;

/* renamed from: s8.v */
/* loaded from: classes.dex */
public class C10844v implements InterfaceC10816d0 {

    /* renamed from: a */
    private final int f27510a;

    public C10844v() {
        this(-1);
    }

    public C10844v(int i10) {
        this.f27510a = i10;
    }

    @Override // p351s8.InterfaceC10816d0
    /* renamed from: a */
    public int mo32952a(int i10) {
        int i11 = this.f27510a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // p351s8.InterfaceC10816d0
    /* renamed from: b */
    public InterfaceC10816d0.b mo32953b(InterfaceC10816d0.a aVar, InterfaceC10816d0.c cVar) {
        if (!m33083e(cVar.f27331c)) {
            return null;
        }
        if (aVar.m32956a(1)) {
            return new InterfaceC10816d0.b(1, 300000L);
        }
        if (aVar.m32956a(2)) {
            return new InterfaceC10816d0.b(2, 60000L);
        }
        return null;
    }

    @Override // p351s8.InterfaceC10816d0
    /* renamed from: d */
    public long mo32955d(InterfaceC10816d0.c cVar) {
        IOException iOException = cVar.f27331c;
        if ((iOException instanceof C11005b3) || (iOException instanceof FileNotFoundException) || (iOException instanceof C10846x) || (iOException instanceof C10818e0.h) || C10829k.m33003a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f27332d - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    /* renamed from: e */
    protected boolean m33083e(IOException iOException) {
        if (!(iOException instanceof C10810a0)) {
            return false;
        }
        int i10 = ((C10810a0) iOException).f27306d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }
}
