.class public final Lcom/google/android/gms/internal/ads/zzbve;
.super Lcom/google/android/gms/internal/ads/zzbur;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

.field private zzb:Li9/p;

.field private zzc:Li9/w;

.field private zzd:Li9/h;

.field private zze:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbur;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzbve;Li9/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbve;->zzd:Li9/h;

    return-void
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzbve;Li9/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbve;->zzb:Li9/p;

    return-void
.end method

.method static bridge synthetic zzu(Lcom/google/android/gms/internal/ads/zzbve;Li9/w;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbve;->zzc:Li9/w;

    return-void
.end method

.method private final zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/u4;->x:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    return-object p1
.end method

.method private static final zzw(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Server parameters: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p0, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :cond_1
    return-object v0

    :catch_0
    move-exception p0

    const-string v0, ""

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p0, Landroid/os/RemoteException;

    invoke-direct {p0}, Landroid/os/RemoteException;-><init>()V

    throw p0
.end method

.method private static final zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/internal/client/u4;->f:Z

    if-nez p0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->b()Lcom/google/android/gms/internal/ads/zzcdv;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcdv;->zzr()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/u4;->F:Ljava/lang/String;

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "max_ad_content_rating"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method


# virtual methods
.method public final zze()Lcom/google/android/gms/ads/internal/client/s2;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    instance-of v1, v0, Li9/d0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    :try_start_0
    check-cast v0, Li9/d0;

    invoke-interface {v0}, Li9/d0;->getVideoController()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v2
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzbvg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    invoke-virtual {v0}, Li9/a;->getVersionInfo()Lx8/a0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbvg;->zza(Lx8/a0;)Lcom/google/android/gms/internal/ads/zzbvg;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzbvg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    invoke-virtual {v0}, Li9/a;->getSDKVersionInfo()Lx8/a0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbvg;->zza(Lx8/a0;)Lcom/google/android/gms/internal/ads/zzbvg;

    move-result-object v0

    return-object v0
.end method

.method public final zzh(Lcom/google/android/gms/dynamic/b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lcom/google/android/gms/ads/internal/client/z4;Lcom/google/android/gms/internal/ads/zzbuv;)V
    .locals 4

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbvc;

    invoke-direct {v0, p0, p6}, Lcom/google/android/gms/internal/ads/zzbvc;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbuv;)V

    iget-object p6, p0, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v1, Li9/n;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "rewarded_interstitial"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    goto :goto_1

    :sswitch_1
    const-string v2, "app_open_ad"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x6

    goto :goto_1

    :sswitch_2
    const-string v2, "app_open"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x5

    goto :goto_1

    :sswitch_3
    const-string v2, "interstitial"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_1

    :sswitch_4
    const-string v2, "rewarded"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    goto :goto_1

    :sswitch_5
    const-string v2, "native"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    :sswitch_6
    const-string v2, "banner"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p2, -0x1

    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    :try_start_1
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbgc;->zzli:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    :pswitch_1
    sget-object p2, Lx8/c;->APP_OPEN_AD:Lx8/c;

    goto :goto_2

    :pswitch_2
    sget-object p2, Lx8/c;->NATIVE:Lx8/c;

    goto :goto_2

    :pswitch_3
    sget-object p2, Lx8/c;->REWARDED_INTERSTITIAL:Lx8/c;

    goto :goto_2

    :pswitch_4
    sget-object p2, Lx8/c;->REWARDED:Lx8/c;

    goto :goto_2

    :pswitch_5
    sget-object p2, Lx8/c;->INTERSTITIAL:Lx8/c;

    goto :goto_2

    :pswitch_6
    sget-object p2, Lx8/c;->BANNER:Lx8/c;

    :goto_2
    invoke-direct {v1, p2, p4}, Li9/n;-><init>(Lx8/c;Landroid/os/Bundle;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p4, Lk9/a;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget v2, p5, Lcom/google/android/gms/ads/internal/client/z4;->e:I

    iget v3, p5, Lcom/google/android/gms/ads/internal/client/z4;->b:I

    iget-object p5, p5, Lcom/google/android/gms/ads/internal/client/z4;->a:Ljava/lang/String;

    invoke-static {v2, v3, p5}, Lx8/e0;->c(IILjava/lang/String;)Lx8/i;

    move-result-object p5

    invoke-direct {p4, v1, p2, p3, p5}, Lk9/a;-><init>(Landroid/content/Context;Ljava/util/List;Landroid/os/Bundle;Lx8/i;)V

    invoke-virtual {p6, p4, v0}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->collectSignals(Lk9/a;Lk9/b;)V

    return-void

    :cond_1
    :goto_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Internal Error"

    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    const-string p3, "Error generating signals for RTB"

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p3, "adapter.collectSignals"

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x533a80d4 -> :sswitch_6
        -0x3ebdafe9 -> :sswitch_5
        -0xe47b3f2 -> :sswitch_4
        0x240b672c -> :sswitch_3
        0x459991a8 -> :sswitch_2
        0x69fe9e1a -> :sswitch_1
        0x71ef0bbd -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzi(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbud;Lcom/google/android/gms/internal/ads/zzbtb;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbvb;

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    invoke-direct {v2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzbvb;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbud;Lcom/google/android/gms/internal/ads/zzbtb;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v15, Li9/i;

    invoke-static/range {p4 .. p4}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/content/Context;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzbve;->zzw(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzbve;->zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;

    move-result-object v8

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result v9

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/client/u4;->v:Landroid/location/Location;

    iget v11, v0, Lcom/google/android/gms/ads/internal/client/u4;->r:I

    iget v12, v0, Lcom/google/android/gms/ads/internal/client/u4;->E:I

    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    move-object v4, v15

    move-object/from16 v6, p1

    invoke-direct/range {v4 .. v14}, Li9/i;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v15, v2}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbAppOpenAd(Li9/i;Li9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, "Adapter failed to render app open ad."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v2, "adapter.loadRtbAppOpenAd"

    move-object/from16 v3, p4

    invoke-static {v3, v0, v2}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final zzj(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzbtb;Lcom/google/android/gms/ads/internal/client/z4;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    move-object/from16 v2, p7

    :try_start_0
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbux;

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    invoke-direct {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzbux;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzbtb;)V

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v15, Li9/l;

    invoke-static/range {p4 .. p4}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/content/Context;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzbve;->zzw(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzbve;->zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;

    move-result-object v9

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result v10

    iget-object v11, v0, Lcom/google/android/gms/ads/internal/client/u4;->v:Landroid/location/Location;

    iget v12, v0, Lcom/google/android/gms/ads/internal/client/u4;->r:I

    iget v13, v0, Lcom/google/android/gms/ads/internal/client/u4;->E:I

    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;

    move-result-object v14

    iget v0, v2, Lcom/google/android/gms/ads/internal/client/z4;->e:I

    iget v5, v2, Lcom/google/android/gms/ads/internal/client/z4;->b:I

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/z4;->a:Ljava/lang/String;

    invoke-static {v0, v5, v2}, Lx8/e0;->c(IILjava/lang/String;)Lx8/i;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    move-object v5, v15

    move-object/from16 v7, p1

    move-object v1, v15

    move-object v15, v0

    move-object/from16 v16, v2

    invoke-direct/range {v5 .. v16}, Li9/l;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Lx8/i;Ljava/lang/String;)V

    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbBannerAd(Li9/l;Li9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, "Adapter failed to render banner ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "adapter.loadRtbBannerAd"

    move-object/from16 v2, p4

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final zzk(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzbtb;Lcom/google/android/gms/ads/internal/client/z4;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    move-object/from16 v2, p7

    :try_start_0
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbuy;

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    invoke-direct {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzbuy;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzbtb;)V

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v15, Li9/l;

    invoke-static/range {p4 .. p4}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/content/Context;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzbve;->zzw(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzbve;->zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;

    move-result-object v9

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result v10

    iget-object v11, v0, Lcom/google/android/gms/ads/internal/client/u4;->v:Landroid/location/Location;

    iget v12, v0, Lcom/google/android/gms/ads/internal/client/u4;->r:I

    iget v13, v0, Lcom/google/android/gms/ads/internal/client/u4;->E:I

    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;

    move-result-object v14

    iget v0, v2, Lcom/google/android/gms/ads/internal/client/z4;->e:I

    iget v5, v2, Lcom/google/android/gms/ads/internal/client/z4;->b:I

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/z4;->a:Ljava/lang/String;

    invoke-static {v0, v5, v2}, Lx8/e0;->c(IILjava/lang/String;)Lx8/i;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    move-object v5, v15

    move-object/from16 v7, p1

    move-object v1, v15

    move-object v15, v0

    move-object/from16 v16, v2

    invoke-direct/range {v5 .. v16}, Li9/l;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Lx8/i;Ljava/lang/String;)V

    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbInterscrollerAd(Li9/l;Li9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, "Adapter failed to render interscroller ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "adapter.loadRtbInterscrollerAd"

    move-object/from16 v2, p4

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final zzl(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbuj;Lcom/google/android/gms/internal/ads/zzbtb;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbuz;

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    invoke-direct {v2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzbuz;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbuj;Lcom/google/android/gms/internal/ads/zzbtb;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v15, Li9/r;

    invoke-static/range {p4 .. p4}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/content/Context;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzbve;->zzw(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzbve;->zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;

    move-result-object v8

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result v9

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/client/u4;->v:Landroid/location/Location;

    iget v11, v0, Lcom/google/android/gms/ads/internal/client/u4;->r:I

    iget v12, v0, Lcom/google/android/gms/ads/internal/client/u4;->E:I

    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    move-object v4, v15

    move-object/from16 v6, p1

    invoke-direct/range {v4 .. v14}, Li9/r;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v15, v2}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbInterstitialAd(Li9/r;Li9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, "Adapter failed to render interstitial ad."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v2, "adapter.loadRtbInterstitialAd"

    move-object/from16 v3, p4

    invoke-static {v3, v0, v2}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final zzm(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbum;Lcom/google/android/gms/internal/ads/zzbtb;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzbve;->zzn(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbum;Lcom/google/android/gms/internal/ads/zzbtb;Lcom/google/android/gms/internal/ads/zzbjb;)V

    return-void
.end method

.method public final zzn(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbum;Lcom/google/android/gms/internal/ads/zzbtb;Lcom/google/android/gms/internal/ads/zzbjb;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbva;

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    invoke-direct {v2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzbva;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbum;Lcom/google/android/gms/internal/ads/zzbtb;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v15, Li9/u;

    invoke-static/range {p4 .. p4}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/content/Context;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzbve;->zzw(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzbve;->zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;

    move-result-object v8

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result v9

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/client/u4;->v:Landroid/location/Location;

    iget v11, v0, Lcom/google/android/gms/ads/internal/client/u4;->r:I

    iget v12, v0, Lcom/google/android/gms/ads/internal/client/u4;->E:I

    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    move-object v4, v15

    move-object/from16 v6, p1

    move-object v0, v15

    move-object/from16 v15, p7

    invoke-direct/range {v4 .. v15}, Li9/u;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbjb;)V

    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbNativeAd(Li9/u;Li9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, "Adapter failed to render native ad."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v2, "adapter.loadRtbNativeAd"

    move-object/from16 v3, p4

    invoke-static {v3, v0, v2}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final zzo(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbup;Lcom/google/android/gms/internal/ads/zzbtb;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbvd;

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    invoke-direct {v2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzbvd;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbup;Lcom/google/android/gms/internal/ads/zzbtb;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v15, Li9/y;

    invoke-static/range {p4 .. p4}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/content/Context;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzbve;->zzw(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzbve;->zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;

    move-result-object v8

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result v9

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/client/u4;->v:Landroid/location/Location;

    iget v11, v0, Lcom/google/android/gms/ads/internal/client/u4;->r:I

    iget v12, v0, Lcom/google/android/gms/ads/internal/client/u4;->E:I

    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    move-object v4, v15

    move-object/from16 v6, p1

    invoke-direct/range {v4 .. v14}, Li9/y;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v15, v2}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbRewardedInterstitialAd(Li9/y;Li9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, "Adapter failed to render rewarded interstitial ad."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v2, "adapter.loadRtbRewardedInterstitialAd"

    move-object/from16 v3, p4

    invoke-static {v3, v0, v2}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final zzp(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbup;Lcom/google/android/gms/internal/ads/zzbtb;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbvd;

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    invoke-direct {v2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzbvd;-><init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbup;Lcom/google/android/gms/internal/ads/zzbtb;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbve;->zza:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    new-instance v15, Li9/y;

    invoke-static/range {p4 .. p4}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/content/Context;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzbve;->zzw(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzbve;->zzv(Lcom/google/android/gms/ads/internal/client/u4;)Landroid/os/Bundle;

    move-result-object v8

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzx(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result v9

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/client/u4;->v:Landroid/location/Location;

    iget v11, v0, Lcom/google/android/gms/ads/internal/client/u4;->r:I

    iget v12, v0, Lcom/google/android/gms/ads/internal/client/u4;->E:I

    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzbve;->zzy(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/u4;)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    move-object v4, v15

    move-object/from16 v6, p1

    invoke-direct/range {v4 .. v14}, Li9/y;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v15, v2}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbRewardedAd(Li9/y;Li9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, "Adapter failed to render rewarded ad."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v2, "adapter.loadRtbRewardedAd"

    move-object/from16 v3, p4

    invoke-static {v3, v0, v2}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final zzq(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbve;->zze:Ljava/lang/String;

    return-void
.end method

.method public final zzr(Lcom/google/android/gms/dynamic/b;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zzd:Li9/h;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Li9/h;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "adapter.showRtbAppOpenAd"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final zzs(Lcom/google/android/gms/dynamic/b;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zzb:Li9/p;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Li9/p;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "adapter.showRtbInterstitialAd"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final zzt(Lcom/google/android/gms/dynamic/b;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbve;->zzc:Li9/w;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Li9/w;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "adapter.showRtbRewardedAd"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzbss;->zza(Lcom/google/android/gms/dynamic/b;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
