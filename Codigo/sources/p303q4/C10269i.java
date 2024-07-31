package p303q4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.C4578h0;
import com.facebook.appevents.C4589o;
import com.facebook.internal.C4639q;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p264o4.C9787i;

/* renamed from: q4.i */
/* loaded from: classes.dex */
public final class C10269i {

    /* renamed from: a */
    public static final C10269i f25492a = new C10269i();

    /* renamed from: b */
    private static final String f25493b = C10269i.class.getCanonicalName();

    /* renamed from: c */
    private static final C4578h0 f25494c = new C4578h0(C7799e0.m23860l());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4.i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private BigDecimal f25495a;

        /* renamed from: b */
        private Currency f25496b;

        /* renamed from: c */
        private Bundle f25497c;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param) {
            C9322n.m27781e(purchaseAmount, "purchaseAmount");
            C9322n.m27781e(currency, "currency");
            C9322n.m27781e(param, "param");
            this.f25495a = purchaseAmount;
            this.f25496b = currency;
            this.f25497c = param;
        }

        /* renamed from: a */
        public final Currency m30759a() {
            return this.f25496b;
        }

        /* renamed from: b */
        public final Bundle m30760b() {
            return this.f25497c;
        }

        /* renamed from: c */
        public final BigDecimal m30761c() {
            return this.f25495a;
        }
    }

    private C10269i() {
    }

    /* renamed from: a */
    private final a m30753a(String str, String str2) {
        return m30754b(str, str2, new HashMap());
    }

    /* renamed from: b */
    private final a m30754b(String str, String str2, Map<String, String> map) {
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
            if (C9322n.m27777a(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                C9322n.m27780d(introductoryPriceCycles, "introductoryPriceCycles");
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
            C9322n.m27780d(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e10) {
            Log.e(f25493b, "Error parsing in-app subscription data.", e10);
            return null;
        }
    }

    /* renamed from: c */
    public static final boolean m30755c() {
        C4641r m11447f = C4648v.m11447f(C7799e0.m23861m());
        return m11447f != null && C7799e0.m23864p() && m11447f.m11380f();
    }

    /* renamed from: d */
    public static final void m30756d() {
        Context m23860l = C7799e0.m23860l();
        String m23861m = C7799e0.m23861m();
        if (C7799e0.m23864p()) {
            if (m23860l instanceof Application) {
                C4589o.f8635b.m11050a((Application) m23860l, m23861m);
            } else {
                Log.w(f25493b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    /* renamed from: e */
    public static final void m30757e(String str, long j10) {
        Context m23860l = C7799e0.m23860l();
        C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
        if (m11457q == null || !m11457q.m11375a() || j10 <= 0) {
            return;
        }
        C4578h0 c4578h0 = new C4578h0(m23860l);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        c4578h0.m10995c("fb_aa_time_spent_on_view", j10, bundle);
    }

    /* renamed from: f */
    public static final void m30758f(String purchase, String skuDetails, boolean z10) {
        a m30753a;
        C9322n.m27781e(purchase, "purchase");
        C9322n.m27781e(skuDetails, "skuDetails");
        if (m30755c() && (m30753a = f25492a.m30753a(purchase, skuDetails)) != null) {
            boolean z11 = false;
            if (z10) {
                C4639q c4639q = C4639q.f8777a;
                if (C4639q.m11365d("app_events_if_auto_log_subs", C7799e0.m23861m(), false)) {
                    z11 = true;
                }
            }
            if (z11) {
                f25494c.m11001i(C9787i.f24152a.m29401m(skuDetails) ? "StartTrial" : "Subscribe", m30753a.m30761c(), m30753a.m30759a(), m30753a.m30760b());
            } else {
                f25494c.m11002j(m30753a.m30761c(), m30753a.m30759a(), m30753a.m30760b());
            }
        }
    }
}
