package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import ea.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f9223a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9224b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9225c;

    /* renamed from: d, reason: collision with root package name */
    private final List f9226d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9227e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9228f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private PendingIntent f9229a;

        /* renamed from: b, reason: collision with root package name */
        private String f9230b;

        /* renamed from: c, reason: collision with root package name */
        private String f9231c;

        /* renamed from: d, reason: collision with root package name */
        private List f9232d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private String f9233e;

        /* renamed from: f, reason: collision with root package name */
        private int f9234f;

        public SaveAccountLinkingTokenRequest a() {
            s.b(this.f9229a != null, "Consent PendingIntent cannot be null");
            s.b("auth_code".equals(this.f9230b), "Invalid tokenType");
            s.b(!TextUtils.isEmpty(this.f9231c), "serviceId cannot be null or empty");
            s.b(this.f9232d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f9229a, this.f9230b, this.f9231c, this.f9232d, this.f9233e, this.f9234f);
        }

        public a b(PendingIntent pendingIntent) {
            this.f9229a = pendingIntent;
            return this;
        }

        public a c(List<String> list) {
            this.f9232d = list;
            return this;
        }

        public a d(String str) {
            this.f9231c = str;
            return this;
        }

        public a e(String str) {
            this.f9230b = str;
            return this;
        }

        public final a f(String str) {
            this.f9233e = str;
            return this;
        }

        public final a g(int i10) {
            this.f9234f = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f9223a = pendingIntent;
        this.f9224b = str;
        this.f9225c = str2;
        this.f9226d = list;
        this.f9227e = str3;
        this.f9228f = i10;
    }

    public static a u1() {
        return new a();
    }

    public static a z1(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        s.j(saveAccountLinkingTokenRequest);
        a u12 = u1();
        u12.c(saveAccountLinkingTokenRequest.w1());
        u12.d(saveAccountLinkingTokenRequest.x1());
        u12.b(saveAccountLinkingTokenRequest.v1());
        u12.e(saveAccountLinkingTokenRequest.y1());
        u12.g(saveAccountLinkingTokenRequest.f9228f);
        String str = saveAccountLinkingTokenRequest.f9227e;
        if (!TextUtils.isEmpty(str)) {
            u12.f(str);
        }
        return u12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f9226d.size() == saveAccountLinkingTokenRequest.f9226d.size() && this.f9226d.containsAll(saveAccountLinkingTokenRequest.f9226d) && q.b(this.f9223a, saveAccountLinkingTokenRequest.f9223a) && q.b(this.f9224b, saveAccountLinkingTokenRequest.f9224b) && q.b(this.f9225c, saveAccountLinkingTokenRequest.f9225c) && q.b(this.f9227e, saveAccountLinkingTokenRequest.f9227e) && this.f9228f == saveAccountLinkingTokenRequest.f9228f;
    }

    public int hashCode() {
        return q.c(this.f9223a, this.f9224b, this.f9225c, this.f9226d, this.f9227e);
    }

    public PendingIntent v1() {
        return this.f9223a;
    }

    public List<String> w1() {
        return this.f9226d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.E(parcel, 1, v1(), i10, false);
        c.G(parcel, 2, y1(), false);
        c.G(parcel, 3, x1(), false);
        c.I(parcel, 4, w1(), false);
        c.G(parcel, 5, this.f9227e, false);
        c.u(parcel, 6, this.f9228f);
        c.b(parcel, a10);
    }

    public String x1() {
        return this.f9225c;
    }

    public String y1() {
        return this.f9224b;
    }
}
