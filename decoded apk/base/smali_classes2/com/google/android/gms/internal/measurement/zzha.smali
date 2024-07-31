.class public final Lcom/google/android/gms/internal/measurement/zzha;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Lcom/google/common/collect/b0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzhc;->zza:Lcom/google/android/gms/internal/measurement/zzhc;

    invoke-static {v0}, Leb/w;->a(Leb/v;)Leb/v;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzha;->zza:Leb/v;

    return-void
.end method

.method static synthetic zza()Lcom/google/common/collect/b0;
    .locals 1

    new-instance v0, Lcom/google/common/collect/b0$a;

    invoke-direct {v0}, Lcom/google/common/collect/b0$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/collect/b0$a;->d()Lcom/google/common/collect/b0;

    move-result-object v0

    return-object v0
.end method
