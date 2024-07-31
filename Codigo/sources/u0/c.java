package u0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: t, reason: collision with root package name */
    private int f27010t;

    /* renamed from: u, reason: collision with root package name */
    private int f27011u;

    /* renamed from: v, reason: collision with root package name */
    private LayoutInflater f27012v;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f27011u = i10;
        this.f27010t = i10;
        this.f27012v = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // u0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f27012v.inflate(this.f27011u, viewGroup, false);
    }

    @Override // u0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f27012v.inflate(this.f27010t, viewGroup, false);
    }
}
