package p080e9;

/* renamed from: e9.a */
/* loaded from: classes.dex */
public interface InterfaceC7135a {

    /* renamed from: e9.a$a */
    /* loaded from: classes.dex */
    public enum a {
        NOT_READY,
        READY
    }

    String getDescription();

    a getInitializationState();

    int getLatency();
}
