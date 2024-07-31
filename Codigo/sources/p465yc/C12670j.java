package p465yc;

import android.util.Base64;
import android.util.JsonReader;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p181jd.InterfaceC9037a;
import p219ld.C9501d;
import p442xc.AbstractC12426f0;
import p442xc.C12415a;

/* renamed from: yc.j */
/* loaded from: classes.dex */
public class C12670j {

    /* renamed from: a */
    private static final InterfaceC9037a f34358a = new C9501d().m28244i(C12415a.f33297a).m28245j(true).m28243h();

    /* renamed from: yc.j$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        T mo41655a(JsonReader jsonReader);
    }

    /* renamed from: A */
    private static AbstractC12426f0.e.d.f m41656A(JsonReader jsonReader) {
        AbstractC12426f0.e.d.f.a m40408a = AbstractC12426f0.e.d.f.m40408a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("assignments")) {
                m40408a.mo40411b(m41678n(jsonReader, new a() { // from class: yc.c
                    @Override // p465yc.C12670j.a
                    /* renamed from: a */
                    public final Object mo41655a(JsonReader jsonReader2) {
                        AbstractC12426f0.e.d.AbstractC13287e m41690z;
                        m41690z = C12670j.m41690z(jsonReader2);
                        return m41690z;
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m40408a.mo40410a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: B */
    private static AbstractC12426f0.e.d.a.b.AbstractC13279d m41657B(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a m40329a = AbstractC12426f0.e.d.a.b.AbstractC13279d.m40329a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40329a.mo40334b(jsonReader.nextLong());
                    break;
                case 1:
                    m40329a.mo40335c(jsonReader.nextString());
                    break;
                case 2:
                    m40329a.mo40336d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40329a.mo40333a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: C */
    public static AbstractC12426f0.e.d.a.b.AbstractC13281e m41658C(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a m40337a = AbstractC12426f0.e.d.a.b.AbstractC13281e.m40337a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40337a.mo40342b(m41678n(jsonReader, new C12669i()));
                    break;
                case 1:
                    m40337a.mo40344d(jsonReader.nextString());
                    break;
                case 2:
                    m40337a.mo40343c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40337a.mo40341a();
    }

    /* renamed from: D */
    public static AbstractC12426f0.d.b m41659D(JsonReader jsonReader) {
        AbstractC12426f0.d.b.a m40194a = AbstractC12426f0.d.b.m40194a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                m40194a.mo40199c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                m40194a.mo40198b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m40194a.mo40197a();
    }

    /* renamed from: E */
    private static AbstractC12426f0.d m41660E(JsonReader jsonReader) {
        AbstractC12426f0.d.a m40193a = AbstractC12426f0.d.m40193a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                m40193a.mo40180b(m41678n(jsonReader, new a() { // from class: yc.b
                    @Override // p465yc.C12670j.a
                    /* renamed from: a */
                    public final Object mo41655a(JsonReader jsonReader2) {
                        AbstractC12426f0.d.b m41659D;
                        m41659D = C12670j.m41659D(jsonReader2);
                        return m41659D;
                    }
                }));
            } else if (nextName.equals("orgId")) {
                m40193a.mo40181c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m40193a.mo40179a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: F */
    private static AbstractC12426f0.e.AbstractC13288e m41661F(JsonReader jsonReader) {
        AbstractC12426f0.e.AbstractC13288e.a m40412a = AbstractC12426f0.e.AbstractC13288e.m40412a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40412a.mo40418b(jsonReader.nextString());
                    break;
                case 1:
                    m40412a.mo40419c(jsonReader.nextBoolean());
                    break;
                case 2:
                    m40412a.mo40421e(jsonReader.nextString());
                    break;
                case 3:
                    m40412a.mo40420d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40412a.mo40417a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: G */
    public static AbstractC12426f0.e.d.a.c m41662G(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.c.AbstractC13285a m40357a = AbstractC12426f0.e.d.a.c.m40357a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40357a.mo40365d(jsonReader.nextInt());
                    break;
                case 1:
                    m40357a.mo40366e(jsonReader.nextString());
                    break;
                case 2:
                    m40357a.mo40363b(jsonReader.nextBoolean());
                    break;
                case 3:
                    m40357a.mo40364c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40357a.mo40362a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: H */
    private static AbstractC12426f0 m41663H(JsonReader jsonReader) {
        AbstractC12426f0.b m40183b = AbstractC12426f0.m40183b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40183b.mo40121i(m41660E(jsonReader));
                    break;
                case 1:
                    m40183b.mo40123k(jsonReader.nextString());
                    break;
                case 2:
                    m40183b.mo40115c(jsonReader.nextString());
                    break;
                case 3:
                    m40183b.mo40114b(m41677m(jsonReader));
                    break;
                case 4:
                    m40183b.mo40116d(jsonReader.nextString());
                    break;
                case 5:
                    m40183b.mo40119g(jsonReader.nextString());
                    break;
                case 6:
                    m40183b.mo40120h(jsonReader.nextString());
                    break;
                case 7:
                    m40183b.mo40118f(jsonReader.nextString());
                    break;
                case '\b':
                    m40183b.mo40122j(jsonReader.nextInt());
                    break;
                case '\t':
                    m40183b.mo40117e(jsonReader.nextString());
                    break;
                case '\n':
                    m40183b.mo40124l(m41665J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40183b.mo40113a();
    }

    /* renamed from: I */
    private static AbstractC12426f0.e.d.AbstractC13287e.b m41664I(JsonReader jsonReader) {
        AbstractC12426f0.e.d.AbstractC13287e.b.a m40402a = AbstractC12426f0.e.d.AbstractC13287e.b.m40402a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("variantId")) {
                m40402a.mo40407c(jsonReader.nextString());
            } else if (nextName.equals("rolloutId")) {
                m40402a.mo40406b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m40402a.mo40405a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: J */
    private static AbstractC12426f0.e m41665J(JsonReader jsonReader) {
        AbstractC12426f0.e.b m40200a = AbstractC12426f0.e.m40200a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals(Constants.IDENTIFIER)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals(io.flutter.plugins.firebase.auth.Constants.USER)) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40200a.mo40246m(jsonReader.nextLong());
                    break;
                case 1:
                    m40200a.mo40236c(jsonReader.nextString());
                    break;
                case 2:
                    m40200a.m40244k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m40200a.mo40239f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    m40200a.mo40238e(m41681q(jsonReader));
                    break;
                case 5:
                    m40200a.mo40240g(m41678n(jsonReader, new a() { // from class: yc.a
                        @Override // p465yc.C12670j.a
                        /* renamed from: a */
                        public final Object mo41655a(JsonReader jsonReader2) {
                            AbstractC12426f0.e.d m41682r;
                            m41682r = C12670j.m41682r(jsonReader2);
                            return m41682r;
                        }
                    }));
                    break;
                case 6:
                    m40200a.mo40245l(m41661F(jsonReader));
                    break;
                case 7:
                    m40200a.mo40235b(m41676l(jsonReader));
                    break;
                case '\b':
                    m40200a.mo40247n(m41666K(jsonReader));
                    break;
                case '\t':
                    m40200a.mo40241h(jsonReader.nextString());
                    break;
                case '\n':
                    m40200a.mo40237d(jsonReader.nextBoolean());
                    break;
                case 11:
                    m40200a.mo40242i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40200a.mo40234a();
    }

    /* renamed from: K */
    private static AbstractC12426f0.e.f m41666K(JsonReader jsonReader) {
        AbstractC12426f0.e.f.a m40422a = AbstractC12426f0.e.f.m40422a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(Constants.IDENTIFIER)) {
                m40422a.mo40100b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m40422a.mo40099a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: l */
    private static AbstractC12426f0.e.a m41676l(JsonReader jsonReader) {
        AbstractC12426f0.e.a.AbstractC13273a m40218a = AbstractC12426f0.e.a.m40218a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals(Constants.IDENTIFIER)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40218a.mo40230e(jsonReader.nextString());
                    break;
                case 1:
                    m40218a.mo40227b(jsonReader.nextString());
                    break;
                case 2:
                    m40218a.mo40228c(jsonReader.nextString());
                    break;
                case 3:
                    m40218a.mo40232g(jsonReader.nextString());
                    break;
                case 4:
                    m40218a.mo40231f(jsonReader.nextString());
                    break;
                case 5:
                    m40218a.mo40229d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40218a.mo40226a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: m */
    private static AbstractC12426f0.a m41677m(JsonReader jsonReader) {
        AbstractC12426f0.a.b m40190a = AbstractC12426f0.a.m40190a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(Constants.TIMESTAMP)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40190a.mo40138b(m41678n(jsonReader, new a() { // from class: yc.f
                        @Override // p465yc.C12670j.a
                        /* renamed from: a */
                        public final Object mo41655a(JsonReader jsonReader2) {
                            AbstractC12426f0.a.AbstractC13271a m41679o;
                            m41679o = C12670j.m41679o(jsonReader2);
                            return m41679o;
                        }
                    }));
                    break;
                case 1:
                    m40190a.mo40140d(jsonReader.nextInt());
                    break;
                case 2:
                    m40190a.mo40142f(jsonReader.nextLong());
                    break;
                case 3:
                    m40190a.mo40144h(jsonReader.nextLong());
                    break;
                case 4:
                    m40190a.mo40145i(jsonReader.nextLong());
                    break;
                case 5:
                    m40190a.mo40141e(jsonReader.nextString());
                    break;
                case 6:
                    m40190a.mo40143g(jsonReader.nextInt());
                    break;
                case 7:
                    m40190a.mo40146j(jsonReader.nextString());
                    break;
                case '\b':
                    m40190a.mo40139c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40190a.mo40137a();
    }

    /* renamed from: n */
    private static <T> List<T> m41678n(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo41655a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: o */
    public static AbstractC12426f0.a.AbstractC13271a m41679o(JsonReader jsonReader) {
        AbstractC12426f0.a.AbstractC13271a.AbstractC13272a m40191a = AbstractC12426f0.a.AbstractC13271a.m40191a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals(Constants.BUILD_ID)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40191a.mo40159d(jsonReader.nextString());
                    break;
                case 1:
                    m40191a.mo40157b(jsonReader.nextString());
                    break;
                case 2:
                    m40191a.mo40158c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40191a.mo40156a();
    }

    /* renamed from: p */
    public static AbstractC12426f0.c m41680p(JsonReader jsonReader) {
        AbstractC12426f0.c.a m40192a = AbstractC12426f0.c.m40192a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(Constants.KEY)) {
                m40192a.mo40172b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                m40192a.mo40173c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m40192a.mo40171a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: q */
    private static AbstractC12426f0.e.c m41681q(JsonReader jsonReader) {
        AbstractC12426f0.e.c.a m40248a = AbstractC12426f0.e.c.m40248a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40248a.mo40266i(jsonReader.nextBoolean());
                    break;
                case 1:
                    m40248a.mo40262e(jsonReader.nextString());
                    break;
                case 2:
                    m40248a.mo40265h(jsonReader.nextLong());
                    break;
                case 3:
                    m40248a.mo40259b(jsonReader.nextInt());
                    break;
                case 4:
                    m40248a.mo40261d(jsonReader.nextLong());
                    break;
                case 5:
                    m40248a.mo40260c(jsonReader.nextInt());
                    break;
                case 6:
                    m40248a.mo40263f(jsonReader.nextString());
                    break;
                case 7:
                    m40248a.mo40267j(jsonReader.nextInt());
                    break;
                case '\b':
                    m40248a.mo40264g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40248a.mo40258a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: r */
    public static AbstractC12426f0.e.d m41682r(JsonReader jsonReader) {
        AbstractC12426f0.e.d.b m40268a = AbstractC12426f0.e.d.m40268a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(Constants.TIMESTAMP)) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40268a.mo40369c(m41685u(jsonReader));
                    break;
                case 1:
                    m40268a.mo40371e(m41656A(jsonReader));
                    break;
                case 2:
                    m40268a.mo40368b(m41683s(jsonReader));
                    break;
                case 3:
                    m40268a.mo40370d(m41689y(jsonReader));
                    break;
                case 4:
                    m40268a.mo40373g(jsonReader.nextString());
                    break;
                case 5:
                    m40268a.mo40372f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40268a.mo40367a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: s */
    private static AbstractC12426f0.e.d.a m41683s(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.AbstractC13274a m40276a = AbstractC12426f0.e.d.a.m40276a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals("appProcessDetails")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals("background")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals("currentProcessDetails")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40276a.mo40286b(m41678n(jsonReader, new a() { // from class: yc.e
                        @Override // p465yc.C12670j.a
                        /* renamed from: a */
                        public final Object mo41655a(JsonReader jsonReader2) {
                            AbstractC12426f0.e.d.a.c m41662G;
                            m41662G = C12670j.m41662G(jsonReader2);
                            return m41662G;
                        }
                    }));
                    break;
                case 1:
                    m40276a.mo40287c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    m40276a.mo40290f(m41686v(jsonReader));
                    break;
                case 3:
                    m40276a.mo40291g(m41678n(jsonReader, new a() { // from class: yc.d
                        @Override // p465yc.C12670j.a
                        /* renamed from: a */
                        public final Object mo41655a(JsonReader jsonReader2) {
                            AbstractC12426f0.c m41680p;
                            m41680p = C12670j.m41680p(jsonReader2);
                            return m41680p;
                        }
                    }));
                    break;
                case 4:
                    m40276a.mo40289e(m41678n(jsonReader, new a() { // from class: yc.d
                        @Override // p465yc.C12670j.a
                        /* renamed from: a */
                        public final Object mo41655a(JsonReader jsonReader2) {
                            AbstractC12426f0.c m41680p;
                            m41680p = C12670j.m41680p(jsonReader2);
                            return m41680p;
                        }
                    }));
                    break;
                case 5:
                    m40276a.mo40292h(jsonReader.nextInt());
                    break;
                case 6:
                    m40276a.mo40288d(m41662G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40276a.mo40285a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: t */
    public static AbstractC12426f0.e.d.a.b.AbstractC13275a m41684t(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a m40299a = AbstractC12426f0.e.d.a.b.AbstractC13275a.m40299a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40299a.mo40307c(jsonReader.nextString());
                    break;
                case 1:
                    m40299a.mo40308d(jsonReader.nextLong());
                    break;
                case 2:
                    m40299a.m40310f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m40299a.mo40306b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40299a.mo40305a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: u */
    private static AbstractC12426f0.e.d.c m41685u(JsonReader jsonReader) {
        AbstractC12426f0.e.d.c.a m40374a = AbstractC12426f0.e.d.c.m40374a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40374a.mo40382b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    m40374a.mo40383c(jsonReader.nextInt());
                    break;
                case 2:
                    m40374a.mo40385e(jsonReader.nextInt());
                    break;
                case 3:
                    m40374a.mo40384d(jsonReader.nextLong());
                    break;
                case 4:
                    m40374a.mo40387g(jsonReader.nextLong());
                    break;
                case 5:
                    m40374a.mo40386f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40374a.mo40381a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: v */
    private static AbstractC12426f0.e.d.a.b m41686v(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.b.AbstractC13277b m40293a = AbstractC12426f0.e.d.a.b.m40293a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals(Constants.EXCEPTION)) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40293a.mo40312b(m41677m(jsonReader));
                    break;
                case 1:
                    m40293a.mo40316f(m41678n(jsonReader, new a() { // from class: yc.g
                        @Override // p465yc.C12670j.a
                        /* renamed from: a */
                        public final Object mo41655a(JsonReader jsonReader2) {
                            AbstractC12426f0.e.d.a.b.AbstractC13281e m41658C;
                            m41658C = C12670j.m41658C(jsonReader2);
                            return m41658C;
                        }
                    }));
                    break;
                case 2:
                    m40293a.mo40315e(m41657B(jsonReader));
                    break;
                case 3:
                    m40293a.mo40313c(m41678n(jsonReader, new a() { // from class: yc.h
                        @Override // p465yc.C12670j.a
                        /* renamed from: a */
                        public final Object mo41655a(JsonReader jsonReader2) {
                            AbstractC12426f0.e.d.a.b.AbstractC13275a m41684t;
                            m41684t = C12670j.m41684t(jsonReader2);
                            return m41684t;
                        }
                    }));
                    break;
                case 4:
                    m40293a.mo40314d(m41687w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40293a.mo40311a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: w */
    private static AbstractC12426f0.e.d.a.b.c m41687w(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.b.c.AbstractC13278a m40317a = AbstractC12426f0.e.d.a.b.c.m40317a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals(Constants.REASON)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40317a.mo40325c(m41678n(jsonReader, new C12669i()));
                    break;
                case 1:
                    m40317a.mo40327e(jsonReader.nextString());
                    break;
                case 2:
                    m40317a.mo40328f(jsonReader.nextString());
                    break;
                case 3:
                    m40317a.mo40324b(m41687w(jsonReader));
                    break;
                case 4:
                    m40317a.mo40326d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40317a.mo40323a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: x */
    public static AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b m41688x(JsonReader jsonReader) {
        AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a m40345a = AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.m40345a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(Constants.FILE)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40345a.mo40354d(jsonReader.nextLong());
                    break;
                case 1:
                    m40345a.mo40356f(jsonReader.nextString());
                    break;
                case 2:
                    m40345a.mo40355e(jsonReader.nextLong());
                    break;
                case 3:
                    m40345a.mo40352b(jsonReader.nextString());
                    break;
                case 4:
                    m40345a.mo40353c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40345a.mo40351a();
    }

    /* renamed from: y */
    private static AbstractC12426f0.e.d.AbstractC13286d m41689y(JsonReader jsonReader) {
        AbstractC12426f0.e.d.AbstractC13286d.a m40388a = AbstractC12426f0.e.d.AbstractC13286d.m40388a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                m40388a.mo40391b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m40388a.mo40390a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: z */
    public static AbstractC12426f0.e.d.AbstractC13287e m41690z(JsonReader jsonReader) {
        AbstractC12426f0.e.d.AbstractC13287e.a m40392a = AbstractC12426f0.e.d.AbstractC13287e.m40392a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals("parameterKey")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals("templateVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals("rolloutVariant")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals("parameterValue")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m40392a.mo40398b(jsonReader.nextString());
                    break;
                case 1:
                    m40392a.mo40401e(jsonReader.nextLong());
                    break;
                case 2:
                    m40392a.mo40400d(m41664I(jsonReader));
                    break;
                case 3:
                    m40392a.mo40399c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m40392a.mo40397a();
    }

    /* renamed from: L */
    public AbstractC12426f0 m41691L(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC12426f0 m41663H = m41663H(jsonReader);
                jsonReader.close();
                return m41663H;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: M */
    public String m41692M(AbstractC12426f0 abstractC12426f0) {
        return f34358a.mo26546b(abstractC12426f0);
    }

    /* renamed from: j */
    public AbstractC12426f0.e.d m41693j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC12426f0.e.d m41682r = m41682r(jsonReader);
                jsonReader.close();
                return m41682r;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: k */
    public String m41694k(AbstractC12426f0.e.d dVar) {
        return f34358a.mo26546b(dVar);
    }
}
