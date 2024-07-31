.class final Lcom/google/android/gms/internal/ads/zzaln;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zzd:Ljava/util/regex/Pattern;

.field private static final zze:Lcom/google/android/gms/internal/ads/zzgaf;

.field private static final zzf:Lcom/google/android/gms/internal/ads/zzgaf;

.field private static final zzg:Lcom/google/android/gms/internal/ads/zzgaf;

.field private static final zzh:Lcom/google/android/gms/internal/ads/zzgaf;


# instance fields
.field public final zza:I

.field public final zzb:I

.field public final zzc:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "\\s+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaln;->zzd:Ljava/util/regex/Pattern;

    const-string v0, "auto"

    const-string v1, "none"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgaf;->zzp(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgaf;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaln;->zze:Lcom/google/android/gms/internal/ads/zzgaf;

    const-string v0, "sesame"

    const-string v1, "circle"

    const-string v2, "dot"

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzgaf;->zzq(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgaf;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaln;->zzf:Lcom/google/android/gms/internal/ads/zzgaf;

    const-string v0, "filled"

    const-string v1, "open"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgaf;->zzp(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgaf;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaln;->zzg:Lcom/google/android/gms/internal/ads/zzgaf;

    const-string v0, "before"

    const-string v1, "outside"

    const-string v2, "after"

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzgaf;->zzq(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgaf;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaln;->zzh:Lcom/google/android/gms/internal/ads/zzgaf;

    return-void
.end method

.method private constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaln;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzaln;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzaln;->zzc:I

    return-void
.end method

.method public static zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaln;
    .locals 8

    if-nez p0, :cond_0

    goto/16 :goto_b

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfwk;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaln;->zzd:Ljava/util/regex/Pattern;

    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/util/regex/Pattern;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgaf;->zzm([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgaf;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaln;->zzh:Lcom/google/android/gms/internal/ads/zzgaf;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzgca;->zzb(Ljava/util/Set;Ljava/util/Set;)Lcom/google/android/gms/internal/ads/zzgbz;

    move-result-object v0

    const-string v1, "outside"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgag;->zza(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x41ecca5b

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v2, v3, :cond_2

    const v1, 0x58705dc

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "after"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v6

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v5

    goto :goto_1

    :cond_3
    :goto_0
    move v0, v4

    :goto_1
    const/4 v1, 0x2

    if-eqz v0, :cond_5

    if-eq v0, v5, :cond_4

    move v0, v5

    goto :goto_2

    :cond_4
    const/4 v0, -0x2

    goto :goto_2

    :cond_5
    move v0, v1

    :goto_2
    sget-object v2, Lcom/google/android/gms/internal/ads/zzaln;->zze:Lcom/google/android/gms/internal/ads/zzgaf;

    invoke-static {v2, p0}, Lcom/google/android/gms/internal/ads/zzgca;->zzb(Ljava/util/Set;Ljava/util/Set;)Lcom/google/android/gms/internal/ads/zzgbz;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x33af38

    if-eq v1, v2, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "none"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    move p0, v6

    goto :goto_4

    :cond_7
    :goto_3
    move p0, v4

    :goto_4
    if-eqz p0, :cond_8

    goto/16 :goto_a

    :cond_8
    move v4, v6

    goto/16 :goto_a

    :cond_9
    sget-object v2, Lcom/google/android/gms/internal/ads/zzaln;->zzg:Lcom/google/android/gms/internal/ads/zzgaf;

    invoke-static {v2, p0}, Lcom/google/android/gms/internal/ads/zzgca;->zzb(Ljava/util/Set;Ljava/util/Set;)Lcom/google/android/gms/internal/ads/zzgbz;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/zzaln;->zzf:Lcom/google/android/gms/internal/ads/zzgaf;

    invoke-static {v3, p0}, Lcom/google/android/gms/internal/ads/zzgca;->zzb(Ljava/util/Set;Ljava/util/Set;)Lcom/google/android/gms/internal/ads/zzgbz;

    move-result-object p0

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_a

    :cond_a
    const-string v3, "filled"

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzgag;->zza(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v7, 0x34264a

    if-eq v3, v7, :cond_b

    goto :goto_5

    :cond_b
    const-string v3, "open"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move v2, v6

    goto :goto_6

    :cond_c
    :goto_5
    move v2, v4

    :goto_6
    if-eqz v2, :cond_d

    move v2, v5

    goto :goto_7

    :cond_d
    move v2, v1

    :goto_7
    const-string v3, "circle"

    invoke-static {p0, v3}, Lcom/google/android/gms/internal/ads/zzgag;->zza(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v7, -0x35fdaa48    # -2135406.0f

    if-eq v3, v7, :cond_f

    const v7, 0x18549

    if-eq v3, v7, :cond_e

    goto :goto_8

    :cond_e
    const-string v3, "dot"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_10

    move v4, v6

    goto :goto_8

    :cond_f
    const-string v3, "sesame"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_10

    move v4, v5

    :cond_10
    :goto_8
    if-eqz v4, :cond_12

    if-eq v4, v5, :cond_11

    move v6, v2

    move v4, v5

    goto :goto_a

    :cond_11
    const/4 v4, 0x3

    goto :goto_9

    :cond_12
    move v4, v1

    :goto_9
    move v6, v2

    :goto_a
    new-instance p0, Lcom/google/android/gms/internal/ads/zzaln;

    invoke-direct {p0, v4, v6, v0}, Lcom/google/android/gms/internal/ads/zzaln;-><init>(III)V

    return-object p0

    :cond_13
    :goto_b
    const/4 p0, 0x0

    return-object p0
.end method
