.class public final Lcom/google/android/gms/internal/measurement/zzpm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Leb/v<",
        "Lcom/google/android/gms/internal/measurement/zzpp;",
        ">;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zzpm;


# instance fields
.field private final zzb:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Lcom/google/android/gms/internal/measurement/zzpp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzpm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzpm;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzpm;->zza:Lcom/google/android/gms/internal/measurement/zzpm;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzpo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzpo;-><init>()V

    invoke-static {v0}, Leb/w;->b(Ljava/lang/Object;)Leb/v;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzpm;->zzb:Leb/v;

    return-void
.end method

.method public static zza()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzpm;->zza:Lcom/google/android/gms/internal/measurement/zzpm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzpm;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzpp;->zza()Z

    move-result v0

    return v0
.end method

.method public static zzb()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzpm;->zza:Lcom/google/android/gms/internal/measurement/zzpm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzpm;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzpp;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzpm;->zzb:Leb/v;

    invoke-interface {v0}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpp;

    return-object v0
.end method
