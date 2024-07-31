.class Lz2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/p;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/location/m;

.field private final c:Lcom/google/android/gms/location/g;

.field private final d:Lz2/d0;

.field private final e:I

.field private final f:Lz2/z;

.field private g:Ly2/a;

.field private h:Lz2/e0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz2/z;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/k;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/location/o;->a(Landroid/content/Context;)Lcom/google/android/gms/location/g;

    move-result-object v0

    iput-object v0, p0, Lz2/k;->c:Lcom/google/android/gms/location/g;

    iput-object p2, p0, Lz2/k;->f:Lz2/z;

    new-instance v0, Lz2/d0;

    invoke-direct {v0, p1, p2}, Lz2/d0;-><init>(Landroid/content/Context;Lz2/z;)V

    iput-object v0, p0, Lz2/k;->d:Lz2/d0;

    invoke-direct {p0}, Lz2/k;->s()I

    move-result p2

    iput p2, p0, Lz2/k;->e:I

    new-instance p2, Lz2/k$a;

    invoke-direct {p2, p0, p1}, Lz2/k$a;-><init>(Lz2/k;Landroid/content/Context;)V

    iput-object p2, p0, Lz2/k;->b:Lcom/google/android/gms/location/m;

    return-void
.end method

.method public static synthetic g(Lz2/k;Lcom/google/android/gms/location/q;)V
    .locals 0

    invoke-direct {p0, p1}, Lz2/k;->v(Lcom/google/android/gms/location/q;)V

    return-void
.end method

