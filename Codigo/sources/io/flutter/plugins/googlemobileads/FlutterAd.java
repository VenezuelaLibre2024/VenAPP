package io.flutter.plugins.googlemobileads;

import io.flutter.plugin.platform.PlatformView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import x8.b;
import x8.l;
import x8.o;
import x8.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class FlutterAd {
    protected final int adId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class FlutterAdError {
        final int code;
        final String domain;
        final String message;

        public FlutterAdError(int i10, String str, String str2) {
            this.code = i10;
            this.domain = str;
            this.message = str2;
        }

        public FlutterAdError(b bVar) {
            this.code = bVar.a();
            this.domain = bVar.b();
            this.message = bVar.c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterAdError)) {
                return false;
            }
            FlutterAdError flutterAdError = (FlutterAdError) obj;
            if (this.code == flutterAdError.code && this.domain.equals(flutterAdError.domain)) {
                return this.message.equals(flutterAdError.message);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.code), this.domain, this.message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class FlutterAdapterResponseInfo {
        private final String adSourceId;
        private final String adSourceInstanceId;
        private final String adSourceInstanceName;
        private final String adSourceName;
        private final Map<String, String> adUnitMapping;
        private final String adapterClassName;
        private final String description;
        private FlutterAdError error;
        private final long latencyMillis;

        public FlutterAdapterResponseInfo(String str, long j10, String str2, Map<String, String> map, FlutterAdError flutterAdError, String str3, String str4, String str5, String str6) {
            this.adapterClassName = str;
            this.latencyMillis = j10;
            this.description = str2;
            this.adUnitMapping = map;
            this.error = flutterAdError;
            this.adSourceName = str3;
            this.adSourceId = str4;
            this.adSourceInstanceName = str5;
            this.adSourceInstanceId = str6;
        }

        FlutterAdapterResponseInfo(l lVar) {
            this.adapterClassName = lVar.f();
            this.latencyMillis = lVar.h();
            this.description = lVar.toString();
            if (lVar.g() != null) {
                this.adUnitMapping = new HashMap();
                for (String str : lVar.g().keySet()) {
                    this.adUnitMapping.put(str, lVar.g().getString(str));
                }
            } else {
                this.adUnitMapping = new HashMap();
            }
            if (lVar.a() != null) {
                this.error = new FlutterAdError(lVar.a());
            }
            this.adSourceName = lVar.e();
            this.adSourceId = lVar.b();
            this.adSourceInstanceName = lVar.d();
            this.adSourceInstanceId = lVar.c();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FlutterAdapterResponseInfo)) {
                return false;
            }
            FlutterAdapterResponseInfo flutterAdapterResponseInfo = (FlutterAdapterResponseInfo) obj;
            return Objects.equals(this.adapterClassName, flutterAdapterResponseInfo.adapterClassName) && this.latencyMillis == flutterAdapterResponseInfo.latencyMillis && Objects.equals(this.description, flutterAdapterResponseInfo.description) && Objects.equals(this.error, flutterAdapterResponseInfo.error) && Objects.equals(this.adUnitMapping, flutterAdapterResponseInfo.adUnitMapping) && Objects.equals(this.adSourceName, flutterAdapterResponseInfo.adSourceName) && Objects.equals(this.adSourceId, flutterAdapterResponseInfo.adSourceId) && Objects.equals(this.adSourceInstanceName, flutterAdapterResponseInfo.adSourceInstanceName) && Objects.equals(this.adSourceInstanceId, flutterAdapterResponseInfo.adSourceInstanceId);
        }

        public String getAdSourceId() {
            return this.adSourceId;
        }

        public String getAdSourceInstanceId() {
            return this.adSourceInstanceId;
        }

        public String getAdSourceInstanceName() {
            return this.adSourceInstanceName;
        }

        public String getAdSourceName() {
            return this.adSourceName;
        }

        public Map<String, String> getAdUnitMapping() {
            return this.adUnitMapping;
        }

        public String getAdapterClassName() {
            return this.adapterClassName;
        }

        public String getDescription() {
            return this.description;
        }

        public FlutterAdError getError() {
            return this.error;
        }

        public long getLatencyMillis() {
            return this.latencyMillis;
        }

        public int hashCode() {
            return Objects.hash(this.adapterClassName, Long.valueOf(this.latencyMillis), this.description, this.error, this.adSourceName, this.adSourceId, this.adSourceInstanceName, this.adSourceInstanceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class FlutterLoadAdError {
        final int code;
        final String domain;
        final String message;
        FlutterResponseInfo responseInfo;

        public FlutterLoadAdError(int i10, String str, String str2, FlutterResponseInfo flutterResponseInfo) {
            this.code = i10;
            this.domain = str;
            this.message = str2;
            this.responseInfo = flutterResponseInfo;
        }

        public FlutterLoadAdError(o oVar) {
            this.code = oVar.a();
            this.domain = oVar.b();
            this.message = oVar.c();
            if (oVar.f() != null) {
                this.responseInfo = new FlutterResponseInfo(oVar.f());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterLoadAdError)) {
                return false;
            }
            FlutterLoadAdError flutterLoadAdError = (FlutterLoadAdError) obj;
            if (this.code == flutterLoadAdError.code && this.domain.equals(flutterLoadAdError.domain) && Objects.equals(this.responseInfo, flutterLoadAdError.responseInfo)) {
                return this.message.equals(flutterLoadAdError.message);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.code), this.domain, this.message, this.responseInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class FlutterOverlayAd extends FlutterAd {
        public FlutterOverlayAd(int i10) {
            super(i10);
        }

        public abstract void setImmersiveMode(boolean z10);

        public abstract void show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class FlutterResponseInfo {
        private final List<FlutterAdapterResponseInfo> adapterResponses;
        private final FlutterAdapterResponseInfo loadedAdapterResponseInfo;
        private final String mediationAdapterClassName;
        private final Map<String, String> responseExtras;
        private final String responseId;

        public FlutterResponseInfo(String str, String str2, List<FlutterAdapterResponseInfo> list, FlutterAdapterResponseInfo flutterAdapterResponseInfo, Map<String, String> map) {
            this.responseId = str;
            this.mediationAdapterClassName = str2;
            this.adapterResponses = list;
            this.loadedAdapterResponseInfo = flutterAdapterResponseInfo;
            this.responseExtras = map;
        }

        public FlutterResponseInfo(z zVar) {
            this.responseId = zVar.e();
            this.mediationAdapterClassName = zVar.c();
            ArrayList arrayList = new ArrayList();
            Iterator<l> it = zVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(new FlutterAdapterResponseInfo(it.next()));
            }
            this.adapterResponses = arrayList;
            this.loadedAdapterResponseInfo = zVar.b() != null ? new FlutterAdapterResponseInfo(zVar.b()) : null;
            HashMap hashMap = new HashMap();
            if (zVar.d() != null) {
                for (String str : zVar.d().keySet()) {
                    hashMap.put(str, zVar.d().getString(str));
                }
            }
            this.responseExtras = hashMap;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FlutterResponseInfo)) {
                return false;
            }
            FlutterResponseInfo flutterResponseInfo = (FlutterResponseInfo) obj;
            return Objects.equals(this.responseId, flutterResponseInfo.responseId) && Objects.equals(this.mediationAdapterClassName, flutterResponseInfo.mediationAdapterClassName) && Objects.equals(this.adapterResponses, flutterResponseInfo.adapterResponses) && Objects.equals(this.loadedAdapterResponseInfo, flutterResponseInfo.loadedAdapterResponseInfo);
        }

        public List<FlutterAdapterResponseInfo> getAdapterResponses() {
            return this.adapterResponses;
        }

        public FlutterAdapterResponseInfo getLoadedAdapterResponseInfo() {
            return this.loadedAdapterResponseInfo;
        }

        public String getMediationAdapterClassName() {
            return this.mediationAdapterClassName;
        }

        public Map<String, String> getResponseExtras() {
            return this.responseExtras;
        }

        public String getResponseId() {
            return this.responseId;
        }

        public int hashCode() {
            return Objects.hash(this.responseId, this.mediationAdapterClassName, this.adapterResponses, this.loadedAdapterResponseInfo);
        }
    }

    public FlutterAd(int i10) {
        this.adId = i10;
    }

    public abstract void dispose();

    public PlatformView getPlatformView() {
        return null;
    }

    abstract void load();
}
