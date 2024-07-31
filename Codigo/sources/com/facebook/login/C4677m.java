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
import androidx.fragment.app.ActivityC1263e;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d;
import com.facebook.FacebookActivity;
import com.facebook.appevents.C4578h0;
import com.facebook.common.C4602b;
import com.facebook.common.C4603c;
import com.facebook.common.C4604d;
import com.facebook.common.C4605e;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import com.facebook.internal.EnumC4624i0;
import com.facebook.login.C4689u;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7018k0;
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
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.AsyncTaskC7813l0;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.C7824r;
import p152i4.C7830u;
import p152i4.EnumC7804h;
import p152i4.EnumC7819o0;
import p394v4.C11626a;

/* renamed from: com.facebook.login.m */
/* loaded from: classes.dex */
public class C4677m extends DialogInterfaceOnCancelListenerC1261d {

    /* renamed from: M */
    public static final a f8941M = new a(null);

    /* renamed from: N */
    private static final String f8942N = "device/login";

    /* renamed from: O */
    private static final String f8943O = "device/login_status";

    /* renamed from: P */
    private static final int f8944P = 1349174;

    /* renamed from: B */
    private View f8945B;

    /* renamed from: C */
    private TextView f8946C;

    /* renamed from: D */
    private TextView f8947D;

    /* renamed from: E */
    private C4679n f8948E;

    /* renamed from: F */
    private final AtomicBoolean f8949F = new AtomicBoolean();

    /* renamed from: G */
    private volatile AsyncTaskC7813l0 f8950G;

    /* renamed from: H */
    private volatile ScheduledFuture<?> f8951H;

    /* renamed from: I */
    private volatile c f8952I;

    /* renamed from: J */
    private boolean f8953J;

    /* renamed from: K */
    private boolean f8954K;

    /* renamed from: L */
    private C4689u.e f8955L;

    /* renamed from: com.facebook.login.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final b m11615b(JSONObject jSONObject) {
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
                    C9322n.m27780d(permission, "permission");
                    if (!(permission.length() == 0) && !C9322n.m27777a(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
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
    /* renamed from: com.facebook.login.m$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private List<String> f8956a;

        /* renamed from: b */
        private List<String> f8957b;

        /* renamed from: c */
        private List<String> f8958c;

        public b(List<String> grantedPermissions, List<String> declinedPermissions, List<String> expiredPermissions) {
            C9322n.m27781e(grantedPermissions, "grantedPermissions");
            C9322n.m27781e(declinedPermissions, "declinedPermissions");
            C9322n.m27781e(expiredPermissions, "expiredPermissions");
            this.f8956a = grantedPermissions;
            this.f8957b = declinedPermissions;
            this.f8958c = expiredPermissions;
        }

        /* renamed from: a */
        public final List<String> m11616a() {
            return this.f8957b;
        }

        /* renamed from: b */
        public final List<String> m11617b() {
            return this.f8958c;
        }

