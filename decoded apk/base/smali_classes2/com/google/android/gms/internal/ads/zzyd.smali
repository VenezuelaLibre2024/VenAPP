.class public final synthetic Lcom/google/android/gms/internal/ads/zzyd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/ads/zzyd;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzyd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzyd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzyd;->zza:Lcom/google/android/gms/internal/ads/zzyd;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzyf;

    check-cast p2, Lcom/google/android/gms/internal/ads/zzyf;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzyf;->zzd(Lcom/google/android/gms/internal/ads/zzyf;Lcom/google/android/gms/internal/ads/zzyf;)I

    move-result p1

    return p1
.end method