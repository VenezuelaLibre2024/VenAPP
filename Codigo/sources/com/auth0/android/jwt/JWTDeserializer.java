package com.auth0.android.jwt;

import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class JWTDeserializer implements i<d> {
    JWTDeserializer() {
    }

    private Date c(m mVar, String str) {
        if (mVar.s(str)) {
            return new Date(mVar.r(str).h() * 1000);
        }
        return null;
    }

    private String d(m mVar, String str) {
        if (mVar.s(str)) {
            return mVar.r(str).k();
        }
        return null;
    }

    private List<String> e(m mVar, String str) {
        List<String> emptyList = Collections.emptyList();
        if (!mVar.s(str)) {
            return emptyList;
        }
        j r10 = mVar.r(str);
        if (!r10.l()) {
            return Collections.singletonList(r10.k());
        }
        g c10 = r10.c();
        ArrayList arrayList = new ArrayList(c10.size());
        for (int i10 = 0; i10 < c10.size(); i10++) {
            arrayList.add(c10.q(i10).k());
        }
        return arrayList;
    }

    @Override // com.google.gson.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(j jVar, Type type, h hVar) {
        if (jVar.m() || !jVar.n()) {
            throw new c("The token's payload had an invalid JSON format.");
        }
        m d10 = jVar.d();
        String d11 = d(d10, "iss");
        String d12 = d(d10, "sub");
        Date c10 = c(d10, "exp");
        Date c11 = c(d10, "nbf");
        Date c12 = c(d10, "iat");
        String d13 = d(d10, "jti");
        List<String> e10 = e(d10, "aud");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, j> entry : d10.q()) {
            hashMap.put(entry.getKey(), new b(entry.getValue()));
        }
        return new d(d11, d12, c10, c11, c12, d13, e10, hashMap);
    }
}
