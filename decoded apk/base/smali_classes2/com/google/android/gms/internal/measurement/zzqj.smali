.class public final Lcom/google/android/gms/internal/measurement/zzqj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Leb/v<",
        "Lcom/google/android/gms/internal/measurement/zzqi;",
        ">;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zzqj;


# instance fields
.field private final zzb:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Lcom/google/android/gms/internal/measurement/zzqi;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzqj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzqj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzqj;->zza:Lcom/google/android/gms/internal/measurement/zzqj;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzql;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzql;-><init>()V

    invoke-static {v0}, Leb/w;->b(Ljava/lang/Object;)Leb/v;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzqj;->zzb:Leb/v;

    return-void
.end method

.method public static zza()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqj;->zza:Lcom/google/android/gms/internal/measurement/zzqj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzqj;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzqi;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzqj;->zzb:Leb/v;

    invoke-interface {v0}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqi;

    return-object v0
.end method
