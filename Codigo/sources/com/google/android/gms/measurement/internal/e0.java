package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.facebook.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzgk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e0 {
    public static final h4<Long> A;
    public static final h4<Boolean> A0;
    public static final h4<Long> B;
    public static final h4<Boolean> B0;
    public static final h4<Long> C;
    public static final h4<Boolean> C0;
    public static final h4<Long> D;
    public static final h4<Boolean> D0;
    public static final h4<Integer> E;
    public static final h4<Boolean> E0;
    public static final h4<Long> F;
    public static final h4<Boolean> F0;
    public static final h4<Integer> G;
    public static final h4<Boolean> G0;
    public static final h4<Integer> H;
    public static final h4<Boolean> H0;
    public static final h4<Integer> I;
    public static final h4<Boolean> I0;
    public static final h4<Integer> J;
    public static final h4<Boolean> J0;
    public static final h4<Integer> K;
    public static final h4<Boolean> K0;
    public static final h4<Long> L;
    public static final h4<Boolean> L0;
    public static final h4<Boolean> M;
    public static final h4<Boolean> M0;
    public static final h4<String> N;
    public static final h4<Boolean> N0;
    public static final h4<Long> O;
    public static final h4<Boolean> O0;
    public static final h4<Integer> P;
    private static final h4<Boolean> P0;
    public static final h4<Double> Q;
    public static final h4<Boolean> Q0;
    public static final h4<Integer> R;
    public static final h4<Boolean> R0;
    public static final h4<Integer> S;
    public static final h4<Boolean> S0;
    private static final h4<Integer> T;
    public static final h4<Boolean> T0;
    public static final h4<Integer> U;
    public static final h4<Boolean> U0;
    public static final h4<Long> V;
    public static final h4<Boolean> V0;
    public static final h4<Long> W;
    public static final h4<Boolean> W0;
    public static final h4<Integer> X;
    public static final h4<Boolean> X0;
    public static final h4<String> Y;
    public static final h4<Boolean> Y0;
    public static final h4<String> Z;
    public static final h4<Boolean> Z0;

    /* renamed from: a0 */
    public static final h4<String> f10088a0;

    /* renamed from: a1 */
    public static final h4<Boolean> f10089a1;

    /* renamed from: b0 */
    public static final h4<String> f10091b0;

    /* renamed from: b1 */
    public static h4<Boolean> f10092b1;

    /* renamed from: c0 */
    public static final h4<String> f10094c0;

    /* renamed from: d0 */
    public static final h4<String> f10096d0;

    /* renamed from: e0 */
    public static final h4<String> f10098e0;

    /* renamed from: f0 */
    public static final h4<Boolean> f10100f0;

    /* renamed from: g0 */
    public static final h4<Boolean> f10102g0;

    /* renamed from: h0 */
    public static final h4<Boolean> f10104h0;

    /* renamed from: i0 */
    public static final h4<Boolean> f10106i0;

    /* renamed from: j0 */
    public static final h4<Boolean> f10108j0;

    /* renamed from: k0 */
    public static final h4<Boolean> f10110k0;

    /* renamed from: l */
    public static final h4<Integer> f10111l;

    /* renamed from: l0 */
    public static final h4<Boolean> f10112l0;

    /* renamed from: m */
    public static final h4<Integer> f10113m;

    /* renamed from: m0 */
    public static final h4<Boolean> f10114m0;

    /* renamed from: n */
    public static final h4<Integer> f10115n;

    /* renamed from: n0 */
    public static final h4<Boolean> f10116n0;

    /* renamed from: o */
    public static final h4<Integer> f10117o;

    /* renamed from: o0 */
    public static final h4<Boolean> f10118o0;

    /* renamed from: p */
    public static final h4<Integer> f10119p;

    /* renamed from: p0 */
    public static final h4<Boolean> f10120p0;

    /* renamed from: q */
    public static final h4<Integer> f10121q;

    /* renamed from: q0 */
    public static final h4<Boolean> f10122q0;

    /* renamed from: r */
    public static final h4<Integer> f10123r;

    /* renamed from: r0 */
    public static final h4<Integer> f10124r0;

    /* renamed from: s */
    public static final h4<String> f10125s;

    /* renamed from: s0 */
    private static final h4<Boolean> f10126s0;

    /* renamed from: t */
    public static final h4<Long> f10127t;

    /* renamed from: t0 */
    private static final h4<Boolean> f10128t0;

    /* renamed from: u */
    public static final h4<Long> f10129u;

    /* renamed from: u0 */
    public static final h4<Boolean> f10130u0;

    /* renamed from: v */
    public static final h4<Long> f10131v;

    /* renamed from: v0 */
    public static final h4<Boolean> f10132v0;

    /* renamed from: w */
    public static final h4<Long> f10133w;

    /* renamed from: w0 */
    public static final h4<Boolean> f10134w0;

    /* renamed from: x */
    public static final h4<Long> f10135x;

    /* renamed from: x0 */
    public static final h4<Boolean> f10136x0;

    /* renamed from: y */
    public static final h4<Long> f10137y;

    /* renamed from: y0 */
    public static final h4<Boolean> f10138y0;

    /* renamed from: z */
    public static final h4<Long> f10139z;

    /* renamed from: z0 */
    private static final h4<Boolean> f10140z0;

    /* renamed from: a */
    private static final List<h4<?>> f10087a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Set<h4<?>> f10090b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final h4<Long> f10093c = a("measurement.ad_id_cache_time", 10000L, 10000L, g0.f10190a);

    /* renamed from: d */
    public static final h4<Long> f10095d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, k0.f10324a);

    /* renamed from: e */
    public static final h4<Long> f10097e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, x0.f10801a);

    /* renamed from: f */
    public static final h4<Long> f10099f = a("measurement.config.cache_time", 86400000L, 3600000L, j1.f10303a);

    /* renamed from: g */
    public static final h4<String> f10101g = a("measurement.config.url_scheme", "https", "https", v1.f10691a);

    /* renamed from: h */
    public static final h4<String> f10103h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", i2.f10247a);

    /* renamed from: i */
    public static final h4<Integer> f10105i = a("measurement.upload.max_bundles", 100, 100, u2.f10668a);

    /* renamed from: j */
    public static final h4<Integer> f10107j = a("measurement.upload.max_batch_size", 65536, 65536, h3.f10211a);

    /* renamed from: k */
    public static final h4<Integer> f10109k = a("measurement.upload.max_bundle_size", 65536, 65536, t3.f10643a);

    static {
        Integer valueOf = Integer.valueOf(AdError.NETWORK_ERROR_CODE);
        f10111l = a("measurement.upload.max_events_per_bundle", valueOf, valueOf, i0.f10245a);
        f10113m = a("measurement.upload.max_events_per_day", 100000, 100000, s0.f10616a);
        f10115n = a("measurement.upload.max_error_events_per_day", valueOf, valueOf, c1.f10020a);
        f10117o = a("measurement.upload.max_public_events_per_day", 50000, 50000, p1.f10488a);
        Integer valueOf2 = Integer.valueOf(ModuleDescriptor.MODULE_VERSION);
        f10119p = a("measurement.upload.max_conversions_per_day", valueOf2, valueOf2, z1.f10877a);
        f10121q = a("measurement.upload.max_realtime_events_per_day", 10, 10, m2.f10395a);
        f10123r = a("measurement.store.max_stored_events_per_app", 100000, 100000, v2.f10692a);
        f10125s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", j3.f10305a);
        f10127t = a("measurement.upload.backoff_period", 43200000L, 43200000L, s3.f10619a);
        f10129u = a("measurement.upload.window_interval", 3600000L, 3600000L, f0.f10168a);
        f10131v = a("measurement.upload.interval", 3600000L, 3600000L, h0.f10208a);
        f10133w = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, j0.f10302a);
        f10135x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, m0.f10393a);
        f10137y = a("measurement.upload.minimum_delay", 500L, 500L, l0.f10343a);
        f10139z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, o0.f10454a);
        A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, n0.f10420a);
        B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, q0.f10530a);
        C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, p0.f10487a);
        D = a("measurement.upload.retry_time", 1800000L, 1800000L, r0.f10565a);
        E = a("measurement.upload.retry_count", 6, 6, u0.f10666a);
        F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, t0.f10640a);
        G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, v0.f10690a);
        H = a("measurement.audience.filter_result_max_count", 200, 200, z0.f10876a);
        I = a("measurement.upload.max_public_user_properties", 25, 25, null);
        J = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        K = a("measurement.upload.max_public_event_params", 25, 25, null);
        L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, y0.f10832a);
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, b1.f9974a);
        N = a("measurement.test.string_flag", "---", "---", a1.f9945a);
        O = a("measurement.test.long_flag", -1L, -1L, d1.f10058a);
        P = a("measurement.test.int_flag", -2, -2, f1.f10169a);
        Double valueOf3 = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", valueOf3, valueOf3, e1.f10141a);
        R = a("measurement.experiment.max_ids", 50, 50, h1.f10209a);
        S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, g1.f10191a);
        T = a("measurement.upload.max_event_parameter_value_length", 100, 100, i1.f10246a);
        U = a("measurement.max_bundles_per_iteration", 100, 100, l1.f10344a);
        V = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, k1.f10325a);
        W = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, n1.f10421a);
        X = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, m1.f10394a);
        Y = a("measurement.rb.attribution.uri_scheme", "https", "https", o1.f10455a);
        Z = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", r1.f10566a);
        f10088a0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", q1.f10531a);
        f10091b0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,", "com.labpixies.flood,", t1.f10641a);
        f10094c0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", s1.f10617a);
        f10096d0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", u1.f10667a);
        f10098e0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", y1.f10833a);
        Boolean bool2 = Boolean.TRUE;
        f10100f0 = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, w1.f10757a);
        f10102g0 = a("measurement.quality.checksum", bool, bool, null);
        f10104h0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, a2.f9946a);
        f10106i0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, c2.f10021a);
        f10108j0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, b2.f9975a);
        f10110k0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, e2.f10142a);
        f10112l0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, d2.f10059a);
        f10114m0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, g2.f10192a);
        f10116n0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, f2.f10170a);
        f10118o0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, h2.f10210a);
        f10120p0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, k2.f10326a);
        f10122q0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, j2.f10304a);
        f10124r0 = a("measurement.service.storage_consent_support_version", 203600, 203600, l2.f10345a);
        f10126s0 = a("measurement.client.click_identifier_control.dev", bool, bool, o2.f10456a);
        f10128t0 = a("measurement.service.click_identifier_control", bool, bool, n2.f10422a);
        f10130u0 = a("measurement.service.store_null_safelist", bool2, bool2, q2.f10532a);
        f10132v0 = a("measurement.service.store_safelist", bool2, bool2, p2.f10489a);
        f10134w0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, s2.f10618a);
        f10136x0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, r2.f10567a);
        f10138y0 = a("measurement.session_stitching_token_enabled", bool, bool, t2.f10642a);
        f10140z0 = a("measurement.sgtm.client.dev", bool, bool, w2.f10758a);
        A0 = a("measurement.sgtm.service", bool, bool, z2.f10878a);
        B0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, x2.f10805a);
        C0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, b3.f9976a);
        D0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, a3.f9947a);
        E0 = a("measurement.sfmc.client", bool2, bool2, d3.f10060a);
        F0 = a("measurement.sfmc.service", bool2, bool2, c3.f10022a);
        G0 = a("measurement.gmscore_feature_tracking", bool2, bool2, f3.f10171a);
        H0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, e3.f10143a);
        I0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, g3.f10193a);
        J0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, i3.f10248a);
        K0 = a("measurement.remove_app_background.client", bool, bool, l3.f10346a);
        L0 = a("measurement.rb.attribution.service", bool, bool, k3.f10327a);
        M0 = a("measurement.rb.attribution.client2", bool, bool, n3.f10423a);
        N0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, m3.f10396a);
        O0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, p3.f10490a);
        P0 = a("measurement.rb.attribution.followup1.service", bool, bool, o3.f10457a);
        Q0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, r3.f10568a);
        R0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, q3.f10533a);
        S0 = a("measurement.dma_consent.client", bool, bool, v3.f10693a);
        T0 = a("measurement.dma_consent.service", bool, bool, u3.f10669a);
        U0 = a("measurement.dma_consent.client_bow_check", bool, bool, x3.f10806a);
        V0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, w3.f10759a);
        W0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, a4.f9948a);
        X0 = a("measurement.dma_consent.service_split_batch_on_consent", bool, bool, y3.f10835a);
        Y0 = a("measurement.service.deferred_first_open", bool, bool, c4.f10023a);
        Z0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, b4.f9977a);
        f10089a1 = a("measurement.gbraid_campaign.gbraid.service", bool, bool, e4.f10144a);
        f10092b1 = a("measurement.increase_param_lengths", bool, bool, d4.f10061a);
    }

    private static <V> h4<V> a(String str, V v10, V v11, g4<V> g4Var) {
        h4<V> h4Var = new h4<>(str, v10, v11, g4Var);
        f10087a.add(h4Var);
        return h4Var;
    }

    public static Map<String, String> c(Context context) {
        zzfy zza = zzfy.zza(context.getContentResolver(), zzgk.zza("com.google.android.gms.measurement"), wa.f.f29738a);
        return zza == null ? Collections.emptyMap() : zza.zza();
    }
}
