package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.util.y0;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfgm {
    public final String zzA;
    public final zzcbp zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfhk zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbwz zzae;
    public final b5 zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzcag zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfgr zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0631. Please report as an issue. */
    public zzfgm(JsonReader jsonReader) {
        List list;
        List list2;
        char c10;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgaa zzl = zzgaa.zzl();
        zzgaa zzl2 = zzgaa.zzl();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        List list3 = zzl;
        List list4 = zzl2;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i11 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        int i12 = 0;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        int i13 = 0;
        zzfgr zzfgrVar = null;
        zzcbp zzcbpVar = null;
        zzbwz zzbwzVar = null;
        b5 b5Var = null;
        String str19 = null;
        int i14 = -1;
        int i15 = -1;
        List list5 = emptyList11;
        List list6 = emptyList12;
        List list7 = emptyList13;
        List list8 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        String str20 = str18;
        String str21 = str20;
        int i16 = 0;
        int i17 = 0;
        zzcag zzcagVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? "" : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_name")) {
                        c10 = ';';
                        break;
                    }
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_signals")) {
                        c10 = 28;
                        break;
                    }
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("omid_settings")) {
                        c10 = ')';
                        break;
                    }
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("recursive_server_response_data")) {
                        c10 = 'E';
                        break;
                    }
                    break;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_consent")) {
                        c10 = 'F';
                        break;
                    }
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("play_prewarm_options")) {
                        c10 = '1';
                        break;
                    }
                    break;
                case -1785028569:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("parallel_key")) {
                        c10 = 'H';
                        break;
                    }
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_name")) {
                        c10 = '9';
                        break;
                    }
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_interscroller")) {
                        c10 = '5';
                        break;
                    }
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("backend_query_id")) {
                        c10 = '/';
                        break;
                    }
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("nofill_urls")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_custom_close_blocked")) {
                        c10 = '#';
                        break;
                    }
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("orientation")) {
                        c10 = '%';
                        break;
                    }
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("enable_omid")) {
                        c10 = '\'';
                        break;
                    }
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        c10 = 'C';
                        break;
                    }
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("showable_impression_type")) {
                        c10 = ',';
                        break;
                    }
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_cover")) {
                        c10 = '6';
                        break;
                    }
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_sizes")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapters")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("test_mode_enabled")) {
                        c10 = '\"';
                        break;
                    }
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("extras")) {
                        c10 = 29;
                        break;
                    }
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_event_value")) {
                        c10 = '3';
                        break;
                    }
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        c10 = 30;
                        break;
                    }
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_urls")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_type")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_scroll_aware")) {
                        c10 = '+';
                        break;
                    }
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("fill_urls")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allocation_id")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_complete_urls")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("active_view")) {
                        c10 = 25;
                        break;
                    }
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("valid_from_timestamp")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_id")) {
                        c10 = '<';
                        break;
                    }
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("click_urls")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -570101180:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("late_load_urls")) {
                        c10 = 'I';
                        break;
                    }
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("safe_browsing")) {
                        c10 = 26;
                        break;
                    }
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("imp_urls")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rtb_native_required_assets")) {
                        c10 = '>';
                        break;
                    }
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_timeout_ms")) {
                        c10 = '&';
                        break;
                    }
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_close_time_ms")) {
                        c10 = '-';
                        break;
                    }
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("content_url")) {
                        c10 = '@';
                        break;
                    }
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_close_button_enabled")) {
                        c10 = '2';
                        break;
                    }
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        c10 = 'A';
                        break;
                    }
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("watermark")) {
                        c10 = '.';
                        break;
                    }
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("native_required_asset_viewability")) {
                        c10 = '?';
                        break;
                    }
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_offline_ad")) {
                        c10 = '=';
                        break;
                    }
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_custom_click_gesture")) {
                        c10 = ' ';
                        break;
                    }
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals(FacebookMediationAdapter.KEY_ID)) {
                        c10 = 23;
                        break;
                    }
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("data")) {
                        c10 = 22;
                        break;
                    }
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("request_id")) {
                        c10 = 'D';
                        break;
                    }
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_test_label")) {
                        c10 = '!';
                        break;
                    }
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("qdata")) {
                        c10 = 24;
                        break;
                    }
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_load_urls")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_closable_area_disabled")) {
                        c10 = '$';
                        break;
                    }
                    break;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("consent_form_action_identifier")) {
                        c10 = 'G';
                        break;
                    }
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_dialog_string")) {
                        c10 = 27;
                        break;
                    }
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("container_sizes")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("impression_type")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("transaction_id")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rewards")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapter_response_info_key")) {
                        c10 = '8';
                        break;
                    }
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("cache_hit_urls")) {
                        c10 = 'B';
                        break;
                    }
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        c10 = 31;
                        break;
                    }
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_id")) {
                        c10 = ':';
                        break;
                    }
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("bid_response")) {
                        c10 = '(';
                        break;
                    }
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_start_urls")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_network_class_name")) {
                        c10 = '7';
                        break;
                    }
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_reward_urls")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("use_third_party_container_height")) {
                        c10 = '0';
                        break;
                    }
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("renderers")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        c10 = '*';
                        break;
                    }
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rule_line_external_id")) {
                        c10 = '4';
                        break;
                    }
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str22.equals("manual_tracking_urls")) {
                        c10 = 15;
                        break;
                    }
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    emptyList = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 1:
                    i16 = zzb(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 2:
                    emptyList2 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 3:
                    emptyList3 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 4:
                    emptyList4 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 5:
                    i17 = zzc(jsonReader.nextInt());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 6:
                    emptyList5 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 7:
                    emptyList6 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\b':
                    emptyList7 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\t':
                    str21 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\n':
                    str20 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 11:
                    zzcagVar = zzcag.zza(y0.e(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\f':
                    emptyList8 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\r':
                    emptyList9 = y0.d(jsonReader);
                    emptyList10 = list2;
                    break;
                case 14:
                    emptyList10 = y0.d(jsonReader);
                    emptyList9 = list;
                    break;
                case 15:
                    list5 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 16:
                    i10 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 17:
                    list6 = zzfgn.zza(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 18:
                    zzfgrVar = new zzfgr(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 19:
                    list8 = zzfgn.zza(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 20:
                    list7 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 21:
                    str = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 22:
                    jSONObject12 = y0.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 23:
                    str2 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 24:
                    str3 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 25:
                    str4 = y0.h(jsonReader).toString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 26:
                    zzcbpVar = zzcbp.zza(y0.h(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 27:
                    str5 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 28:
                    jSONObject7 = y0.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 29:
                    jSONObject8 = y0.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 30:
                    z10 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 31:
                    z11 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ' ':
                    z12 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '!':
                    z13 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\"':
                    z14 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '#':
                    z15 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '$':
                    z16 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '%':
                    i14 = zzd(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '&':
                    i11 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\'':
                    z17 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '(':
                    str6 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ')':
                    jSONObject9 = y0.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '*':
                    z18 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '+':
                    z19 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ',':
                    i12 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '-':
                    i15 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '.':
                    str7 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '/':
                    str8 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '0':
                    z20 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '1':
                    zzbwzVar = zzbwz.zza(y0.h(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '2':
                    jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '3':
                    b5Var = b5.u1(y0.h(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '4':
                    str9 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '5':
                    z21 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '6':
                    jSONObject10 = y0.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '7':
                    str10 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '8':
                    str17 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '9':
                    if (((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        str11 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case ':':
                    if (((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        str12 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case ';':
                    if (((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        str13 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case '<':
                    if (((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case '=':
                    z22 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '>':
                    jSONObject11 = y0.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '?':
                    z23 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '@':
                    str19 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'A':
                    z24 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'B':
                    list3 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'C':
                    z25 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'D':
                    str15 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'E':
                    str16 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'F':
                    z26 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'G':
                    i13 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'H':
                    str18 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'I':
                    list4 = y0.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i16;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i17;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str21;
        this.zzl = str20;
        this.zzm = zzcagVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = list5;
        this.zzr = i10;
        this.zzs = list6;
        this.zzt = zzfgrVar;
        this.zzu = list7;
        this.zzv = list8;
        this.zzx = str;
        this.zzw = jSONObject12;
        this.zzy = str2;
        this.zzz = str3;
        this.zzA = str4;
        this.zzB = zzcbpVar;
        this.zzC = str5;
        this.zzD = jSONObject7;
        this.zzE = jSONObject8;
        this.zzK = z10;
        this.zzL = z11;
        this.zzM = z12;
        this.zzN = z13;
        this.zzO = z14;
        this.zzP = z15;
        this.zzQ = z16;
        this.zzR = i14;
        this.zzS = i11;
        this.zzU = z17;
        this.zzV = str6;
        this.zzW = new zzfhk(jSONObject9);
        this.zzX = z18;
        this.zzY = z19;
        this.zzZ = i12;
        this.zzaa = str7;
        this.zzab = i15;
        this.zzac = str8;
        this.zzad = z20;
        this.zzae = zzbwzVar;
        this.zzaf = b5Var;
        this.zzag = str9;
        this.zzah = z21;
        this.zzai = jSONObject10;
        this.zzF = str10;
        this.zzG = str11;
        this.zzH = str12;
        this.zzI = str13;
        this.zzJ = str14;
        this.zzaj = z22;
        this.zzak = jSONObject11;
        this.zzal = z23;
        this.zzam = str19;
        this.zzan = z24;
        this.zze = list3;
        this.zzT = z25;
        this.zzao = str15;
        this.zzap = str16;
        this.zzaq = str17;
        this.zzar = z26;
        this.zzas = i13;
        this.zzau = list4;
        this.zzat = str18;
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
