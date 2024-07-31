package q4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.h0;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final i f23524a = new i();

    /* renamed from: b */
    private static final String f23525b = i.class.getCanonicalName();

    /* renamed from: c */
    private static final h0 f23526c = new h0(e0.l());

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private BigDecimal f23527a;

        /* renamed from: b */
        private Currency f23528b;

        /* renamed from: c */
        private Bundle f23529c;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param) {
            kotlin.jvm.internal.n.e(purchaseAmount, "purchaseAmount");
            kotlin.jvm.internal.n.e(currency, "currency");
            kotlin.jvm.internal.n.e(param, "param");
            this.f23527a = purchaseAmount;
            this.f23528b = currency;
            this.f23529c = param;
        }

        public final Currency a() {
            return this.f23528b;
        }

        public final Bundle b() {
            return this.f23529c;
        }

        public final BigDecimal c() {
            return this.f23527a;
        }
    }

    private i() {
    }

    private final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    private final a b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z10 = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (kotlin.jvm.internal.n.a(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                kotlin.jvm.internal.n.d(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            kotlin.jvm.internal.n.d(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e10) {
            Log.e(f23525b, "Error parsing in-app subscription data.", e10);
            return null;
        }
    }

    public static final boolean c() {
        r f10 = v.f(e0.m());
        return f10 != null && e0.p() && f10.f();
    }

    public static final void d() {
        Context l10 = e0.l();
        String m10 = e0.m();
        if (e0.p()) {
            if (l10 instanceof Application) {
                com.facebook.appevents.o.f7660b.a((Application) l10, m10);
            } else {
                Log.w(f23525b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void e(String str, long j10) {
        Context l10 = e0.l();
        r q10 = v.q(e0.m(), false);
        if (q10 == null || !q10.a() || j10 <= 0) {
            return;
        }
        h0 h0Var = new h0(l10);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        h0Var.c("fb_aa_time_spent_on_view", j10, bundle);
    }

    public static final void f(String purchase, String skuDetails, boolean z10) {
        a a10;
        kotlin.jvm.internal.n.e(purchase, "purchase");
        kotlin.jvm.internal.n.e(skuDetails, "skuDetails");
        if (c() && (a10 = f23524a.a(purchase, skuDetails)) != null) {
            boolean z11 = false;
            if (z10) {
                q qVar = q.f7797a;
                if (q.d("app_events_if_auto_log_subs", e0.m(), false)) {
                    z11 = true;
                }
            }
            if (z11) {
                f23526c.i(o4.i.f22219a.m(skuDetails) ? "StartTrial" : "Subscribe", a10.c(), a10.a(), a10.b());
            } else {
                f23526c.j(a10.c(), a10.a(), a10.b());
            }
        }
    }
}
