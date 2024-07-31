.class public Lcom/google/android/gms/location/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a<",
            "Lcom/google/android/gms/common/api/a$d$c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/location/f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/location/j;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lcom/google/android/gms/location/t;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/location/zzbp;->zzb:Lcom/google/android/gms/common/api/a;

    sput-object v0, Lcom/google/android/gms/location/o;->a:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/location/zzau;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzau;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/o;->b:Lcom/google/android/gms/location/f;

    new-instance v0, Lcom/google/android/gms/internal/location/zzbv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzbv;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/o;->c:Lcom/google/android/gms/location/j;

    new-instance v0, Lcom/google/android/gms/internal/location/zzcc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzcc;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/o;->d:Lcom/google/android/gms/location/t;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/location/g;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzbp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/location/zzbp;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lcom/google/android/gms/location/u;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzce;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/location/zzce;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
