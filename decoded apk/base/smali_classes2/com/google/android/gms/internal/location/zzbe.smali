.class public final synthetic Lcom/google/android/gms/internal/location/zzbe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/r;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/location/zzbe;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzbe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzbe;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/location/zzbe;->zza:Lcom/google/android/gms/internal/location/zzbe;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/gms/location/l$a;

    invoke-direct {v0}, Lcom/google/android/gms/location/l$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/location/l$a;->a()Lcom/google/android/gms/location/l;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/location/zzda;->zzt(Lcom/google/android/gms/location/l;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
