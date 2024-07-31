package com.facebook.internal;

import android.R;
import com.facebook.internal.C4639q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p450xk.C12524p;

/* renamed from: com.facebook.internal.n */
/* loaded from: classes.dex */
public final class C4633n {

    /* renamed from: a */
    public static final C4633n f8754a = new C4633n();

    /* renamed from: b */
    private static final Map<b, String[]> f8755b = new HashMap();

    /* renamed from: com.facebook.internal.n$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo10935a(boolean z10);
    }

    /* renamed from: com.facebook.internal.n$b */
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

        /* renamed from: com.facebook.internal.n$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final b m11259a(int i10) {
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

        /* renamed from: com.facebook.internal.n$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C13181b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8756a;

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
                f8756a = iArr;
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

        /* renamed from: i */
        public final b m11257i() {
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
                        return Companion.m11259a(0);
                    }
                    aVar = Companion;
                    i10 = -16777216;
                }
                i11 = i12 & i10;
            }
            return aVar.m11259a(i11);
        }

        /* renamed from: l */
        public final String m11258l() {
            return C9322n.m27787k("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C13181b.f8756a[ordinal()]) {
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

    /* renamed from: com.facebook.internal.n$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8757a;

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
            f8757a = iArr;
        }
    }

    /* renamed from: com.facebook.internal.n$d */
    /* loaded from: classes.dex */
    public static final class d implements C4639q.a {

        /* renamed from: a */
        final /* synthetic */ a f8758a;

        /* renamed from: b */
        final /* synthetic */ b f8759b;

        d(a aVar, b bVar) {
            this.f8758a = aVar;
            this.f8759b = bVar;
        }

        @Override // com.facebook.internal.C4639q.a
        /* renamed from: a */
        public void mo11260a() {
            a aVar = this.f8758a;
            C4633n c4633n = C4633n.f8754a;
            aVar.mo10935a(C4633n.m11254g(this.f8759b));
        }
    }

    private C4633n() {
    }

    /* renamed from: a */
    public static final void m11248a(b feature, a callback) {
        C9322n.m27781e(feature, "feature");
        C9322n.m27781e(callback, "callback");
        C4639q c4639q = C4639q.f8777a;
        C4639q.m11367h(new d(callback, feature));
    }

    /* renamed from: b */
    private final boolean m11249b(b bVar) {
        switch (c.f8757a[bVar.ordinal()]) {
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

    /* renamed from: c */
    public static final void m11250c(b feature) {
        C9322n.m27781e(feature, "feature");
        C7799e0.m23860l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.m11258l(), C7799e0.m23829B()).apply();
    }

    /* renamed from: d */
    public static final b m11251d(String className) {
        boolean m41031E;
        C9322n.m27781e(className, "className");
        f8754a.m11253f();
        for (Map.Entry<b, String[]> entry : f8755b.entrySet()) {
            b key = entry.getKey();
            String[] value = entry.getValue();
            int length = value.length;
            int i10 = 0;
            while (i10 < length) {
                String str = value[i10];
                i10++;
                m41031E = C12524p.m41031E(className, str, false, 2, null);
                if (m41031E) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    /* renamed from: e */
    private final boolean m11252e(b bVar) {
        boolean m11249b = m11249b(bVar);
        C4639q c4639q = C4639q.f8777a;
        return C4639q.m11365d(bVar.m11258l(), C7799e0.m23861m(), m11249b);
    }

    /* renamed from: f */
    private final synchronized void m11253f() {
        Map<b, String[]> map = f8755b;
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

    /* renamed from: g */
    public static final boolean m11254g(b feature) {
        C9322n.m27781e(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        String string = C7799e0.m23860l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.m11258l(), null);
        if (string != null && C9322n.m27777a(string, C7799e0.m23829B())) {
            return false;
        }
        b m11257i = feature.m11257i();
        return m11257i == feature ? f8754a.m11252e(feature) : m11254g(m11257i) && f8754a.m11252e(feature);
    }
}
