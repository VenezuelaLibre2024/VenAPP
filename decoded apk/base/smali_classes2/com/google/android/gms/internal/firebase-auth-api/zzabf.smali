.class final Lcom/google/android/gms/internal/firebase-auth-api/zzabf;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzacx;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzacx<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzy:Lcom/google/android/gms/internal/firebase-auth-api/zzafz;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xf

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacx;-><init>(I)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzafy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafy;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafy;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafy;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzafy;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaey;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaey;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaey;)Lcom/google/android/gms/internal/firebase-auth-api/zzafy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzafz;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zzy:Lcom/google/android/gms/internal/firebase-auth-api/zzafz;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 1

    const-string v0, "revokeAccessToken"

    return-object v0
.end method

.method public final zza(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/internal/firebase-auth-api/zzacg;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzacg;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzade;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzade;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzacx;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacx;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zzy:Lcom/google/android/gms/internal/firebase-auth-api/zzafz;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacx;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacz;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacg;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafz;Lcom/google/android/gms/internal/firebase-auth-api/zzace;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacx;->zzb(Ljava/lang/Object;)V

    return-void
.end method