.method public static synthetic h(Lz2/k;Landroid/app/Activity;Ly2/a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz2/k;->w(Landroid/app/Activity;Ly2/a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic i(Ly2/a;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lz2/k;->t(Ly2/a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic j(Lz2/a0;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lz2/k;->u(Lz2/a0;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method static synthetic k(Lz2/k;)Lz2/e0;
    .locals 0

    iget-object p0, p0, Lz2/k;->h:Lz2/e0;

    return-object p0
.end method

.method static synthetic l(Lz2/k;)Lcom/google/android/gms/location/m;
    .locals 0

    iget-object p0, p0, Lz2/k;->b:Lcom/google/android/gms/location/m;

    return-object p0
.end method

.method static synthetic m(Lz2/k;)Lcom/google/android/gms/location/g;
    .locals 0

    iget-object p0, p0, Lz2/k;->c:Lcom/google/android/gms/location/g;

    return-object p0
.end method

.method static synthetic n(Lz2/k;)Ly2/a;
    .locals 0

    iget-object p0, p0, Lz2/k;->g:Ly2/a;

    return-object p0
.end method

.method static synthetic o(Lz2/k;)Lz2/d0;
    .locals 0

    iget-object p0, p0, Lz2/k;->d:Lz2/d0;

    return-object p0
.end method

.method private static p(Lz2/z;)Lcom/google/android/gms/location/LocationRequest;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    invoke-static {p0}, Lz2/k;->q(Lz2/z;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/LocationRequest$a;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest$a;-><init>(J)V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lz2/z;->a()Lz2/m;

    move-result-object v1

    invoke-static {v1}, Lz2/k;->y(Lz2/m;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest$a;->h(I)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p0}, Lz2/z;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest$a;->d(J)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p0}, Lz2/z;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest$a;->g(J)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p0}, Lz2/z;->b()J

    move-result-wide v1

    long-to-float p0, v1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/location/LocationRequest$a;->f(F)Lcom/google/android/gms/location/LocationRequest$a;

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest$a;->a()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p0

    return-object p0
.end method

.method private static q(Lz2/z;)Lcom/google/android/gms/location/LocationRequest;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->u1()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lz2/z;->a()Lz2/m;

    move-result-object v1

    invoke-static {v1}, Lz2/k;->y(Lz2/m;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->J1(I)Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {p0}, Lz2/z;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->I1(J)Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {p0}, Lz2/z;->c()J

    move-result-wide v1

    const-wide/16 v3, 0x2

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->H1(J)Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {p0}, Lz2/z;->b()J

    move-result-wide v1

    long-to-float p0, v1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/location/LocationRequest;->K1(F)Lcom/google/android/gms/location/LocationRequest;

    :cond_0
    return-object v0
.end method

.method private static r(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/p;
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/p$a;

    invoke-direct {v0}, Lcom/google/android/gms/location/p$a;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/location/p$a;->a(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/p$a;

    invoke-virtual {v0}, Lcom/google/android/gms/location/p$a;->b()Lcom/google/android/gms/location/p;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized s()I
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static synthetic t(Ly2/a;Ljava/lang/Exception;)V
    .locals 1

    const-string p1, "Geolocator"

    const-string v0, "Error trying to get last the last known GPS location"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p0, :cond_0

    sget-object p1, Ly2/b;->errorWhileAcquiringPosition:Ly2/b;

    invoke-interface {p0, p1}, Ly2/a;->a(Ly2/b;)V

    :cond_0
    return-void
.end method

.method private static synthetic u(Lz2/a0;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ly2/b;->locationServicesDisabled:Ly2/b;

    invoke-interface {p0, v0}, Lz2/a0;->a(Ly2/b;)V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/q;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/location/q;->c()Lcom/google/android/gms/location/s;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/location/s;->x1()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/location/s;->z1()Z

    move-result p1

    if-eqz p1, :cond_2

    move p1, v0

    goto :goto_1

    :cond_2
    move p1, v1

    :goto_1
    if-nez v2, :cond_4

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    :cond_4
    :goto_2
    invoke-interface {p0, v0}, Lz2/a0;->b(Z)V

    goto :goto_3

    :cond_5
    sget-object p1, Ly2/b;->locationServicesDisabled:Ly2/b;

    invoke-interface {p0, p1}, Lz2/a0;->a(Ly2/b;)V

    :goto_3
    return-void
.end method

.method private synthetic v(Lcom/google/android/gms/location/q;)V
    .locals 0

    iget-object p1, p0, Lz2/k;->f:Lz2/z;

    invoke-direct {p0, p1}, Lz2/k;->x(Lz2/z;)V

    return-void
.end method

.method private synthetic w(Landroid/app/Activity;Ly2/a;Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p3, Lcom/google/android/gms/common/api/l;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    sget-object p1, Ly2/b;->locationServicesDisabled:Ly2/b;

    invoke-interface {p2, p1}, Ly2/a;->a(Ly2/b;)V

    return-void

    :cond_0
    check-cast p3, Lcom/google/android/gms/common/api/l;

    invoke-virtual {p3}, Lcom/google/android/gms/common/api/b;->getStatusCode()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    :try_start_0
    iget v0, p0, Lz2/k;->e:I

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/common/api/l;->a(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    check-cast p3, Lcom/google/android/gms/common/api/b;

    invoke-virtual {p3}, Lcom/google/android/gms/common/api/b;->getStatusCode()I

    move-result p1

    const/16 p3, 0x2136

    if-ne p1, p3, :cond_2

    iget-object p1, p0, Lz2/k;->f:Lz2/z;

    invoke-direct {p0, p1}, Lz2/k;->x(Lz2/z;)V

    goto :goto_0

    :catch_0
    :cond_2
    sget-object p1, Ly2/b;->locationServicesDisabled:Ly2/b;

    invoke-interface {p2, p1}, Ly2/a;->a(Ly2/b;)V

    :goto_0
    return-void
.end method

.method private x(Lz2/z;)V
    .locals 3

    invoke-static {p1}, Lz2/k;->p(Lz2/z;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p1

    iget-object v0, p0, Lz2/k;->d:Lz2/d0;

    invoke-virtual {v0}, Lz2/d0;->d()V

    iget-object v0, p0, Lz2/k;->c:Lcom/google/android/gms/location/g;

    iget-object v1, p0, Lz2/k;->b:Lcom/google/android/gms/location/m;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/location/g;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/m;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static y(Lz2/m;)I
    .locals 1

    sget-object v0, Lz2/k$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/16 p0, 0x64

    return p0

    :cond_0
    const/16 p0, 0x66

    return p0

    :cond_1
    const/16 p0, 0x68

    return p0

    :cond_2
    const/16 p0, 0x69

    return p0
.end method


# virtual methods
.method public b(Lz2/a0;)V
    .locals 2

    iget-object v0, p0, Lz2/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/location/o;->b(Landroid/content/Context;)Lcom/google/android/gms/location/u;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/location/p$a;

    invoke-direct {v1}, Lcom/google/android/gms/location/p$a;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/location/p$a;->b()Lcom/google/android/gms/location/p;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/u;->checkLocationSettings(Lcom/google/android/gms/location/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lz2/f;

    invoke-direct {v1, p1}, Lz2/f;-><init>(Lz2/a0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public c(Landroid/app/Activity;Lz2/e0;Ly2/a;)V
    .locals 1

    iput-object p2, p0, Lz2/k;->h:Lz2/e0;

    iput-object p3, p0, Lz2/k;->g:Ly2/a;

    iget-object p2, p0, Lz2/k;->f:Lz2/z;

    invoke-static {p2}, Lz2/k;->p(Lz2/z;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p2

    invoke-static {p2}, Lz2/k;->r(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/p;

    move-result-object p2

    iget-object v0, p0, Lz2/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/location/o;->b(Landroid/content/Context;)Lcom/google/android/gms/location/u;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/location/u;->checkLocationSettings(Lcom/google/android/gms/location/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance v0, Lz2/i;

    invoke-direct {v0, p0}, Lz2/i;-><init>(Lz2/k;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance v0, Lz2/j;

    invoke-direct {v0, p0, p1, p3}, Lz2/j;-><init>(Lz2/k;Landroid/app/Activity;Ly2/a;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public d(Lz2/e0;Ly2/a;)V
    .locals 2

    iget-object v0, p0, Lz2/k;->c:Lcom/google/android/gms/location/g;

    invoke-interface {v0}, Lcom/google/android/gms/location/g;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lz2/g;

    invoke-direct {v1, p1}, Lz2/g;-><init>(Lz2/e0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lz2/h;

    invoke-direct {v0, p2}, Lz2/h;-><init>(Ly2/a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public e(II)Z
    .locals 2

    iget v0, p0, Lz2/k;->e:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_3

    const/4 p1, -0x1

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Lz2/k;->f:Lz2/z;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lz2/k;->h:Lz2/e0;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lz2/k;->g:Ly2/a;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lz2/k;->x(Lz2/z;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v1

    :cond_2
    iget-object p1, p0, Lz2/k;->g:Ly2/a;

    if-eqz p1, :cond_3

    sget-object p2, Ly2/b;->locationServicesDisabled:Ly2/b;

    invoke-interface {p1, p2}, Ly2/a;->a(Ly2/b;)V

    :cond_3
    return v1
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lz2/k;->d:Lz2/d0;

    invoke-virtual {v0}, Lz2/d0;->e()V

    iget-object v0, p0, Lz2/k;->c:Lcom/google/android/gms/location/g;

    iget-object v1, p0, Lz2/k;->b:Lcom/google/android/gms/location/m;

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/g;->removeLocationUpdates(Lcom/google/android/gms/location/m;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
