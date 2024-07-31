package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.u;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public class n extends f0 {

    /* renamed from: f */
    private static ScheduledThreadPoolExecutor f7973f;

    /* renamed from: d */
    private final String f7974d;

    /* renamed from: e */
    public static final b f7972e = new b(null);
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new n(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (n.f7973f == null) {
                n.f7973f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = n.f7973f;
            if (scheduledThreadPoolExecutor == null) {
                kotlin.jvm.internal.n.p("backgroundExecutor");
                throw null;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected n(Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.n.e(parcel, "parcel");
        this.f7974d = "device_auth";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        this.f7974d = "device_auth";
    }

    private final void w(u.e eVar) {
        androidx.fragment.app.e i10 = d().i();
        if (i10 == null || i10.isFinishing()) {
            return;
        }
        m s10 = s();
        s10.p(i10.getSupportFragmentManager(), "login_with_facebook");
        s10.R(eVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.f0
    public String f() {
        return this.f7974d;
    }

    @Override // com.facebook.login.f0
    public int o(u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        w(request);
        return 1;
    }

    protected m s() {
        return new m();
    }

    public void t() {
        d().g(u.f.f8033t.a(d().o(), "User canceled log in."));
    }

    public void u(Exception ex) {
        kotlin.jvm.internal.n.e(ex, "ex");
        d().g(u.f.c.d(u.f.f8033t, d().o(), null, ex.getMessage(), null, 8, null));
    }

    public void v(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, i4.h hVar, Date date, Date date2, Date date3) {
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        kotlin.jvm.internal.n.e(userId, "userId");
        d().g(u.f.f8033t.e(d().o(), new i4.a(accessToken, applicationId, userId, collection, collection2, collection3, hVar, date, date2, date3, null, RecognitionOptions.UPC_E, null)));
    }
}
