.class public final Lcom/google/android/gms/internal/mlkit_common/zzql;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/common/internal/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/internal/j;

    const-string v1, "RemoteModelUtils"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/internal/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzql;->zza:Lcom/google/android/gms/common/internal/j;

    return-void
.end method

.method public static zza(Ltf/b;Lcom/google/mlkit/common/sdkinternal/n;Lcom/google/android/gms/internal/mlkit_common/zzqb;)Lcom/google/android/gms/internal/mlkit_common/zzlu;
    .locals 10

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzb()Lcom/google/mlkit/common/sdkinternal/l;

    move-result-object v0

    invoke-virtual {p0}, Ltf/b;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzma;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_common/zzma;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/mlkit_common/zzlv;

    invoke-direct {v3}, Lcom/google/android/gms/internal/mlkit_common/zzlv;-><init>()V

    invoke-virtual {p0}, Ltf/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/mlkit_common/zzlv;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzlv;

    sget-object v4, Lcom/google/android/gms/internal/mlkit_common/zzlx;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzlx;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/mlkit_common/zzlv;->zzd(Lcom/google/android/gms/internal/mlkit_common/zzlx;)Lcom/google/android/gms/internal/mlkit_common/zzlv;

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_common/zzag;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/mlkit_common/zzlv;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzlv;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzlw;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlw;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzlw;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzlw;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzlw;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzlw;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzlw;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzlw;

    :goto_0
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzlv;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzlw;)Lcom/google/android/gms/internal/mlkit_common/zzlv;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_common/zzlv;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzlz;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mlkit_common/zzma;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzlz;)Lcom/google/android/gms/internal/mlkit_common/zzma;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_common/zzma;->zzc()Lcom/google/android/gms/internal/mlkit_common/zzmd;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzlr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzlr;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzc()Lcom/google/android/gms/internal/mlkit_common/zzlm;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzlr;->zzd(Lcom/google/android/gms/internal/mlkit_common/zzlm;)Lcom/google/android/gms/internal/mlkit_common/zzlr;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzd()Lcom/google/android/gms/internal/mlkit_common/zzls;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzlr;->zzc(Lcom/google/android/gms/internal/mlkit_common/zzls;)Lcom/google/android/gms/internal/mlkit_common/zzlr;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zza()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzlr;->zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_common/zzlr;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/mlkit_common/zzlr;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzmd;)Lcom/google/android/gms/internal/mlkit_common/zzlr;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzg()Z

    move-result v0

    const-string v2, "Model downloaded without its beginning time recorded."

    const-string v3, "RemoteModelUtils"

    const-wide/16 v4, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {p1, p0}, Lcom/google/mlkit/common/sdkinternal/n;->b(Ltf/b;)J

    move-result-wide v6

    cmp-long v0, v6, v4

    if-nez v0, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzql;->zza:Lcom/google/android/gms/common/internal/j;

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/common/internal/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1, p0}, Lcom/google/mlkit/common/sdkinternal/n;->c(Ltf/b;)J

    move-result-wide v8

    cmp-long v0, v8, v4

    if-nez v0, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    invoke-virtual {p1, p0, v8, v9}, Lcom/google/mlkit/common/sdkinternal/n;->d(Ltf/b;J)V

    :cond_4
    sub-long/2addr v8, v6

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/mlkit_common/zzlr;->zzg(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_common/zzlr;

    :cond_5
    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzf()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1, p0}, Lcom/google/mlkit/common/sdkinternal/n;->b(Ltf/b;)J

    move-result-wide p0

    cmp-long p2, p0, v4

    if-nez p2, :cond_6

    sget-object p0, Lcom/google/android/gms/internal/mlkit_common/zzql;->zza:Lcom/google/android/gms/common/internal/j;

    invoke-virtual {p0, v3, v2}, Lcom/google/android/gms/common/internal/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, p0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/mlkit_common/zzlr;->zze(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_common/zzlr;

    :cond_7
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzlr;->zzi()Lcom/google/android/gms/internal/mlkit_common/zzlu;

    move-result-object p0

    return-object p0
.end method
