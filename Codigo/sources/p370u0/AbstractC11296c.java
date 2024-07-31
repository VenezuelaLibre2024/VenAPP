package p370u0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: u0.c */
/* loaded from: classes.dex */
public abstract class AbstractC11296c extends AbstractC11294a {

    /* renamed from: t */
    private int f29312t;

    /* renamed from: u */
    private int f29313u;

    /* renamed from: v */
    private LayoutInflater f29314v;

    @Deprecated
    public AbstractC11296c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f29313u = i10;
        this.f29312t = i10;
        this.f29314v = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p370u0.AbstractC11294a
    /* renamed from: f */
    public View mo35294f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f29314v.inflate(this.f29313u, viewGroup, false);
    }

    @Override // p370u0.AbstractC11294a
    /* renamed from: g */
    public View mo1726g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f29314v.inflate(this.f29312t, viewGroup, false);
    }
}
