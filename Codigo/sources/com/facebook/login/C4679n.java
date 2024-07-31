package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC1263e;
import com.facebook.login.C4689u;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;
import p152i4.EnumC7804h;

/* renamed from: com.facebook.login.n */
/* loaded from: classes.dex */
public class C4679n extends AbstractC4664f0 {

    /* renamed from: f */
    private static ScheduledThreadPoolExecutor f8968f;

    /* renamed from: d */
    private final String f8969d;

    /* renamed from: e */
    public static final b f8967e = new b(null);
    public static final Parcelable.Creator<C4679n> CREATOR = new a();

    /* renamed from: com.facebook.login.n$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C4679n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4679n createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C4679n(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4679n[] newArray(int i10) {
            return new C4679n[i10];
        }
    }

    /* renamed from: com.facebook.login.n$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final synchronized ScheduledThreadPoolExecutor m11643a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (C4679n.f8968f == null) {
                C4679n.f8968f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = C4679n.f8968f;
            if (scheduledThreadPoolExecutor == null) {
                C9322n.m27792p("backgroundExecutor");
                throw null;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C4679n(Parcel parcel) {
        super(parcel);
        C9322n.m27781e(parcel, "parcel");
        this.f8969d = "device_auth";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4679n(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
        this.f8969d = "device_auth";
    }

    /* renamed from: w */
    private final void m11636w(C4689u.e eVar) {
        ActivityC1263e m11696i = m11555d().m11696i();
        if (m11696i == null || m11696i.isFinishing()) {
            return;
        }
        C4677m m11637s = m11637s();
        m11637s.mo6926p(m11696i.getSupportFragmentManager(), "login_with_facebook");
        m11637s.m11612R(eVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: f */
    public String mo11494f() {
        return this.f8969d;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: o */
    public int mo11498o(C4689u.e request) {
        C9322n.m27781e(request, "request");
        m11636w(request);
        return 1;
    }

    /* renamed from: s */
    protected C4677m m11637s() {
        return new C4677m();
    }

    /* renamed from: t */
    public void m11638t() {
        m11555d().m11695g(C4689u.f.f9032t.m11749a(m11555d().m11701o(), "User canceled log in."));
    }

    /* renamed from: u */
    public void m11639u(Exception ex) {
        C9322n.m27781e(ex, "ex");
        m11555d().m11695g(C4689u.f.c.m11748d(C4689u.f.f9032t, m11555d().m11701o(), null, ex.getMessage(), null, 8, null));
    }

    /* renamed from: v */
    public void m11640v(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC7804h enumC7804h, Date date, Date date2, Date date3) {
        C9322n.m27781e(accessToken, "accessToken");
        C9322n.m27781e(applicationId, "applicationId");
        C9322n.m27781e(userId, "userId");
        m11555d().m11695g(C4689u.f.f9032t.m11752e(m11555d().m11701o(), new C7787a(accessToken, applicationId, userId, collection, collection2, collection3, enumC7804h, date, date2, date3, null, RecognitionOptions.UPC_E, null)));
    }
}
