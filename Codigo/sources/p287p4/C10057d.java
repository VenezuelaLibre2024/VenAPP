package p287p4;

import android.os.Bundle;
import ck.C2025j;
import ck.InterfaceC2023h;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import dk.C7030q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import p007a5.C0033a;
import p152i4.C7799e0;
import p280ok.InterfaceC9987a;

/* renamed from: p4.d */
/* loaded from: classes.dex */
public final class C10057d {

    /* renamed from: a */
    public static final C10057d f24700a = new C10057d();

    /* renamed from: b */
    private static boolean f24701b;

    /* renamed from: c */
    private static final InterfaceC2023h f24702c;

    /* renamed from: d */
    private static HashSet<String> f24703d;

    /* renamed from: p4.d$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9987a<HashSet<String>> {

        /* renamed from: a */
        public static final a f24704a = new a();

        a() {
            super(0);
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashSet<String> invoke() {
            HashSet<String> m20574f;
            m20574f = C7030q0.m20574f("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_search_string", "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
            return m20574f;
        }
    }

    static {
        InterfaceC2023h m10334a;
        m10334a = C2025j.m10334a(a.f24704a);
        f24702c = m10334a;
    }

    private C10057d() {
    }

    /* renamed from: a */
    private final HashSet<String> m29990a(JSONArray jSONArray) {
        if (!C0033a.m107d(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            String string = jSONArray.getString(i10);
                            C9322n.m27780d(string, "jsonArray.getString(i)");
                            hashSet.add(string);
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    return hashSet;
                }
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final void m29991b() {
        if (C0033a.m107d(C10057d.class)) {
            return;
        }
        try {
            f24701b = true;
            f24700a.m29992d();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10057d.class);
        }
    }

    /* renamed from: d */
    private final void m29992d() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
            if (m11457q == null) {
                return;
            }
            HashSet<String> m29990a = m29990a(m11457q.m11382h());
            if (m29990a == null) {
                m29990a = m29994c();
            }
            f24703d = m29990a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: e */
    public static final void m29993e(Bundle bundle) {
        if (C0033a.m107d(C10057d.class)) {
            return;
        }
        try {
            if (f24701b && bundle != null && !bundle.isEmpty() && f24703d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                C9322n.m27780d(keySet, "parameters.keySet()");
                for (String param : keySet) {
                    HashSet<String> hashSet = f24703d;
                    C9322n.m27778b(hashSet);
                    if (!hashSet.contains(param)) {
                        C9322n.m27780d(param, "param");
                        arrayList.add(param);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10057d.class);
        }
    }

    /* renamed from: c */
    public final HashSet<String> m29994c() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return (HashSet) f24702c.getValue();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: f */
    public final boolean m29995f(Bundle parameters) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            C9322n.m27781e(parameters, "parameters");
            if (parameters.containsKey("pm")) {
                return C9322n.m27777a(parameters.get("pm"), "1");
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }
}
