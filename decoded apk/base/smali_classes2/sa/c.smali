.class public Lsa/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsa/c$c;,
        Lsa/c$b;,
        Lsa/c$a;,
        Lsa/c$f;,
        Lsa/c$g;,
        Lsa/c$h;,
        Lsa/c$i;,
        Lsa/c$e;,
        Lsa/c$d;,
        Lsa/c$j;,
        Lsa/c$k;,
        Lsa/c$l;
    }
.end annotation


# instance fields
.field private final a:Lta/b;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private d:Lsa/i;


# direct methods
.method public constructor <init>(Lta/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lsa/c;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lsa/c;->c:Ljava/util/Map;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lta/b;

    iput-object p1, p0, Lsa/c;->a:Lta/b;

    return-void
.end method


# virtual methods
.method public final A(Lsa/c$d;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->O1(Lta/o0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/q;

    invoke-direct {v1, p0, p1}, Lsa/q;-><init>(Lsa/c;Lsa/c$d;)V

    invoke-interface {v0, v1}, Lta/b;->O1(Lta/o0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final B(Lsa/c$e;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->Y(Lta/h;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/p;

    invoke-direct {v1, p0, p1}, Lsa/p;-><init>(Lsa/c;Lsa/c$e;)V

    invoke-interface {v0, v1}, Lta/b;->Y(Lta/h;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final C(Lsa/c$f;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->F(Lta/j;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/x;

    invoke-direct {v1, p0, p1}, Lsa/x;-><init>(Lsa/c;Lsa/c$f;)V

    invoke-interface {v0, v1}, Lta/b;->F(Lta/j;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final D(Lsa/c$g;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->B0(Lta/l;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/k;

    invoke-direct {v1, p0, p1}, Lsa/k;-><init>(Lsa/c;Lsa/c$g;)V

    invoke-interface {v0, v1}, Lta/b;->B0(Lta/l;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final E(Lsa/c$h;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->e1(Lta/p;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/j;

    invoke-direct {v1, p0, p1}, Lsa/j;-><init>(Lsa/c;Lsa/c$h;)V

    invoke-interface {v0, v1}, Lta/b;->e1(Lta/p;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final F(Lsa/c$i;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->I(Lta/r;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/o;

    invoke-direct {v1, p0, p1}, Lsa/o;-><init>(Lsa/c;Lsa/c$i;)V

    invoke-interface {v0, v1}, Lta/b;->I(Lta/r;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final G(Lsa/c$j;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->w0(Lta/u;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/r;

    invoke-direct {v1, p0, p1}, Lsa/r;-><init>(Lsa/c;Lsa/c$j;)V

    invoke-interface {v0, v1}, Lta/b;->w0(Lta/u;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final H(Lsa/c$k;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->a2(Lta/w;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/s;

    invoke-direct {v1, p0, p1}, Lsa/s;-><init>(Lsa/c;Lsa/c$k;)V

    invoke-interface {v0, v1}, Lta/b;->a2(Lta/w;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final I(IIII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lta/b;->H0(IIII)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lua/v;

    invoke-direct {p2, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final J(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->setTrafficEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final K(Lsa/c$l;)V
    .locals 1

    const-string v0, "Callback must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lsa/c;->L(Lsa/c$l;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final L(Lsa/c$l;Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "Callback must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Lcom/google/android/gms/dynamic/d;

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/t;

    invoke-direct {v1, p0, p1}, Lsa/t;-><init>(Lsa/c;Lsa/c$l;)V

    invoke-interface {v0, v1, p2}, Lta/b;->C(Lta/z;Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lua/v;

    invoke-direct {p2, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final a(Lua/g;)Lua/f;
    .locals 2

    :try_start_0
    const-string v0, "CircleOptions must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lua/f;

    iget-object v1, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v1, p1}, Lta/b;->M1(Lua/g;)Lcom/google/android/gms/internal/maps/zzl;

    move-result-object p1

    invoke-direct {v0, p1}, Lua/f;-><init>(Lcom/google/android/gms/internal/maps/zzl;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final b(Lua/n;)Lua/m;
    .locals 2

    :try_start_0
    const-string v0, "MarkerOptions must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->h(Lua/n;)Lcom/google/android/gms/internal/maps/zzad;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lua/n;->zzb()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    new-instance p1, Lua/a;

    invoke-direct {p1, v0}, Lua/a;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lua/m;

    invoke-direct {p1, v0}, Lua/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final c(Lua/r;)Lua/q;
    .locals 2

    :try_start_0
    const-string v0, "PolygonOptions must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lua/q;

    iget-object v1, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v1, p1}, Lta/b;->y0(Lua/r;)Lcom/google/android/gms/internal/maps/zzag;

    move-result-object p1

    invoke-direct {v0, p1}, Lua/q;-><init>(Lcom/google/android/gms/internal/maps/zzag;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final d(Lua/t;)Lua/s;
    .locals 2

    :try_start_0
    const-string v0, "PolylineOptions must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lua/s;

    iget-object v1, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v1, p1}, Lta/b;->o(Lua/t;)Lcom/google/android/gms/internal/maps/zzaj;

    move-result-object p1

    invoke-direct {v0, p1}, Lua/s;-><init>(Lcom/google/android/gms/internal/maps/zzaj;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final e(Lua/c0;)Lua/b0;
    .locals 1

    :try_start_0
    const-string v0, "TileOverlayOptions must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->d0(Lua/c0;)Lcom/google/android/gms/internal/maps/zzam;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lua/b0;

    invoke-direct {v0, p1}, Lua/b0;-><init>(Lcom/google/android/gms/internal/maps/zzam;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final f(Lsa/a;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-virtual {p1}, Lsa/a;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lta/b;->f0(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final g()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0}, Lta/b;->z()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final h()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0}, Lta/b;->k0()F

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final i()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0}, Lta/b;->u0()F

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final j()Lsa/h;
    .locals 2

    :try_start_0
    new-instance v0, Lsa/h;

    iget-object v1, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v1}, Lta/b;->c0()Lta/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lsa/h;-><init>(Lta/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final k()Lsa/i;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/c;->d:Lsa/i;

    if-nez v0, :cond_0

    new-instance v0, Lsa/i;

    iget-object v1, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v1}, Lta/b;->z1()Lta/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lsa/i;-><init>(Lta/e;)V

    iput-object v0, p0, Lsa/c;->d:Lsa/i;

    :cond_0
    iget-object v0, p0, Lsa/c;->d:Lsa/i;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final l()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0}, Lta/b;->D1()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final m()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0}, Lta/b;->c1()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final n(Lsa/a;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-virtual {p1}, Lsa/a;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lta/b;->O0(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public o()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0}, Lta/b;->s1()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final p(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->setBuildingsEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final q(Z)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->setIndoorEnabled(Z)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public r(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->n(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public s(Lua/l;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->l1(Lua/l;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final t(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->setMapType(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public u(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->L(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public v(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->i1(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final w(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    invoke-interface {v0, p1}, Lta/b;->setMyLocationEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final x(Lsa/c$a;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->r(Lta/i0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/w;

    invoke-direct {v1, p0, p1}, Lsa/w;-><init>(Lsa/c;Lsa/c$a;)V

    invoke-interface {v0, v1}, Lta/b;->r(Lta/i0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final y(Lsa/c$b;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->k1(Lta/k0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/v;

    invoke-direct {v1, p0, p1}, Lsa/v;-><init>(Lsa/c;Lsa/c$b;)V

    invoke-interface {v0, v1}, Lta/b;->k1(Lta/k0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final z(Lsa/c$c;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lsa/c;->a:Lta/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lta/b;->A1(Lta/m0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/c;->a:Lta/b;

    new-instance v1, Lsa/u;

    invoke-direct {v1, p0, p1}, Lsa/u;-><init>(Lsa/c;Lsa/c$c;)V

    invoke-interface {v0, v1}, Lta/b;->A1(Lta/m0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
