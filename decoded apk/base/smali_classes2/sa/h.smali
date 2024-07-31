.class public final Lsa/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lta/d;


# direct methods
.method constructor <init>(Lta/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsa/h;->a:Lta/d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lsa/h;->a:Lta/d;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lta/d;->h0(Lcom/google/android/gms/dynamic/b;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public b()Lua/e0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/h;->a:Lta/d;

    invoke-interface {v0}, Lta/d;->G()Lua/e0;

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

.method public c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lsa/h;->a:Lta/d;

    invoke-interface {v0, p1}, Lta/d;->y(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Point;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
