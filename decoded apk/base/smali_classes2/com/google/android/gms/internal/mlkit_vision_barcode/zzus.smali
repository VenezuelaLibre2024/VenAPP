.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zzf:Lcom/google/android/gms/common/internal/j;


# instance fields
.field final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

.field final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

.field zzc:Ljava/util/concurrent/ScheduledFuture;

.field zzd:Ljava/lang/String;

.field zze:I

.field private final zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzh:Ljava/lang/Object;

.field private final zzi:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

.field private final zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

.field private final zzl:Ljava/lang/String;

.field private zzm:Ljava/util/concurrent/Executor;

.field private zzn:F

.field private zzo:F

.field private zzp:J

.field private zzq:J

.field private zzr:Z

.field private zzs:Lzf/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/j;

    const-string v1, "AutoZoom"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzf:Lcom/google/android/gms/common/internal/j;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzg;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzd;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzar;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    new-instance v3, Lcom/google/mlkit/common/sdkinternal/n;

    invoke-direct {v3, p1}, Lcom/google/mlkit/common/sdkinternal/n;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztq;

    const-string v5, "scanner-auto-zoom"

    invoke-static {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzto;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzto;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;

    move-result-object v6

    invoke-direct {v4, p1, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;)V

    invoke-direct {v2, p1, v3, v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;-><init>(Landroid/content/Context;Lcom/google/mlkit/common/sdkinternal/n;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztn;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;->zzz()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

    iput-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzl:Ljava/lang/String;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzo:F

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;->zza()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzp:J

    return-void
.end method

.method static bridge synthetic zzb()Lcom/google/android/gms/common/internal/j;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzf:Lcom/google/android/gms/common/internal/j;

    return-object v0
.end method

.method public static zzd(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;Ljava/lang/String;)V

    return-object v0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzc:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza()J

    move-result-wide v3

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzi()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-ltz v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzf:Lcom/google/android/gms/common/internal/j;

    const-string v3, "AutoZoom"

    const-string v4, "Reset zoom = 1"

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/common/internal/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdJ:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V

    :cond_1
    monitor-exit v0

    return-void

    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;F)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V

    return-void
.end method

.method private final zzp(F)F
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v0

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzo:F

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_1

    cmpl-float v0, p1, v2

    if-lez v0, :cond_1

    return v2

    :cond_1
    return p1
.end method

.method private final zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzd:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzd:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;->zzf(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;->zzc(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;->zza()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzq:J

    sub-long/2addr v1, v3

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;->zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;

    if-eqz p4, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;-><init>()V

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzc()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;->zzc(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zze()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;->zze(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzb()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;->zzb(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzd()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;->zzd(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;->zza(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsc;->zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsb;->zzh()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-static {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method private final zzr(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbu;->zzs()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;->zza()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzp:J

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzc:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzc:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final zza()J
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;->zza()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzp:J

    sub-long/2addr v2, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method final synthetic zzc(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzs:Lzf/b;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzp(F)F

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->y:I

    const/4 p1, 0x0

    throw p1
.end method

.method public final zzi(ILcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzh()Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzl()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzb()F

    move-result v1

    cmpg-float v1, v1, v3

    if-gtz v1, :cond_10

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr:Z

    const/4 v4, 0x1

    if-nez v1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdH:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    iget v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    invoke-direct {p0, v1, v5, v5, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V

    iput-boolean v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr:Z

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzf:Lcom/google/android/gms/common/internal/j;

    const-string v5, "AutoZoom"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    const-string v7, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d"

    const/4 v8, 0x6

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzc()F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zze()F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    aput-object v9, v8, v4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzb()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v8, v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzd()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v4, 0x3

    aput-object v2, v8, v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v4, 0x4

    aput-object v2, v8, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x5

    aput-object v2, v8, v4

    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v5, v4}, Lcom/google/android/gms/common/internal/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

    invoke-virtual {v1, v2, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbu;->zzt(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzby;->zzw()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzh()I

    move-result v4

    if-le v2, v4, :cond_5

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, p1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v2, v4, :cond_3

    move v2, v4

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzf:Lcom/google/android/gms/common/internal/j;

    const-string v4, "AutoZoom"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Removing recent frameIndex = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/common/internal/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbh;->zzf(Ljava/lang/Object;)Ljava/util/List;

    :cond_5
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzby;->zzu()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v5, p1, :cond_6

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzh()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzh()Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzc()F

    move-result v6

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzc()F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zze()F

    move-result v7

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zze()F

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzb()F

    move-result v8

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzb()F

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v8

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzd()F

    move-result v9

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzd()F

    move-result v11

    invoke-static {v9, v11}, Ljava/lang/Math;->min(FF)F

    move-result v9

    invoke-static {v6, v7, v8, v9, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzg(FFFFF)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzf()F

    move-result v7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzf()F

    move-result v5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzf()F

    move-result v8

    add-float/2addr v5, v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzf()F

    move-result v6

    sub-float/2addr v5, v6

    div-float/2addr v7, v5

    goto :goto_3

    :cond_8
    :goto_2
    move v7, v3

    :goto_3
    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzd()F

    move-result v5

    cmpl-float v5, v7, v5

    if-ltz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_9
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzg()I

    move-result v1

    if-ge p1, v1, :cond_a

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzl()Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zza()F

    move-result p1

    cmpl-float p1, p1, v3

    if-gtz p1, :cond_f

    :cond_a
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzj()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_b

    :goto_4
    monitor-exit p1

    goto/16 :goto_6

    :cond_b
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzc()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zze()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzb()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzd()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzi(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object v1

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdy;

    move-result-object v1

    const v2, 0x4e6e6b28    # 1.0E9f

    :cond_c
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzc()F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, -0x41000000    # -0.5f

    add-float/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const v5, 0x3a83126f    # 0.001f

    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v3

    div-float v3, v4, v3

    cmpl-float v4, v2, v3

    if-lez v4, :cond_c

    move v2, v3

    goto :goto_5

    :cond_d
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    mul-float/2addr v1, v2

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzp(F)F

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzk()Z

    move-result v2

    if-eqz v2, :cond_e

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    sub-float v3, v1, v2

    div-float/2addr v3, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zze()F

    move-result v2

    cmpg-float v2, v3, v2

    if-gtz v2, :cond_e

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuu;->zzf()F

    move-result v2

    neg-float v2, v2

    cmpl-float v2, v3, v2

    if-ltz v2, :cond_e

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzf:Lcom/google/android/gms/common/internal/j;

    const-string v2, "AutoZoom"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Auto zoom to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " is filtered by threshold"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v2, v1}, Lcom/google/android/gms/common/internal/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;->zza()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzp:J

    goto/16 :goto_4

    :cond_e
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzf:Lcom/google/android/gms/common/internal/j;

    const-string v3, "AutoZoom"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Going to set zoom = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/common/internal/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdI:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    invoke-virtual {p0, v1, v2, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_4

    :cond_f
    :goto_6
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception p2

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p2

    :cond_10
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final zzj()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzk(F)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbc;->zzc(Z)V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzo:F

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method final zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzm:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzs:Lzf/b;

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-nez v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    iget v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;F)V

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzm:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzem;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzur;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p2

    move-object v5, p3

    move v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzur;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;F)V

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;->zza()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzem;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzek;Ljava/util/concurrent/Executor;)V

    monitor-exit v0

    return-void

    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzm()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr(Z)V

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuq;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuq;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;)V

    const-wide/16 v7, 0x1f4

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v5, v7

    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzc:Ljava/util/concurrent/ScheduledFuture;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/4 v4, 0x0

    if-ne v3, v1, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzd:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbf;->zza()J

    move-result-wide v5

    iput-wide v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzq:J

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr:Z

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdC:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    :goto_0
    invoke-direct {p0, v1, v3, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdE:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    goto :goto_0

    :goto_1
    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    monitor-exit v0

    return-void

    :cond_2
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzn(Z)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr(Z)V

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr:Z

    if-nez p1, :cond_1

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdH:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdF:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    :goto_0
    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzdG:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn:F

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzr:Z

    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zze:I

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzd:Ljava/lang/String;

    monitor-exit v0

    return-void

    :cond_3
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzo(Lzf/b;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzs:Lzf/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzm:Ljava/util/concurrent/Executor;

    return-void
.end method
