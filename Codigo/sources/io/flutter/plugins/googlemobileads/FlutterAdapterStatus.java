package io.flutter.plugins.googlemobileads;

import e9.a;

/* loaded from: classes3.dex */
class FlutterAdapterStatus {
    final String description;
    final Number latency;
    final AdapterInitializationState state;

    /* renamed from: io.flutter.plugins.googlemobileads.FlutterAdapterStatus$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State;

        static {
            int[] iArr = new int[a.EnumC0222a.values().length];
            $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State = iArr;
            try {
                iArr[a.EnumC0222a.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State[a.EnumC0222a.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    enum AdapterInitializationState {
        NOT_READY,
        READY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAdapterStatus(a aVar) {
        AdapterInitializationState adapterInitializationState;
        int i10 = AnonymousClass1.$SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State[aVar.getInitializationState().ordinal()];
        if (i10 == 1) {
            adapterInitializationState = AdapterInitializationState.NOT_READY;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", aVar.getInitializationState()));
            }
            adapterInitializationState = AdapterInitializationState.READY;
        }
        this.state = adapterInitializationState;
        this.description = aVar.getDescription();
        this.latency = Integer.valueOf(aVar.getLatency());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAdapterStatus(AdapterInitializationState adapterInitializationState, String str, Number number) {
        this.state = adapterInitializationState;
        this.description = str;
        this.latency = number;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdapterStatus)) {
            return false;
        }
        FlutterAdapterStatus flutterAdapterStatus = (FlutterAdapterStatus) obj;
        if (this.state == flutterAdapterStatus.state && this.description.equals(flutterAdapterStatus.description)) {
            return this.latency.equals(flutterAdapterStatus.latency);
        }
        return false;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.description.hashCode()) * 31) + this.latency.hashCode();
    }
}
