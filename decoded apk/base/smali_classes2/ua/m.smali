.class public Lua/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lcom/google/android/gms/internal/maps/zzad;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/maps/zzad;

    iput-object p1, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzad;->zzk()Ljava/lang/String;

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

.method public b()Lcom/google/android/gms/maps/model/LatLng;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzad;->zzj()Lcom/google/android/gms/maps/model/LatLng;

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

.method public c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzad;->zzn()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public d()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzad;->zzH()Z

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

.method public e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzad;->zzo()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lua/m;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    check-cast p1, Lua/m;

    iget-object p1, p1, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzE(Lcom/google/android/gms/internal/maps/zzad;)Z

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

.method public f(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzp(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public g(FF)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/maps/zzad;->zzq(FF)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lua/v;

    invoke-direct {p2, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public h(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzr(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public hashCode()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzad;->zzg()I

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
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzs(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Lua/b;)V
    .locals 1

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/maps/zzad;->zzt(Lcom/google/android/gms/dynamic/b;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lua/b;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzt(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(FF)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/maps/zzad;->zzv(FF)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lua/v;

    invoke-direct {p2, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public l(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzw(Lcom/google/android/gms/maps/model/LatLng;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "latlng cannot be null - a position is required."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzx(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public n(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzy(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public o(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzA(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public p(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzB(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public q(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzad;->zzC(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public r()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/m;->a:Lcom/google/android/gms/internal/maps/zzad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzad;->zzD()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
