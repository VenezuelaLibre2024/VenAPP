.class public final Lsa/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lta/a;


# direct methods
.method public static a(Lcom/google/android/gms/maps/model/CameraPosition;)Lsa/a;
    .locals 2

    const-string v0, "cameraPosition must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lta/a;->U(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lua/v;

    invoke-direct {v0, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static b(Lcom/google/android/gms/maps/model/LatLng;)Lsa/a;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lta/a;->L0(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lua/v;

    invoke-direct {v0, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lsa/a;
    .locals 2

    const-string v0, "bounds must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Lta/a;->e(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lua/v;

    invoke-direct {p1, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static d(Lcom/google/android/gms/maps/model/LatLng;F)Lsa/a;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Lta/a;->m0(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lua/v;

    invoke-direct {p1, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static e(FF)Lsa/a;
    .locals 2

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Lta/a;->n0(FF)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lua/v;

    invoke-direct {p1, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static f(F)Lsa/a;
    .locals 2

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lta/a;->zoomBy(F)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lua/v;

    invoke-direct {v0, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static g(FLandroid/graphics/Point;)Lsa/a;
    .locals 3

    const-string v0, "focus must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    iget v2, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-interface {v1, p0, v2, p1}, Lta/a;->f1(FII)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lua/v;

    invoke-direct {p1, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static h()Lsa/a;
    .locals 2

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1}, Lta/a;->zoomIn()Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static i()Lsa/a;
    .locals 2

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1}, Lta/a;->zoomOut()Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static j(F)Lsa/a;
    .locals 2

    :try_start_0
    new-instance v0, Lsa/a;

    invoke-static {}, Lsa/b;->l()Lta/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lta/a;->i0(F)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lsa/a;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lua/v;

    invoke-direct {v0, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static k(Lta/a;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lta/a;

    sput-object p0, Lsa/b;->a:Lta/a;

    return-void
.end method

.method private static l()Lta/a;
    .locals 2

    sget-object v0, Lsa/b;->a:Lta/a;

    const-string v1, "CameraUpdateFactory is not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lta/a;

    return-object v0
.end method
