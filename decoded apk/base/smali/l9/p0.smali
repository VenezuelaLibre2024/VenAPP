.class final Ll9/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgej;


# instance fields
.field final synthetic a:Lcom/google/common/util/concurrent/f;

.field final synthetic b:Lcom/google/android/gms/internal/ads/zzccx;

.field final synthetic c:Lcom/google/android/gms/internal/ads/zzccq;

.field final synthetic d:Lcom/google/android/gms/internal/ads/zzfmo;

.field final synthetic e:J

.field final synthetic f:Ll9/c;


# direct methods
.method constructor <init>(Ll9/c;Lcom/google/common/util/concurrent/f;Lcom/google/android/gms/internal/ads/zzccx;Lcom/google/android/gms/internal/ads/zzccq;Lcom/google/android/gms/internal/ads/zzfmo;J)V
    .locals 0

    iput-object p2, p0, Ll9/p0;->a:Lcom/google/common/util/concurrent/f;

    iput-object p3, p0, Ll9/p0;->b:Lcom/google/android/gms/internal/ads/zzccx;

    iput-object p4, p0, Ll9/p0;->c:Lcom/google/android/gms/internal/ads/zzccq;

    iput-object p5, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    iput-wide p6, p0, Ll9/p0;->e:J

    iput-object p1, p0, Ll9/p0;->f:Ll9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 9

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->b()Lla/f;

    move-result-object v0

    invoke-interface {v0}, Lla/f;->a()J

    move-result-wide v0

    iget-wide v2, p0, Ll9/p0;->e:J

    sub-long/2addr v0, v2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->q()Lcom/google/android/gms/internal/ads/zzcdl;

    move-result-object v3

    const-string v4, "SignalGeneratorImpl.generateSignals"

    invoke-virtual {v3, p1, v4}, Lcom/google/android/gms/internal/ads/zzcdl;->zzw(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v3, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v3}, Ll9/c;->N2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwk;

    move-result-object v4

    invoke-static {v3}, Ll9/c;->M2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwa;

    move-result-object v3

    const/4 v5, 0x2

    new-array v5, v5, [Landroid/util/Pair;

    new-instance v6, Landroid/util/Pair;

    const-string v7, "sgf_reason"

    invoke-direct {v6, v7, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v7, 0x0

    aput-object v6, v5, v7

    new-instance v6, Landroid/util/Pair;

    const-string v8, "tqgt"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v8, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    aput-object v6, v5, v0

    const-string v0, "sgf"

    invoke-static {v4, v3, v0, v5}, Ll9/y;->c(Lcom/google/android/gms/internal/ads/zzdwk;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object v0, p0, Ll9/p0;->a:Lcom/google/common/util/concurrent/f;

    iget-object v1, p0, Ll9/p0;->b:Lcom/google/android/gms/internal/ads/zzccx;

    invoke-static {v0, v1}, Ll9/c;->P2(Lcom/google/common/util/concurrent/f;Lcom/google/android/gms/internal/ads/zzccx;)Lcom/google/android/gms/internal/ads/zzfmz;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzfmo;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {v1, v7}, Lcom/google/android/gms/internal/ads/zzfmo;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfmz;->zza(Lcom/google/android/gms/internal/ads/zzfmo;)Lcom/google/android/gms/internal/ads/zzfmz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfmz;->zzg()V

    :cond_0
    :try_start_0
    const-string p1, "Unknown format is no longer supported."

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Internal error. "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-object p1, p0, Ll9/p0;->c:Lcom/google/android/gms/internal/ads/zzccq;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/zzccq;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 14

    const-string v0, "sgf_reason"

    const-string v1, "sgf"

    const-string v2, "QueryInfo generation has been disabled."

    iget-object v3, p0, Ll9/p0;->a:Lcom/google/common/util/concurrent/f;

    check-cast p1, Ll9/o;

    iget-object v4, p0, Ll9/p0;->b:Lcom/google/android/gms/internal/ads/zzccx;

    invoke-static {v3, v4}, Ll9/c;->P2(Lcom/google/common/util/concurrent/f;Lcom/google/android/gms/internal/ads/zzccx;)Lcom/google/android/gms/internal/ads/zzfmz;

    move-result-object v3

    iget-object v4, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v4}, Ll9/c;->j2(Ll9/c;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v4, Lcom/google/android/gms/internal/ads/zzbgc;->zzhD:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_0

    :try_start_0
    iget-object p1, p0, Ll9/p0;->c:Lcom/google/android/gms/internal/ads/zzccq;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/zzccq;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzg(Ljava/lang/String;)V

    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    iget-object p1, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/zzfmo;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {p1, v6}, Lcom/google/android/gms/internal/ads/zzfmo;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfmo;

    :goto_1
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzfmz;->zza(Lcom/google/android/gms/internal/ads/zzfmo;)Lcom/google/android/gms/internal/ads/zzfmz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfmz;->zzg()V

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->b()Lla/f;

    move-result-object v2

    invoke-interface {v2}, Lla/f;->a()J

    move-result-wide v7

    iget-wide v9, p0, Ll9/p0;->e:J

    sub-long/2addr v7, v9

    const-string v2, "SignalGeneratorImpl.generateSignals.onSuccess"

    const-string v4, "sgs"

    const-string v9, ""

    if-nez p1, :cond_1

    :try_start_1
    iget-object p1, p0, Ll9/p0;->c:Lcom/google/android/gms/internal/ads/zzccq;

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0, v0}, Lcom/google/android/gms/internal/ads/zzccq;->zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {p1}, Ll9/c;->N2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwk;

    move-result-object v0

    invoke-static {p1}, Ll9/c;->M2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwa;

    move-result-object p1

    new-array v1, v5, [Landroid/util/Pair;

    new-instance v7, Landroid/util/Pair;

    const-string v8, "rid"

    const-string v10, "-1"

    invoke-direct {v7, v8, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v7, v1, v6

    invoke-static {v0, p1, v4, v1}, Ll9/y;->c(Lcom/google/android/gms/internal/ads/zzdwk;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object p1, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {p1, v5}, Lcom/google/android/gms/internal/ads/zzfmo;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfmo;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    :goto_2
    iget-object p1, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    goto :goto_1

    :cond_1
    :try_start_2
    new-instance v10, Lorg/json/JSONObject;

    iget-object v11, p1, Ll9/o;->b:Ljava/lang/String;

    invoke-direct {v10, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v11, "request_id"

    invoke-virtual {v10, v11, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_2

    const-string p1, "The request ID is empty in request JSON."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Ll9/p0;->c:Lcom/google/android/gms/internal/ads/zzccq;

    const-string v4, "Internal error: request ID is empty in request JSON."

    invoke-interface {p1, v4}, Lcom/google/android/gms/internal/ads/zzccq;->zzb(Ljava/lang/String;)V

    iget-object p1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {p1}, Ll9/c;->N2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwk;

    move-result-object v4

    invoke-static {p1}, Ll9/c;->M2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwa;

    move-result-object p1

    new-array v5, v5, [Landroid/util/Pair;

    new-instance v7, Landroid/util/Pair;

    const-string v8, "rid_missing"

    invoke-direct {v7, v0, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v7, v5, v6

    invoke-static {v4, p1, v1, v5}, Ll9/y;->c(Lcom/google/android/gms/internal/ads/zzdwk;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object p1, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    const-string v0, "Request ID empty"

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzfmo;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {p1, v6}, Lcom/google/android/gms/internal/ads/zzfmo;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfmo;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_2
    :try_start_4
    iget-object v0, p0, Ll9/p0;->f:Ll9/c;

    iget-object v1, p1, Ll9/o;->b:Ljava/lang/String;

    invoke-static {v0}, Ll9/c;->M2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwa;

    move-result-object v12

    invoke-static {v0, v11, v1, v12}, Ll9/c;->p2(Ll9/c;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdwa;)V

    iget-object v0, p1, Ll9/o;->c:Landroid/os/Bundle;

    iget-object v1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v1}, Ll9/c;->s2(Ll9/c;)Z

    move-result v11

    if-eqz v11, :cond_3

    if-eqz v0, :cond_3

    invoke-static {v1}, Ll9/c;->W2(Ll9/c;)Ljava/lang/String;

    move-result-object v1

    const/4 v11, -0x1

    invoke-virtual {v0, v1, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v11, :cond_3

    iget-object v1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v1}, Ll9/c;->W2(Ll9/c;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Ll9/c;->l2(Ll9/c;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-virtual {v0, v11, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    iget-object v1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v1}, Ll9/c;->t2(Ll9/c;)Z

    move-result v11

    if-eqz v11, :cond_5

    if-eqz v0, :cond_5

    invoke-static {v1}, Ll9/c;->g2(Ll9/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v1}, Ll9/c;->f2(Ll9/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->r()Lcom/google/android/gms/ads/internal/util/j2;

    move-result-object v11

    iget-object v12, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v12}, Ll9/c;->I2(Ll9/c;)Landroid/content/Context;

    move-result-object v13

    invoke-static {v12}, Ll9/c;->L2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzcei;

    move-result-object v12

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzcei;->zza:Ljava/lang/String;

    invoke-virtual {v11, v13, v12}, Lcom/google/android/gms/ads/internal/util/j2;->E(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Ll9/c;->m2(Ll9/c;Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v1}, Ll9/c;->g2(Ll9/c;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Ll9/c;->f2(Ll9/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v1, p0, Ll9/p0;->c:Lcom/google/android/gms/internal/ads/zzccq;

    iget-object v11, p1, Ll9/o;->a:Ljava/lang/String;

    iget-object p1, p1, Ll9/o;->b:Ljava/lang/String;

    invoke-interface {v1, v11, p1, v0}, Lcom/google/android/gms/internal/ads/zzccq;->zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {p1}, Ll9/c;->N2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwk;

    move-result-object v0

    invoke-static {p1}, Ll9/c;->M2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwa;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/util/Pair;

    new-instance v11, Landroid/util/Pair;

    const-string v12, "tqgt"

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v11, v12, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v11, v1, v6

    new-instance v7, Landroid/util/Pair;

    const-string v8, "tpc"

    const-string v11, "na"

    sget-object v12, Lcom/google/android/gms/internal/ads/zzbgc;->zzju:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v13

    invoke-virtual {v13, v12}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v12, :cond_6

    goto :goto_3

    :cond_6
    :try_start_5
    const-string v12, "extras"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    const-string v12, "accept_3p_cookie"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    const-string v11, "1"

    goto :goto_3

    :cond_7
    const-string v11, "0"
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v10

    :try_start_6
    const-string v12, "Error retrieving JSONObject from the requestJson, "

    invoke-static {v12, v10}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    invoke-direct {v7, v8, v11}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v7, v1, v5

    invoke-static {v0, p1, v4, v1}, Ll9/y;->c(Lcom/google/android/gms/internal/ads/zzdwk;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object p1, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {p1, v5}, Lcom/google/android/gms/internal/ads/zzfmo;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfmo;
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_2
    move-exception p1

    goto :goto_4

    :catch_3
    move-exception p1

    :try_start_7
    const-string v4, "Failed to create JSON object from the request string."

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    iget-object v4, p0, Ll9/p0;->c:Lcom/google/android/gms/internal/ads/zzccq;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Internal error for request JSON: "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Lcom/google/android/gms/internal/ads/zzccq;->zzb(Ljava/lang/String;)V

    iget-object v4, p0, Ll9/p0;->f:Ll9/c;

    invoke-static {v4}, Ll9/c;->N2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwk;

    move-result-object v7

    invoke-static {v4}, Ll9/c;->M2(Ll9/c;)Lcom/google/android/gms/internal/ads/zzdwa;

    move-result-object v4

    new-array v5, v5, [Landroid/util/Pair;

    new-instance v8, Landroid/util/Pair;

    const-string v10, "request_invalid"

    invoke-direct {v8, v0, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v8, v5, v6

    invoke-static {v7, v4, v1, v5}, Ll9/y;->c(Lcom/google/android/gms/internal/ads/zzdwk;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object v0, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfmo;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/zzfmo;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->q()Lcom/google/android/gms/internal/ads/zzcdl;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzcdl;->zzw(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :goto_4
    :try_start_8
    iget-object v0, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfmo;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/zzfmo;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-static {v9, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->q()Lcom/google/android/gms/internal/ads/zzcdl;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzcdl;->zzw(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :cond_8
    return-void

    :goto_5
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbht;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v3, :cond_9

    iget-object v0, p0, Ll9/p0;->d:Lcom/google/android/gms/internal/ads/zzfmo;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzfmz;->zza(Lcom/google/android/gms/internal/ads/zzfmo;)Lcom/google/android/gms/internal/ads/zzfmz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfmz;->zzg()V

    :cond_9
    throw p1
.end method
