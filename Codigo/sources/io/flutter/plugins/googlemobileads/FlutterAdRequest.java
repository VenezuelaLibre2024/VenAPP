package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import x8.a;
import x8.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterAdRequest {
    private final Map<String, String> adMobExtras;
    private final String contentUrl;
    private final Integer httpTimeoutMillis;
    private final List<String> keywords;
    private final List<FlutterMediationExtras> mediationExtras;
    private final String mediationExtrasIdentifier;
    private final MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final List<String> neighboringContentUrls;
    private final Boolean nonPersonalizedAds;
    private final String requestAgent;

    /* loaded from: classes3.dex */
    protected static class Builder {
        private Map<String, String> adMobExtras;
        private String contentUrl;
        private Integer httpTimeoutMillis;
        private List<String> keywords;
        private List<FlutterMediationExtras> mediationExtras;
        private String mediationExtrasIdentifier;
        private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
        private List<String> neighboringContentUrls;
        private Boolean nonPersonalizedAds;
        private String requestAgent;

        /* JADX INFO: Access modifiers changed from: package-private */
        public FlutterAdRequest build() {
            return new FlutterAdRequest(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.adMobExtras, this.requestAgent, this.mediationExtras);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Map<String, String> getAdMobExtras() {
            return this.adMobExtras;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public String getContentUrl() {
            return this.contentUrl;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Integer getHttpTimeoutMillis() {
            return this.httpTimeoutMillis;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<String> getKeywords() {
            return this.keywords;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<FlutterMediationExtras> getMediationExtras() {
            return this.mediationExtras;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public String getMediationExtrasIdentifier() {
            return this.mediationExtrasIdentifier;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public MediationNetworkExtrasProvider getMediationNetworkExtrasProvider() {
            return this.mediationNetworkExtrasProvider;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<String> getNeighboringContentUrls() {
            return this.neighboringContentUrls;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Boolean getNonPersonalizedAds() {
            return this.nonPersonalizedAds;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public String getRequestAgent() {
            return this.requestAgent;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setAdMobExtras(Map<String, String> map) {
            this.adMobExtras = map;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setContentUrl(String str) {
            this.contentUrl = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setHttpTimeoutMillis(Integer num) {
            this.httpTimeoutMillis = num;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setKeywords(List<String> list) {
            this.keywords = list;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setMediationExtras(List<FlutterMediationExtras> list) {
            this.mediationExtras = list;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setMediationNetworkExtrasIdentifier(String str) {
            this.mediationExtrasIdentifier = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setMediationNetworkExtrasProvider(MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
            this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setNeighboringContentUrls(List<String> list) {
            this.neighboringContentUrls = list;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setNonPersonalizedAds(Boolean bool) {
            this.nonPersonalizedAds = bool;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setRequestAgent(String str) {
            this.requestAgent = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FlutterAdRequest(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, MediationNetworkExtrasProvider mediationNetworkExtrasProvider, Map<String, String> map, String str3, List<FlutterMediationExtras> list3) {
        this.keywords = list;
        this.contentUrl = str;
        this.nonPersonalizedAds = bool;
        this.neighboringContentUrls = list2;
        this.httpTimeoutMillis = num;
        this.mediationExtrasIdentifier = str2;
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
        this.adMobExtras = map;
        this.requestAgent = str3;
        this.mediationExtras = list3;
    }

    private <T extends a<T>> void addNetworkExtras(a<T> aVar, String str) {
        HashMap hashMap = new HashMap();
        List<FlutterMediationExtras> list = this.mediationExtras;
        if (list != null) {
            Iterator<FlutterMediationExtras> it = list.iterator();
            while (it.hasNext()) {
                Pair<Class<Object>, Bundle> mediationExtras = it.next().getMediationExtras();
                hashMap.put((Class) mediationExtras.first, (Bundle) mediationExtras.second);
            }
        } else {
            MediationNetworkExtrasProvider mediationNetworkExtrasProvider = this.mediationNetworkExtrasProvider;
            if (mediationNetworkExtrasProvider != null) {
                hashMap.putAll(mediationNetworkExtrasProvider.getMediationExtras(str, this.mediationExtrasIdentifier));
            }
        }
        Map<String, String> map = this.adMobExtras;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.adMobExtras.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            hashMap.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.nonPersonalizedAds;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            hashMap.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            aVar.b((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h asAdRequest(String str) {
        return ((h.a) updateAdRequestBuilder(new h.a(), str)).k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdRequest)) {
            return false;
        }
        FlutterAdRequest flutterAdRequest = (FlutterAdRequest) obj;
        return Objects.equals(this.keywords, flutterAdRequest.keywords) && Objects.equals(this.contentUrl, flutterAdRequest.contentUrl) && Objects.equals(this.nonPersonalizedAds, flutterAdRequest.nonPersonalizedAds) && Objects.equals(this.neighboringContentUrls, flutterAdRequest.neighboringContentUrls) && Objects.equals(this.httpTimeoutMillis, flutterAdRequest.httpTimeoutMillis) && Objects.equals(this.mediationExtrasIdentifier, flutterAdRequest.mediationExtrasIdentifier) && Objects.equals(this.mediationNetworkExtrasProvider, flutterAdRequest.mediationNetworkExtrasProvider) && Objects.equals(this.adMobExtras, flutterAdRequest.adMobExtras);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, String> getAdMobExtras() {
        return this.adMobExtras;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getContentUrl() {
        return this.contentUrl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Integer getHttpTimeoutMillis() {
        return this.httpTimeoutMillis;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<String> getKeywords() {
        return this.keywords;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<FlutterMediationExtras> getMediationExtras() {
        return this.mediationExtras;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getMediationExtrasIdentifier() {
        return this.mediationExtrasIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<String> getNeighboringContentUrls() {
        return this.neighboringContentUrls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean getNonPersonalizedAds() {
        return this.nonPersonalizedAds;
    }

    protected String getRequestAgent() {
        return this.requestAgent;
    }

    public int hashCode() {
        return Objects.hash(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.mediationExtras);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends a<T>> a<T> updateAdRequestBuilder(a<T> aVar, String str) {
        List<String> list = this.keywords;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        String str2 = this.contentUrl;
        if (str2 != null) {
            aVar.d(str2);
        }
        addNetworkExtras(aVar, str);
        List<String> list2 = this.neighboringContentUrls;
        if (list2 != null) {
            aVar.f(list2);
        }
        Integer num = this.httpTimeoutMillis;
        if (num != null) {
            aVar.e(num.intValue());
        }
        aVar.g(this.requestAgent);
        return aVar;
    }
}
