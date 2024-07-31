.class public final Lua/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/maps/zzaj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/maps/zzaj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/maps/zzaj;

    iput-object p1, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzaj;->zzl()Ljava/lang/String;

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
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzaj;->zzp()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzq(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public d(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzr(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public e(Lua/e;)V
    .locals 1

    const-string v0, "endCap must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzs(Lua/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lua/s;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    check-cast p1, Lua/s;

    iget-object p1, p1, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzD(Lcom/google/android/gms/internal/maps/zzaj;)Z

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

.method public f(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzt(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public g(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzu(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public h(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lua/o;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzv(Ljava/util/List;)V
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
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzaj;->zzh()I

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

.method public i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    const-string v0, "points must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzw(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Lua/e;)V
    .locals 1

    const-string v0, "startCap must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzy(Lua/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzA(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public l(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzB(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public m(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/s;->a:Lcom/google/android/gms/internal/maps/zzaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzaj;->zzC(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
