package ai;

/* loaded from: classes3.dex */
public abstract class a extends b {
    @Override // ai.f
    public void error(String str, String str2, Object obj) {
        l().error(str, str2, obj);
    }

    protected abstract f l();

    @Override // ai.f
    public void success(Object obj) {
        l().success(obj);
    }
}
