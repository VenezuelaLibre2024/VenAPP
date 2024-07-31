package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import com.facebook.login.u;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i4.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends androidx.fragment.app.d {
    public static final a M = new a(null);
    private static final String N = "device/login";
    private static final String O = "device/login_status";
    private static final int P = 1349174;
    private View B;
    private TextView C;
    private TextView D;
    private n E;
    private final AtomicBoolean F = new AtomicBoolean();
    private volatile i4.l0 G;
    private volatile ScheduledFuture<?> H;
    private volatile c I;
    private boolean J;
    private boolean K;
    private u.e L;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b b(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    String permission = optJSONObject.optString("permission");
                    kotlin.jvm.internal.n.d(permission, "permission");
                    if (!(permission.length() == 0) && !kotlin.jvm.internal.n.a(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f7961a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f7962b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f7963c;

        public b(List<String> grantedPermissions, List<String> declinedPermissions, List<String> expiredPermissions) {
            kotlin.jvm.internal.n.e(grantedPermissions, "grantedPermissions");
            kotlin.jvm.internal.n.e(declinedPermissions, "declinedPermissions");
            kotlin.jvm.internal.n.e(expiredPermissions, "expiredPermissions");
            this.f7961a = grantedPermissions;
            this.f7962b = declinedPermissions;
            this.f7963c = expiredPermissions;
        }

        public final List<String> a() {
            return this.f7962b;
        }

        public final List<String> b() {
            return this.f7963c;
        }

        public final List<String> c() {
            return this.f7961a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f7965a;

        /* renamed from: b, reason: collision with root package name */
        private String f7966b;

        /* renamed from: c, reason: collision with root package name */
        private String f7967c;

        /* renamed from: d, reason: collision with root package name */
        private long f7968d;

        /* renamed from: e, reason: collision with root package name */
        private long f7969e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f7964f = new b(null);
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.e(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public c() {
        }

        protected c(Parcel parcel) {
            kotlin.jvm.internal.n.e(parcel, "parcel");
            this.f7965a = parcel.readString();
            this.f7966b = parcel.readString();
            this.f7967c = parcel.readString();
            this.f7968d = parcel.readLong();
            this.f7969e = parcel.readLong();
        }

        public final String a() {
            return this.f7965a;
        }

        public final long b() {
            return this.f7968d;
        }

        public final String c() {
            return this.f7967c;
        }

        public final String d() {
            return this.f7966b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final void e(long j10) {
            this.f7968d = j10;
        }

        public final void f(long j10) {
            this.f7969e = j10;
        }

        public final void g(String str) {
            this.f7967c = str;
        }

        public final void h(String str) {
            this.f7966b = str;
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
            this.f7965a = format;
        }

        public final boolean i() {
            return this.f7969e != 0 && (new Date().getTime() - this.f7969e) - (this.f7968d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.e(dest, "dest");
            dest.writeString(this.f7965a);
            dest.writeString(this.f7966b);
            dest.writeString(this.f7967c);
            dest.writeLong(this.f7968d);
            dest.writeLong(this.f7969e);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Dialog {
        d(androidx.fragment.app.e eVar, int i10) {
            super(eVar, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (m.this.F()) {
                super.onBackPressed();
            }
        }
    }

    private final i4.i0 C() {
        Bundle bundle = new Bundle();
        c cVar = this.I;
        bundle.putString("code", cVar == null ? null : cVar.c());
        bundle.putString("access_token", A());
        return i4.i0.f17005n.B(null, O, bundle, new i0.b() { // from class: com.facebook.login.g
            @Override // i4.i0.b
            public final void b(i4.n0 n0Var) {
                m.x(m.this, n0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(m this$0, View view) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.G();
    }

    private final void I(final String str, long j10, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = j10 != 0 ? new Date(new Date().getTime() + (j10 * 1000)) : null;
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date = new Date(l10.longValue() * 1000);
        }
        i4.i0 x10 = i4.i0.f17005n.x(new i4.a(str, i4.e0.m(), "0", null, null, null, null, date2, null, date, null, RecognitionOptions.UPC_E, null), "me", new i0.b() { // from class: com.facebook.login.j
            @Override // i4.i0.b
            public final void b(i4.n0 n0Var) {
                m.J(m.this, str, date2, date, n0Var);
            }
        });
        x10.G(i4.o0.GET);
        x10.H(bundle);
        x10.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(m this$0, String accessToken, Date date, Date date2, i4.n0 response) {
        EnumSet<com.facebook.internal.i0> o10;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(accessToken, "$accessToken");
        kotlin.jvm.internal.n.e(response, "response");
        if (this$0.F.get()) {
            return;
        }
        i4.u b10 = response.b();
        if (b10 != null) {
            i4.r e10 = b10.e();
            if (e10 == null) {
                e10 = new i4.r();
            }
            this$0.H(e10);
            return;
        }
        try {
            JSONObject c10 = response.c();
            if (c10 == null) {
                c10 = new JSONObject();
            }
            String string = c10.getString(FacebookMediationAdapter.KEY_ID);
            kotlin.jvm.internal.n.d(string, "jsonObject.getString(\"id\")");
            b b11 = M.b(c10);
            String string2 = c10.getString("name");
            kotlin.jvm.internal.n.d(string2, "jsonObject.getString(\"name\")");
            c cVar = this$0.I;
            if (cVar != null) {
                v4.a aVar = v4.a.f27907a;
                v4.a.a(cVar.d());
            }
            com.facebook.internal.v vVar = com.facebook.internal.v.f7874a;
            com.facebook.internal.r f10 = com.facebook.internal.v.f(i4.e0.m());
            Boolean bool = null;
            if (f10 != null && (o10 = f10.o()) != null) {
                bool = Boolean.valueOf(o10.contains(com.facebook.internal.i0.RequireConfirm));
            }
            if (!kotlin.jvm.internal.n.a(bool, Boolean.TRUE) || this$0.K) {
                this$0.z(string, b11, accessToken, date, date2);
            } else {
                this$0.K = true;
                this$0.L(string, b11, accessToken, string2, date, date2);
            }
        } catch (JSONException e11) {
            this$0.H(new i4.r(e11));
        }
    }

    private final void K() {
        c cVar = this.I;
        if (cVar != null) {
            cVar.f(new Date().getTime());
        }
        this.G = C().l();
    }

    private final void L(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = getResources().getString(com.facebook.common.d.f7692g);
        kotlin.jvm.internal.n.d(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(com.facebook.common.d.f7691f);
        kotlin.jvm.internal.n.d(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(com.facebook.common.d.f7690e);
        kotlin.jvm.internal.n.d(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m.M(m.this, str, bVar, str2, date, date2, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m.N(m.this, dialogInterface, i10);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(m this$0, String userId, b permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(userId, "$userId");
        kotlin.jvm.internal.n.e(permissions, "$permissions");
        kotlin.jvm.internal.n.e(accessToken, "$accessToken");
        this$0.z(userId, permissions, accessToken, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(m this$0, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        View D = this$0.D(false);
        Dialog h10 = this$0.h();
        if (h10 != null) {
            h10.setContentView(D);
        }
        u.e eVar = this$0.L;
        if (eVar == null) {
            return;
        }
        this$0.R(eVar);
    }

    private final void O() {
        c cVar = this.I;
        Long valueOf = cVar == null ? null : Long.valueOf(cVar.b());
        if (valueOf != null) {
            this.H = n.f7972e.a().schedule(new Runnable() { // from class: com.facebook.login.f
                @Override // java.lang.Runnable
                public final void run() {
                    m.P(m.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(m this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.K();
    }

    private final void Q(c cVar) {
        this.I = cVar;
        TextView textView = this.C;
        if (textView == null) {
            kotlin.jvm.internal.n.p("confirmationCode");
            throw null;
        }
        textView.setText(cVar.d());
        v4.a aVar = v4.a.f27907a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), v4.a.c(cVar.a()));
        TextView textView2 = this.D;
        if (textView2 == null) {
            kotlin.jvm.internal.n.p("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.C;
        if (textView3 == null) {
            kotlin.jvm.internal.n.p("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.B;
        if (view == null) {
            kotlin.jvm.internal.n.p("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.K && v4.a.f(cVar.d())) {
            new com.facebook.appevents.h0(getContext()).f("fb_smart_login_service");
        }
        if (cVar.i()) {
            O();
        } else {
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(m this$0, i4.n0 response) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(response, "response");
        if (this$0.J) {
            return;
        }
        if (response.b() != null) {
            i4.u b10 = response.b();
            i4.r e10 = b10 == null ? null : b10.e();
            if (e10 == null) {
                e10 = new i4.r();
            }
            this$0.H(e10);
            return;
        }
        JSONObject c10 = response.c();
        if (c10 == null) {
            c10 = new JSONObject();
        }
        c cVar = new c();
        try {
            cVar.h(c10.getString("user_code"));
            cVar.g(c10.getString("code"));
            cVar.e(c10.getLong("interval"));
            this$0.Q(cVar);
        } catch (JSONException e11) {
            this$0.H(new i4.r(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(m this$0, i4.n0 response) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(response, "response");
        if (this$0.F.get()) {
            return;
        }
        i4.u b10 = response.b();
        if (b10 == null) {
            try {
                JSONObject c10 = response.c();
                if (c10 == null) {
                    c10 = new JSONObject();
                }
                String string = c10.getString("access_token");
                kotlin.jvm.internal.n.d(string, "resultObject.getString(\"access_token\")");
                this$0.I(string, c10.getLong("expires_in"), Long.valueOf(c10.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e10) {
                this$0.H(new i4.r(e10));
                return;
            }
        }
        int g10 = b10.g();
        boolean z10 = true;
        if (g10 != P && g10 != 1349172) {
            z10 = false;
        }
        if (z10) {
            this$0.O();
            return;
        }
        if (g10 == 1349152) {
            c cVar = this$0.I;
            if (cVar != null) {
                v4.a aVar = v4.a.f27907a;
                v4.a.a(cVar.d());
            }
            u.e eVar = this$0.L;
            if (eVar != null) {
                this$0.R(eVar);
                return;
            }
        } else if (g10 != 1349173) {
            i4.u b11 = response.b();
            i4.r e11 = b11 == null ? null : b11.e();
            if (e11 == null) {
                e11 = new i4.r();
            }
            this$0.H(e11);
            return;
        }
        this$0.G();
    }

    private final void z(String str, b bVar, String str2, Date date, Date date2) {
        n nVar = this.E;
        if (nVar != null) {
            nVar.v(str2, i4.e0.m(), str, bVar.c(), bVar.a(), bVar.b(), i4.h.DEVICE_AUTH, date, null, date2);
        }
        Dialog h10 = h();
        if (h10 == null) {
            return;
        }
        h10.dismiss();
    }

    public String A() {
        return com.facebook.internal.o0.b() + '|' + com.facebook.internal.o0.c();
    }

    protected int B(boolean z10) {
        return z10 ? com.facebook.common.c.f7685d : com.facebook.common.c.f7683b;
    }

    protected View D(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.n.d(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(B(z10), (ViewGroup) null);
        kotlin.jvm.internal.n.d(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(com.facebook.common.b.f7681f);
        kotlin.jvm.internal.n.d(findViewById, "view.findViewById(R.id.progress_bar)");
        this.B = findViewById;
        View findViewById2 = inflate.findViewById(com.facebook.common.b.f7680e);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.C = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(com.facebook.common.b.f7676a);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.E(m.this, view);
            }
        });
        View findViewById4 = inflate.findViewById(com.facebook.common.b.f7677b);
        if (findViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        this.D = textView;
        textView.setText(Html.fromHtml(getString(com.facebook.common.d.f7686a)));
        return inflate;
    }

    protected boolean F() {
        return true;
    }

    protected void G() {
        if (this.F.compareAndSet(false, true)) {
            c cVar = this.I;
            if (cVar != null) {
                v4.a aVar = v4.a.f27907a;
                v4.a.a(cVar.d());
            }
            n nVar = this.E;
            if (nVar != null) {
                nVar.t();
            }
            Dialog h10 = h();
            if (h10 == null) {
                return;
            }
            h10.dismiss();
        }
    }

    protected void H(i4.r ex) {
        kotlin.jvm.internal.n.e(ex, "ex");
        if (this.F.compareAndSet(false, true)) {
            c cVar = this.I;
            if (cVar != null) {
                v4.a aVar = v4.a.f27907a;
                v4.a.a(cVar.d());
            }
            n nVar = this.E;
            if (nVar != null) {
                nVar.u(ex);
            }
            Dialog h10 = h();
            if (h10 == null) {
                return;
            }
            h10.dismiss();
        }
    }

    public void R(u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        this.L = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.n()));
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        com.facebook.internal.n0.r0(bundle, "redirect_uri", request.i());
        com.facebook.internal.n0.r0(bundle, "target_user_id", request.h());
        bundle.putString("access_token", A());
        v4.a aVar = v4.a.f27907a;
        Map<String, String> y10 = y();
        bundle.putString("device_info", v4.a.d(y10 == null ? null : dk.k0.u(y10)));
        i4.i0.f17005n.B(null, N, bundle, new i0.b() { // from class: com.facebook.login.h
            @Override // i4.i0.b
            public final void b(i4.n0 n0Var2) {
                m.S(m.this, n0Var2);
            }
        }).l();
    }

    @Override // androidx.fragment.app.d
    public Dialog j(Bundle bundle) {
        d dVar = new d(requireActivity(), com.facebook.common.e.f7694b);
        dVar.setContentView(D(v4.a.e() && !this.K));
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        u k10;
        kotlin.jvm.internal.n.e(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        y yVar = (y) ((FacebookActivity) requireActivity()).d();
        f0 f0Var = null;
        if (yVar != null && (k10 = yVar.k()) != null) {
            f0Var = k10.j();
        }
        this.E = (n) f0Var;
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            Q(cVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.J = true;
        this.F.set(true);
        super.onDestroyView();
        i4.l0 l0Var = this.G;
        if (l0Var != null) {
            l0Var.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.H;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.n.e(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.J) {
            return;
        }
        G();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.e(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.I != null) {
            outState.putParcelable("request_state", this.I);
        }
    }

    public Map<String, String> y() {
        return null;
    }
}
