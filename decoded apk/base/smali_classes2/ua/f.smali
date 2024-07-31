.class public final Lua/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/maps/zzl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/maps/zzl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/maps/zzl;

    iput-object p1, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzl;->zzl()Ljava/lang/String;

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

.method public b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzl;->zzn()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    :try_start_0
    const-string v0, "center must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzo(Lcom/google/android/gms/maps/model/LatLng;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public d(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzp(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public e(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzq(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lua/f;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    check-cast p1, Lua/f;

    iget-object p1, p1, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzy(Lcom/google/android/gms/internal/maps/zzl;)Z

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

.method public f(D)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/maps/zzl;->zzr(D)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lua/v;

    invoke-direct {p2, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public g(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzs(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public h(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzu(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzl;->zzi()I

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

.method public i(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzw(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/f;->a:Lcom/google/android/gms/internal/maps/zzl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzl;->zzx(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
