.class Lz2/k$a;
.super Lcom/google/android/gms/location/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz2/k;-><init>(Landroid/content/Context;Lz2/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lz2/k;


# direct methods
.method constructor <init>(Lz2/k;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lz2/k$a;->b:Lz2/k;

    iput-object p2, p0, Lz2/k$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Lcom/google/android/gms/location/m;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized onLocationAvailability(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationAvailability;->u1()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lz2/k$a;->b:Lz2/k;

    iget-object v0, p0, Lz2/k$a;->a:Landroid/content/Context;

    invoke-interface {p1, v0}, Lz2/p;->a(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {p1}, Lz2/k;->n(Lz2/k;)Ly2/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {p1}, Lz2/k;->n(Lz2/k;)Ly2/a;

    move-result-object p1

    sget-object v0, Ly2/b;->locationServicesDisabled:Ly2/b;

    invoke-interface {p1, v0}, Ly2/a;->a(Ly2/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {v0}, Lz2/k;->k(Lz2/k;)Lz2/e0;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p1, "FlutterGeolocator"

    const-string v0, "LocationCallback was called with empty locationResult or no positionChangedCallback was registered."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {p1}, Lz2/k;->m(Lz2/k;)Lcom/google/android/gms/location/g;

    move-result-object p1

    iget-object v0, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {v0}, Lz2/k;->l(Lz2/k;)Lcom/google/android/gms/location/m;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/location/g;->removeLocationUpdates(Lcom/google/android/gms/location/m;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {p1}, Lz2/k;->n(Lz2/k;)Ly2/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {p1}, Lz2/k;->n(Lz2/k;)Ly2/a;

    move-result-object p1

    sget-object v0, Ly2/b;->errorWhileAcquiringPosition:Ly2/b;

    invoke-interface {p1, v0}, Ly2/a;->a(Ly2/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->u1()Landroid/location/Location;

    move-result-object p1

    iget-object v0, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {v0}, Lz2/k;->o(Lz2/k;)Lz2/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz2/d0;->b(Landroid/location/Location;)V

    iget-object v0, p0, Lz2/k$a;->b:Lz2/k;

    invoke-static {v0}, Lz2/k;->k(Lz2/k;)Lz2/e0;

    move-result-object v0

    invoke-interface {v0, p1}, Lz2/e0;->a(Landroid/location/Location;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
