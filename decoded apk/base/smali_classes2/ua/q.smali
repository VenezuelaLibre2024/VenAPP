.class public final Lua/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/maps/zzag;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/maps/zzag;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/maps/zzag;

    iput-object p1, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzag;->zzk()Ljava/lang/String;

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
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzag;->zzo()V
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
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzp(Z)V
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
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzq(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public e(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzr(Z)V
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

    instance-of v0, p1, Lua/q;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    check-cast p1, Lua/q;

    iget-object p1, p1, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzB(Lcom/google/android/gms/internal/maps/zzag;)Z

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

.method public f(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzs(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public g(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzt(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public h(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzu(I)V
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
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzag;->zzi()I

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

.method public i(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzx(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzz(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/q;->a:Lcom/google/android/gms/internal/maps/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzag;->zzA(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
