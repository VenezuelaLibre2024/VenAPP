package com.facebook.internal;

import android.R;
import com.facebook.internal.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public static final n f7774a = new n();

    /* renamed from: b */
    private static final Map<b, String[]> f7775b = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    /* loaded from: classes.dex */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);

        public static final a Companion = new a(null);
        private final int code;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final b a(int i10) {
                b[] valuesCustom = b.valuesCustom();
                int length = valuesCustom.length;
                int i11 = 0;
                while (i11 < length) {
                    b bVar = valuesCustom[i11];
                    i11++;
                    if (bVar.code == i10) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        /* renamed from: com.facebook.internal.n$b$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0138b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f7776a;

            static {
                int[] iArr = new int[b.valuesCustom().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ProtectedMode.ordinal()] = 16;
                iArr[b.MACARuleMatching.ordinal()] = 17;
                iArr[b.BlocklistEvents.ordinal()] = 18;
                iArr[b.FilterRedactedEvents.ordinal()] = 19;
                iArr[b.FilterSensitiveParams.ordinal()] = 20;
                iArr[b.ModelRequest.ordinal()] = 21;
                iArr[b.EventDeactivation.ordinal()] = 22;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 23;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 24;
                iArr[b.IapLogging.ordinal()] = 25;
                iArr[b.IapLoggingLib2.ordinal()] = 26;
                iArr[b.Monitoring.ordinal()] = 27;
                iArr[b.Megatron.ordinal()] = 28;
                iArr[b.Elora.ordinal()] = 29;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 30;
                iArr[b.Login.ordinal()] = 31;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 32;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 33;
                iArr[b.BypassAppSwitch.ordinal()] = 34;
                iArr[b.Share.ordinal()] = 35;
                f7776a = iArr;
            }
        }

        b(int i10) {
            this.code = i10;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final b i() {
            a aVar;
            int i10;
            int i11;
            int i12 = this.code;
            if ((i12 & 255) > 0) {
                aVar = Companion;
                i11 = i12 & (-256);
            } else {
                if ((65280 & i12) > 0) {
                    aVar = Companion;
                    i10 = -65536;
                } else {
                    if ((16711680 & i12) <= 0) {
                        return Companion.a(0);
                    }
                    aVar = Companion;
                    i10 = -16777216;
                }
                i11 = i12 & i10;
            }
            return aVar.a(i11);
        }

        public final String l() {
            return kotlin.jvm.internal.n.k("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C0138b.f7776a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ProtectedMode";
                case 17:
                    return "MACARuleMatching";
                case 18:
                    return "BlocklistEvents";
                case 19:
                    return "FilterRedactedEvents";
                case 20:
                    return "FilterSensitiveParams";
                case 21:
                    return "ModelRequest";
                case 22:
                    return "EventDeactivation";
                case 23:
                    return "OnDeviceEventProcessing";
                case 24:
                    return "OnDevicePostInstallEventProcessing";
                case 25:
                    return "IAPLogging";
                case 26:
                    return "IAPLoggingLib2";
                case 27:
                    return "Monitoring";
                case 28:
                    return "Megatron";
                case 29:
                    return "Elora";
                case 30:
                    return "ServiceUpdateCompliance";
                case 31:
                    return "LoginKit";
                case 32:
                    return "ChromeCustomTabsPrefetching";
                case 33:
                    return "IgnoreAppSwitchToLoggedOut";
                case 34:
                    return "BypassAppSwitch";
                case 35:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7777a;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ProtectedMode.ordinal()] = 19;
            iArr[b.MACARuleMatching.ordinal()] = 20;
            iArr[b.BlocklistEvents.ordinal()] = 21;
            iArr[b.FilterRedactedEvents.ordinal()] = 22;
            iArr[b.FilterSensitiveParams.ordinal()] = 23;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 24;
            iArr[b.Monitoring.ordinal()] = 25;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 26;
            iArr[b.BypassAppSwitch.ordinal()] = 27;
            f7777a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements q.a {

        /* renamed from: a */
        final /* synthetic */ a f7778a;

        /* renamed from: b */
        final /* synthetic */ b f7779b;

        d(a aVar, b bVar) {
            this.f7778a = aVar;
            this.f7779b = bVar;
        }

        @Override // com.facebook.internal.q.a
        public void a() {
            a aVar = this.f7778a;
            n nVar = n.f7774a;
            aVar.a(n.g(this.f7779b));
        }
    }

    private n() {
    }

    public static final void a(b feature, a callback) {
        kotlin.jvm.internal.n.e(feature, "feature");
        kotlin.jvm.internal.n.e(callback, "callback");
        q qVar = q.f7797a;
        q.h(new d(callback, feature));
    }

    private final boolean b(b bVar) {
        switch (c.f7777a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return false;
            default:
                return true;
        }
    }

    public static final void c(b feature) {
        kotlin.jvm.internal.n.e(feature, "feature");
        i4.e0.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.l(), i4.e0.B()).apply();
    }

    public static final b d(String className) {
        boolean E;
        kotlin.jvm.internal.n.e(className, "className");
        f7774a.f();
        for (Map.Entry<b, String[]> entry : f7775b.entrySet()) {
            b key = entry.getKey();
            String[] value = entry.getValue();
            int length = value.length;
            int i10 = 0;
            while (i10 < length) {
                String str = value[i10];
                i10++;
                E = xk.p.E(className, str, false, 2, null);
                if (E) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    private final boolean e(b bVar) {
        boolean b10 = b(bVar);
        q qVar = q.f7797a;
        return q.d(bVar.l(), i4.e0.m(), b10);
    }

    private final synchronized void f() {
        Map<b, String[]> map = f7775b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(b.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
            map.put(b.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
            map.put(b.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    public static final boolean g(b feature) {
        kotlin.jvm.internal.n.e(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        String string = i4.e0.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.l(), null);
        if (string != null && kotlin.jvm.internal.n.a(string, i4.e0.B())) {
            return false;
        }
        b i10 = feature.i();
        return i10 == feature ? f7774a.e(feature) : g(i10) && f7774a.e(feature);
    }
}
