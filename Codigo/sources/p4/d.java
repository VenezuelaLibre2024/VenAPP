package p4;

import android.os.Bundle;
import ck.h;
import ck.j;
import com.facebook.internal.r;
import com.facebook.internal.v;
import dk.q0;
import i4.e0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f22767a = new d();

    /* renamed from: b */
    private static boolean f22768b;

    /* renamed from: c */
    private static final h f22769c;

    /* renamed from: d */
    private static HashSet<String> f22770d;

    /* loaded from: classes.dex */
    static final class a extends o implements ok.a<HashSet<String>> {

        /* renamed from: a */
        public static final a f22771a = new a();

        a() {
            super(0);
        }

        @Override // ok.a
        /* renamed from: a */
        public final HashSet<String> invoke() {
            HashSet<String> f10;
            f10 = q0.f("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_search_string", "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
            return f10;
        }
    }

    static {
        h a10;
        a10 = j.a(a.f22771a);
        f22769c = a10;
    }

    private d() {
    }

    private final HashSet<String> a(JSONArray jSONArray) {
        if (!a5.a.d(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            String string = jSONArray.getString(i10);
                            n.d(string, "jsonArray.getString(i)");
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
                a5.a.b(th2, this);
            }
        }
        return null;
    }

    public static final void b() {
        if (a5.a.d(d.class)) {
            return;
        }
        try {
            f22768b = true;
            f22767a.d();
        } catch (Throwable th2) {
            a5.a.b(th2, d.class);
        }
    }

    private final void d() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f7874a;
            r q10 = v.q(e0.m(), false);
            if (q10 == null) {
                return;
            }
            HashSet<String> a10 = a(q10.h());
            if (a10 == null) {
                a10 = c();
            }
            f22770d = a10;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void e(Bundle bundle) {
        if (a5.a.d(d.class)) {
            return;
        }
        try {
            if (f22768b && bundle != null && !bundle.isEmpty() && f22770d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                n.d(keySet, "parameters.keySet()");
                for (String param : keySet) {
                    HashSet<String> hashSet = f22770d;
                    n.b(hashSet);
                    if (!hashSet.contains(param)) {
                        n.d(param, "param");
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
            a5.a.b(th2, d.class);
        }
    }

    public final HashSet<String> c() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return (HashSet) f22769c.getValue();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final boolean f(Bundle parameters) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            n.e(parameters, "parameters");
            if (parameters.containsKey("pm")) {
                return n.a(parameters.get("pm"), "1");
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }
}
