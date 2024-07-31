.class public final Loc/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static h:Lga/a;


# instance fields
.field private final a:Lzb/g;

.field volatile b:J

.field volatile c:J

.field private d:J

.field private e:Landroid/os/HandlerThread;

.field private f:Landroid/os/Handler;

.field private g:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lga/a;

    const-string v1, "FirebaseAuth:"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "TokenRefresher"

    invoke-direct {v0, v2, v1}, Lga/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Loc/s;->h:Lga/a;

    return-void
.end method

.method public constructor <init>(Lzb/g;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Loc/s;->h:Lga/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Initializing TokenRefresher"

    invoke-virtual {v0, v2, v1}, Lga/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzb/g;

    iput-object p1, p0, Loc/s;->a:Lzb/g;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TokenRefresher"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Loc/s;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    iget-object v1, p0, Loc/s;->e:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzg;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Loc/s;->f:Landroid/os/Handler;

    new-instance v0, Loc/r;

    invoke-virtual {p1}, Lzb/g;->q()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Loc/r;-><init>(Loc/s;Ljava/lang/String;)V

    iput-object v0, p0, Loc/s;->g:Ljava/lang/Runnable;

    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Loc/s;->d:J

    return-void
.end method

.method static bridge synthetic a()Lga/a;
    .locals 1

    sget-object v0, Loc/s;->h:Lga/a;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Loc/s;->f:Landroid/os/Handler;

    iget-object v1, p0, Loc/s;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 6

    sget-object v0, Loc/s;->h:Lga/a;

    iget-wide v1, p0, Loc/s;->b:J

    iget-wide v3, p0, Loc/s;->d:J

    sub-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Scheduling refresh for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lga/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Loc/s;->b()V

    invoke-static {}, Lla/i;->d()Lla/f;

    move-result-object v0

    invoke-interface {v0}, Lla/f;->a()J

    move-result-wide v0

    iget-wide v2, p0, Loc/s;->b:J

    sub-long/2addr v2, v0

    iget-wide v0, p0, Loc/s;->d:J

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iput-wide v0, p0, Loc/s;->c:J

    iget-object v0, p0, Loc/s;->f:Landroid/os/Handler;

    iget-object v1, p0, Loc/s;->g:Ljava/lang/Runnable;

    iget-wide v4, p0, Loc/s;->c:J

    mul-long/2addr v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method final d()V
    .locals 7

    iget-wide v0, p0, Loc/s;->c:J

    long-to-int v0, v0

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const/16 v1, 0x78

    if-eq v0, v1, :cond_1

    const/16 v1, 0xf0

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1e0

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3c0

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x1e

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x3c0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x2

    iget-wide v2, p0, Loc/s;->c:J

    mul-long/2addr v0, v2

    :goto_0
    iput-wide v0, p0, Loc/s;->c:J

    invoke-static {}, Lla/i;->d()Lla/f;

    move-result-object v0

    invoke-interface {v0}, Lla/f;->a()J

    move-result-wide v0

    iget-wide v2, p0, Loc/s;->c:J

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Loc/s;->b:J

    sget-object v0, Loc/s;->h:Lga/a;

    iget-wide v1, p0, Loc/s;->b:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Scheduling refresh for "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lga/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Loc/s;->f:Landroid/os/Handler;

    iget-object v1, p0, Loc/s;->g:Ljava/lang/Runnable;

    iget-wide v2, p0, Loc/s;->c:J

    mul-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
