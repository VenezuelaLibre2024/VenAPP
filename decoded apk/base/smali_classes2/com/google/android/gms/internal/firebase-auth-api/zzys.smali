.class final Lcom/google/android/gms/internal/firebase-auth-api/zzys;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzadk;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzadk<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzagf;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzacd;

.field private final synthetic zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

.field private final synthetic zze:Lcom/google/android/gms/internal/firebase-auth-api/zzadl;

.field private final synthetic zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzyj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzyj;Lcom/google/android/gms/internal/firebase-auth-api/zzagc;Lcom/google/android/gms/internal/firebase-auth-api/zzafc;Lcom/google/android/gms/internal/firebase-auth-api/zzacd;Lcom/google/android/gms/internal/firebase-auth-api/zzafn;Lcom/google/android/gms/internal/firebase-auth-api/zzadl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzyj;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzacd;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzadl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagf;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    const-string v1, "EMAIL"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzi(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzc()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    const-string v2, "DISPLAY_NAME"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzi(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzb()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    const-string v2, "PHOTO_URL"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzi(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    :goto_2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zze()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zze()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    const-string v1, "redacted"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lla/c;->c([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    :cond_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagf;->zze()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/util/List;)Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzacd;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagf;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagf;->zzd()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagf;->zza()J

    move-result-wide v4

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v3, v2, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    move-object v1, p1

    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafn;Lcom/google/android/gms/internal/firebase-auth-api/zzafc;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzys;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzadl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;)V

    return-void
.end method
