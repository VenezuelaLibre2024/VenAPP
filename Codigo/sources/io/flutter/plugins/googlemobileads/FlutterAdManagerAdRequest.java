package io.flutter.plugins.googlemobileads;

import io.flutter.plugins.googlemobileads.FlutterAdRequest;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterAdManagerAdRequest extends FlutterAdRequest {
    private final Map<String, String> customTargeting;
    private final Map<String, List<String>> customTargetingLists;
    private final String publisherProvidedId;

    /* loaded from: classes3.dex */
    static class Builder extends FlutterAdRequest.Builder {
        private Map<String, String> customTargeting;
        private Map<String, List<String>> customTargetingLists;
        private String publisherProvidedId;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.flutter.plugins.googlemobileads.FlutterAdRequest.Builder
        public FlutterAdManagerAdRequest build() {
            return new FlutterAdManagerAdRequest(getKeywords(), getContentUrl(), this.customTargeting, this.customTargetingLists, getNonPersonalizedAds(), getNeighboringContentUrls(), getHttpTimeoutMillis(), this.publisherProvidedId, getMediationExtrasIdentifier(), getMediationNetworkExtrasProvider(), getAdMobExtras(), getRequestAgent(), getMediationExtras());
        }

        public Builder setCustomTargeting(Map<String, String> map) {
            this.customTargeting = map;
            return this;
        }

        public Builder setCustomTargetingLists(Map<String, List<String>> map) {
            this.customTargetingLists = map;
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.publisherProvidedId = str;
            return this;
        }
    }

    private FlutterAdManagerAdRequest(List<String> list, String str, Map<String, String> map, Map<String, List<String>> map2, Boolean bool, List<String> list2, Integer num, String str2, String str3, MediationNetworkExtrasProvider mediationNetworkExtrasProvider, Map<String, String> map3, String str4, List<FlutterMediationExtras> list3) {
        super(list, str, bool, list2, num, str3, mediationNetworkExtrasProvider, map3, str4, list3);
        this.customTargeting = map;
        this.customTargetingLists = map2;
        this.publisherProvidedId = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a asAdManagerAdRequest(String str) {
        a.C0532a c0532a = new a.C0532a();
        updateAdRequestBuilder(c0532a, str);
        Map<String, String> map = this.customTargeting;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0532a.k(entry.getKey(), entry.getValue());
            }
        }
        Map<String, List<String>> map2 = this.customTargetingLists;
        if (map2 != null) {
            for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
                c0532a.l(entry2.getKey(), entry2.getValue());
            }
        }
        String str2 = this.publisherProvidedId;
        if (str2 != null) {
            c0532a.n(str2);
        }
        return c0532a.m();
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdRequest
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdManagerAdRequest)) {
            return false;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) obj;
        return super.equals(obj) && Objects.equals(this.customTargeting, flutterAdManagerAdRequest.customTargeting) && Objects.equals(this.customTargetingLists, flutterAdManagerAdRequest.customTargetingLists);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, String> getCustomTargeting() {
        return this.customTargeting;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, List<String>> getCustomTargetingLists() {
        return this.customTargetingLists;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getPublisherProvidedId() {
        return this.publisherProvidedId;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdRequest
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.customTargeting, this.customTargetingLists);
    }
}
