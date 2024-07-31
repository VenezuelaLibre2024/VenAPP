package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import ql.a0;
import ql.c0;
import ql.d0;
import ql.e;
import ql.f;
import ql.u;
import ql.w;
import se.h;
import we.k;

/* loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(c0 c0Var, h hVar, long j10, long j11) {
        a0 O = c0Var.O();
        if (O == null) {
            return;
        }
        hVar.x(O.i().s().toString());
        hVar.l(O.g());
        if (O.a() != null) {
            long a10 = O.a().a();
            if (a10 != -1) {
                hVar.p(a10);
            }
        }
        d0 a11 = c0Var.a();
        if (a11 != null) {
            long b10 = a11.b();
            if (b10 != -1) {
                hVar.t(b10);
            }
            w e10 = a11.e();
            if (e10 != null) {
                hVar.s(e10.toString());
            }
        }
        hVar.m(c0Var.g());
        hVar.r(j10);
        hVar.v(j11);
        hVar.b();
    }

    @Keep
    public static void enqueue(e eVar, f fVar) {
        l lVar = new l();
        eVar.Q(new d(fVar, k.k(), lVar, lVar.e()));
    }

    @Keep
    public static c0 execute(e eVar) {
        h c10 = h.c(k.k());
        l lVar = new l();
        long e10 = lVar.e();
        try {
            c0 n10 = eVar.n();
            a(n10, c10, e10, lVar.c());
            return n10;
        } catch (IOException e11) {
            a0 o10 = eVar.o();
            if (o10 != null) {
                u i10 = o10.i();
                if (i10 != null) {
                    c10.x(i10.s().toString());
                }
                if (o10.g() != null) {
                    c10.l(o10.g());
                }
            }
            c10.r(e10);
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e11;
        }
    }
}