        /* renamed from: c */
        public final List<String> m11618c() {
            return this.f8956a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.login.m$c */
    /* loaded from: classes.dex */
    public static final class c implements Parcelable {

        /* renamed from: a */
        private String f8960a;

        /* renamed from: b */
        private String f8961b;

        /* renamed from: c */
        private String f8962c;

        /* renamed from: d */
        private long f8963d;

        /* renamed from: e */
        private long f8964e;

        /* renamed from: f */
        public static final b f8959f = new b(null);
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: com.facebook.login.m$c$a */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                C9322n.m27781e(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* renamed from: com.facebook.login.m$c$b */
        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(C9315g c9315g) {
                this();
            }
        }

        public c() {
        }

        protected c(Parcel parcel) {
            C9322n.m27781e(parcel, "parcel");
            this.f8960a = parcel.readString();
            this.f8961b = parcel.readString();
            this.f8962c = parcel.readString();
            this.f8963d = parcel.readLong();
            this.f8964e = parcel.readLong();
        }

        /* renamed from: a */
        public final String m11619a() {
            return this.f8960a;
        }

        /* renamed from: b */
        public final long m11620b() {
            return this.f8963d;
        }

        /* renamed from: c */
        public final String m11621c() {
            return this.f8962c;
        }

        /* renamed from: d */
        public final String m11622d() {
            return this.f8961b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final void m11623e(long j10) {
            this.f8963d = j10;
        }

        /* renamed from: f */
        public final void m11624f(long j10) {
            this.f8964e = j10;
        }

        /* renamed from: g */
        public final void m11625g(String str) {
            this.f8962c = str;
        }

        /* renamed from: h */
        public final void m11626h(String str) {
            this.f8961b = str;
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            this.f8960a = format;
        }

        /* renamed from: i */
        public final boolean m11627i() {
            return this.f8964e != 0 && (new Date().getTime() - this.f8964e) - (this.f8963d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            C9322n.m27781e(dest, "dest");
            dest.writeString(this.f8960a);
            dest.writeString(this.f8961b);
            dest.writeString(this.f8962c);
            dest.writeLong(this.f8963d);
            dest.writeLong(this.f8964e);
        }
    }

    /* renamed from: com.facebook.login.m$d */
    /* loaded from: classes.dex */
    public static final class d extends Dialog {
        d(ActivityC1263e activityC1263e, int i10) {
            super(activityC1263e, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (C4677m.this.m11609F()) {
                super.onBackPressed();
            }
        }
    }

    /* renamed from: C */
    private final C7807i0 m11585C() {
        Bundle bundle = new Bundle();
        c cVar = this.f8952I;
        bundle.putString("code", cVar == null ? null : cVar.m11621c());
        bundle.putString("access_token", m11606A());
        return C7807i0.f18658n.m23988B(null, f8943O, bundle, new C7807i0.b() { // from class: com.facebook.login.g
            @Override // p152i4.C7807i0.b
            /* renamed from: b */
            public final void mo9121b(C7817n0 c7817n0) {
                C4677m.m11604x(C4677m.this, c7817n0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m11586E(C4677m this$0, View view) {
        C9322n.m27781e(this$0, "this$0");
        this$0.m11610G();
    }

    /* renamed from: I */
    private final void m11587I(final String str, long j10, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = j10 != 0 ? new Date(new Date().getTime() + (j10 * 1000)) : null;
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date = new Date(l10.longValue() * 1000);
        }
        C7807i0 m24001x = C7807i0.f18658n.m24001x(new C7787a(str, C7799e0.m23861m(), "0", null, null, null, null, date2, null, date, null, RecognitionOptions.UPC_E, null), "me", new C7807i0.b() { // from class: com.facebook.login.j
            @Override // p152i4.C7807i0.b
            /* renamed from: b */
            public final void mo9121b(C7817n0 c7817n0) {
                C4677m.m11588J(C4677m.this, str, date2, date, c7817n0);
            }
        });
        m24001x.m23946G(EnumC7819o0.GET);
        m24001x.m23947H(bundle);
        m24001x.m23950l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m11588J(C4677m this$0, String accessToken, Date date, Date date2, C7817n0 response) {
        EnumSet<EnumC4624i0> m11389o;
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(accessToken, "$accessToken");
        C9322n.m27781e(response, "response");
        if (this$0.f8949F.get()) {
            return;
        }
        C7830u m24061b = response.m24061b();
        if (m24061b != null) {
            C7824r m24102e = m24061b.m24102e();
            if (m24102e == null) {
                m24102e = new C7824r();
            }
            this$0.m11611H(m24102e);
            return;
        }
        try {
            JSONObject m24062c = response.m24062c();
            if (m24062c == null) {
                m24062c = new JSONObject();
            }
            String string = m24062c.getString(FacebookMediationAdapter.KEY_ID);
            C9322n.m27780d(string, "jsonObject.getString(\"id\")");
            b m11615b = f8941M.m11615b(m24062c);
            String string2 = m24062c.getString("name");
            C9322n.m27780d(string2, "jsonObject.getString(\"name\")");
            c cVar = this$0.f8952I;
            if (cVar != null) {
                C11626a c11626a = C11626a.f30231a;
                C11626a.m36421a(cVar.m11622d());
            }
            C4648v c4648v = C4648v.f8854a;
            C4641r m11447f = C4648v.m11447f(C7799e0.m23861m());
            Boolean bool = null;
            if (m11447f != null && (m11389o = m11447f.m11389o()) != null) {
                bool = Boolean.valueOf(m11389o.contains(EnumC4624i0.RequireConfirm));
            }
            if (!C9322n.m27777a(bool, Boolean.TRUE) || this$0.f8954K) {
                this$0.m11605z(string, m11615b, accessToken, date, date2);
            } else {
                this$0.f8954K = true;
                this$0.m11590L(string, m11615b, accessToken, string2, date, date2);
            }
        } catch (JSONException e10) {
            this$0.m11611H(new C7824r(e10));
        }
    }

    /* renamed from: K */
    private final void m11589K() {
        c cVar = this.f8952I;
        if (cVar != null) {
            cVar.m11624f(new Date().getTime());
        }
        this.f8950G = m11585C().m23950l();
    }

    /* renamed from: L */
    private final void m11590L(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = getResources().getString(C4604d.f8667g);
        C9322n.m27780d(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(C4604d.f8666f);
        C9322n.m27780d(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(C4604d.f8665e);
        C9322n.m27780d(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C4677m.m11591M(C4677m.this, str, bVar, str2, date, date2, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C4677m.m11592N(C4677m.this, dialogInterface, i10);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m11591M(C4677m this$0, String userId, b permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(userId, "$userId");
        C9322n.m27781e(permissions, "$permissions");
        C9322n.m27781e(accessToken, "$accessToken");
        this$0.m11605z(userId, permissions, accessToken, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m11592N(C4677m this$0, DialogInterface dialogInterface, int i10) {
        C9322n.m27781e(this$0, "this$0");
        View m11608D = this$0.m11608D(false);
        Dialog m6919h = this$0.m6919h();
        if (m6919h != null) {
            m6919h.setContentView(m11608D);
        }
        C4689u.e eVar = this$0.f8955L;
        if (eVar == null) {
            return;
        }
        this$0.m11612R(eVar);
    }

    /* renamed from: O */
    private final void m11593O() {
        c cVar = this.f8952I;
        Long valueOf = cVar == null ? null : Long.valueOf(cVar.m11620b());
        if (valueOf != null) {
            this.f8951H = C4679n.f8967e.m11643a().schedule(new Runnable() { // from class: com.facebook.login.f
                @Override // java.lang.Runnable
                public final void run() {
                    C4677m.m11594P(C4677m.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m11594P(C4677m this$0) {
        C9322n.m27781e(this$0, "this$0");
        this$0.m11589K();
    }

    /* renamed from: Q */
    private final void m11595Q(c cVar) {
        this.f8952I = cVar;
        TextView textView = this.f8946C;
        if (textView == null) {
            C9322n.m27792p("confirmationCode");
            throw null;
        }
        textView.setText(cVar.m11622d());
        C11626a c11626a = C11626a.f30231a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), C11626a.m36423c(cVar.m11619a()));
        TextView textView2 = this.f8947D;
        if (textView2 == null) {
            C9322n.m27792p("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f8946C;
        if (textView3 == null) {
            C9322n.m27792p("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f8945B;
        if (view == null) {
            C9322n.m27792p("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f8954K && C11626a.m36426f(cVar.m11622d())) {
            new C4578h0(getContext()).m10998f("fb_smart_login_service");
        }
        if (cVar.m11627i()) {
            m11593O();
        } else {
            m11589K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m11596S(C4677m this$0, C7817n0 response) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(response, "response");
        if (this$0.f8953J) {
            return;
        }
        if (response.m24061b() != null) {
            C7830u m24061b = response.m24061b();
            C7824r m24102e = m24061b == null ? null : m24061b.m24102e();
            if (m24102e == null) {
                m24102e = new C7824r();
            }
            this$0.m11611H(m24102e);
            return;
        }
        JSONObject m24062c = response.m24062c();
        if (m24062c == null) {
            m24062c = new JSONObject();
        }
        c cVar = new c();
        try {
            cVar.m11626h(m24062c.getString("user_code"));
            cVar.m11625g(m24062c.getString("code"));
            cVar.m11623e(m24062c.getLong("interval"));
            this$0.m11595Q(cVar);
        } catch (JSONException e10) {
            this$0.m11611H(new C7824r(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m11604x(C4677m this$0, C7817n0 response) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(response, "response");
        if (this$0.f8949F.get()) {
            return;
        }
        C7830u m24061b = response.m24061b();
        if (m24061b == null) {
            try {
                JSONObject m24062c = response.m24062c();
                if (m24062c == null) {
                    m24062c = new JSONObject();
                }
                String string = m24062c.getString("access_token");
                C9322n.m27780d(string, "resultObject.getString(\"access_token\")");
                this$0.m11587I(string, m24062c.getLong("expires_in"), Long.valueOf(m24062c.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e10) {
                this$0.m11611H(new C7824r(e10));
                return;
            }
        }
        int m24104g = m24061b.m24104g();
        boolean z10 = true;
        if (m24104g != f8944P && m24104g != 1349172) {
            z10 = false;
        }
        if (z10) {
            this$0.m11593O();
            return;
        }
        if (m24104g == 1349152) {
            c cVar = this$0.f8952I;
            if (cVar != null) {
                C11626a c11626a = C11626a.f30231a;
                C11626a.m36421a(cVar.m11622d());
            }
            C4689u.e eVar = this$0.f8955L;
            if (eVar != null) {
                this$0.m11612R(eVar);
                return;
            }
        } else if (m24104g != 1349173) {
            C7830u m24061b2 = response.m24061b();
            C7824r m24102e = m24061b2 == null ? null : m24061b2.m24102e();
            if (m24102e == null) {
                m24102e = new C7824r();
            }
            this$0.m11611H(m24102e);
            return;
        }
        this$0.m11610G();
    }

    /* renamed from: z */
    private final void m11605z(String str, b bVar, String str2, Date date, Date date2) {
        C4679n c4679n = this.f8948E;
        if (c4679n != null) {
            c4679n.m11640v(str2, C7799e0.m23861m(), str, bVar.m11618c(), bVar.m11616a(), bVar.m11617b(), EnumC7804h.DEVICE_AUTH, date, null, date2);
        }
        Dialog m6919h = m6919h();
        if (m6919h == null) {
            return;
        }
        m6919h.dismiss();
    }

    /* renamed from: A */
    public String m11606A() {
        return C4636o0.m11351b() + '|' + C4636o0.m11352c();
    }

    /* renamed from: B */
    protected int m11607B(boolean z10) {
        return z10 ? C4603c.f8660d : C4603c.f8658b;
    }

    /* renamed from: D */
    protected View m11608D(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C9322n.m27780d(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(m11607B(z10), (ViewGroup) null);
        C9322n.m27780d(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(C4602b.f8656f);
        C9322n.m27780d(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f8945B = findViewById;
        View findViewById2 = inflate.findViewById(C4602b.f8655e);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f8946C = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C4602b.f8651a);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4677m.m11586E(C4677m.this, view);
            }
        });
        View findViewById4 = inflate.findViewById(C4602b.f8652b);
        if (findViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        this.f8947D = textView;
        textView.setText(Html.fromHtml(getString(C4604d.f8661a)));
        return inflate;
    }

    /* renamed from: F */
    protected boolean m11609F() {
        return true;
    }

    /* renamed from: G */
    protected void m11610G() {
        if (this.f8949F.compareAndSet(false, true)) {
            c cVar = this.f8952I;
            if (cVar != null) {
                C11626a c11626a = C11626a.f30231a;
                C11626a.m36421a(cVar.m11622d());
            }
            C4679n c4679n = this.f8948E;
            if (c4679n != null) {
                c4679n.m11638t();
            }
            Dialog m6919h = m6919h();
            if (m6919h == null) {
                return;
            }
            m6919h.dismiss();
        }
    }

    /* renamed from: H */
    protected void m11611H(C7824r ex) {
        C9322n.m27781e(ex, "ex");
        if (this.f8949F.compareAndSet(false, true)) {
            c cVar = this.f8952I;
            if (cVar != null) {
                C11626a c11626a = C11626a.f30231a;
                C11626a.m36421a(cVar.m11622d());
            }
            C4679n c4679n = this.f8948E;
            if (c4679n != null) {
                c4679n.m11639u(ex);
            }
            Dialog m6919h = m6919h();
            if (m6919h == null) {
                return;
            }
            m6919h.dismiss();
        }
    }

    /* renamed from: R */
    public void m11612R(C4689u.e request) {
        C9322n.m27781e(request, "request");
        this.f8955L = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.m11730n()));
        C4634n0 c4634n0 = C4634n0.f8760a;
        C4634n0.m11328r0(bundle, "redirect_uri", request.m11725i());
        C4634n0.m11328r0(bundle, "target_user_id", request.m11724h());
        bundle.putString("access_token", m11606A());
        C11626a c11626a = C11626a.f30231a;
        Map<String, String> m11613y = m11613y();
        bundle.putString("device_info", C11626a.m36424d(m11613y == null ? null : C7018k0.m20434u(m11613y)));
        C7807i0.f18658n.m23988B(null, f8942N, bundle, new C7807i0.b() { // from class: com.facebook.login.h
            @Override // p152i4.C7807i0.b
            /* renamed from: b */
            public final void mo9121b(C7817n0 c7817n0) {
                C4677m.m11596S(C4677m.this, c7817n0);
            }
        }).m23950l();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d
    /* renamed from: j */
    public Dialog mo6921j(Bundle bundle) {
        d dVar = new d(requireActivity(), C4605e.f8669b);
        dVar.setContentView(m11608D(C11626a.m36425e() && !this.f8954K));
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        C4689u m11770k;
        C9322n.m27781e(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C4693y c4693y = (C4693y) ((FacebookActivity) requireActivity()).m10922d();
        AbstractC4664f0 abstractC4664f0 = null;
        if (c4693y != null && (m11770k = c4693y.m11770k()) != null) {
            abstractC4664f0 = m11770k.m11697j();
        }
        this.f8948E = (C4679n) abstractC4664f0;
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            m11595Q(cVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f8953J = true;
        this.f8949F.set(true);
        super.onDestroyView();
        AsyncTaskC7813l0 asyncTaskC7813l0 = this.f8950G;
        if (asyncTaskC7813l0 != null) {
            asyncTaskC7813l0.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.f8951H;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        C9322n.m27781e(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f8953J) {
            return;
        }
        m11610G();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        C9322n.m27781e(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f8952I != null) {
            outState.putParcelable("request_state", this.f8952I);
        }
    }

    /* renamed from: y */
    public Map<String, String> m11613y() {
        return null;
    }
}
