.class public final Lcom/google/android/gms/internal/ads/zzdzx;
.super Lcom/google/android/gms/ads/internal/client/k2;
.source "SourceFile"


# instance fields
.field final zza:Ljava/util/Map;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/lang/ref/WeakReference;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzdzl;

.field private final zze:Lcom/google/android/gms/internal/ads/zzgey;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzdzy;

.field private zzg:Lcom/google/android/gms/internal/ads/zzdzd;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lcom/google/android/gms/internal/ads/zzdzl;Lcom/google/android/gms/internal/ads/zzdzy;Lcom/google/android/gms/internal/ads/zzgey;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/k2;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zza:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzb:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzc:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzd:Lcom/google/android/gms/internal/ads/zzdzl;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zze:Lcom/google/android/gms/internal/ads/zzgey;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzf:Lcom/google/android/gms/internal/ads/zzdzy;

    return-void
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzdzx;)Lcom/google/android/gms/internal/ads/zzdzl;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzd:Lcom/google/android/gms/internal/ads/zzdzl;

    return-object p0
.end method

.method static bridge synthetic zzc(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzl(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdzx;->zzm(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final zzj()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzc:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzb:Landroid/content/Context;

    :cond_0
    return-object v0
.end method

.method private static zzk()Lx8/h;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "request_origin"

    const-string v2, "inspector_ooct"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lx8/h$a;

    invoke-direct {v1}, Lx8/h$a;-><init>()V

    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v1, v2, v0}, Lx8/a;->b(Ljava/lang/Class;Landroid/os/Bundle;)Lx8/a;

    move-result-object v0

    check-cast v0, Lx8/h$a;

    invoke-virtual {v0}, Lx8/h$a;->k()Lx8/h;

    move-result-object v0

    return-object v0
.end method

.method private static zzl(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Lx8/o;

    if-eqz v0, :cond_0

    check-cast p0, Lx8/o;

    invoke-virtual {p0}, Lx8/o;->f()Lx8/z;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lz8/a;

    if-eqz v0, :cond_1

    check-cast p0, Lz8/a;

    invoke-virtual {p0}, Lz8/a;->getResponseInfo()Lx8/z;

    move-result-object p0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lh9/a;

    if-eqz v0, :cond_2

    check-cast p0, Lh9/a;

    invoke-virtual {p0}, Lh9/a;->getResponseInfo()Lx8/z;

    move-result-object p0

    goto :goto_0

    :cond_2
    instance-of v0, p0, Ln9/c;

    if-eqz v0, :cond_3

    check-cast p0, Ln9/c;

    invoke-virtual {p0}, Ln9/c;->getResponseInfo()Lx8/z;

    move-result-object p0

    goto :goto_0

    :cond_3
    instance-of v0, p0, Lo9/a;

    if-eqz v0, :cond_4

    check-cast p0, Lo9/a;

    invoke-virtual {p0}, Lo9/a;->getResponseInfo()Lx8/z;

    move-result-object p0

    goto :goto_0

    :cond_4
    instance-of v0, p0, Lx8/k;

    if-eqz v0, :cond_5

    check-cast p0, Lx8/k;

    invoke-virtual {p0}, Lx8/m;->getResponseInfo()Lx8/z;

    move-result-object p0

    goto :goto_0

    :cond_5
    instance-of v0, p0, Lcom/google/android/gms/ads/nativead/b;

    if-eqz v0, :cond_7

    check-cast p0, Lcom/google/android/gms/ads/nativead/b;

    invoke-virtual {p0}, Lcom/google/android/gms/ads/nativead/b;->getResponseInfo()Lx8/z;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lx8/z;->h()Lcom/google/android/gms/ads/internal/client/p2;

    move-result-object p0

    if-eqz p0, :cond_7

    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/p2;->zzh()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_7
    :goto_1
    const-string p0, ""

    return-object p0
.end method

.method private final declared-synchronized zzm(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzg:Lcom/google/android/gms/internal/ads/zzdzd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdzd;->zzb(Ljava/lang/String;)Lcom/google/common/util/concurrent/f;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdzv;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zzdzv;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zze:Lcom/google/android/gms/internal/ads/zzgey;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzgen;->zzr(Lcom/google/common/util/concurrent/f;Lcom/google/android/gms/internal/ads/zzgej;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v0, "OutOfContextTester.setAdAsOutOfContext"

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->q()Lcom/google/android/gms/internal/ads/zzcdl;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzcdl;->zzw(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzd:Lcom/google/android/gms/internal/ads/zzdzl;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdzl;->zzk(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized zzn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzg:Lcom/google/android/gms/internal/ads/zzdzd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdzd;->zzb(Ljava/lang/String;)Lcom/google/common/util/concurrent/f;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdzw;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zzdzw;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zze:Lcom/google/android/gms/internal/ads/zzgey;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzgen;->zzr(Lcom/google/common/util/concurrent/f;Lcom/google/android/gms/internal/ads/zzgej;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v0, "OutOfContextTester.setAdAsShown"

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->q()Lcom/google/android/gms/internal/ads/zzcdl;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzcdl;->zzw(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzd:Lcom/google/android/gms/internal/ads/zzdzl;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdzl;->zzk(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final zze(Ljava/lang/String;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/dynamic/b;)V
    .locals 2

    invoke-static {p2}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-static {p3}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup;

    if-eqz p2, :cond_3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zza:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zza:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    instance-of p1, v0, Lx8/k;

    if-eqz p1, :cond_2

    check-cast v0, Lx8/k;

    invoke-static {p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzdzy;->zza(Landroid/content/Context;Landroid/view/ViewGroup;Lx8/k;)V

    return-void

    :cond_2
    instance-of p1, v0, Lcom/google/android/gms/ads/nativead/b;

    if-eqz p1, :cond_3

    check-cast v0, Lcom/google/android/gms/ads/nativead/b;

    invoke-static {p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzdzy;->zzb(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/gms/ads/nativead/b;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzdzd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzg:Lcom/google/android/gms/internal/ads/zzdzd;

    return-void
.end method

.method protected final declared-synchronized zzg(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zza:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzdzx;->zzl(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzdzx;->zzm(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzh(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "BANNER"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v5

    goto :goto_1

    :sswitch_1
    const-string v0, "REWARDED_INTERSTITIAL"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v1

    goto :goto_1

    :sswitch_2
    const-string v0, "REWARDED"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v2

    goto :goto_1

    :sswitch_3
    const-string v0, "APP_OPEN_AD"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :sswitch_4
    const-string v0, "INTERSTITIAL"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v4

    goto :goto_1

    :sswitch_5
    const-string v0, "NATIVE"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    move p2, v3

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p2, -0x1

    :goto_1
    if-eqz p2, :cond_6

    if-eq p2, v5, :cond_5

    if-eq p2, v4, :cond_4

    if-eq p2, v3, :cond_3

    if-eq p2, v2, :cond_2

    if-eq p2, v1, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzj()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdzx;->zzk()Lx8/h;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdzt;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzdzt;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v1}, Lo9/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lo9/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzj()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdzx;->zzk()Lx8/h;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdzs;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzdzs;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v1}, Ln9/c;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Ln9/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :try_start_3
    new-instance p2, Lx8/g$a;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzj()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lx8/g$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdzm;

    invoke-direct {v0, p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzdzm;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lx8/g$a;->b(Lcom/google/android/gms/ads/nativead/b$c;)Lx8/g$a;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzdzu;

    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/internal/ads/zzdzu;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lx8/g$a;->c(Lx8/e;)Lx8/g$a;

    invoke-virtual {p2}, Lx8/g$a;->a()Lx8/g;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdzx;->zzk()Lx8/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Lx8/g;->a(Lx8/h;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzj()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdzx;->zzk()Lx8/h;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdzr;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzdzr;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v1}, Lh9/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lh9/b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_5
    new-instance p2, Lx8/k;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzj()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lx8/k;-><init>(Landroid/content/Context;)V

    sget-object v0, Lx8/i;->i:Lx8/i;

    invoke-virtual {p2, v0}, Lx8/m;->setAdSize(Lx8/i;)V

    invoke-virtual {p2, p1}, Lx8/m;->setAdUnitId(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdzq;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdzq;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Lx8/k;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lx8/m;->setAdListener(Lx8/e;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdzx;->zzk()Lx8/h;

    move-result-object p1

    invoke-virtual {p2, p1}, Lx8/m;->b(Lx8/h;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzj()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdzx;->zzk()Lx8/h;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdzp;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzdzp;-><init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v5, v1}, Lz8/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;ILz8/a$a;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x772abbe9 -> :sswitch_5
        -0x51d5b0d4 -> :sswitch_4
        -0x1987ba06 -> :sswitch_3
        0x205e3c0e -> :sswitch_2
        0x6e8e03bd -> :sswitch_1
        0x7458732c -> :sswitch_0
    .end sparse-switch
.end method

.method public final declared-synchronized zzi(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zzd:Lcom/google/android/gms/internal/ads/zzdzl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdzl;->zzg()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zza:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_8

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbgc;->zzjm:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    instance-of v3, v1, Lz8/a;

    if-nez v3, :cond_1

    instance-of v3, v1, Lh9/a;

    if-nez v3, :cond_1

    instance-of v3, v1, Ln9/c;

    if-nez v3, :cond_1

    instance-of v3, v1, Lo9/a;

    if-eqz v3, :cond_2

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdzx;->zza:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdzx;->zzl(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, p2}, Lcom/google/android/gms/internal/ads/zzdzx;->zzn(Ljava/lang/String;Ljava/lang/String;)V

    instance-of p2, v1, Lz8/a;

    if-eqz p2, :cond_3

    check-cast v1, Lz8/a;

    invoke-virtual {v1, v0}, Lz8/a;->show(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :try_start_1
    instance-of p2, v1, Lh9/a;

    if-eqz p2, :cond_4

    check-cast v1, Lh9/a;

    invoke-virtual {v1, v0}, Lh9/a;->show(Landroid/app/Activity;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_2
    instance-of p2, v1, Ln9/c;

    if-eqz p2, :cond_5

    check-cast v1, Ln9/c;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzdzn;->zza:Lcom/google/android/gms/internal/ads/zzdzn;

    invoke-virtual {v1, v0, p1}, Ln9/c;->show(Landroid/app/Activity;Lx8/u;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_3
    instance-of p2, v1, Lo9/a;

    if-eqz p2, :cond_6

    check-cast v1, Lo9/a;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzdzo;->zza:Lcom/google/android/gms/internal/ads/zzdzo;

    invoke-virtual {v1, v0, p1}, Lo9/a;->show(Landroid/app/Activity;Lx8/u;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    instance-of p2, v1, Lx8/k;

    if-nez p2, :cond_7

    instance-of p2, v1, Lcom/google/android/gms/ads/nativead/b;

    if-eqz p2, :cond_8

    :cond_7
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzj()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.ads.OutOfContextTestingActivity"

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "adUnit"

    invoke-virtual {p2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->r()Lcom/google/android/gms/ads/internal/util/j2;

    invoke-static {v0, p2}, Lcom/google/android/gms/ads/internal/util/j2;->s(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_8
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
